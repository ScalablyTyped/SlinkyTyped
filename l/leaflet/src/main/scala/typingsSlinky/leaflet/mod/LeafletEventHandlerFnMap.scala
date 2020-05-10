package typingsSlinky.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeafletEventHandlerFnMap extends js.Object {
  var add: js.UndefOr[LeafletEventHandlerFn] = js.native
  var autopanstart: js.UndefOr[LeafletEventHandlerFn] = js.native
  var baselayerchange: js.UndefOr[LayersControlEventHandlerFn] = js.native
  var click: js.UndefOr[LeafletMouseEventHandlerFn] = js.native
  var contextmenu: js.UndefOr[LeafletMouseEventHandlerFn] = js.native
  var dblclick: js.UndefOr[LeafletMouseEventHandlerFn] = js.native
  var down: js.UndefOr[LeafletEventHandlerFn] = js.native
  var drag: js.UndefOr[LeafletEventHandlerFn] = js.native
  var dragend: js.UndefOr[DragEndEventHandlerFn] = js.native
  var dragstart: js.UndefOr[LeafletEventHandlerFn] = js.native
  var error: js.UndefOr[LeafletEventHandlerFn] = js.native
  var keydown: js.UndefOr[LeafletKeyboardEventHandlerFn] = js.native
  var keypress: js.UndefOr[LeafletKeyboardEventHandlerFn] = js.native
  var keyup: js.UndefOr[LeafletKeyboardEventHandlerFn] = js.native
  var layeradd: js.UndefOr[LayerEventHandlerFn] = js.native
  var layerremove: js.UndefOr[LayerEventHandlerFn] = js.native
  var load: js.UndefOr[LeafletEventHandlerFn] = js.native
  var loading: js.UndefOr[LeafletEventHandlerFn] = js.native
  var locationerror: js.UndefOr[ErrorEventHandlerFn] = js.native
  var locationfound: js.UndefOr[LocationEventHandlerFn] = js.native
  var mousedown: js.UndefOr[LeafletMouseEventHandlerFn] = js.native
  var mousemove: js.UndefOr[LeafletMouseEventHandlerFn] = js.native
  var mouseout: js.UndefOr[LeafletMouseEventHandlerFn] = js.native
  var mouseover: js.UndefOr[LeafletMouseEventHandlerFn] = js.native
  var mouseup: js.UndefOr[LeafletMouseEventHandlerFn] = js.native
  var move: js.UndefOr[LeafletEventHandlerFn] = js.native
  var moveend: js.UndefOr[LeafletEventHandlerFn] = js.native
  var movestart: js.UndefOr[LeafletEventHandlerFn] = js.native
  var overlayadd: js.UndefOr[LayersControlEventHandlerFn] = js.native
  var overlayremove: js.UndefOr[LayersControlEventHandlerFn] = js.native
  var popupclose: js.UndefOr[PopupEventHandlerFn] = js.native
  var popupopen: js.UndefOr[PopupEventHandlerFn] = js.native
  var preclick: js.UndefOr[LeafletMouseEventHandlerFn] = js.native
  var predrag: js.UndefOr[LeafletEventHandlerFn] = js.native
  var remove: js.UndefOr[LeafletEventHandlerFn] = js.native
  var resize: js.UndefOr[ResizeEventHandlerFn] = js.native
  var tileerror: js.UndefOr[TileErrorEventHandlerFn] = js.native
  var tileload: js.UndefOr[TileEventHandlerFn] = js.native
  var tileloadstart: js.UndefOr[TileEventHandlerFn] = js.native
  var tileunload: js.UndefOr[TileEventHandlerFn] = js.native
  var tooltipclose: js.UndefOr[TooltipEventHandlerFn] = js.native
  var tooltipopen: js.UndefOr[TooltipEventHandlerFn] = js.native
  var unload: js.UndefOr[LeafletEventHandlerFn] = js.native
  var update: js.UndefOr[LeafletEventHandlerFn] = js.native
  var viewreset: js.UndefOr[LeafletEventHandlerFn] = js.native
  var zoom: js.UndefOr[LeafletEventHandlerFn] = js.native
  var zoomanim: js.UndefOr[ZoomAnimEventHandlerFn] = js.native
  var zoomend: js.UndefOr[LeafletEventHandlerFn] = js.native
  var zoomlevelschange: js.UndefOr[LeafletEventHandlerFn] = js.native
  var zoomstart: js.UndefOr[LeafletEventHandlerFn] = js.native
}

object LeafletEventHandlerFnMap {
  @scala.inline
  def apply(): LeafletEventHandlerFnMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeafletEventHandlerFnMap]
  }
  @scala.inline
  implicit class LeafletEventHandlerFnMapOps[Self <: LeafletEventHandlerFnMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.undefined)
        ret
    }
    @scala.inline
    def withAutopanstart(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autopanstart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAutopanstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autopanstart")(js.undefined)
        ret
    }
    @scala.inline
    def withBaselayerchange(value: /* event */ LayersControlEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselayerchange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBaselayerchange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselayerchange")(js.undefined)
        ret
    }
    @scala.inline
    def withClick(value: /* event */ LeafletMouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.undefined)
        ret
    }
    @scala.inline
    def withContextmenu(value: /* event */ LeafletMouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextmenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContextmenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextmenu")(js.undefined)
        ret
    }
    @scala.inline
    def withDblclick(value: /* event */ LeafletMouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDblclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(js.undefined)
        ret
    }
    @scala.inline
    def withDown(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(js.undefined)
        ret
    }
    @scala.inline
    def withDrag(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.undefined)
        ret
    }
    @scala.inline
    def withDragend(value: /* event */ DragEndEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragend")(js.undefined)
        ret
    }
    @scala.inline
    def withDragstart(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragstart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragstart")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withKeydown(value: /* event */ LeafletKeyboardEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keydown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutKeydown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keydown")(js.undefined)
        ret
    }
    @scala.inline
    def withKeypress(value: /* event */ LeafletKeyboardEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keypress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutKeypress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keypress")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyup(value: /* event */ LeafletKeyboardEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutKeyup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyup")(js.undefined)
        ret
    }
    @scala.inline
    def withLayeradd(value: /* event */ LayerEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layeradd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLayeradd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layeradd")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerremove(value: /* event */ LayerEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerremove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLayerremove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerremove")(js.undefined)
        ret
    }
    @scala.inline
    def withLoad(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
    @scala.inline
    def withLoading(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationerror(value: /* event */ ErrorEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationerror")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLocationerror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationerror")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationfound(value: /* event */ LocationEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationfound")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLocationfound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationfound")(js.undefined)
        ret
    }
    @scala.inline
    def withMousedown(value: /* event */ LeafletMouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousedown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMousedown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousedown")(js.undefined)
        ret
    }
    @scala.inline
    def withMousemove(value: /* event */ LeafletMouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMousemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousemove")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseout(value: /* event */ LeafletMouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseout")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseover(value: /* event */ LeafletMouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseover")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseup(value: /* event */ LeafletMouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseup")(js.undefined)
        ret
    }
    @scala.inline
    def withMove(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveend(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMoveend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveend")(js.undefined)
        ret
    }
    @scala.inline
    def withMovestart(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movestart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMovestart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movestart")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayadd(value: /* event */ LayersControlEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayadd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOverlayadd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayadd")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayremove(value: /* event */ LayersControlEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayremove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOverlayremove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayremove")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupclose(value: /* event */ PopupEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupclose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPopupclose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupclose")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupopen(value: /* event */ PopupEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupopen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPopupopen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupopen")(js.undefined)
        ret
    }
    @scala.inline
    def withPreclick(value: /* event */ LeafletMouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preclick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPreclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preclick")(js.undefined)
        ret
    }
    @scala.inline
    def withPredrag(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPredrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predrag")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withResize(value: /* event */ ResizeEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.undefined)
        ret
    }
    @scala.inline
    def withTileerror(value: /* event */ TileErrorEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileerror")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTileerror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileerror")(js.undefined)
        ret
    }
    @scala.inline
    def withTileload(value: /* event */ TileEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTileload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileload")(js.undefined)
        ret
    }
    @scala.inline
    def withTileloadstart(value: /* event */ TileEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileloadstart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTileloadstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileloadstart")(js.undefined)
        ret
    }
    @scala.inline
    def withTileunload(value: /* event */ TileEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileunload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTileunload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileunload")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipclose(value: /* event */ TooltipEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipclose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTooltipclose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipclose")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipopen(value: /* event */ TooltipEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipopen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTooltipopen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipopen")(js.undefined)
        ret
    }
    @scala.inline
    def withUnload(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUnload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unload")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
    @scala.inline
    def withViewreset(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewreset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutViewreset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewreset")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomanim(value: /* event */ ZoomAnimEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomanim")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutZoomanim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomanim")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomend(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutZoomend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomend")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomlevelschange(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomlevelschange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutZoomlevelschange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomlevelschange")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomstart(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomstart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutZoomstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomstart")(js.undefined)
        ret
    }
  }
  
}

