package typingsSlinky.jsplumb.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectParams extends StObject {
  
  var anchor: js.UndefOr[AnchorSpec] = js.native
  
  var anchors: js.UndefOr[js.Tuple2[AnchorSpec, AnchorSpec]] = js.native
  
  var connector: js.UndefOr[ConnectorSpec] = js.native
  
  var cssClass: js.UndefOr[String] = js.native
  
  var deleteEndpointsOnDetach: js.UndefOr[Boolean] = js.native
  
  var detachable: js.UndefOr[Boolean] = js.native
  
  var endpoint: js.UndefOr[EndpointSpec] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var overlays: js.UndefOr[js.Array[OverlaySpec]] = js.native
  
  var parameters: js.UndefOr[Record[String, _]] = js.native
  
  var source: js.UndefOr[ElementRef | Endpoint] = js.native
  
  var target: js.UndefOr[ElementRef | Endpoint] = js.native
  
  var uuids: js.UndefOr[js.Tuple2[UUID, UUID]] = js.native
}
object ConnectParams {
  
  @scala.inline
  def apply(): ConnectParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectParams]
  }
  
  @scala.inline
  implicit class ConnectParamsMutableBuilder[Self <: ConnectParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: AnchorSpec): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setAnchorVarargs(value: (AnchorStaticSpec | AnchorDynamicId | AnchorPerimeterSpec | AnchorContinuousSpec)*): Self = StObject.set(x, "anchor", js.Array(value :_*))
    
    @scala.inline
    def setAnchors(value: js.Tuple2[AnchorSpec, AnchorSpec]): Self = StObject.set(x, "anchors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorsUndefined: Self = StObject.set(x, "anchors", js.undefined)
    
    @scala.inline
    def setConnector(value: ConnectorSpec): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorUndefined: Self = StObject.set(x, "connector", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    @scala.inline
    def setDeleteEndpointsOnDetach(value: Boolean): Self = StObject.set(x, "deleteEndpointsOnDetach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteEndpointsOnDetachUndefined: Self = StObject.set(x, "deleteEndpointsOnDetach", js.undefined)
    
    @scala.inline
    def setDetachable(value: Boolean): Self = StObject.set(x, "detachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetachableUndefined: Self = StObject.set(x, "detachable", js.undefined)
    
    @scala.inline
    def setEndpoint(value: EndpointSpec): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setOverlays(value: js.Array[OverlaySpec]): Self = StObject.set(x, "overlays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlaysUndefined: Self = StObject.set(x, "overlays", js.undefined)
    
    @scala.inline
    def setOverlaysVarargs(value: OverlaySpec*): Self = StObject.set(x, "overlays", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: Record[String, _]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setSource(value: ElementRef | Endpoint): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceElement(value: Element): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTarget(value: ElementRef | Endpoint): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetElement(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setUuids(value: js.Tuple2[UUID, UUID]): Self = StObject.set(x, "uuids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuidsUndefined: Self = StObject.set(x, "uuids", js.undefined)
  }
}
