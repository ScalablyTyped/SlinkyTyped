package typingsSlinky.oracleOraclejet.ojganttMod

import typingsSlinky.oracleOraclejet.anon.AccessibleDependencyInfo
import typingsSlinky.oracleOraclejet.anon.Baseline
import typingsSlinky.oracleOraclejet.anon.BaselineDate
import typingsSlinky.oracleOraclejet.anon.HeightNumber
import typingsSlinky.oracleOraclejet.anon.MaxWidth
import typingsSlinky.oracleOraclejet.anon.Move
import typingsSlinky.oracleOraclejet.anon.OffsetY
import typingsSlinky.oracleOraclejet.anon.Scale
import typingsSlinky.oracleOraclejet.anon.Vertical
import typingsSlinky.oracleOraclejet.anon.`7`
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
import typingsSlinky.oracleOraclejet.ojganttMod.ojGantt.ReferenceObject
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.bottom
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.multiple
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.single
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojGanttSettableProperties[K1, K2, D1, D2] extends dvtBaseComponentSettableProperties {
  var animationOnDataChange: auto | none = js.native
  var animationOnDisplay: auto | none = js.native
  var as: String = js.native
  var axisPosition: bottom | top = js.native
  var dependencyData: js.UndefOr[DataProvider[K1, D1]] = js.native
  var dnd: Move = js.native
  var end: String = js.native
  var gridlines: Vertical = js.native
  var majorAxis: Scale = js.native
  var minorAxis: Scale = js.native
  var referenceObjects: js.Array[ReferenceObject] = js.native
  var rowAxis: MaxWidth[K2, D2] = js.native
  var rowDefaults: HeightNumber = js.native
  var scrollPosition: OffsetY = js.native
  var selection: js.Array[K2] = js.native
  var selectionMode: single | multiple | none = js.native
  var start: String = js.native
  var taskData: js.UndefOr[DataProvider[K2, D2]] = js.native
  var taskDefaults: Baseline = js.native
  var tooltip: `7`[K2, D2] = js.native
  @JSName("translations")
  var translations_ojGanttSettableProperties: AccessibleDependencyInfo = js.native
  var valueFormats: BaselineDate = js.native
  var viewportEnd: String = js.native
  var viewportStart: String = js.native
}

object ojGanttSettableProperties {
  @scala.inline
  def apply[K1, K2, D1, D2](
    animationOnDataChange: auto | none,
    animationOnDisplay: auto | none,
    as: String,
    axisPosition: bottom | top,
    dnd: Move,
    end: String,
    gridlines: Vertical,
    majorAxis: Scale,
    minorAxis: Scale,
    referenceObjects: js.Array[ReferenceObject],
    rowAxis: MaxWidth[K2, D2],
    rowDefaults: HeightNumber,
    scrollPosition: OffsetY,
    selection: js.Array[K2],
    selectionMode: single | multiple | none,
    start: String,
    taskDefaults: Baseline,
    tooltip: `7`[K2, D2],
    trackResize: on | off,
    translations: AccessibleDependencyInfo,
    valueFormats: BaselineDate,
    viewportEnd: String,
    viewportStart: String
  ): ojGanttSettableProperties[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal(animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], axisPosition = axisPosition.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], gridlines = gridlines.asInstanceOf[js.Any], majorAxis = majorAxis.asInstanceOf[js.Any], minorAxis = minorAxis.asInstanceOf[js.Any], referenceObjects = referenceObjects.asInstanceOf[js.Any], rowAxis = rowAxis.asInstanceOf[js.Any], rowDefaults = rowDefaults.asInstanceOf[js.Any], scrollPosition = scrollPosition.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], taskDefaults = taskDefaults.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valueFormats = valueFormats.asInstanceOf[js.Any], viewportEnd = viewportEnd.asInstanceOf[js.Any], viewportStart = viewportStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojGanttSettableProperties[K1, K2, D1, D2]]
  }
  @scala.inline
  implicit class ojGanttSettablePropertiesOps[Self[k1, k2, d1, d2] <: ojGanttSettableProperties[k1, k2, d1, d2], K1, K2, D1, D2] (val x: Self[K1, K2, D1, D2]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K1, K2, D1, D2] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K1, K2, D1, D2]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K1, K2, D1, D2]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K1, K2, D1, D2]) with Other]
    @scala.inline
    def withAnimationOnDataChange(value: auto | none): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOnDataChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationOnDisplay(value: auto | none): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOnDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAs(value: String): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxisPosition(value: bottom | top): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDnd(value: Move): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: String): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGridlines(value: Vertical): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajorAxis(value: Scale): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinorAxis(value: Scale): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferenceObjects(value: js.Array[ReferenceObject]): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowAxis(value: MaxWidth[K2, D2]): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowDefaults(value: HeightNumber): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollPosition(value: OffsetY): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelection(value: js.Array[K2]): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionMode(value: single | multiple | none): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: String): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskDefaults(value: Baseline): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltip(value: `7`[K2, D2]): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslations(value: AccessibleDependencyInfo): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueFormats(value: BaselineDate): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportEnd(value: String): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportStart(value: String): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDependencyData(value: DataProvider[K1, D1]): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencyData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependencyData: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencyData")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskData(value: DataProvider[K2, D2]): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskData: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskData")(js.undefined)
        ret
    }
  }
  
}

