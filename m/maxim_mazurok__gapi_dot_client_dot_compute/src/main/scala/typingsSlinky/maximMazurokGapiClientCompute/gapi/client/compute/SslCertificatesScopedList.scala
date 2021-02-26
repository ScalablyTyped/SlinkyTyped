package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SslCertificatesScopedList extends StObject {
  
  /** List of SslCertificates contained in this scope. */
  var sslCertificates: js.UndefOr[js.Array[SslCertificate]] = js.native
  
  /** Informational warning which replaces the list of backend services when the list is empty. */
  var warning: js.UndefOr[Code] = js.native
}
object SslCertificatesScopedList {
  
  @scala.inline
  def apply(): SslCertificatesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslCertificatesScopedList]
  }
  
  @scala.inline
  implicit class SslCertificatesScopedListMutableBuilder[Self <: SslCertificatesScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSslCertificates(value: js.Array[SslCertificate]): Self = StObject.set(x, "sslCertificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslCertificatesUndefined: Self = StObject.set(x, "sslCertificates", js.undefined)
    
    @scala.inline
    def setSslCertificatesVarargs(value: SslCertificate*): Self = StObject.set(x, "sslCertificates", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
