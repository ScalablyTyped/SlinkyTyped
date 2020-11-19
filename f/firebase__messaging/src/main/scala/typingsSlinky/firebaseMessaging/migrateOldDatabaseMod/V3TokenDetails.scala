package typingsSlinky.firebaseMessaging.migrateOldDatabaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuth(value: js.typedarray.ArrayBuffer): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTime(value: Double): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFcmPushSet(value: String): Self = this.set("fcmPushSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFcmSenderId(value: String): Self = this.set("fcmSenderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFcmToken(value: String): Self = this.set("fcmToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP256dh(value: js.typedarray.ArrayBuffer): Self = this.set("p256dh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwScope(value: String): Self = this.set("swScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVapidKey(value: js.typedarray.Uint8Array): Self = this.set("vapidKey", value.asInstanceOf[js.Any])
  }
}
