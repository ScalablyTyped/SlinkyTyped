package typingsSlinky.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMGeometricEffectOffset
  extends CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The way the strokes or fills are displayed at corners.
    */
  var method: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectOffsetMethod * / any */ String
  ] = js.native
  
  /**
    * The distance of the symbol perpendicular to the feature geometry.
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * The way the symbol handles complex geometries.
    */
  var option: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectOffsetOption * / any */ String
  ] = js.native
  
  @JSName("type")
  var type_CIMGeometricEffectOffset: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectOffset = js.native
}
object CIMGeometricEffectOffset {
  
  @scala.inline
  def apply(`type`: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectOffset): CIMGeometricEffectOffset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGeometricEffectOffset]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectOffsetMutableBuilder[Self <: CIMGeometricEffectOffset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectOffsetMethod * / any */ String
    ): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOption(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectOffsetOption * / any */ String
    ): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectOffset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
