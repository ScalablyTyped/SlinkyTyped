package typingsSlinky.googleapisCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSimple extends js.Object {
  var simple: AnonPath = js.native
}

object AnonSimple {
  @scala.inline
  def apply(simple: AnonPath): AnonSimple = {
    val __obj = js.Dynamic.literal(simple = simple.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSimple]
  }
  @scala.inline
  implicit class AnonSimpleOps[Self <: AnonSimple] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSimple(value: AnonPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simple")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

