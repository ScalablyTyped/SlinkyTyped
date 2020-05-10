package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBack extends js.Object {
  var back: String = js.native
}

object AnonBack {
  @scala.inline
  def apply(back: String): AnonBack = {
    val __obj = js.Dynamic.literal(back = back.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBack]
  }
  @scala.inline
  implicit class AnonBackOps[Self <: AnonBack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("back")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

