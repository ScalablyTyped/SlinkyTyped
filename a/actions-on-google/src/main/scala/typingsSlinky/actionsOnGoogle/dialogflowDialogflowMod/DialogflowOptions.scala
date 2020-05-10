package typingsSlinky.actionsOnGoogle.dialogflowDialogflowMod

import typingsSlinky.actionsOnGoogle.conversationConversationMod.ConversationAppOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogflowOptions[TConvData, TUserStorage] extends ConversationAppOptions[TConvData, TUserStorage] {
  /**
    * Verifies whether the request comes from Dialogflow.
    * Uses header keys and values to check against ones specified by the developer
    * in the Dialogflow Fulfillment settings of the app.
    *
    * HTTP Code 403 will be thrown by default on verification error.
    *
    * @public
    */
  var verification: js.UndefOr[DialogflowVerification | DialogflowVerificationHeaders] = js.native
}

object DialogflowOptions {
  @scala.inline
  def apply[TConvData, TUserStorage](): DialogflowOptions[TConvData, TUserStorage] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowOptions[TConvData, TUserStorage]]
  }
  @scala.inline
  implicit class DialogflowOptionsOps[Self[tconvdata, tuserstorage] <: DialogflowOptions[tconvdata, tuserstorage], TConvData, TUserStorage] (val x: Self[TConvData, TUserStorage]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TConvData, TUserStorage] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TConvData, TUserStorage]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TConvData, TUserStorage]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TConvData, TUserStorage]) with Other]
    @scala.inline
    def withVerification(value: DialogflowVerification | DialogflowVerificationHeaders): Self[TConvData, TUserStorage] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerification: Self[TConvData, TUserStorage] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verification")(js.undefined)
        ret
    }
  }
  
}

