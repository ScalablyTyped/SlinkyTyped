package typingsSlinky.firebaseMessaging.migrateOldDatabaseMod

import org.scalajs.dom.experimental.push.PushSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait V2TokenDetails extends js.Object {
  var auth: js.UndefOr[String] = js.native
  var createTime: js.UndefOr[Double] = js.native
  var endpoint: js.UndefOr[String] = js.native
  var fcmPushSet: String = js.native
  var fcmSenderId: String = js.native
  var fcmToken: String = js.native
  var p256dh: js.UndefOr[String] = js.native
  var subscription: PushSubscription = js.native
  var swScope: String = js.native
  var vapidKey: String | js.typedarray.Uint8Array = js.native
}

object V2TokenDetails {
  @scala.inline
  def apply(
    fcmPushSet: String,
    fcmSenderId: String,
    fcmToken: String,
    subscription: PushSubscription,
    swScope: String,
    vapidKey: String | js.typedarray.Uint8Array
  ): V2TokenDetails = {
    val __obj = js.Dynamic.literal(fcmPushSet = fcmPushSet.asInstanceOf[js.Any], fcmSenderId = fcmSenderId.asInstanceOf[js.Any], fcmToken = fcmToken.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], swScope = swScope.asInstanceOf[js.Any], vapidKey = vapidKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[V2TokenDetails]
  }
  @scala.inline
  implicit class V2TokenDetailsOps[Self <: V2TokenDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFcmPushSet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fcmPushSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFcmSenderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fcmSenderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFcmToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fcmToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscription(value: PushSubscription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVapidKeyUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vapidKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVapidKey(value: String | js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vapidKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuth(value: String): Self = {
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
    def withCreateTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withP256dh(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p256dh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutP256dh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p256dh")(js.undefined)
        ret
    }
  }
  
}

