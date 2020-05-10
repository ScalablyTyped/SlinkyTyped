package typingsSlinky.facebookJsSdk.facebook

import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.canvas_preview
import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.popup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstantExperiencesPreviewDialogParams extends DialogParams {
  var canvas_id: String = js.native
  @JSName("display")
  var display_InstantExperiencesPreviewDialogParams: popup = js.native
  var method: canvas_preview = js.native
}

object InstantExperiencesPreviewDialogParams {
  @scala.inline
  def apply(canvas_id: String, display: popup, method: canvas_preview): InstantExperiencesPreviewDialogParams = {
    val __obj = js.Dynamic.literal(canvas_id = canvas_id.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstantExperiencesPreviewDialogParams]
  }
  @scala.inline
  implicit class InstantExperiencesPreviewDialogParamsOps[Self <: InstantExperiencesPreviewDialogParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanvas_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvas_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplay(value: popup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: canvas_preview): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

