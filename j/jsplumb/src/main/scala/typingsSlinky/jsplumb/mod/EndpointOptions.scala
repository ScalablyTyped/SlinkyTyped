package typingsSlinky.jsplumb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointOptions extends js.Object {
  var anchor: js.UndefOr[AnchorSpec] = js.native
  var connectionType: js.UndefOr[String] = js.native
  var connectionsDetachable: js.UndefOr[Boolean] = js.native
  var connector: js.UndefOr[ConnectorSpec] = js.native
  var `connector-pointer-events`: js.UndefOr[String] = js.native
  var connectorClass: js.UndefOr[String] = js.native
  var connectorHoverClass: js.UndefOr[String] = js.native
  var connectorHoverStyle: js.UndefOr[PaintStyle] = js.native
  var connectorOverlays: js.UndefOr[js.Array[OverlaySpec]] = js.native
  var connectorStyle: js.UndefOr[PaintStyle] = js.native
  var cssClass: js.UndefOr[String] = js.native
  //= 1?
  var dragOptions: js.UndefOr[DragOptions] = js.native
  var dragProxy: js.UndefOr[String | js.Array[String]] = js.native
  var dropOptions: js.UndefOr[DropOptions] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var endpoint: js.UndefOr[EndpointSpec] = js.native
  var hoverClass: js.UndefOr[String] = js.native
  var hoverPaintStyle: js.UndefOr[PaintStyle] = js.native
  var id: js.UndefOr[String] = js.native
  //= true
  var isSource: js.UndefOr[Boolean] = js.native
  //= false
  var isTarget: js.UndefOr[Boolean] = js.native
  var maxConnections: Double = js.native
   // "Dot", etc.
  var overlays: js.UndefOr[js.Array[OverlaySpec]] = js.native
  //= true
  var paintStyle: js.UndefOr[PaintStyle] = js.native
  //= false
  var parameters: js.UndefOr[js.Object] = js.native
  //= false
  var reattach: js.UndefOr[Boolean] = js.native
  var reattachConnections: js.UndefOr[Boolean] = js.native
  var scope: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object EndpointOptions {
  @scala.inline
  def apply(maxConnections: Double): EndpointOptions = {
    val __obj = js.Dynamic.literal(maxConnections = maxConnections.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointOptions]
  }
  @scala.inline
  implicit class EndpointOptionsOps[Self <: EndpointOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxConnections(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConnections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnchor(value: AnchorSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionType")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionsDetachable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionsDetachable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionsDetachable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionsDetachable")(js.undefined)
        ret
    }
    @scala.inline
    def withConnector(value: ConnectorSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connector")(js.undefined)
        ret
    }
    @scala.inline
    def `withConnector-pointer-events`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connector-pointer-events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutConnector-pointer-events`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connector-pointer-events")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectorClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectorClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorClass")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectorHoverClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorHoverClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectorHoverClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorHoverClass")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectorHoverStyle(value: PaintStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorHoverStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectorHoverStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorHoverStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectorOverlays(value: js.Array[OverlaySpec]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorOverlays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectorOverlays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorOverlays")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectorStyle(value: PaintStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDragOptions(value: DragOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDragProxy(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withDropOptions(value: DropOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoint(value: EndpointSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverClass")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverPaintStyle(value: PaintStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverPaintStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverPaintStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverPaintStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSource(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSource")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTarget(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlays(value: js.Array[OverlaySpec]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlays")(js.undefined)
        ret
    }
    @scala.inline
    def withPaintStyle(value: PaintStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paintStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaintStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paintStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withReattach(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reattach")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReattach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reattach")(js.undefined)
        ret
    }
    @scala.inline
    def withReattachConnections(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reattachConnections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReattachConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reattachConnections")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

