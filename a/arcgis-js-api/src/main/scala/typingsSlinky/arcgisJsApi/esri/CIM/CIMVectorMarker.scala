package typingsSlinky.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMVectorMarker
  extends CIMMarker
     with CIMSymbolLayerType {
  
  /**
    * A clipping path for the vector marker graphics.
    */
  var clippingPath: js.UndefOr[CIMClippingPath] = js.native
  
  /**
    * The depth of the marker when drawn in 3D.
    */
  var depth3D: js.UndefOr[Double] = js.native
  
  /**
    * The outer boundary of the entire vector marker.
    */
  var frame: js.UndefOr[ExternalReferenceEnvelope] = js.native
  
  /**
    * The vector graphics that define the shape of the marker.
    */
  var markerGraphics: js.UndefOr[js.Array[CIMMarkerGraphic]] = js.native
  
  /**
    * A value indicating whether the frame of the vector marker should be honored when drawing the marker.
    */
  var respectFrame: js.UndefOr[Boolean] = js.native
  
  /**
    * A value indicating whether the strokes and or fills of a marker are scaled proportionally when the symbol size is changed. When enabled, the strokes for the outline or fill of the polygon symbol used to draw the marker will be scaled proportionally with changes to the symbol size. If this property is not enabled, then the stroke will draw with the specified width regardless of the marker size.
    */
  var scaleSymbolsProportionally: js.UndefOr[Boolean] = js.native
  
  @JSName("type")
  var type_CIMVectorMarker: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMVectorMarker = js.native
  
  /**
    * A value indicating whether the marker stands upright as though locked in place. The marker can be viewed from all angles.
    */
  var verticalOrientation3D: js.UndefOr[Boolean] = js.native
}
object CIMVectorMarker {
  
  @scala.inline
  def apply(`type`: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMVectorMarker): CIMVectorMarker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMVectorMarker]
  }
  
  @scala.inline
  implicit class CIMVectorMarkerMutableBuilder[Self <: CIMVectorMarker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClippingPath(value: CIMClippingPath): Self = StObject.set(x, "clippingPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClippingPathUndefined: Self = StObject.set(x, "clippingPath", js.undefined)
    
    @scala.inline
    def setDepth3D(value: Double): Self = StObject.set(x, "depth3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepth3DUndefined: Self = StObject.set(x, "depth3D", js.undefined)
    
    @scala.inline
    def setFrame(value: ExternalReferenceEnvelope): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
    
    @scala.inline
    def setMarkerGraphics(value: js.Array[CIMMarkerGraphic]): Self = StObject.set(x, "markerGraphics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerGraphicsUndefined: Self = StObject.set(x, "markerGraphics", js.undefined)
    
    @scala.inline
    def setMarkerGraphicsVarargs(value: CIMMarkerGraphic*): Self = StObject.set(x, "markerGraphics", js.Array(value :_*))
    
    @scala.inline
    def setRespectFrame(value: Boolean): Self = StObject.set(x, "respectFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRespectFrameUndefined: Self = StObject.set(x, "respectFrame", js.undefined)
    
    @scala.inline
    def setScaleSymbolsProportionally(value: Boolean): Self = StObject.set(x, "scaleSymbolsProportionally", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleSymbolsProportionallyUndefined: Self = StObject.set(x, "scaleSymbolsProportionally", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMVectorMarker): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalOrientation3D(value: Boolean): Self = StObject.set(x, "verticalOrientation3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalOrientation3DUndefined: Self = StObject.set(x, "verticalOrientation3D", js.undefined)
  }
}
