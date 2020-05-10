package typingsSlinky.baidumapWebSdk.BMap

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WalkingRouteOptions extends js.Object {
  var onInfoHtmlSet: js.UndefOr[js.Function2[/* poi */ LocalResultPoi, /* html */ HTMLElement, Unit]] = js.native
  var onMarkersSet: js.UndefOr[js.Function1[/* pois */ js.Array[LocalResultPoi], Unit]] = js.native
  var onPolylinesSet: js.UndefOr[js.Function1[/* routes */ js.Array[Route], Unit]] = js.native
  var onResultsHtmlSet: js.UndefOr[js.Function1[/* container */ HTMLElement, Unit]] = js.native
  var onSearchComplete: js.UndefOr[js.Function1[/* result */ WalkingRouteResult, Unit]] = js.native
  var renderOptions: js.UndefOr[RenderOptions] = js.native
}

object WalkingRouteOptions {
  @scala.inline
  def apply(): WalkingRouteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WalkingRouteOptions]
  }
  @scala.inline
  implicit class WalkingRouteOptionsOps[Self <: WalkingRouteOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnInfoHtmlSet(value: (/* poi */ LocalResultPoi, /* html */ HTMLElement) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInfoHtmlSet")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnInfoHtmlSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInfoHtmlSet")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMarkersSet(value: /* pois */ js.Array[LocalResultPoi] => Unit): Self = {
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
    def withOnPolylinesSet(value: /* routes */ js.Array[Route] => Unit): Self = {
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
    def withOnResultsHtmlSet(value: /* container */ HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResultsHtmlSet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResultsHtmlSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResultsHtmlSet")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSearchComplete(value: /* result */ WalkingRouteResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearchComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSearchComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearchComplete")(js.undefined)
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

