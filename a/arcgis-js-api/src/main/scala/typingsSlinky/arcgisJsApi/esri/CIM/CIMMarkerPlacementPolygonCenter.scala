package typingsSlinky.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMMarkerPlacementPolygonCenter
  extends CIMMarkerPlacementBase
     with CIMMarkerPlacementType {
  
  /**
    * A value indicating whether the marker should be clipped if it extends pasts the boundary of the polygon.
    */
  var clipAtBoundary: js.UndefOr[Boolean] = js.native
  
  /**
    * The method used to determine the polygon center.
    */
  var method: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementPolygonCenterMethod * / any */ String
  ] = js.native
  
  /**
    * The value which offsets the marker horizontally from the center.
    */
  var offsetX: js.UndefOr[Double] = js.native
  
  /**
    * The value which offsets the marker vertically from the center.
    */
  var offsetY: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CIMMarkerPlacementPolygonCenter: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementPolygonCenter = js.native
}
object CIMMarkerPlacementPolygonCenter {
  
  @scala.inline
  def apply(`type`: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementPolygonCenter): CIMMarkerPlacementPolygonCenter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMMarkerPlacementPolygonCenter]
  }
  
  @scala.inline
  implicit class CIMMarkerPlacementPolygonCenterMutableBuilder[Self <: CIMMarkerPlacementPolygonCenter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClipAtBoundary(value: Boolean): Self = StObject.set(x, "clipAtBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipAtBoundaryUndefined: Self = StObject.set(x, "clipAtBoundary", js.undefined)
    
    @scala.inline
    def setMethod(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementPolygonCenterMethod * / any */ String
    ): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementPolygonCenter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
