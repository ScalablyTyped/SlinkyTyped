package typingsSlinky.reactNativeGoby.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDialog extends js.Object {
  /**
    * Indicates whether you would like to append the description of an available release to the
    * notification message which is displayed to the end user. Defaults to false.
    */
  var appendReleaseDescription: js.UndefOr[Boolean] = js.native
  /**
    * Indicates the string you would like to prefix the release description with, if any, when
    * displaying the update notification to the end user. Defaults to " Description: "
    */
  var descriptionPrefix: js.UndefOr[String] = js.native
  /**
    * The text to use for the button the end user must press in order to install a mandatory update. Defaults to "Continue".
    */
  var mandatoryContinueButtonLabel: js.UndefOr[String] = js.native
  /**
    * The text used as the body of an update notification, when the update is specified as mandatory.
    * Defaults to "An update is available that must be installed.".
    */
  var mandatoryUpdateMessage: js.UndefOr[String] = js.native
  /**
    * The text to use for the button the end user can press in order to ignore an optional update that is available. Defaults to "Ignore".
    */
  var optionalIgnoreButtonLabel: js.UndefOr[String] = js.native
  /**
    * The text to use for the button the end user can press in order to install an optional update. Defaults to "Install".
    */
  var optionalInstallButtonLabel: js.UndefOr[String] = js.native
  /**
    * The text used as the body of an update notification, when the update is optional. Defaults to "An update is available. Would you like to install it?".
    */
  var optionalUpdateMessage: js.UndefOr[String] = js.native
  /**
    * The text used as the header of an update notification that is displayed to the end user. Defaults to "Update available".
    */
  var title: js.UndefOr[String] = js.native
}

object UpdateDialog {
  @scala.inline
  def apply(): UpdateDialog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDialog]
  }
  @scala.inline
  implicit class UpdateDialogOps[Self <: UpdateDialog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendReleaseDescription(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendReleaseDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendReleaseDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendReleaseDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptionPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescriptionPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withMandatoryContinueButtonLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mandatoryContinueButtonLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMandatoryContinueButtonLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mandatoryContinueButtonLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withMandatoryUpdateMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mandatoryUpdateMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMandatoryUpdateMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mandatoryUpdateMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionalIgnoreButtonLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalIgnoreButtonLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionalIgnoreButtonLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalIgnoreButtonLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionalInstallButtonLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalInstallButtonLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionalInstallButtonLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalInstallButtonLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionalUpdateMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalUpdateMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionalUpdateMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalUpdateMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

