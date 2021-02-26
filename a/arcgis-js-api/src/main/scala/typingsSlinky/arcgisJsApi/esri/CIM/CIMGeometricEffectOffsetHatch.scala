package typingsSlinky.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMGeometricEffectOffsetHatch
  extends CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The length of the offset hatch.
    */
  var length: js.UndefOr[Double] = js.native
  
  /**
    * The spacing of the offset hatch.
    */
  var spacing: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CIMGeometricEffectOffsetHatch: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectOffsetHatch = js.native
}
object CIMGeometricEffectOffsetHatch {
  
  @scala.inline
  def apply(`type`: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectOffsetHatch): CIMGeometricEffectOffsetHatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGeometricEffectOffsetHatch]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectOffsetHatchMutableBuilder[Self <: CIMGeometricEffectOffsetHatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectOffsetHatch): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
