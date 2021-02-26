package typingsSlinky.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrinterXri extends StObject {
  
  var `xri-authentication`: js.UndefOr[XriAuthentication] = js.native
  
  var `xri-security`: js.UndefOr[XriSecurity] = js.native
  
  var `xri-uri`: js.UndefOr[String] = js.native
}
object PrinterXri {
  
  @scala.inline
  def apply(): PrinterXri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrinterXri]
  }
  
  @scala.inline
  implicit class PrinterXriMutableBuilder[Self <: PrinterXri] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setXri-authentication`(value: XriAuthentication): Self = StObject.set(x, "xri-authentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setXri-authenticationUndefined`: Self = StObject.set(x, "xri-authentication", js.undefined)
    
    @scala.inline
    def `setXri-security`(value: XriSecurity): Self = StObject.set(x, "xri-security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setXri-securityUndefined`: Self = StObject.set(x, "xri-security", js.undefined)
    
    @scala.inline
    def `setXri-uri`(value: String): Self = StObject.set(x, "xri-uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setXri-uriUndefined`: Self = StObject.set(x, "xri-uri", js.undefined)
  }
}
