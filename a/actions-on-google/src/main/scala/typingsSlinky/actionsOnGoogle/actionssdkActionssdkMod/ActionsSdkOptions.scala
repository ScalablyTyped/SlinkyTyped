package typingsSlinky.actionsOnGoogle.actionssdkActionssdkMod

import typingsSlinky.actionsOnGoogle.conversationConversationMod.ConversationAppOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionsSdkOptions[TConvData, TUserStorage] extends ConversationAppOptions[TConvData, TUserStorage] {
  /**
    * Validates whether request is from Google through signature verification.
    * Uses Google-Auth-Library to verify authorization token against given Google Cloud Project ID.
    * Auth token is given in request header with key, "authorization".
    *
    * HTTP Code 403 will be thrown by default on verification error.
    *
    * @example
    * ```javascript
    *
    * const app = actionssdk({ verification: 'nodejs-cloud-test-project-1234' })
    * ```
    *
    * @public
    */
  var verification: js.UndefOr[ActionsSdkVerification | String] = js.native
}

object ActionsSdkOptions {
  @scala.inline
  def apply[TConvData, TUserStorage](): ActionsSdkOptions[TConvData, TUserStorage] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionsSdkOptions[TConvData, TUserStorage]]
  }
  @scala.inline
  implicit class ActionsSdkOptionsOps[Self[tconvdata, tuserstorage] <: ActionsSdkOptions[tconvdata, tuserstorage], TConvData, TUserStorage] (val x: Self[TConvData, TUserStorage]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TConvData, TUserStorage] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TConvData, TUserStorage]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TConvData, TUserStorage]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TConvData, TUserStorage]) with Other]
    @scala.inline
    def withVerification(value: ActionsSdkVerification | String): Self[TConvData, TUserStorage] = {
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

