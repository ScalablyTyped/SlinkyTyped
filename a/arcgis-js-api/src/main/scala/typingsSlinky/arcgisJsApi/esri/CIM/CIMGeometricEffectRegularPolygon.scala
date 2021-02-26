package typingsSlinky.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMGeometricEffectRegularPolygon
  extends CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The amount of rotation for the polygon.
    */
  var angle: js.UndefOr[Double] = js.native
  
  /**
    * The number of sides for the polygon. Specifying a value less than 3 produces a circle.
    */
  var edges: js.UndefOr[Double] = js.native
  
  /**
    * The distance from the center of the polygon.
    */
  var radius: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CIMGeometricEffectRegularPolygon: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectRegularPolygon = js.native
}
object CIMGeometricEffectRegularPolygon {
  
  @scala.inline
  def apply(`type`: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectRegularPolygon): CIMGeometricEffectRegularPolygon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGeometricEffectRegularPolygon]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectRegularPolygonMutableBuilder[Self <: CIMGeometricEffectRegularPolygon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setEdges(value: Double): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectRegularPolygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
