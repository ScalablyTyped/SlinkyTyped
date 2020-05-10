package typingsSlinky.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActivateText extends js.Object {
  var activateText: String = js.native
  var deactivateText: String = js.native
  var finishText: String = js.native
}

object AnonActivateText {
  @scala.inline
  def apply(activateText: String, deactivateText: String, finishText: String): AnonActivateText = {
    val __obj = js.Dynamic.literal(activateText = activateText.asInstanceOf[js.Any], deactivateText = deactivateText.asInstanceOf[js.Any], finishText = finishText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActivateText]
  }
  @scala.inline
  implicit class AnonActivateTextOps[Self <: AnonActivateText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivateText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activateText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeactivateText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivateText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinishText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

