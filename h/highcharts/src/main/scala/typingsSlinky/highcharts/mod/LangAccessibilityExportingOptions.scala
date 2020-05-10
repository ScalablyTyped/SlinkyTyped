package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LangAccessibilityExportingOptions extends js.Object {
  var chartMenuLabel: js.UndefOr[String] = js.native
  var exportRegionLabel: js.UndefOr[String] = js.native
  var menuButtonLabel: js.UndefOr[String] = js.native
}

object LangAccessibilityExportingOptions {
  @scala.inline
  def apply(): LangAccessibilityExportingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilityExportingOptions]
  }
  @scala.inline
  implicit class LangAccessibilityExportingOptionsOps[Self <: LangAccessibilityExportingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChartMenuLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartMenuLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChartMenuLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartMenuLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withExportRegionLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportRegionLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportRegionLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportRegionLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuButtonLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuButtonLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuButtonLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuButtonLabel")(js.undefined)
        ret
    }
  }
  
}

