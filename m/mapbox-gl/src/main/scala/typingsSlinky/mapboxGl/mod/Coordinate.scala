package typingsSlinky.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Coordinate extends StObject {
  
  var canonical: CanonicalCoordinate = js.native
  
  var key: Double = js.native
  
  var wrap: Double = js.native
}
object Coordinate {
  
  @scala.inline
  def apply(canonical: CanonicalCoordinate, key: Double, wrap: Double): Coordinate = {
    val __obj = js.Dynamic.literal(canonical = canonical.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coordinate]
  }
  
  @scala.inline
  implicit class CoordinateMutableBuilder[Self <: Coordinate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanonical(value: CanonicalCoordinate): Self = StObject.set(x, "canonical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrap(value: Double): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
  }
}
