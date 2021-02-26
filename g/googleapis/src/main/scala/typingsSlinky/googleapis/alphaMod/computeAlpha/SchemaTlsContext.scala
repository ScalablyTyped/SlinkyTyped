package typingsSlinky.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The TLS settings for the client or server.
  */
@js.native
trait SchemaTlsContext extends StObject {
  
  /**
    * Defines the mechanism to obtain the client or server certificate.
    */
  var certificateContext: js.UndefOr[SchemaTlsCertificateContext] = js.native
  
  /**
    * Defines the mechanism to obtain the Certificate Authority certificate to
    * validate the client/server certificate. If omitted, the proxy will not
    * validate the server or client certificate.
    */
  var validationContext: js.UndefOr[SchemaTlsValidationContext] = js.native
}
object SchemaTlsContext {
  
  @scala.inline
  def apply(): SchemaTlsContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTlsContext]
  }
  
  @scala.inline
  implicit class SchemaTlsContextMutableBuilder[Self <: SchemaTlsContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateContext(value: SchemaTlsCertificateContext): Self = StObject.set(x, "certificateContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateContextUndefined: Self = StObject.set(x, "certificateContext", js.undefined)
    
    @scala.inline
    def setValidationContext(value: SchemaTlsValidationContext): Self = StObject.set(x, "validationContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationContextUndefined: Self = StObject.set(x, "validationContext", js.undefined)
  }
}
