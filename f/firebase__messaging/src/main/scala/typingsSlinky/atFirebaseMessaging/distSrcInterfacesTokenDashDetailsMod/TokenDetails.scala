package typingsSlinky.atFirebaseMessaging.distSrcInterfacesTokenDashDetailsMod

import typingsSlinky.std.ArrayBufferLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenDetails extends js.Object {
  var auth: ArrayBufferLike
  var createTime: Double
  var endpoint: String
  var fcmSenderId: String
  var fcmToken: String
  var p256dh: ArrayBufferLike
  var swScope: String
  var vapidKey: scala.scalajs.js.typedarray.Uint8Array
}

object TokenDetails {
  @scala.inline
  def apply(
    auth: ArrayBufferLike,
    createTime: Double,
    endpoint: String,
    fcmSenderId: String,
    fcmToken: String,
    p256dh: ArrayBufferLike,
    swScope: String,
    vapidKey: scala.scalajs.js.typedarray.Uint8Array
  ): TokenDetails = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], fcmSenderId = fcmSenderId.asInstanceOf[js.Any], fcmToken = fcmToken.asInstanceOf[js.Any], p256dh = p256dh.asInstanceOf[js.Any], swScope = swScope.asInstanceOf[js.Any], vapidKey = vapidKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TokenDetails]
  }
}

