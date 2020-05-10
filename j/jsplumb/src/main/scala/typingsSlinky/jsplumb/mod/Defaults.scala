package typingsSlinky.jsplumb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Defaults extends js.Object {
  var Anchor: js.UndefOr[AnchorSpec] = js.native
  var Anchors: js.UndefOr[js.Tuple2[AnchorSpec, AnchorSpec]] = js.native
  var ConnectionOverlays: js.UndefOr[js.Array[OverlaySpec]] = js.native
  var ConnectionsDetachable: js.UndefOr[Boolean] = js.native
  var Connector: js.UndefOr[ConnectorSpec] = js.native
  var Container: js.UndefOr[js.Any] = js.native
   // string(selector or id) or element
  var DragOptions: js.UndefOr[typingsSlinky.jsplumb.mod.DragOptions] = js.native
  var Endpoint: js.UndefOr[EndpointSpec] = js.native
  var EndpointHoverStyle: js.UndefOr[PaintStyle] = js.native
  var EndpointStyle: js.UndefOr[PaintStyle] = js.native
  var Endpoints: js.UndefOr[js.Tuple2[EndpointSpec, EndpointSpec]] = js.native
  var HoverPaintStyle: js.UndefOr[PaintStyle] = js.native
  var PaintStyle: js.UndefOr[typingsSlinky.jsplumb.mod.PaintStyle] = js.native
  var ReattachConnections: js.UndefOr[Boolean] = js.native
}

object Defaults {
  @scala.inline
  def apply(): Defaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Defaults]
  }
  @scala.inline
  implicit class DefaultsOps[Self <: Defaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchor(value: AnchorSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Anchor")(js.undefined)
        ret
    }
    @scala.inline
    def withAnchors(value: js.Tuple2[AnchorSpec, AnchorSpec]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Anchors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Anchors")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionOverlays(value: js.Array[OverlaySpec]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionOverlays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionOverlays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionOverlays")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionsDetachable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionsDetachable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionsDetachable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionsDetachable")(js.undefined)
        ret
    }
    @scala.inline
    def withConnector(value: ConnectorSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Connector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Connector")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Container")(js.undefined)
        ret
    }
    @scala.inline
    def withDragOptions(value: DragOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DragOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DragOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoint(value: EndpointSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointHoverStyle(value: PaintStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointHoverStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointHoverStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointHoverStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointStyle(value: PaintStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoints(value: js.Tuple2[EndpointSpec, EndpointSpec]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverPaintStyle(value: PaintStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HoverPaintStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverPaintStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HoverPaintStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPaintStyle(value: PaintStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaintStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaintStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaintStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withReattachConnections(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReattachConnections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReattachConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReattachConnections")(js.undefined)
        ret
    }
  }
  
}

