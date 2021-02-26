package typingsSlinky.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMSymbolLayerBase extends StObject {
  
  /**
    * A value indicating whether the color set at the basic properties level is applied to the symbol layer. If the symbol layer is color locked then changes made to the color in the basic properties will not be applied to the symbol layer.
    */
  var colorLocked: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the geometric effects that are applied to the symbol layer. Effects dynamically alter the feature geometry when the symbology is applied. Multiple effects applied to a symbol layer are rendered sequentially.
    */
  var effects: js.UndefOr[js.Array[CIMGeometricEffectType]] = js.native
  
  /**
    * A value indicating whether the symbol layer is visible. The symbol layer draws only when enabled. Currently, an invisible layer is not considered in any transformations when in a 3D context.
    */
  var enable: js.UndefOr[Boolean] = js.native
  
  /**
    * The internal name of the symbol layer used for symbol level drawing.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A value indicating whether or not the symbol layer should overprint in press printing.
    */
  var overprint: js.UndefOr[Boolean] = js.native
  
  /**
    * The primitive name.
    */
  var primitiveName: js.UndefOr[String] = js.native
  
  var `type`: String = js.native
}
object CIMSymbolLayerBase {
  
  @scala.inline
  def apply(`type`: String): CIMSymbolLayerBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMSymbolLayerBase]
  }
  
  @scala.inline
  implicit class CIMSymbolLayerBaseMutableBuilder[Self <: CIMSymbolLayerBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorLocked(value: Boolean): Self = StObject.set(x, "colorLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorLockedUndefined: Self = StObject.set(x, "colorLocked", js.undefined)
    
    @scala.inline
    def setEffects(value: js.Array[CIMGeometricEffectType]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
    
    @scala.inline
    def setEffectsVarargs(value: CIMGeometricEffectType*): Self = StObject.set(x, "effects", js.Array(value :_*))
    
    @scala.inline
    def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOverprint(value: Boolean): Self = StObject.set(x, "overprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverprintUndefined: Self = StObject.set(x, "overprint", js.undefined)
    
    @scala.inline
    def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
