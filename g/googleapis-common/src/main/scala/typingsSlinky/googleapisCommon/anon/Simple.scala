package typingsSlinky.googleapisCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Simple extends js.Object {
  var simple: Path = js.native
}

object Simple {
  @scala.inline
  def apply(simple: Path): Simple = {
    val __obj = js.Dynamic.literal(simple = simple.asInstanceOf[js.Any])
    __obj.asInstanceOf[Simple]
  }
  @scala.inline
  implicit class SimpleOps[Self <: Simple] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSimple(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simple")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

