package typingsSlinky.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaOptions extends StObject {
  
  /** Optional. Refers to the "CA" X.509 extension, which is a boolean value. When this value is missing, the extension will be omitted from the CA certificate. */
  var isCa: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. Refers to the path length restriction X.509 extension. For a CA certificate, this value describes the depth of subordinate CA certificates that are allowed. If this value
    * is less than 0, the request will fail. If this value is missing, the max path length will be omitted from the CA certificate.
    */
  var maxIssuerPathLength: js.UndefOr[Double] = js.native
}
object CaOptions {
  
  @scala.inline
  def apply(): CaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaOptions]
  }
  
  @scala.inline
  implicit class CaOptionsMutableBuilder[Self <: CaOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsCa(value: Boolean): Self = StObject.set(x, "isCa", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCaUndefined: Self = StObject.set(x, "isCa", js.undefined)
    
    @scala.inline
    def setMaxIssuerPathLength(value: Double): Self = StObject.set(x, "maxIssuerPathLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxIssuerPathLengthUndefined: Self = StObject.set(x, "maxIssuerPathLength", js.undefined)
  }
}
