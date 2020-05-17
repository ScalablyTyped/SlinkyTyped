package typingsSlinky.nivoGeo.anon

import typingsSlinky.nivoCore.anon.PartialcontainerPartialCS
import typingsSlinky.nivoCore.anon.PartialdomainPartiallineP
import typingsSlinky.nivoCore.anon.PartiallineColorstringlin
import typingsSlinky.nivoCore.anon.PartiallinePartialCSSProp
import typingsSlinky.nivoCore.anon.PartialtextPartialCSSProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@nivo/core.@nivo/core.Theme> */
@js.native
trait PartialTheme extends js.Object {
  var axis: js.UndefOr[PartialdomainPartiallineP] = js.native
  var background: js.UndefOr[String] = js.native
  var dots: js.UndefOr[PartialtextPartialCSSProp] = js.native
  var grid: js.UndefOr[PartiallinePartialCSSProp] = js.native
  var labels: js.UndefOr[PartialtextPartialCSSProp] = js.native
  var legends: js.UndefOr[PartialtextPartialCSSProp] = js.native
  var markers: js.UndefOr[PartiallineColorstringlin] = js.native
  var tooltip: js.UndefOr[PartialcontainerPartialCS] = js.native
}

object PartialTheme {
  @scala.inline
  def apply(): PartialTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTheme]
  }
  @scala.inline
  implicit class PartialThemeOps[Self <: PartialTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: PartialdomainPartiallineP): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withDots(value: PartialtextPartialCSSProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dots")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: PartiallinePartialCSSProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: PartialtextPartialCSSProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withLegends(value: PartialtextPartialCSSProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegends: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legends")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkers(value: PartiallineColorstringlin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: PartialcontainerPartialCS): Self = {
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
  }
  
}

