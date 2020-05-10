package typingsSlinky.oracleOraclejet.ojganttMod

import typingsSlinky.oracleOraclejet.Anon7
import typingsSlinky.oracleOraclejet.AnonAccessibleDependencyInfo
import typingsSlinky.oracleOraclejet.AnonBaseline
import typingsSlinky.oracleOraclejet.AnonBaselineDate
import typingsSlinky.oracleOraclejet.AnonHeightNumber
import typingsSlinky.oracleOraclejet.AnonMaxWidth
import typingsSlinky.oracleOraclejet.AnonMove
import typingsSlinky.oracleOraclejet.AnonOffsetY
import typingsSlinky.oracleOraclejet.AnonScale
import typingsSlinky.oracleOraclejet.AnonVertical
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
  var dnd: AnonMove = js.native
  var end: String = js.native
  var gridlines: AnonVertical = js.native
  var majorAxis: AnonScale = js.native
  var minorAxis: AnonScale = js.native
  var referenceObjects: js.Array[ReferenceObject] = js.native
  var rowAxis: AnonMaxWidth[K2, D2] = js.native
  var rowDefaults: AnonHeightNumber = js.native
  var scrollPosition: AnonOffsetY = js.native
  var selection: js.Array[K2] = js.native
  var selectionMode: single | multiple | none = js.native
  var start: String = js.native
  var taskData: js.UndefOr[DataProvider[K2, D2]] = js.native
  var taskDefaults: AnonBaseline = js.native
  var tooltip: Anon7[K2, D2] = js.native
  @JSName("translations")
  var translations_ojGanttSettableProperties: AnonAccessibleDependencyInfo = js.native
  var valueFormats: AnonBaselineDate = js.native
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
    dnd: AnonMove,
    end: String,
    gridlines: AnonVertical,
    majorAxis: AnonScale,
    minorAxis: AnonScale,
    referenceObjects: js.Array[ReferenceObject],
    rowAxis: AnonMaxWidth[K2, D2],
    rowDefaults: AnonHeightNumber,
    scrollPosition: AnonOffsetY,
    selection: js.Array[K2],
    selectionMode: single | multiple | none,
    start: String,
    taskDefaults: AnonBaseline,
    tooltip: Anon7[K2, D2],
    trackResize: on | off,
    translations: AnonAccessibleDependencyInfo,
    valueFormats: AnonBaselineDate,
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
    def withDnd(value: AnonMove): Self[K1, K2, D1, D2] = {
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
    def withGridlines(value: AnonVertical): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajorAxis(value: AnonScale): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinorAxis(value: AnonScale): Self[K1, K2, D1, D2] = {
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
    def withRowAxis(value: AnonMaxWidth[K2, D2]): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowDefaults(value: AnonHeightNumber): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollPosition(value: AnonOffsetY): Self[K1, K2, D1, D2] = {
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
    def withTaskDefaults(value: AnonBaseline): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltip(value: Anon7[K2, D2]): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslations(value: AnonAccessibleDependencyInfo): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueFormats(value: AnonBaselineDate): Self[K1, K2, D1, D2] = {
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

