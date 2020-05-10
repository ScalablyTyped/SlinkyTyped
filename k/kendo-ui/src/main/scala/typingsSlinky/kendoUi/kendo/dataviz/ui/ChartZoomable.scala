package typingsSlinky.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartZoomable extends js.Object {
  var mousewheel: js.UndefOr[Boolean | ChartZoomableMousewheel] = js.native
  var selection: js.UndefOr[Boolean | ChartZoomableSelection] = js.native
}

object ChartZoomable {
  @scala.inline
  def apply(): ChartZoomable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartZoomable]
  }
  @scala.inline
  implicit class ChartZoomableOps[Self <: ChartZoomable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMousewheel(value: Boolean | ChartZoomableMousewheel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousewheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMousewheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousewheel")(js.undefined)
        ret
    }
    @scala.inline
    def withSelection(value: Boolean | ChartZoomableSelection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(js.undefined)
        ret
    }
  }
  
}

