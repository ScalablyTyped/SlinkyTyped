package typingsSlinky.reactLeaflet.mod

import typingsSlinky.leaflet.mod.DragEndEvent
import typingsSlinky.leaflet.mod.ErrorEvent
import typingsSlinky.leaflet.mod.LayerEvent
import typingsSlinky.leaflet.mod.LayersControlEvent
import typingsSlinky.leaflet.mod.LeafletEvent
import typingsSlinky.leaflet.mod.LeafletMouseEvent
import typingsSlinky.leaflet.mod.LocationEvent
import typingsSlinky.leaflet.mod.PopupEvent
import typingsSlinky.leaflet.mod.ResizeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapEvents extends StObject {
  
  var onautopanstart: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  
  var onbaselayerchange: js.UndefOr[js.Function1[/* event */ LayersControlEvent, Unit]] = js.native
  
  var onblur: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  
  var onclick: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  
  var oncontextmenu: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  
  var ondblclick: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  
  var ondrag: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  
  var ondragend: js.UndefOr[js.Function1[/* event */ DragEndEvent, Unit]] = js.native
  
  var ondragstart: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  
  var onfocus: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  
  var onlayeradd: js.UndefOr[js.Function1[/* event */ LayerEvent, Unit]] = js.native
  
  var onlayerremove: js.UndefOr[js.Function1[/* event */ LayerEvent, Unit]] = js.native
  
  var onload: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  
  var onlocationerror: js.UndefOr[js.Function1[/* event */ ErrorEvent, Unit]] = js.native
  
  var onlocationfound: js.UndefOr[js.Function1[/* event */ LocationEvent, Unit]] = js.native
  
  var onmousedown: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  
  var onmousemove: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  
  var onmouseout: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  
  var onmouseover: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  
  var onmouseup: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  
  var onmove: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  
  var onmoveend: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  
  var onmovestart: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  
  var onoverlayadd: js.UndefOr[js.Function1[/* event */ LayersControlEvent, Unit]] = js.native
  
  var onoverlayremove: js.UndefOr[js.Function1[/* event */ LayersControlEvent, Unit]] = js.native
  
  var onpopupclose: js.UndefOr[js.Function1[/* event */ PopupEvent, Unit]] = js.native
  
  var onpopupopen: js.UndefOr[js.Function1[/* event */ PopupEvent, Unit]] = js.native
  
  var onpreclick: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  
  var onresize: js.UndefOr[js.Function1[/* event */ ResizeEvent, Unit]] = js.native
  
  var onunload: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  
  var onviewreset: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  
  var onzoomend: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  
  var onzoomlevelschange: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  
  var onzoomstart: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
}
object MapEvents {
  
  @scala.inline
  def apply(): MapEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapEvents]
  }
  
  @scala.inline
  implicit class MapEventsMutableBuilder[Self <: MapEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnautopanstart(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onautopanstart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnautopanstartUndefined: Self = StObject.set(x, "onautopanstart", js.undefined)
    
    @scala.inline
    def setOnbaselayerchange(value: /* event */ LayersControlEvent => Unit): Self = StObject.set(x, "onbaselayerchange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnbaselayerchangeUndefined: Self = StObject.set(x, "onbaselayerchange", js.undefined)
    
    @scala.inline
    def setOnblur(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onblur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnblurUndefined: Self = StObject.set(x, "onblur", js.undefined)
    
    @scala.inline
    def setOnclick(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "onclick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
    
    @scala.inline
    def setOncontextmenu(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "oncontextmenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOncontextmenuUndefined: Self = StObject.set(x, "oncontextmenu", js.undefined)
    
    @scala.inline
    def setOndblclick(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "ondblclick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOndblclickUndefined: Self = StObject.set(x, "ondblclick", js.undefined)
    
    @scala.inline
    def setOndrag(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "ondrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOndragUndefined: Self = StObject.set(x, "ondrag", js.undefined)
    
    @scala.inline
    def setOndragend(value: /* event */ DragEndEvent => Unit): Self = StObject.set(x, "ondragend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOndragendUndefined: Self = StObject.set(x, "ondragend", js.undefined)
    
    @scala.inline
    def setOndragstart(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "ondragstart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOndragstartUndefined: Self = StObject.set(x, "ondragstart", js.undefined)
    
    @scala.inline
    def setOnfocus(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onfocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnfocusUndefined: Self = StObject.set(x, "onfocus", js.undefined)
    
    @scala.inline
    def setOnlayeradd(value: /* event */ LayerEvent => Unit): Self = StObject.set(x, "onlayeradd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnlayeraddUndefined: Self = StObject.set(x, "onlayeradd", js.undefined)
    
    @scala.inline
    def setOnlayerremove(value: /* event */ LayerEvent => Unit): Self = StObject.set(x, "onlayerremove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnlayerremoveUndefined: Self = StObject.set(x, "onlayerremove", js.undefined)
    
    @scala.inline
    def setOnload(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onload", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
    
    @scala.inline
    def setOnlocationerror(value: /* event */ ErrorEvent => Unit): Self = StObject.set(x, "onlocationerror", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnlocationerrorUndefined: Self = StObject.set(x, "onlocationerror", js.undefined)
    
    @scala.inline
    def setOnlocationfound(value: /* event */ LocationEvent => Unit): Self = StObject.set(x, "onlocationfound", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnlocationfoundUndefined: Self = StObject.set(x, "onlocationfound", js.undefined)
    
    @scala.inline
    def setOnmousedown(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "onmousedown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnmousedownUndefined: Self = StObject.set(x, "onmousedown", js.undefined)
    
    @scala.inline
    def setOnmousemove(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "onmousemove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnmousemoveUndefined: Self = StObject.set(x, "onmousemove", js.undefined)
    
    @scala.inline
    def setOnmouseout(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "onmouseout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnmouseoutUndefined: Self = StObject.set(x, "onmouseout", js.undefined)
    
    @scala.inline
    def setOnmouseover(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "onmouseover", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnmouseoverUndefined: Self = StObject.set(x, "onmouseover", js.undefined)
    
    @scala.inline
    def setOnmouseup(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "onmouseup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnmouseupUndefined: Self = StObject.set(x, "onmouseup", js.undefined)
    
    @scala.inline
    def setOnmove(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onmove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnmoveUndefined: Self = StObject.set(x, "onmove", js.undefined)
    
    @scala.inline
    def setOnmoveend(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onmoveend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnmoveendUndefined: Self = StObject.set(x, "onmoveend", js.undefined)
    
    @scala.inline
    def setOnmovestart(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onmovestart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnmovestartUndefined: Self = StObject.set(x, "onmovestart", js.undefined)
    
    @scala.inline
    def setOnoverlayadd(value: /* event */ LayersControlEvent => Unit): Self = StObject.set(x, "onoverlayadd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnoverlayaddUndefined: Self = StObject.set(x, "onoverlayadd", js.undefined)
    
    @scala.inline
    def setOnoverlayremove(value: /* event */ LayersControlEvent => Unit): Self = StObject.set(x, "onoverlayremove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnoverlayremoveUndefined: Self = StObject.set(x, "onoverlayremove", js.undefined)
    
    @scala.inline
    def setOnpopupclose(value: /* event */ PopupEvent => Unit): Self = StObject.set(x, "onpopupclose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnpopupcloseUndefined: Self = StObject.set(x, "onpopupclose", js.undefined)
    
    @scala.inline
    def setOnpopupopen(value: /* event */ PopupEvent => Unit): Self = StObject.set(x, "onpopupopen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnpopupopenUndefined: Self = StObject.set(x, "onpopupopen", js.undefined)
    
    @scala.inline
    def setOnpreclick(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "onpreclick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnpreclickUndefined: Self = StObject.set(x, "onpreclick", js.undefined)
    
    @scala.inline
    def setOnresize(value: /* event */ ResizeEvent => Unit): Self = StObject.set(x, "onresize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnresizeUndefined: Self = StObject.set(x, "onresize", js.undefined)
    
    @scala.inline
    def setOnunload(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onunload", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnunloadUndefined: Self = StObject.set(x, "onunload", js.undefined)
    
    @scala.inline
    def setOnviewreset(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onviewreset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnviewresetUndefined: Self = StObject.set(x, "onviewreset", js.undefined)
    
    @scala.inline
    def setOnzoomend(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onzoomend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnzoomendUndefined: Self = StObject.set(x, "onzoomend", js.undefined)
    
    @scala.inline
    def setOnzoomlevelschange(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onzoomlevelschange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnzoomlevelschangeUndefined: Self = StObject.set(x, "onzoomlevelschange", js.undefined)
    
    @scala.inline
    def setOnzoomstart(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onzoomstart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnzoomstartUndefined: Self = StObject.set(x, "onzoomstart", js.undefined)
  }
}
