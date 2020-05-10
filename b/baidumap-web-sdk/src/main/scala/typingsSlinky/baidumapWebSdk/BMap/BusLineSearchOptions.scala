package typingsSlinky.baidumapWebSdk.BMap

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BusLineSearchOptions extends js.Object {
  var onBusLineHtmlSet: js.UndefOr[js.Function1[/* container */ HTMLElement, Unit]] = js.native
  var onBusListHtmlSet: js.UndefOr[js.Function1[/* container */ HTMLElement, Unit]] = js.native
  var onGetBusLineComplete: js.UndefOr[js.Function1[/* rs */ BusLine, Unit]] = js.native
  var onGetBusListComplete: js.UndefOr[js.Function1[/* rs */ BusListResult, Unit]] = js.native
  var onMarkersSet: js.UndefOr[js.Function1[/* sts */ js.Array[Marker], Unit]] = js.native
  var onPolylinesSet: js.UndefOr[js.Function1[/* ply */ Polyline, Unit]] = js.native
  var renderOptions: js.UndefOr[RenderOptions] = js.native
}

object BusLineSearchOptions {
  @scala.inline
  def apply(): BusLineSearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusLineSearchOptions]
  }
  @scala.inline
  implicit class BusLineSearchOptionsOps[Self <: BusLineSearchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnBusLineHtmlSet(value: /* container */ HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBusLineHtmlSet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBusLineHtmlSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBusLineHtmlSet")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBusListHtmlSet(value: /* container */ HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBusListHtmlSet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBusListHtmlSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBusListHtmlSet")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGetBusLineComplete(value: /* rs */ BusLine => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGetBusLineComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnGetBusLineComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGetBusLineComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGetBusListComplete(value: /* rs */ BusListResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGetBusListComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnGetBusListComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGetBusListComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMarkersSet(value: /* sts */ js.Array[Marker] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMarkersSet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMarkersSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMarkersSet")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPolylinesSet(value: /* ply */ Polyline => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPolylinesSet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPolylinesSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPolylinesSet")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderOptions(value: RenderOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderOptions")(js.undefined)
        ret
    }
  }
  
}

