package typingsSlinky.oracleOraclejet.ojganttMod

import org.scalablytyped.runtime.StringDictionary
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

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojgantt.ojGanttSettableProperties<K1, K2, D1, D2>> */
@js.native
trait ojGanttSettablePropertiesLenient[K1, K2, D1, D2]
  extends /* key */ StringDictionary[js.Any] {
  var animationOnDataChange: js.UndefOr[auto | none] = js.native
  var animationOnDisplay: js.UndefOr[auto | none] = js.native
  var as: js.UndefOr[String] = js.native
  var axisPosition: js.UndefOr[bottom | top] = js.native
  var dependencyData: js.UndefOr[DataProvider[K1, D1]] = js.native
  var dnd: js.UndefOr[Move] = js.native
  var end: js.UndefOr[String] = js.native
  var gridlines: js.UndefOr[Vertical] = js.native
  var majorAxis: js.UndefOr[Scale] = js.native
  var minorAxis: js.UndefOr[Scale] = js.native
  var referenceObjects: js.UndefOr[js.Array[ReferenceObject]] = js.native
  var rowAxis: js.UndefOr[MaxWidth[K2, D2]] = js.native
  var rowDefaults: js.UndefOr[HeightNumber] = js.native
  var scrollPosition: js.UndefOr[OffsetY] = js.native
  var selection: js.UndefOr[js.Array[K2]] = js.native
  var selectionMode: js.UndefOr[single | multiple | none] = js.native
  var start: js.UndefOr[String] = js.native
  var taskData: js.UndefOr[DataProvider[K2, D2]] = js.native
  var taskDefaults: js.UndefOr[Baseline] = js.native
  var tooltip: js.UndefOr[`7`[K2, D2]] = js.native
  var trackResize: js.UndefOr[on | off] = js.native
  var translations: js.UndefOr[AccessibleDependencyInfo] = js.native
  var valueFormats: js.UndefOr[BaselineDate] = js.native
  var viewportEnd: js.UndefOr[String] = js.native
  var viewportStart: js.UndefOr[String] = js.native
}

object ojGanttSettablePropertiesLenient {
  @scala.inline
  def apply[K1, K2, D1, D2](): ojGanttSettablePropertiesLenient[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojGanttSettablePropertiesLenient[K1, K2, D1, D2]]
  }
  @scala.inline
  implicit class ojGanttSettablePropertiesLenientOps[Self[k1, k2, d1, d2] <: ojGanttSettablePropertiesLenient[k1, k2, d1, d2], K1, K2, D1, D2] (val x: Self[K1, K2, D1, D2]) extends AnyVal {
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
    def withoutAnimationOnDataChange: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOnDataChange")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationOnDisplay(value: auto | none): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOnDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationOnDisplay: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOnDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withAs(value: String): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisPosition(value: bottom | top): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisPosition: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisPosition")(js.undefined)
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
    def withDnd(value: Move): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnd: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnd")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: String): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withGridlines(value: Vertical): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridlines: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridlines")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorAxis(value: Scale): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorAxis: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorAxis(value: Scale): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorAxis: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceObjects(value: js.Array[ReferenceObject]): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceObjects: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceObjects")(js.undefined)
        ret
    }
    @scala.inline
    def withRowAxis(value: MaxWidth[K2, D2]): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowAxis: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withRowDefaults(value: HeightNumber): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowDefaults: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDefaults")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollPosition(value: OffsetY): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollPosition: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withSelection(value: js.Array[K2]): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelection: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: single | multiple | none): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMode: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: String): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
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
    @scala.inline
    def withTaskDefaults(value: Baseline): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskDefaults: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskDefaults")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: `7`[K2, D2]): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackResize(value: on | off): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackResize: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackResize")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslations(value: AccessibleDependencyInfo): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslations: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(js.undefined)
        ret
    }
    @scala.inline
    def withValueFormats(value: BaselineDate): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueFormats: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withViewportEnd(value: String): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewportEnd: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withViewportStart(value: String): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewportStart: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportStart")(js.undefined)
        ret
    }
  }
  
}

