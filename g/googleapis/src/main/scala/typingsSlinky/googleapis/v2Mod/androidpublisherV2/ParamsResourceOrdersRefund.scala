package typingsSlinky.googleapis.v2Mod.androidpublisherV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceOrdersRefund extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The order ID provided to the user when the subscription or in-app order
    * was purchased.
    */
  var orderId: js.UndefOr[String] = js.native
  /**
    * The package name of the application for which this subscription or in-app
    * item was purchased (for example, 'com.some.thing').
    */
  var packageName: js.UndefOr[String] = js.native
  /**
    * Whether to revoke the purchased item. If set to true, access to the
    * subscription or in-app item will be terminated immediately. If the item
    * is a recurring subscription, all future payments will also be terminated.
    * Consumed in-app items need to be handled by developer's app. (optional)
    */
  var revoke: js.UndefOr[Boolean] = js.native
}

object ParamsResourceOrdersRefund {
  @scala.inline
  def apply(): ParamsResourceOrdersRefund = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrdersRefund]
  }
  @scala.inline
  implicit class ParamsResourceOrdersRefundOps[Self <: ParamsResourceOrdersRefund] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderId")(js.undefined)
        ret
    }
    @scala.inline
    def withPackageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageName")(js.undefined)
        ret
    }
    @scala.inline
    def withRevoke(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revoke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevoke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revoke")(js.undefined)
        ret
    }
  }
  
}

