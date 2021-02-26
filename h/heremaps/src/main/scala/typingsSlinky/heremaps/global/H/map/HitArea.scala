package typingsSlinky.heremaps.global.H.map

import typingsSlinky.heremaps.H.map.HitArea.ShapeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents an area that objects, like a marker, occupies in the screen space, meaning that object can be probed and returned by H.Map@getObjectsAt method.
  */
@JSGlobal("H.map.HitArea")
@js.native
class HitArea protected ()
  extends typingsSlinky.heremaps.H.map.HitArea {
  /**
    * Constructor
    * @param shapeType {H.map.HitArea.ShapeType} - The shape type of the HitArea
    * @param opt_values {Array<number>=} - The type-dependent values to define the shape of the hit area. The format for the different types are:
    */
  def this(shapeType: ShapeType) = this()
  def this(shapeType: ShapeType, opt_values: js.Array[Double]) = this()
}
object HitArea {
  
  /**
    * Enumeration represents possible shape types that HitArea can have.
    */
  @JSGlobal("H.map.HitArea.ShapeType")
  @js.native
  object ShapeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.heremaps.H.map.HitArea.ShapeType with Double] = js.native
    
    /* 2 */ val CIRCLE: typingsSlinky.heremaps.H.map.HitArea.ShapeType.CIRCLE with Double = js.native
    
    /* 0 */ val NONE: typingsSlinky.heremaps.H.map.HitArea.ShapeType.NONE with Double = js.native
    
    /* 3 */ val POLYGON: typingsSlinky.heremaps.H.map.HitArea.ShapeType.POLYGON with Double = js.native
    
    /* 1 */ val RECT: typingsSlinky.heremaps.H.map.HitArea.ShapeType.RECT with Double = js.native
  }
}
