package typingsSlinky.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMGeometricEffectOffsetTangent
  extends CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The origin of the tangent offset for the line. The beginning and end of the lines are defined by how the line was digitized.
    */
  var method: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectOffsetTangentMethod * / any */ String
  ] = js.native
  
  /**
    * The distance the geometry is moved tangent.
    */
  var offset: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CIMGeometricEffectOffsetTangent: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectOffsetTangent = js.native
}
object CIMGeometricEffectOffsetTangent {
  
  @scala.inline
  def apply(`type`: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectOffsetTangent): CIMGeometricEffectOffsetTangent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGeometricEffectOffsetTangent]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectOffsetTangentMutableBuilder[Self <: CIMGeometricEffectOffsetTangent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectOffsetTangentMethod * / any */ String
    ): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectOffsetTangent): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
