package typingsSlinky.reactLeaflet.mod

import typingsSlinky.leaflet.mod.LeafletEvent
import typingsSlinky.leaflet.mod.LeafletMouseEvent
import typingsSlinky.leaflet.mod.PopupEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathEvents extends js.Object {
  var onadd: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  var onclick: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  var oncontextmenu: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  var ondblclick: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  var onmousedown: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  var onmouseout: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  var onmouseover: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  var onpopupclose: js.UndefOr[js.Function1[/* event */ PopupEvent, Unit]] = js.native
  var onpopupopen: js.UndefOr[js.Function1[/* event */ PopupEvent, Unit]] = js.native
  var onremove: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
}

object PathEvents {
  @scala.inline
  def apply(): PathEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathEvents]
  }
  @scala.inline
  implicit class PathEventsOps[Self <: PathEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnadd(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onadd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnadd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onadd")(js.undefined)
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
    def withOnremove(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onremove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnremove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onremove")(js.undefined)
        ret
    }
  }
  
}

