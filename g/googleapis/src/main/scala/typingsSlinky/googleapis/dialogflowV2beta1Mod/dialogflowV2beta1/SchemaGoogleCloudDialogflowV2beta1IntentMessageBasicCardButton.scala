package typingsSlinky.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The button object that appears at the bottom of a card.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCardButton extends js.Object {
  /**
    * Required. Action to take when a user taps on the button.
    */
  var openUriAction: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriAction] = js.native
  /**
    * Required. The title of the button.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCardButton {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCardButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCardButton]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOps[Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCardButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpenUriAction(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openUriAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenUriAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openUriAction")(js.undefined)
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

