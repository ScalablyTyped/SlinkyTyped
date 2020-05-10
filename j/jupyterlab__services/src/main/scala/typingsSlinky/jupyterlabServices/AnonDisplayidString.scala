package typingsSlinky.jupyterlabServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisplayidString extends js.Object {
  var display_id: String = js.native
}

object AnonDisplayidString {
  @scala.inline
  def apply(display_id: String): AnonDisplayidString = {
    val __obj = js.Dynamic.literal(display_id = display_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisplayidString]
  }
  @scala.inline
  implicit class AnonDisplayidStringOps[Self <: AnonDisplayidString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplay_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

