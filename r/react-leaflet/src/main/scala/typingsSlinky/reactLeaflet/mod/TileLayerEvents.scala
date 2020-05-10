package typingsSlinky.reactLeaflet.mod

import typingsSlinky.leaflet.mod.LeafletEvent
import typingsSlinky.leaflet.mod.TileEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileLayerEvents extends js.Object {
  var onload: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  var onloading: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  var ontileerror: js.UndefOr[js.Function1[/* event */ TileEvent, Unit]] = js.native
  var ontileload: js.UndefOr[js.Function1[/* event */ TileEvent, Unit]] = js.native
  var ontileloadstart: js.UndefOr[js.Function1[/* event */ TileEvent, Unit]] = js.native
  var ontileunload: js.UndefOr[js.Function1[/* event */ TileEvent, Unit]] = js.native
}

object TileLayerEvents {
  @scala.inline
  def apply(): TileLayerEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileLayerEvents]
  }
  @scala.inline
  implicit class TileLayerEventsOps[Self <: TileLayerEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withOnloading(value: /* event */ LeafletEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onloading")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnloading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onloading")(js.undefined)
        ret
    }
    @scala.inline
    def withOntileerror(value: /* event */ TileEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontileerror")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOntileerror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontileerror")(js.undefined)
        ret
    }
    @scala.inline
    def withOntileload(value: /* event */ TileEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontileload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOntileload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontileload")(js.undefined)
        ret
    }
    @scala.inline
    def withOntileloadstart(value: /* event */ TileEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontileloadstart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOntileloadstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontileloadstart")(js.undefined)
        ret
    }
    @scala.inline
    def withOntileunload(value: /* event */ TileEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontileunload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOntileunload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontileunload")(js.undefined)
        ret
    }
  }
  
}

