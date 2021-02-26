package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaiduChannelRequest extends StObject {
  
  /**
    * The API key that you received from the Baidu Cloud Push service to communicate with the service.
    */
  var ApiKey: string = js.native
  
  /**
    * Specifies whether to enable the Baidu channel for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.native
  
  /**
    * The secret key that you received from the Baidu Cloud Push service to communicate with the service.
    */
  var SecretKey: string = js.native
}
object BaiduChannelRequest {
  
  @scala.inline
  def apply(ApiKey: string, SecretKey: string): BaiduChannelRequest = {
    val __obj = js.Dynamic.literal(ApiKey = ApiKey.asInstanceOf[js.Any], SecretKey = SecretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaiduChannelRequest]
  }
  
  @scala.inline
  implicit class BaiduChannelRequestMutableBuilder[Self <: BaiduChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiKey(value: string): Self = StObject.set(x, "ApiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setSecretKey(value: string): Self = StObject.set(x, "SecretKey", value.asInstanceOf[js.Any])
  }
}
