package typingsSlinky.flexmonster

import typingsSlinky.flexmonster.mod.MeasureObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActiveMeasure extends js.Object {
  var activeMeasure: js.UndefOr[MeasureObject] = js.native
  var activeTupleIndex: js.UndefOr[Double] = js.native
  var autoRange: js.UndefOr[Boolean] = js.native
  var axisShortNumberFormat: js.UndefOr[Boolean] = js.native
  var labelsHierarchy: js.UndefOr[String] = js.native
  var multipleMeasures: js.UndefOr[Boolean] = js.native
  var oneLevel: js.UndefOr[Boolean] = js.native
  var pieDataIndex: js.UndefOr[String] = js.native
  var position: js.UndefOr[String] = js.native
  var reversedAxes: js.UndefOr[Boolean] = js.native
  var showAllLabels: js.UndefOr[Boolean] = js.native
  var showDataLabels: js.UndefOr[Boolean] = js.native
  var showFilter: js.UndefOr[Boolean] = js.native
  var showLegend: js.UndefOr[Boolean] = js.native
  var showLegendButton: js.UndefOr[Boolean] = js.native
  var showMeasures: js.UndefOr[Boolean] = js.native
  var showOneMeasureSelection: js.UndefOr[Boolean] = js.native
  var showWarning: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object AnonActiveMeasure {
  @scala.inline
  def apply(): AnonActiveMeasure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonActiveMeasure]
  }
  @scala.inline
  implicit class AnonActiveMeasureOps[Self <: AnonActiveMeasure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveMeasure(value: MeasureObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeMeasure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveMeasure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeMeasure")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveTupleIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTupleIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveTupleIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTupleIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoRange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRange")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisShortNumberFormat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisShortNumberFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisShortNumberFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisShortNumberFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelsHierarchy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelsHierarchy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelsHierarchy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelsHierarchy")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipleMeasures(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleMeasures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipleMeasures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleMeasures")(js.undefined)
        ret
    }
    @scala.inline
    def withOneLevel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOneLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withPieDataIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pieDataIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPieDataIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pieDataIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withReversedAxes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversedAxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReversedAxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversedAxes")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAllLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAllLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAllLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAllLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDataLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDataLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDataLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDataLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLegend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLegend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLegend")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLegendButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLegendButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLegendButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLegendButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMeasures(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMeasures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMeasures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMeasures")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOneMeasureSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOneMeasureSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOneMeasureSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOneMeasureSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withShowWarning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWarning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWarning")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
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
  }
  
}

