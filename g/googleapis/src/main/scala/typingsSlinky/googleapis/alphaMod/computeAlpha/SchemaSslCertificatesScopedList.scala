package typingsSlinky.googleapis.alphaMod.computeAlpha

import typingsSlinky.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSslCertificatesScopedList extends StObject {
  
  /**
    * List of SslCertificates contained in this scope.
    */
  var sslCertificates: js.UndefOr[js.Array[SchemaSslCertificate]] = js.native
  
  /**
    * Informational warning which replaces the list of backend services when
    * the list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}
object SchemaSslCertificatesScopedList {
  
  @scala.inline
  def apply(): SchemaSslCertificatesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslCertificatesScopedList]
  }
  
  @scala.inline
  implicit class SchemaSslCertificatesScopedListMutableBuilder[Self <: SchemaSslCertificatesScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSslCertificates(value: js.Array[SchemaSslCertificate]): Self = StObject.set(x, "sslCertificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslCertificatesUndefined: Self = StObject.set(x, "sslCertificates", js.undefined)
    
    @scala.inline
    def setSslCertificatesVarargs(value: SchemaSslCertificate*): Self = StObject.set(x, "sslCertificates", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
