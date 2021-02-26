package typingsSlinky.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Diagnostic extends StObject {
  
  /** The kind of diagnostic information provided. */
  var kind: js.UndefOr[String] = js.native
  
  /** File name and line number of the error or warning. */
  var location: js.UndefOr[String] = js.native
  
  /** Message describing the error or warning. */
  var message: js.UndefOr[String] = js.native
}
object Diagnostic {
  
  @scala.inline
  def apply(): Diagnostic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Diagnostic]
  }
  
  @scala.inline
  implicit class DiagnosticMutableBuilder[Self <: Diagnostic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
