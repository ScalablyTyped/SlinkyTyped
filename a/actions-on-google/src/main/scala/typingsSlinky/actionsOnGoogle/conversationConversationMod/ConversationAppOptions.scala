package typingsSlinky.actionsOnGoogle.conversationConversationMod

import typingsSlinky.actionsOnGoogle.assistantMod.AppOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversationAppOptions[TConvData, TUserStorage] extends AppOptions {
  /**
    * Client ID for User Profile Payload Verification
    * See {@link Profile#payload|conv.user.profile.payload}
    * @public
    */
  var clientId: js.UndefOr[String] = js.native
  /** @public */
  var init: js.UndefOr[js.Function0[ConversationOptionsInit[TConvData, TUserStorage]]] = js.native
  /** @public */
  var ordersv3: js.UndefOr[Boolean] = js.native
}

object ConversationAppOptions {
  @scala.inline
  def apply[TConvData, TUserStorage](): ConversationAppOptions[TConvData, TUserStorage] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversationAppOptions[TConvData, TUserStorage]]
  }
  @scala.inline
  implicit class ConversationAppOptionsOps[Self[tconvdata, tuserstorage] <: ConversationAppOptions[tconvdata, tuserstorage], TConvData, TUserStorage] (val x: Self[TConvData, TUserStorage]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TConvData, TUserStorage] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TConvData, TUserStorage]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TConvData, TUserStorage]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TConvData, TUserStorage]) with Other]
    @scala.inline
    def withClientId(value: String): Self[TConvData, TUserStorage] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientId: Self[TConvData, TUserStorage] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: () => ConversationOptionsInit[TConvData, TUserStorage]): Self[TConvData, TUserStorage] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInit: Self[TConvData, TUserStorage] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withOrdersv3(value: Boolean): Self[TConvData, TUserStorage] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordersv3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrdersv3: Self[TConvData, TUserStorage] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordersv3")(js.undefined)
        ret
    }
  }
  
}

