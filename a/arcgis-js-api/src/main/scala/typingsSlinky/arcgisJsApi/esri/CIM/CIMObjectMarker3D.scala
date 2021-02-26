package typingsSlinky.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMObjectMarker3D
  extends CIMMarker
     with CIMSymbolLayerType {
  
  /**
    * The array of levels of detail.
    */
  var LODs: js.UndefOr[js.Array[CIMObjectMarker3DLOD]] = js.native
  
  /**
    * The marker depth.
    */
  var depth: js.UndefOr[Double] = js.native
  
  /**
    * A value indicating whether the model can be exported.
    */
  var isRestricted: js.UndefOr[Boolean] = js.native
  
  /**
    * The URI of the binary reference containing the "web resource".
    */
  var modelURI: js.UndefOr[String] = js.native
  
  /**
    * The representative image of the marker.
    */
  var thumbnail: js.UndefOr[String] = js.native
  
  /**
    * The color which defines the color that is applied to the marker.
    */
  var tintColor: js.UndefOr[js.Array[Double]] = js.native
  
  @JSName("type")
  var type_CIMObjectMarker3D: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMObjectMarker3D = js.native
  
  /**
    * A value indicating whether or not to ignore the marker anchor point and insert the model directly at the data point.
    */
  var useAnchorPoint: js.UndefOr[Boolean] = js.native
  
  /**
    * The marker width.
    */
  var width: js.UndefOr[Double] = js.native
}
object CIMObjectMarker3D {
  
  @scala.inline
  def apply(`type`: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMObjectMarker3D): CIMObjectMarker3D = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMObjectMarker3D]
  }
  
  @scala.inline
  implicit class CIMObjectMarker3DMutableBuilder[Self <: CIMObjectMarker3D] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    @scala.inline
    def setIsRestricted(value: Boolean): Self = StObject.set(x, "isRestricted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRestrictedUndefined: Self = StObject.set(x, "isRestricted", js.undefined)
    
    @scala.inline
    def setLODs(value: js.Array[CIMObjectMarker3DLOD]): Self = StObject.set(x, "LODs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLODsUndefined: Self = StObject.set(x, "LODs", js.undefined)
    
    @scala.inline
    def setLODsVarargs(value: CIMObjectMarker3DLOD*): Self = StObject.set(x, "LODs", js.Array(value :_*))
    
    @scala.inline
    def setModelURI(value: String): Self = StObject.set(x, "modelURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelURIUndefined: Self = StObject.set(x, "modelURI", js.undefined)
    
    @scala.inline
    def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    
    @scala.inline
    def setTintColor(value: js.Array[Double]): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    @scala.inline
    def setTintColorVarargs(value: Double*): Self = StObject.set(x, "tintColor", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMObjectMarker3D): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseAnchorPoint(value: Boolean): Self = StObject.set(x, "useAnchorPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseAnchorPointUndefined: Self = StObject.set(x, "useAnchorPoint", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
