package typingsSlinky.kendoUi.kendo.dataviz.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SurfaceOptions extends js.Object {
  var click: js.UndefOr[js.Function1[/* e */ SurfaceClickEvent, Unit]] = js.native
  var height: js.UndefOr[String] = js.native
  var mouseenter: js.UndefOr[js.Function1[/* e */ SurfaceMouseenterEvent, Unit]] = js.native
  var mouseleave: js.UndefOr[js.Function1[/* e */ SurfaceMouseleaveEvent, Unit]] = js.native
  var name: js.UndefOr[String] = js.native
  var tooltip: js.UndefOr[SurfaceTooltip] = js.native
  var tooltipClose: js.UndefOr[js.Function1[/* e */ SurfaceTooltipCloseEvent, Unit]] = js.native
  var tooltipOpen: js.UndefOr[js.Function1[/* e */ SurfaceTooltipOpenEvent, Unit]] = js.native
  var `type`: js.UndefOr[String] = js.native
  var width: js.UndefOr[String] = js.native
}

object SurfaceOptions {
  @scala.inline
  def apply(): SurfaceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SurfaceOptions]
  }
  @scala.inline
  implicit class SurfaceOptionsOps[Self <: SurfaceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick(value: /* e */ SurfaceClickEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseenter(value: /* e */ SurfaceMouseenterEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseenter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseenter")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseleave(value: /* e */ SurfaceMouseleaveEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseleave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseleave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseleave")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: SurfaceTooltip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipClose(value: /* e */ SurfaceTooltipCloseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTooltipClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipClose")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipOpen(value: /* e */ SurfaceTooltipOpenEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTooltipOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

