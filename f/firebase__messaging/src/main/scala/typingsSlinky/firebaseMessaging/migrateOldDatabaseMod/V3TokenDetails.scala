package typingsSlinky.firebaseMessaging.migrateOldDatabaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait V3TokenDetails extends js.Object {
  var auth: scala.scalajs.js.typedarray.ArrayBuffer
  var createTime: Double
  var endpoint: String
  var fcmPushSet: String
  var fcmSenderId: String
  var fcmToken: String
  var p256dh: scala.scalajs.js.typedarray.ArrayBuffer
  var swScope: String
  var vapidKey: scala.scalajs.js.typedarray.Uint8Array
}

object V3TokenDetails {
  @scala.inline
  def apply(
    auth: scala.scalajs.js.typedarray.ArrayBuffer,
    createTime: Double,
    endpoint: String,
    fcmPushSet: String,
    fcmSenderId: String,
    fcmToken: String,
    p256dh: scala.scalajs.js.typedarray.ArrayBuffer,
    swScope: String,
    vapidKey: scala.scalajs.js.typedarray.Uint8Array
  ): V3TokenDetails = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], fcmPushSet = fcmPushSet.asInstanceOf[js.Any], fcmSenderId = fcmSenderId.asInstanceOf[js.Any], fcmToken = fcmToken.asInstanceOf[js.Any], p256dh = p256dh.asInstanceOf[js.Any], swScope = swScope.asInstanceOf[js.Any], vapidKey = vapidKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[V3TokenDetails]
  }
}

