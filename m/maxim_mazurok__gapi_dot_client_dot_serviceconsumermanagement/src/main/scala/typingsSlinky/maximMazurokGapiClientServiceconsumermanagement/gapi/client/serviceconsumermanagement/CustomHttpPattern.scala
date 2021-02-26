package typingsSlinky.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomHttpPattern extends StObject {
  
  /** The name of this custom HTTP verb. */
  var kind: js.UndefOr[String] = js.native
  
  /** The path matched by this custom verb. */
  var path: js.UndefOr[String] = js.native
}
object CustomHttpPattern {
  
  @scala.inline
  def apply(): CustomHttpPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomHttpPattern]
  }
  
  @scala.inline
  implicit class CustomHttpPatternMutableBuilder[Self <: CustomHttpPattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
