package typingsSlinky.firebaseMessaging.migrateOldDatabaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait V3TokenDetails extends js.Object {
  var auth: js.typedarray.ArrayBuffer = js.native
  var createTime: Double = js.native
  var endpoint: String = js.native
  var fcmPushSet: String = js.native
  var fcmSenderId: String = js.native
  var fcmToken: String = js.native
  var p256dh: js.typedarray.ArrayBuffer = js.native
  var swScope: String = js.native
  var vapidKey: js.typedarray.Uint8Array = js.native
}

object V3TokenDetails {
  @scala.inline
  def apply(
    auth: js.typedarray.ArrayBuffer,
    createTime: Double,
    endpoint: String,
    fcmPushSet: String,
    fcmSenderId: String,
    fcmToken: String,
    p256dh: js.typedarray.ArrayBuffer,
    swScope: String,
    vapidKey: js.typedarray.Uint8Array
  ): V3TokenDetails = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], fcmPushSet = fcmPushSet.asInstanceOf[js.Any], fcmSenderId = fcmSenderId.asInstanceOf[js.Any], fcmToken = fcmToken.asInstanceOf[js.Any], p256dh = p256dh.asInstanceOf[js.Any], swScope = swScope.asInstanceOf[js.Any], vapidKey = vapidKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[V3TokenDetails]
  }
  @scala.inline
  implicit class V3TokenDetailsOps[Self <: V3TokenDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withP256dh(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p256dh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVapidKey(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vapidKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

