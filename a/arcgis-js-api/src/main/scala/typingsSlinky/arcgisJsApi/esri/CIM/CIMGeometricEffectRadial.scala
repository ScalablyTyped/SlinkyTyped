package typingsSlinky.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMGeometricEffectRadial
  extends CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The orientation of the line from the marker. The angle is calculated in a counterclockwise manner with 0 degrees equal to due east.
    */
  var angle: js.UndefOr[Double] = js.native
  
  /**
    * The distance of the line from end to end.
    */
  var length: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CIMGeometricEffectRadial: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectRadial = js.native
}
object CIMGeometricEffectRadial {
  
  @scala.inline
  def apply(`type`: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectRadial): CIMGeometricEffectRadial = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGeometricEffectRadial]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectRadialMutableBuilder[Self <: CIMGeometricEffectRadial] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectRadial): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
