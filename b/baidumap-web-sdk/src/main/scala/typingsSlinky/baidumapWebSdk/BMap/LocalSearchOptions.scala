package typingsSlinky.baidumapWebSdk.BMap

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalSearchOptions extends js.Object {
  var onInfoHtmlSet: js.UndefOr[js.Function2[/* poi */ LocalResultPoi, /* html */ HTMLElement, Unit]] = js.native
  var onMarkersSet: js.UndefOr[js.Function1[/* pois */ js.Array[LocalResultPoi], Unit]] = js.native
  var onResultsHtmlSet: js.UndefOr[js.Function1[/* container */ HTMLElement, Unit]] = js.native
  var onSearchComplete: js.UndefOr[js.Function1[/* results */ js.Array[LocalResult], Unit]] = js.native
  var pageCapacity: js.UndefOr[Double] = js.native
  var renderOptions: js.UndefOr[RenderOptions] = js.native
}

object LocalSearchOptions {
  @scala.inline
  def apply(): LocalSearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalSearchOptions]
  }
  @scala.inline
  implicit class LocalSearchOptionsOps[Self <: LocalSearchOptions] (val x: Self) extends AnyVal {
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
    def withOnSearchComplete(value: /* results */ js.Array[LocalResult] => Unit): Self = {
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
    def withPageCapacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageCapacity")(js.undefined)
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

