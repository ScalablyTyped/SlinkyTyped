package typingsSlinky.ldapjs.mod

import typingsSlinky.ldapjs.anon.FailAfter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientOptions extends StObject {
  
  var bindCredentials: js.UndefOr[String] = js.native
  
  var bindDN: js.UndefOr[String] = js.native
  
  var connectTimeout: js.UndefOr[Double] = js.native
  
  var idleTimeout: js.UndefOr[Double] = js.native
  
  var log: js.UndefOr[js.Any] = js.native
  
  var queueDisable: js.UndefOr[Boolean] = js.native
  
  var queueSize: js.UndefOr[Double] = js.native
  
  var queueTimeout: js.UndefOr[Double] = js.native
  
  var reconnect: js.UndefOr[Boolean | FailAfter] = js.native
  
  var socketPath: js.UndefOr[String] = js.native
  
  var strictDN: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var tlsOptions: js.UndefOr[js.Object] = js.native
  
  var url: String = js.native
}
object ClientOptions {
  
  @scala.inline
  def apply(url: String): ClientOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
  
  @scala.inline
  implicit class ClientOptionsMutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindCredentials(value: String): Self = StObject.set(x, "bindCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindCredentialsUndefined: Self = StObject.set(x, "bindCredentials", js.undefined)
    
    @scala.inline
    def setBindDN(value: String): Self = StObject.set(x, "bindDN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindDNUndefined: Self = StObject.set(x, "bindDN", js.undefined)
    
    @scala.inline
    def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
    
    @scala.inline
    def setIdleTimeout(value: Double): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleTimeoutUndefined: Self = StObject.set(x, "idleTimeout", js.undefined)
    
    @scala.inline
    def setLog(value: js.Any): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    @scala.inline
    def setQueueDisable(value: Boolean): Self = StObject.set(x, "queueDisable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueDisableUndefined: Self = StObject.set(x, "queueDisable", js.undefined)
    
    @scala.inline
    def setQueueSize(value: Double): Self = StObject.set(x, "queueSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueSizeUndefined: Self = StObject.set(x, "queueSize", js.undefined)
    
    @scala.inline
    def setQueueTimeout(value: Double): Self = StObject.set(x, "queueTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueTimeoutUndefined: Self = StObject.set(x, "queueTimeout", js.undefined)
    
    @scala.inline
    def setReconnect(value: Boolean | FailAfter): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReconnectUndefined: Self = StObject.set(x, "reconnect", js.undefined)
    
    @scala.inline
    def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
    
    @scala.inline
    def setStrictDN(value: Boolean): Self = StObject.set(x, "strictDN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictDNUndefined: Self = StObject.set(x, "strictDN", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setTlsOptions(value: js.Object): Self = StObject.set(x, "tlsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsOptionsUndefined: Self = StObject.set(x, "tlsOptions", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
