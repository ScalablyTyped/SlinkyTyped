package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LangAccessibilitySeriesSummaryOptions extends js.Object {
  var bar: js.UndefOr[String] = js.native
  var barCombination: js.UndefOr[String] = js.native
  var boxplot: js.UndefOr[String] = js.native
  var boxplotCombination: js.UndefOr[String] = js.native
  var bubble: js.UndefOr[String] = js.native
  var bubbleCombination: js.UndefOr[String] = js.native
  var column: js.UndefOr[String] = js.native
  var columnCombination: js.UndefOr[String] = js.native
  var default: js.UndefOr[String] = js.native
  var defaultCombination: js.UndefOr[String] = js.native
  var line: js.UndefOr[String] = js.native
  var lineCombination: js.UndefOr[String] = js.native
  var map: js.UndefOr[String] = js.native
  var mapCombination: js.UndefOr[String] = js.native
  var mapbubble: js.UndefOr[String] = js.native
  var mapbubbleCombination: js.UndefOr[String] = js.native
  var mapline: js.UndefOr[String] = js.native
  var maplineCombination: js.UndefOr[String] = js.native
  var pie: js.UndefOr[String] = js.native
  var pieCombination: js.UndefOr[String] = js.native
  var scatter: js.UndefOr[String] = js.native
  var scatterCombination: js.UndefOr[String] = js.native
  var spline: js.UndefOr[String] = js.native
  var splineCombination: js.UndefOr[String] = js.native
}

object LangAccessibilitySeriesSummaryOptions {
  @scala.inline
  def apply(): LangAccessibilitySeriesSummaryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilitySeriesSummaryOptions]
  }
  @scala.inline
  implicit class LangAccessibilitySeriesSummaryOptionsOps[Self <: LangAccessibilitySeriesSummaryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bar")(js.undefined)
        ret
    }
    @scala.inline
    def withBarCombination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barCombination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarCombination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barCombination")(js.undefined)
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
    def withBoxplotCombination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxplotCombination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxplotCombination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxplotCombination")(js.undefined)
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
    def withBubbleCombination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleCombination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubbleCombination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleCombination")(js.undefined)
        ret
    }
    @scala.inline
    def withColumn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnCombination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnCombination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnCombination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnCombination")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultCombination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCombination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCombination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCombination")(js.undefined)
        ret
    }
    @scala.inline
    def withLine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(js.undefined)
        ret
    }
    @scala.inline
    def withLineCombination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCombination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineCombination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCombination")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
    @scala.inline
    def withMapCombination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapCombination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapCombination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapCombination")(js.undefined)
        ret
    }
    @scala.inline
    def withMapbubble(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapbubble")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapbubble: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapbubble")(js.undefined)
        ret
    }
    @scala.inline
    def withMapbubbleCombination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapbubbleCombination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapbubbleCombination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapbubbleCombination")(js.undefined)
        ret
    }
    @scala.inline
    def withMapline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapline")(js.undefined)
        ret
    }
    @scala.inline
    def withMaplineCombination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maplineCombination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaplineCombination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maplineCombination")(js.undefined)
        ret
    }
    @scala.inline
    def withPie(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pie")(js.undefined)
        ret
    }
    @scala.inline
    def withPieCombination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pieCombination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPieCombination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pieCombination")(js.undefined)
        ret
    }
    @scala.inline
    def withScatter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scatter")(js.undefined)
        ret
    }
    @scala.inline
    def withScatterCombination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scatterCombination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScatterCombination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scatterCombination")(js.undefined)
        ret
    }
    @scala.inline
    def withSpline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spline")(js.undefined)
        ret
    }
    @scala.inline
    def withSplineCombination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splineCombination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplineCombination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splineCombination")(js.undefined)
        ret
    }
  }
  
}

