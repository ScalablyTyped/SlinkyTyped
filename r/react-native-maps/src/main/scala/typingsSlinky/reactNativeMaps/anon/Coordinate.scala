package typingsSlinky.reactNativeMaps.anon

import typingsSlinky.reactNativeMaps.mod.LatLng
import typingsSlinky.reactNativeMaps.mod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Coordinate extends StObject {
  
  var coordinate: LatLng = js.native
  
  var position: Point = js.native
}
object Coordinate {
  
  @scala.inline
  def apply(coordinate: LatLng, position: Point): Coordinate = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coordinate]
  }
  
  @scala.inline
  implicit class CoordinateMutableBuilder[Self <: Coordinate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinate(value: LatLng): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
