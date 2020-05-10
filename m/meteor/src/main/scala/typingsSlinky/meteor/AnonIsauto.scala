package typingsSlinky.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsauto extends js.Object {
  var is_auto: Boolean = js.native
}

object AnonIsauto {
  @scala.inline
  def apply(is_auto: Boolean): AnonIsauto = {
    val __obj = js.Dynamic.literal(is_auto = is_auto.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsauto]
  }
  @scala.inline
  implicit class AnonIsautoOps[Self <: AnonIsauto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIs_auto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_auto")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

