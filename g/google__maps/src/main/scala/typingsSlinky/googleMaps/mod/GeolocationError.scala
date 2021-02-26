package typingsSlinky.googleMaps.mod

import typingsSlinky.googleMaps.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeolocationError extends StObject {
  
  var error: Code = js.native
}
object GeolocationError {
  
  @scala.inline
  def apply(error: Code): GeolocationError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationError]
  }
  
  @scala.inline
  implicit class GeolocationErrorMutableBuilder[Self <: GeolocationError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Code): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
