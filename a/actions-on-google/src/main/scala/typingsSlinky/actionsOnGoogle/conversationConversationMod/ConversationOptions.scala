package typingsSlinky.actionsOnGoogle.conversationConversationMod

import typingsSlinky.actionsOnGoogle.frameworkFrameworkMod.Headers
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2AppRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversationOptions[TUserStorage] extends js.Object {
  /** @public */
  var headers: js.UndefOr[Headers] = js.native
  /** @public */
  var init: js.UndefOr[ConversationOptionsInit[js.Object, TUserStorage]] = js.native
  /** @public */
  var ordersv3: js.UndefOr[Boolean] = js.native
  /** @public */
  var request: js.UndefOr[GoogleActionsV2AppRequest] = js.native
}

object ConversationOptions {
  @scala.inline
  def apply[TUserStorage](): ConversationOptions[TUserStorage] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversationOptions[TUserStorage]]
  }
  @scala.inline
  implicit class ConversationOptionsOps[Self[tuserstorage] <: ConversationOptions[tuserstorage], TUserStorage] (val x: Self[TUserStorage]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TUserStorage] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TUserStorage]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TUserStorage] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TUserStorage] with Other]
    @scala.inline
    def withHeaders(value: Headers): Self[TUserStorage] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self[TUserStorage] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: ConversationOptionsInit[js.Object, TUserStorage]): Self[TUserStorage] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInit: Self[TUserStorage] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withOrdersv3(value: Boolean): Self[TUserStorage] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordersv3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrdersv3: Self[TUserStorage] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordersv3")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest(value: GoogleActionsV2AppRequest): Self[TUserStorage] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest: Self[TUserStorage] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
        ret
    }
  }
  
}

