package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2PlaceValueSpecPlaceDialogSpec extends js.Object {
  /**
    * This is the context for seeking permission to access various user related
    * data if the user prompts for personal location during the sub-dialog like
    * \"Home\", \"Work\" or \"Dad's house\". For example \"*To help you find
    * juice stores*, I just need to check your location. Can I get that from
    * Google?\". The first part of this permission prompt is configurable.
    */
  var permissionContext: js.UndefOr[String] = js.native
  /**
    * This is the initial prompt by AskForPlace sub-dialog. For example \"What
    * place do you want?\"
    */
  var requestPrompt: js.UndefOr[String] = js.native
}

object GoogleActionsV2PlaceValueSpecPlaceDialogSpec {
  @scala.inline
  def apply(): GoogleActionsV2PlaceValueSpecPlaceDialogSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2PlaceValueSpecPlaceDialogSpec]
  }
  @scala.inline
  implicit class GoogleActionsV2PlaceValueSpecPlaceDialogSpecOps[Self <: GoogleActionsV2PlaceValueSpecPlaceDialogSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPermissionContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissionContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionContext")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestPrompt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestPrompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestPrompt")(js.undefined)
        ret
    }
  }
  
}

