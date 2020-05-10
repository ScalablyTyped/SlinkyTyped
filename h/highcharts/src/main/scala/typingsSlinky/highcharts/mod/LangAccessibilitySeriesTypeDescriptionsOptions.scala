package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LangAccessibilitySeriesTypeDescriptionsOptions extends js.Object {
  var arearange: js.UndefOr[String] = js.native
  var areasplinerange: js.UndefOr[String] = js.native
  var boxplot: js.UndefOr[String] = js.native
  var bubble: js.UndefOr[String] = js.native
  var columnrange: js.UndefOr[String] = js.native
  var errorbar: js.UndefOr[String] = js.native
  var funnel: js.UndefOr[String] = js.native
  var pyramid: js.UndefOr[String] = js.native
  var waterfall: js.UndefOr[String] = js.native
}

object LangAccessibilitySeriesTypeDescriptionsOptions {
  @scala.inline
  def apply(): LangAccessibilitySeriesTypeDescriptionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilitySeriesTypeDescriptionsOptions]
  }
  @scala.inline
  implicit class LangAccessibilitySeriesTypeDescriptionsOptionsOps[Self <: LangAccessibilitySeriesTypeDescriptionsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArearange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arearange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArearange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arearange")(js.undefined)
        ret
    }
    @scala.inline
    def withAreasplinerange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areasplinerange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAreasplinerange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areasplinerange")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxplot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxplot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxplot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxplot")(js.undefined)
        ret
    }
    @scala.inline
    def withBubble(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubble")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubble: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubble")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnrange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnrange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnrange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnrange")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorbar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorbar")(js.undefined)
        ret
    }
    @scala.inline
    def withFunnel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("funnel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunnel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("funnel")(js.undefined)
        ret
    }
    @scala.inline
    def withPyramid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pyramid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPyramid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pyramid")(js.undefined)
        ret
    }
    @scala.inline
    def withWaterfall(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waterfall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaterfall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waterfall")(js.undefined)
        ret
    }
  }
  
}

