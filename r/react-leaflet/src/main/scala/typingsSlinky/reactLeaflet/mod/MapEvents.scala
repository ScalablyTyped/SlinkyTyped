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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapEvents extends js.Object {
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
  implicit class MapEventsOps[Self <: MapEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnautopanstart(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onautopanstart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnautopanstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onautopanstart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnbaselayerchange(value: /* event */ LayersControlEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onbaselayerchange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnbaselayerchange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onbaselayerchange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnblur(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onblur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnblur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onblur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnclick(value: /* event */ LeafletMouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclick")(js.undefined)
        ret
    }
    @scala.inline
    def withOncontextmenu(value: /* event */ LeafletMouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncontextmenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOncontextmenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncontextmenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOndblclick(value: /* event */ LeafletMouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondblclick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOndblclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondblclick")(js.undefined)
        ret
    }
    @scala.inline
    def withOndrag(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOndrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondrag")(js.undefined)
        ret
    }
    @scala.inline
    def withOndragend(value: /* event */ DragEndEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOndragend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragend")(js.undefined)
        ret
    }
    @scala.inline
    def withOndragstart(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragstart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOndragstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragstart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnfocus(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnfocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlayeradd(value: /* event */ LayerEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlayeradd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnlayeradd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlayeradd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlayerremove(value: /* event */ LayerEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlayerremove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnlayerremove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlayerremove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnload(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onload")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlocationerror(value: /* event */ ErrorEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlocationerror")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnlocationerror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlocationerror")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlocationfound(value: /* event */ LocationEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlocationfound")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnlocationfound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlocationfound")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmousedown(value: /* event */ LeafletMouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmousedown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnmousedown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmousedown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmousemove(value: /* event */ LeafletMouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmousemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnmousemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmousemove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmouseout(value: /* event */ LeafletMouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnmouseout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmouseover(value: /* event */ LeafletMouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnmouseover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseover")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmouseup(value: /* event */ LeafletMouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnmouseup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseup")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmove(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnmove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmoveend(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmoveend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnmoveend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmoveend")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmovestart(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmovestart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnmovestart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmovestart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnoverlayadd(value: /* event */ LayersControlEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onoverlayadd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnoverlayadd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onoverlayadd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnoverlayremove(value: /* event */ LayersControlEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onoverlayremove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnoverlayremove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onoverlayremove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnpopupclose(value: /* event */ PopupEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpopupclose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnpopupclose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpopupclose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnpopupopen(value: /* event */ PopupEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpopupopen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnpopupopen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpopupopen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnpreclick(value: /* event */ LeafletMouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpreclick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnpreclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpreclick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnresize(value: /* event */ ResizeEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onresize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnresize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onresize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnunload(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onunload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnunload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onunload")(js.undefined)
        ret
    }
    @scala.inline
    def withOnviewreset(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onviewreset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnviewreset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onviewreset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnzoomend(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onzoomend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnzoomend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onzoomend")(js.undefined)
        ret
    }
    @scala.inline
    def withOnzoomlevelschange(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onzoomlevelschange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnzoomlevelschange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onzoomlevelschange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnzoomstart(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onzoomstart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnzoomstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onzoomstart")(js.undefined)
        ret
    }
  }
  
}

