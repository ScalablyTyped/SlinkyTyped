package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBaiduChannelRequestMod {
  
  @js.native
  trait BaiduChannelRequest extends StObject {
    
    /**
      * Platform credential API key from Baidu.
      */
    var ApiKey: js.UndefOr[String] = js.native
    
    /**
      * If the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Platform credential Secret key from Baidu.
      */
    var SecretKey: js.UndefOr[String] = js.native
  }
  object BaiduChannelRequest {
    
    @scala.inline
    def apply(): BaiduChannelRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaiduChannelRequest]
    }
    
    @scala.inline
    implicit class BaiduChannelRequestMutableBuilder[Self <: BaiduChannelRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "ApiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiKeyUndefined: Self = StObject.set(x, "ApiKey", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
      
      @scala.inline
      def setSecretKey(value: String): Self = StObject.set(x, "SecretKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretKeyUndefined: Self = StObject.set(x, "SecretKey", js.undefined)
    }
  }
  
  type UnmarshalledBaiduChannelRequest = BaiduChannelRequest
}
