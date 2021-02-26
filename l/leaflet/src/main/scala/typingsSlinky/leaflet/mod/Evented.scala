package typingsSlinky.leaflet.mod

import typingsSlinky.leaflet.leafletStrings.add
import typingsSlinky.leaflet.leafletStrings.autopanstart
import typingsSlinky.leaflet.leafletStrings.baselayerchange
import typingsSlinky.leaflet.leafletStrings.click
import typingsSlinky.leaflet.leafletStrings.contextmenu
import typingsSlinky.leaflet.leafletStrings.dblclick
import typingsSlinky.leaflet.leafletStrings.down
import typingsSlinky.leaflet.leafletStrings.drag
import typingsSlinky.leaflet.leafletStrings.dragend
import typingsSlinky.leaflet.leafletStrings.dragstart
import typingsSlinky.leaflet.leafletStrings.error
import typingsSlinky.leaflet.leafletStrings.keydown
import typingsSlinky.leaflet.leafletStrings.keypress
import typingsSlinky.leaflet.leafletStrings.keyup
import typingsSlinky.leaflet.leafletStrings.layeradd
import typingsSlinky.leaflet.leafletStrings.layerremove
import typingsSlinky.leaflet.leafletStrings.load
import typingsSlinky.leaflet.leafletStrings.loading
import typingsSlinky.leaflet.leafletStrings.locationerror
import typingsSlinky.leaflet.leafletStrings.locationfound
import typingsSlinky.leaflet.leafletStrings.mousedown
import typingsSlinky.leaflet.leafletStrings.mousemove
import typingsSlinky.leaflet.leafletStrings.mouseout
import typingsSlinky.leaflet.leafletStrings.mouseover
import typingsSlinky.leaflet.leafletStrings.mouseup
import typingsSlinky.leaflet.leafletStrings.move
import typingsSlinky.leaflet.leafletStrings.moveend
import typingsSlinky.leaflet.leafletStrings.movestart
import typingsSlinky.leaflet.leafletStrings.overlayadd
import typingsSlinky.leaflet.leafletStrings.overlayremove
import typingsSlinky.leaflet.leafletStrings.popupclose
import typingsSlinky.leaflet.leafletStrings.popupopen
import typingsSlinky.leaflet.leafletStrings.preclick
import typingsSlinky.leaflet.leafletStrings.predrag
import typingsSlinky.leaflet.leafletStrings.remove
import typingsSlinky.leaflet.leafletStrings.resize
import typingsSlinky.leaflet.leafletStrings.tileerror
import typingsSlinky.leaflet.leafletStrings.tileload
import typingsSlinky.leaflet.leafletStrings.tileloadstart
import typingsSlinky.leaflet.leafletStrings.tileunload
import typingsSlinky.leaflet.leafletStrings.tooltipclose
import typingsSlinky.leaflet.leafletStrings.tooltipopen
import typingsSlinky.leaflet.leafletStrings.unload
import typingsSlinky.leaflet.leafletStrings.update
import typingsSlinky.leaflet.leafletStrings.viewreset
import typingsSlinky.leaflet.leafletStrings.zoom
import typingsSlinky.leaflet.leafletStrings.zoomanim
import typingsSlinky.leaflet.leafletStrings.zoomend
import typingsSlinky.leaflet.leafletStrings.zoomlevelschange
import typingsSlinky.leaflet.leafletStrings.zoomstart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Evented")
@js.native
abstract class Evented () extends Class {
  
  /**
    * Alias for on(...)
    *
    * Adds a set of type/listener pairs, e.g. {click: onClick, mousemove: onMouseMove}
    */
  def addEventListener(eventMap: LeafletEventHandlerFnMap): this.type = js.native
  /**
    * Alias for on(...)
    *
    * Adds a listener function (fn) to a particular event type of the object.
    * You can optionally specify the context of the listener (object the this
    * keyword will point to). You can also pass several space-separated types
    * (e.g. 'click dblclick').
    */
  // tslint:disable:unified-signatures
  def addEventListener(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
  def addEventListener(`type`: String, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_add(`type`: add, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_add(`type`: add, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_autopanstart(`type`: autopanstart, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_autopanstart(`type`: autopanstart, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_click(`type`: click, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_click(`type`: click, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_down(`type`: down, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_down(`type`: down, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_drag(`type`: drag, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_drag(`type`: drag, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(`type`: dragend, fn: DragEndEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(`type`: dragstart, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(`type`: dragstart, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_layeradd(`type`: layeradd, fn: LayerEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_layeradd(`type`: layeradd, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_layerremove(`type`: layerremove, fn: LayerEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_layerremove(`type`: layerremove, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_load(`type`: load, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_load(`type`: load, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_loading(`type`: loading, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_loading(`type`: loading, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_locationfound(`type`: locationfound, fn: LocationEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_move(`type`: move, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_move(`type`: move, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_moveend(`type`: moveend, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_moveend(`type`: moveend, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_movestart(`type`: movestart, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_movestart(`type`: movestart, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_popupclose(`type`: popupclose, fn: PopupEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_popupclose(`type`: popupclose, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_popupopen(`type`: popupopen, fn: PopupEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_popupopen(`type`: popupopen, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_predrag(`type`: predrag, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_predrag(`type`: predrag, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_remove(`type`: remove, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_remove(`type`: remove, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_resize(`type`: resize, fn: ResizeEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_resize(`type`: resize, fn: ResizeEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_tileload(`type`: tileload, fn: TileEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_tileload(`type`: tileload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_tileunload(`type`: tileunload, fn: TileEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_tileunload(`type`: tileunload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_unload(`type`: unload, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_unload(`type`: unload, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_update(`type`: update, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_update(`type`: update, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_viewreset(`type`: viewreset, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_viewreset(`type`: viewreset, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_zoom(`type`: zoom, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_zoom(`type`: zoom, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_zoomend(`type`: zoomend, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_zoomend(`type`: zoomend, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_zoomlevelschange(`type`: zoomlevelschange, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_zoomlevelschange(`type`: zoomlevelschange, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_zoomstart(`type`: zoomstart, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_zoomstart(`type`: zoomstart, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  
  // tslint:enable:unified-signatures
  /**
    * Adds an event parent - an Evented that will receive propagated events
    */
  def addEventParent(obj: Evented): this.type = js.native
  
  /**
    * Alias for once(...)
    *
    * Behaves as on(...), except the listener will only get fired once and then removed.
    */
  def addOneTimeEventListener(eventMap: LeafletEventHandlerFnMap): this.type = js.native
  /**
    * Alias for once(...)
    *
    * Behaves as on(...), except the listener will only get fired once and then removed.
    */
  // tslint:disable:unified-signatures
  def addOneTimeEventListener(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
  def addOneTimeEventListener(`type`: String, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_add(`type`: add, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_add(`type`: add, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_autopanstart(`type`: autopanstart, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_autopanstart(`type`: autopanstart, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_click(`type`: click, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_click(`type`: click, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_down(`type`: down, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_down(`type`: down, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_drag(`type`: drag, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_drag(`type`: drag, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_dragend(`type`: dragend, fn: DragEndEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_dragstart(`type`: dragstart, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_dragstart(`type`: dragstart, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_error(`type`: error, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_error(`type`: error, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_layeradd(`type`: layeradd, fn: LayerEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_layeradd(`type`: layeradd, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_layerremove(`type`: layerremove, fn: LayerEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_layerremove(`type`: layerremove, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_load(`type`: load, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_load(`type`: load, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_loading(`type`: loading, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_loading(`type`: loading, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_locationfound(`type`: locationfound, fn: LocationEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_move(`type`: move, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_move(`type`: move, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_moveend(`type`: moveend, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_moveend(`type`: moveend, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_movestart(`type`: movestart, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_movestart(`type`: movestart, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_popupclose(`type`: popupclose, fn: PopupEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_popupclose(`type`: popupclose, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_popupopen(`type`: popupopen, fn: PopupEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_popupopen(`type`: popupopen, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_predrag(`type`: predrag, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_predrag(`type`: predrag, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_remove(`type`: remove, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_remove(`type`: remove, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_resize(`type`: resize, fn: ResizeEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_resize(`type`: resize, fn: ResizeEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_tileload(`type`: tileload, fn: TileEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_tileload(`type`: tileload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_tileunload(`type`: tileunload, fn: TileEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_tileunload(`type`: tileunload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_unload(`type`: unload, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_unload(`type`: unload, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_update(`type`: update, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_update(`type`: update, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_viewreset(`type`: viewreset, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_viewreset(`type`: viewreset, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_zoom(`type`: zoom, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_zoom(`type`: zoom, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_zoomend(`type`: zoomend, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_zoomend(`type`: zoomend, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_zoomlevelschange(`type`: zoomlevelschange, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_zoomlevelschange(`type`: zoomlevelschange, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_zoomstart(`type`: zoomstart, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_zoomstart(`type`: zoomstart, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  
  // tslint:enable:unified-signatures
  /**
    * Alias for off()
    *
    * Removes all listeners to all events on the object.
    */
  def clearAllEventListeners(): this.type = js.native
  
  // tslint:enable:unified-signatures
  /**
    * Fires an event of the specified type. You can optionally provide a data
    * object — the first argument of the listener function will contain its properties.
    * The event might can optionally be propagated to event parents.
    */
  def fire(`type`: String): this.type = js.native
  def fire(`type`: String, data: js.UndefOr[scala.Nothing], propagate: Boolean): this.type = js.native
  def fire(`type`: String, data: js.Any): this.type = js.native
  def fire(`type`: String, data: js.Any, propagate: Boolean): this.type = js.native
  
  // tslint:enable:unified-signatures
  /**
    * Alias for fire(...)
    *
    * Fires an event of the specified type. You can optionally provide a data
    * object — the first argument of the listener function will contain its properties.
    * The event might can optionally be propagated to event parents.
    */
  def fireEvent(`type`: String): this.type = js.native
  def fireEvent(`type`: String, data: js.UndefOr[scala.Nothing], propagate: Boolean): this.type = js.native
  def fireEvent(`type`: String, data: js.Any): this.type = js.native
  def fireEvent(`type`: String, data: js.Any, propagate: Boolean): this.type = js.native
  
  /**
    * Alias for listens(...)
    *
    * Returns true if a particular event type has any listeners attached to it.
    */
  def hasEventListeners(`type`: String): Boolean = js.native
  
  /**
    * Returns true if a particular event type has any listeners attached to it.
    */
  def listens(`type`: String): Boolean = js.native
  
  /**
    * Removes all listeners to all events on the object.
    */
  def off(): this.type = js.native
  /**
    * Removes a set of type/listener pairs.
    */
  // With an eventMap there are no additional arguments allowed
  def off(eventMap: LeafletEventHandlerFnMap): this.type = js.native
  def off(
    `type`: zoomlevelschange | unload | viewreset | load | zoomstart | movestart | zoom | move | zoomend | moveend | autopanstart | dragstart | drag | add | remove | loading | error | update | down | predrag,
    fn: js.UndefOr[LeafletEventHandlerFn],
    context: js.UndefOr[js.Any]
  ): this.type = js.native
  // tslint:enable:unified-signatures
  /**
    * Removes a previously added listener function. If no function is specified,
    * it will remove all the listeners of that particular event from the object.
    * Note that if you passed a custom context to on, you must pass the same context
    * to off in order to remove the listener.
    */
  // tslint:disable:unified-signatures
  def off(`type`: String): this.type = js.native
  def off(`type`: String, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  def off(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
  def off(`type`: String, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_baselayerchange(`type`: baselayerchange): this.type = js.native
  @JSName("off")
  def off_baselayerchange(`type`: baselayerchange, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("off")
  def off_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_click(`type`: click): this.type = js.native
  @JSName("off")
  def off_click(`type`: click, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("off")
  def off_click(`type`: click, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_click(`type`: click, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_contextmenu(`type`: contextmenu): this.type = js.native
  @JSName("off")
  def off_contextmenu(`type`: contextmenu, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("off")
  def off_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_dblclick(`type`: dblclick): this.type = js.native
  @JSName("off")
  def off_dblclick(`type`: dblclick, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("off")
  def off_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_dragend(`type`: dragend): this.type = js.native
  @JSName("off")
  def off_dragend(`type`: dragend, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("off")
  def off_dragend(`type`: dragend, fn: DragEndEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_keydown(`type`: keydown): this.type = js.native
  @JSName("off")
  def off_keydown(`type`: keydown, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("off")
  def off_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_keypress(`type`: keypress): this.type = js.native
  @JSName("off")
  def off_keypress(`type`: keypress, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("off")
  def off_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_keyup(`type`: keyup): this.type = js.native
  @JSName("off")
  def off_keyup(`type`: keyup, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("off")
  def off_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_layeradd(`type`: layeradd): this.type = js.native
  @JSName("off")
  def off_layeradd(`type`: layeradd, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("off")
  def off_layeradd(`type`: layeradd, fn: LayerEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_layeradd(`type`: layeradd, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_layerremove(`type`: layerremove): this.type = js.native
  @JSName("off")
  def off_layerremove(`type`: layerremove, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("off")
  def off_layerremove(`type`: layerremove, fn: LayerEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_layerremove(`type`: layerremove, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_locationerror(`type`: locationerror): this.type = js.native
  @JSName("off")
  def off_locationerror(`type`: locationerror, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("off")
  def off_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_locationfound(`type`: locationfound): this.type = js.native
  @JSName("off")
  def off_locationfound(`type`: locationfound, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("off")
  def off_locationfound(`type`: locationfound, fn: LocationEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_mousedown(`type`: mousedown): this.type = js.native
  @JSName("off")
  def off_mousedown(`type`: mousedown, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("off")
  def off_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_mousemove(`type`: mousemove): this.type = js.native
  @JSName("off")
  def off_mousemove(`type`: mousemove, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("off")
  def off_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_mouseout(`type`: mouseout): this.type = js.native
  @JSName("off")
  def off_mouseout(`type`: mouseout, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("off")
  def off_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_mouseover(`type`: mouseover): this.type = js.native
  @JSName("off")
  def off_mouseover(`type`: mouseover, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("off")
  def off_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_mouseup(`type`: mouseup): this.type = js.native
  @JSName("off")
  def off_mouseup(`type`: mouseup, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("off")
  def off_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_overlayadd(`type`: overlayadd): this.type = js.native
  @JSName("off")
  def off_overlayadd(`type`: overlayadd, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("off")
  def off_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_overlayremove(`type`: overlayremove): this.type = js.native
  @JSName("off")
  def off_overlayremove(`type`: overlayremove, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("off")
  def off_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_popupclose(`type`: popupclose): this.type = js.native
  @JSName("off")
  def off_popupclose(`type`: popupclose, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("off")
  def off_popupclose(`type`: popupclose, fn: PopupEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_popupclose(`type`: popupclose, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_popupopen(`type`: popupopen): this.type = js.native
  @JSName("off")
  def off_popupopen(`type`: popupopen, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("off")
  def off_popupopen(`type`: popupopen, fn: PopupEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_popupopen(`type`: popupopen, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_preclick(`type`: preclick): this.type = js.native
  @JSName("off")
  def off_preclick(`type`: preclick, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("off")
  def off_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_resize(`type`: resize): this.type = js.native
  @JSName("off")
  def off_resize(`type`: resize, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("off")
  def off_resize(`type`: resize, fn: ResizeEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_resize(`type`: resize, fn: ResizeEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_tileerror(`type`: tileerror): this.type = js.native
  @JSName("off")
  def off_tileerror(`type`: tileerror, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("off")
  def off_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_tileload(`type`: tileload): this.type = js.native
  @JSName("off")
  def off_tileload(`type`: tileload, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("off")
  def off_tileload(`type`: tileload, fn: TileEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_tileload(`type`: tileload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_tileloadstart(`type`: tileloadstart): this.type = js.native
  @JSName("off")
  def off_tileloadstart(`type`: tileloadstart, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("off")
  def off_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_tileunload(`type`: tileunload): this.type = js.native
  @JSName("off")
  def off_tileunload(`type`: tileunload, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("off")
  def off_tileunload(`type`: tileunload, fn: TileEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_tileunload(`type`: tileunload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_tooltipclose(`type`: tooltipclose): this.type = js.native
  @JSName("off")
  def off_tooltipclose(`type`: tooltipclose, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("off")
  def off_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_tooltipopen(`type`: tooltipopen): this.type = js.native
  @JSName("off")
  def off_tooltipopen(`type`: tooltipopen, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("off")
  def off_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_zoomanim(`type`: zoomanim): this.type = js.native
  @JSName("off")
  def off_zoomanim(`type`: zoomanim, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("off")
  def off_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: js.Any): this.type = js.native
  
  /**
    * Adds a set of type/listener pairs, e.g. {click: onClick, mousemove: onMouseMove}
    */
  def on(eventMap: LeafletEventHandlerFnMap): this.type = js.native
  /**
    * Adds a listener function (fn) to a particular event type of the object.
    * You can optionally specify the context of the listener (object the this
    * keyword will point to). You can also pass several space-separated types
    * (e.g. 'click dblclick').
    */
  // tslint:disable:unified-signatures
  def on(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
  def on(`type`: String, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_add(`type`: add, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_add(`type`: add, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_autopanstart(`type`: autopanstart, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_autopanstart(`type`: autopanstart, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_click(`type`: click, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_click(`type`: click, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_down(`type`: down, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_down(`type`: down, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_drag(`type`: drag, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_drag(`type`: drag, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_dragend(`type`: dragend, fn: DragEndEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_dragstart(`type`: dragstart, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_dragstart(`type`: dragstart, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_error(`type`: error, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_error(`type`: error, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_layeradd(`type`: layeradd, fn: LayerEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_layeradd(`type`: layeradd, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_layerremove(`type`: layerremove, fn: LayerEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_layerremove(`type`: layerremove, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_load(`type`: load, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_load(`type`: load, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_loading(`type`: loading, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_loading(`type`: loading, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_locationfound(`type`: locationfound, fn: LocationEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_move(`type`: move, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_move(`type`: move, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_moveend(`type`: moveend, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_moveend(`type`: moveend, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_movestart(`type`: movestart, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_movestart(`type`: movestart, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_popupclose(`type`: popupclose, fn: PopupEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_popupclose(`type`: popupclose, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_popupopen(`type`: popupopen, fn: PopupEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_popupopen(`type`: popupopen, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_predrag(`type`: predrag, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_predrag(`type`: predrag, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_remove(`type`: remove, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_remove(`type`: remove, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_resize(`type`: resize, fn: ResizeEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_resize(`type`: resize, fn: ResizeEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_tileload(`type`: tileload, fn: TileEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_tileload(`type`: tileload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_tileunload(`type`: tileunload, fn: TileEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_tileunload(`type`: tileunload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_unload(`type`: unload, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_unload(`type`: unload, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_update(`type`: update, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_update(`type`: update, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_viewreset(`type`: viewreset, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_viewreset(`type`: viewreset, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_zoom(`type`: zoom, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_zoom(`type`: zoom, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_zoomend(`type`: zoomend, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_zoomend(`type`: zoomend, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_zoomlevelschange(`type`: zoomlevelschange, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_zoomlevelschange(`type`: zoomlevelschange, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_zoomstart(`type`: zoomstart, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_zoomstart(`type`: zoomstart, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  
  /**
    * Behaves as on(...), except the listener will only get fired once and then removed.
    */
  def once(eventMap: LeafletEventHandlerFnMap): this.type = js.native
  /**
    * Behaves as on(...), except the listener will only get fired once and then removed.
    */
  // tslint:disable:unified-signatures
  def once(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
  def once(`type`: String, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_add(`type`: add, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_add(`type`: add, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_autopanstart(`type`: autopanstart, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_autopanstart(`type`: autopanstart, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_click(`type`: click, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_click(`type`: click, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_down(`type`: down, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_down(`type`: down, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_drag(`type`: drag, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_drag(`type`: drag, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_dragend(`type`: dragend, fn: DragEndEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_dragstart(`type`: dragstart, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_dragstart(`type`: dragstart, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_error(`type`: error, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_error(`type`: error, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_layeradd(`type`: layeradd, fn: LayerEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_layeradd(`type`: layeradd, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_layerremove(`type`: layerremove, fn: LayerEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_layerremove(`type`: layerremove, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_load(`type`: load, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_load(`type`: load, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_loading(`type`: loading, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_loading(`type`: loading, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_locationfound(`type`: locationfound, fn: LocationEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_move(`type`: move, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_move(`type`: move, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_moveend(`type`: moveend, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_moveend(`type`: moveend, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_movestart(`type`: movestart, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_movestart(`type`: movestart, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_popupclose(`type`: popupclose, fn: PopupEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_popupclose(`type`: popupclose, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_popupopen(`type`: popupopen, fn: PopupEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_popupopen(`type`: popupopen, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_predrag(`type`: predrag, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_predrag(`type`: predrag, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_remove(`type`: remove, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_remove(`type`: remove, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_resize(`type`: resize, fn: ResizeEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_resize(`type`: resize, fn: ResizeEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_tileerror(`type`: tileerror, fn: TileEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_tileerror(`type`: tileerror, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_tileload(`type`: tileload, fn: TileEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_tileload(`type`: tileload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_tileunload(`type`: tileunload, fn: TileEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_tileunload(`type`: tileunload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_unload(`type`: unload, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_unload(`type`: unload, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_update(`type`: update, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_update(`type`: update, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_viewreset(`type`: viewreset, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_viewreset(`type`: viewreset, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_zoom(`type`: zoom, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_zoom(`type`: zoom, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_zoomend(`type`: zoomend, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_zoomend(`type`: zoomend, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_zoomlevelschange(`type`: zoomlevelschange, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_zoomlevelschange(`type`: zoomlevelschange, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_zoomstart(`type`: zoomstart, fn: LeafletEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_zoomstart(`type`: zoomstart, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  
  /**
    * Alias for off(...)
    *
    * Removes a set of type/listener pairs.
    */
  def removeEventListener(eventMap: LeafletEventHandlerFnMap): this.type = js.native
  def removeEventListener(
    `type`: zoomlevelschange | unload | viewreset | load | zoomstart | movestart | zoom | move | zoomend | moveend | autopanstart | dragstart | drag | add | remove | loading | error | update | down | predrag,
    fn: js.UndefOr[LeafletEventHandlerFn],
    context: js.UndefOr[js.Any]
  ): this.type = js.native
  // tslint:enable:unified-signatures
  /**
    * Alias for off(...)
    *
    * Removes a previously added listener function. If no function is specified,
    * it will remove all the listeners of that particular event from the object.
    * Note that if you passed a custom context to on, you must pass the same context
    * to off in order to remove the listener.
    */
  // tslint:disable:unified-signatures
  def removeEventListener(`type`: String): this.type = js.native
  def removeEventListener(`type`: String, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  def removeEventListener(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
  def removeEventListener(`type`: String, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_baselayerchange(`type`: baselayerchange): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_baselayerchange(`type`: baselayerchange, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(`type`: click): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(`type`: click, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(`type`: click, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(`type`: click, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(`type`: contextmenu): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(`type`: contextmenu, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(`type`: dblclick): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(`type`: dblclick, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(`type`: dragend): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(`type`: dragend, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(`type`: dragend, fn: DragEndEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(`type`: keydown): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(`type`: keydown, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(`type`: keypress): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(`type`: keypress, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(`type`: keyup): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(`type`: keyup, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_layeradd(`type`: layeradd): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_layeradd(`type`: layeradd, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_layeradd(`type`: layeradd, fn: LayerEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_layeradd(`type`: layeradd, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_layerremove(`type`: layerremove): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_layerremove(`type`: layerremove, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_layerremove(`type`: layerremove, fn: LayerEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_layerremove(`type`: layerremove, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_locationerror(`type`: locationerror): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_locationerror(`type`: locationerror, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_locationfound(`type`: locationfound): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_locationfound(`type`: locationfound, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_locationfound(`type`: locationfound, fn: LocationEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(`type`: mousedown): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(`type`: mousedown, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(`type`: mousemove): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(`type`: mousemove, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(`type`: mouseout): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(`type`: mouseout, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(`type`: mouseover): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(`type`: mouseover, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(`type`: mouseup): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(`type`: mouseup, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_overlayadd(`type`: overlayadd): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_overlayadd(`type`: overlayadd, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_overlayremove(`type`: overlayremove): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_overlayremove(`type`: overlayremove, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_popupclose(`type`: popupclose): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_popupclose(`type`: popupclose, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_popupclose(`type`: popupclose, fn: PopupEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_popupclose(`type`: popupclose, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_popupopen(`type`: popupopen): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_popupopen(`type`: popupopen, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_popupopen(`type`: popupopen, fn: PopupEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_popupopen(`type`: popupopen, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_preclick(`type`: preclick): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_preclick(`type`: preclick, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(`type`: resize): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(`type`: resize, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(`type`: resize, fn: ResizeEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(`type`: resize, fn: ResizeEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileerror(`type`: tileerror): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileerror(`type`: tileerror, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileload(`type`: tileload): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileload(`type`: tileload, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileload(`type`: tileload, fn: TileEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileload(`type`: tileload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileloadstart(`type`: tileloadstart): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileloadstart(`type`: tileloadstart, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileunload(`type`: tileunload): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileunload(`type`: tileunload, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileunload(`type`: tileunload, fn: TileEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileunload(`type`: tileunload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tooltipclose(`type`: tooltipclose): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tooltipclose(`type`: tooltipclose, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tooltipopen(`type`: tooltipopen): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tooltipopen(`type`: tooltipopen, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_zoomanim(`type`: zoomanim): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_zoomanim(`type`: zoomanim, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: js.Any): this.type = js.native
  
  /**
    * Removes an event parent, so it will stop receiving propagated events
    */
  def removeEventParent(obj: Evented): this.type = js.native
}
