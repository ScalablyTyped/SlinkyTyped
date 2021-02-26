package typingsSlinky.mapboxMapboxSdk.directionsMod

import typingsSlinky.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionsService extends StObject {
  
  def getDirections(request: DirectionsRequest): MapiRequest = js.native
}
object DirectionsService {
  
  @scala.inline
  def apply(getDirections: DirectionsRequest => MapiRequest): DirectionsService = {
    val __obj = js.Dynamic.literal(getDirections = js.Any.fromFunction1(getDirections))
    __obj.asInstanceOf[DirectionsService]
  }
  
  @scala.inline
  implicit class DirectionsServiceMutableBuilder[Self <: DirectionsService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDirections(value: DirectionsRequest => MapiRequest): Self = StObject.set(x, "getDirections", js.Any.fromFunction1(value))
  }
}
