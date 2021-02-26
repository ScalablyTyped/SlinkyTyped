package typingsSlinky.googleapis.fusiontablesV1Mod.fusiontablesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a point object.
  */
@js.native
trait SchemaPoint extends StObject {
  
  /**
    * The coordinates that define the point.
    */
  var coordinates: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Point: A point geometry.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaPoint {
  
  @scala.inline
  def apply(): SchemaPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPoint]
  }
  
  @scala.inline
  implicit class SchemaPointMutableBuilder[Self <: SchemaPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinates(value: js.Array[Double]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    @scala.inline
    def setCoordinatesVarargs(value: Double*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
