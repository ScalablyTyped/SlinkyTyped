package typingsSlinky.reactLeaflet.mod

import typingsSlinky.leaflet.mod.LayersControlEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayersControlEvents extends js.Object {
  var onbaselayerchange: js.UndefOr[js.Function1[/* event */ LayersControlEvent, Unit]] = js.native
  var onoverlayadd: js.UndefOr[js.Function1[/* event */ LayersControlEvent, Unit]] = js.native
  var onoverlayremove: js.UndefOr[js.Function1[/* event */ LayersControlEvent, Unit]] = js.native
}

object LayersControlEvents {
  @scala.inline
  def apply(): LayersControlEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersControlEvents]
  }
  @scala.inline
  implicit class LayersControlEventsOps[Self <: LayersControlEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

