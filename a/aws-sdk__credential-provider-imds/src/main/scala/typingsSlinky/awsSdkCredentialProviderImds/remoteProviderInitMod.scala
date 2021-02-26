package typingsSlinky.awsSdkCredentialProviderImds

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remoteProviderInitMod {
  
  @JSImport("@aws-sdk/credential-provider-imds/dist/cjs/remoteProvider/RemoteProviderInit", "DEFAULT_MAX_RETRIES")
  @js.native
  val DEFAULT_MAX_RETRIES: /* 0 */ Double = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds/dist/cjs/remoteProvider/RemoteProviderInit", "DEFAULT_TIMEOUT")
  @js.native
  val DEFAULT_TIMEOUT: /* 1000 */ Double = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds/dist/cjs/remoteProvider/RemoteProviderInit", "providerConfigFromInit")
  @js.native
  def providerConfigFromInit(hasMaxRetriesTimeout: RemoteProviderInit): RemoteProviderConfig = js.native
  
  @js.native
  trait RemoteProviderConfig extends StObject {
    
    /**
      * The maximum number of times the HTTP connection should be retried
      */
    var maxRetries: Double = js.native
    
    /**
      * The connection timeout (in milliseconds)
      */
    var timeout: Double = js.native
  }
  object RemoteProviderConfig {
    
    @scala.inline
    def apply(maxRetries: Double, timeout: Double): RemoteProviderConfig = {
      val __obj = js.Dynamic.literal(maxRetries = maxRetries.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoteProviderConfig]
    }
    
    @scala.inline
    implicit class RemoteProviderConfigMutableBuilder[Self <: RemoteProviderConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@aws-sdk/credential-provider-imds.@aws-sdk/credential-provider-imds/dist/cjs/remoteProvider/RemoteProviderInit.RemoteProviderConfig> */
  @js.native
  trait RemoteProviderInit extends StObject {
    
    var maxRetries: js.UndefOr[Double] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object RemoteProviderInit {
    
    @scala.inline
    def apply(): RemoteProviderInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemoteProviderInit]
    }
    
    @scala.inline
    implicit class RemoteProviderInitMutableBuilder[Self <: RemoteProviderInit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
