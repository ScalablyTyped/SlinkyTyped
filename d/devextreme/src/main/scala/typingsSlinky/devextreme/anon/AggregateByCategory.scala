package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.continuous
import typingsSlinky.devextreme.devextremeStrings.datetime
import typingsSlinky.devextreme.devextremeStrings.day
import typingsSlinky.devextreme.devextremeStrings.discrete
import typingsSlinky.devextreme.devextremeStrings.hour
import typingsSlinky.devextreme.devextremeStrings.logarithmic
import typingsSlinky.devextreme.devextremeStrings.millisecond
import typingsSlinky.devextreme.devextremeStrings.minute
import typingsSlinky.devextreme.devextremeStrings.month
import typingsSlinky.devextreme.devextremeStrings.numeric
import typingsSlinky.devextreme.devextremeStrings.quarter
import typingsSlinky.devextreme.devextremeStrings.second
import typingsSlinky.devextreme.devextremeStrings.semidiscrete
import typingsSlinky.devextreme.devextremeStrings.string_
import typingsSlinky.devextreme.devextremeStrings.week
import typingsSlinky.devextreme.devextremeStrings.year
import typingsSlinky.devextreme.mod.DevExpress.viz.ScaleBreak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregateByCategory extends js.Object {
  
  var aggregateByCategory: js.UndefOr[Boolean] = js.native
  
  var aggregationGroupWidth: js.UndefOr[Double] = js.native
  
  var aggregationInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  
  var allowDecimals: js.UndefOr[Boolean] = js.native
  
  var breakStyle: js.UndefOr[Line] = js.native
  
  var breaks: js.UndefOr[js.Array[ScaleBreak]] = js.native
  
  var categories: js.UndefOr[js.Array[Double | String | js.Date]] = js.native
  
  var endOnTick: js.UndefOr[Boolean] = js.native
  
  var endValue: js.UndefOr[Double | js.Date | String] = js.native
  
  var holidays: js.UndefOr[js.Array[js.Date | Double | String]] = js.native
  
  var label: js.UndefOr[OverlappingBehavior] = js.native
  
  var linearThreshold: js.UndefOr[Double] = js.native
  
  var logarithmBase: js.UndefOr[Double] = js.native
  
  var marker: js.UndefOr[Label] = js.native
  
  var maxRange: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  
  var minRange: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  
  var minorTick: js.UndefOr[ColorOpacity] = js.native
  
  var minorTickCount: js.UndefOr[Double] = js.native
  
  var minorTickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  
  var placeholderHeight: js.UndefOr[Double] = js.native
  
  var showCustomBoundaryTicks: js.UndefOr[Boolean] = js.native
  
  var singleWorkdays: js.UndefOr[js.Array[js.Date | Double | String]] = js.native
  
  var startValue: js.UndefOr[Double | js.Date | String] = js.native
  
  var tick: js.UndefOr[OpacityWidth] = js.native
  
  var tickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  
  var `type`: js.UndefOr[continuous | discrete | logarithmic | semidiscrete] = js.native
  
  var valueType: js.UndefOr[datetime | numeric | string_] = js.native
  
  var workWeek: js.UndefOr[js.Array[Double]] = js.native
  
  var workdaysOnly: js.UndefOr[Boolean] = js.native
}
object AggregateByCategory {
  
  @scala.inline
  def apply(): AggregateByCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateByCategory]
  }
  
  @scala.inline
  implicit class AggregateByCategoryOps[Self <: AggregateByCategory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAggregateByCategory(value: Boolean): Self = this.set("aggregateByCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregateByCategory: Self = this.set("aggregateByCategory", js.undefined)
    
    @scala.inline
    def setAggregationGroupWidth(value: Double): Self = this.set("aggregationGroupWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregationGroupWidth: Self = this.set("aggregationGroupWidth", js.undefined)
    
    @scala.inline
    def setAggregationInterval(
      value: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
    ): Self = this.set("aggregationInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregationInterval: Self = this.set("aggregationInterval", js.undefined)
    
    @scala.inline
    def setAllowDecimals(value: Boolean): Self = this.set("allowDecimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDecimals: Self = this.set("allowDecimals", js.undefined)
    
    @scala.inline
    def setBreakStyle(value: Line): Self = this.set("breakStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreakStyle: Self = this.set("breakStyle", js.undefined)
    
    @scala.inline
    def setBreaksVarargs(value: ScaleBreak*): Self = this.set("breaks", js.Array(value :_*))
    
    @scala.inline
    def setBreaks(value: js.Array[ScaleBreak]): Self = this.set("breaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreaks: Self = this.set("breaks", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: (Double | String | js.Date)*): Self = this.set("categories", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: js.Array[Double | String | js.Date]): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    
    @scala.inline
    def setEndOnTick(value: Boolean): Self = this.set("endOnTick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndOnTick: Self = this.set("endOnTick", js.undefined)
    
    @scala.inline
    def setEndValueDate(value: js.Date): Self = this.set("endValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndValue(value: Double | js.Date | String): Self = this.set("endValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndValue: Self = this.set("endValue", js.undefined)
    
    @scala.inline
    def setHolidaysVarargs(value: (js.Date | Double | String)*): Self = this.set("holidays", js.Array(value :_*))
    
    @scala.inline
    def setHolidays(value: js.Array[js.Date | Double | String]): Self = this.set("holidays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHolidays: Self = this.set("holidays", js.undefined)
    
    @scala.inline
    def setLabel(value: OverlappingBehavior): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLinearThreshold(value: Double): Self = this.set("linearThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinearThreshold: Self = this.set("linearThreshold", js.undefined)
    
    @scala.inline
    def setLogarithmBase(value: Double): Self = this.set("logarithmBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogarithmBase: Self = this.set("logarithmBase", js.undefined)
    
    @scala.inline
    def setMarker(value: Label): Self = this.set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    
    @scala.inline
    def setMaxRange(
      value: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
    ): Self = this.set("maxRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRange: Self = this.set("maxRange", js.undefined)
    
    @scala.inline
    def setMinRange(
      value: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
    ): Self = this.set("minRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinRange: Self = this.set("minRange", js.undefined)
    
    @scala.inline
    def setMinorTick(value: ColorOpacity): Self = this.set("minorTick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorTick: Self = this.set("minorTick", js.undefined)
    
    @scala.inline
    def setMinorTickCount(value: Double): Self = this.set("minorTickCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorTickCount: Self = this.set("minorTickCount", js.undefined)
    
    @scala.inline
    def setMinorTickInterval(
      value: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
    ): Self = this.set("minorTickInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorTickInterval: Self = this.set("minorTickInterval", js.undefined)
    
    @scala.inline
    def setPlaceholderHeight(value: Double): Self = this.set("placeholderHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholderHeight: Self = this.set("placeholderHeight", js.undefined)
    
    @scala.inline
    def setShowCustomBoundaryTicks(value: Boolean): Self = this.set("showCustomBoundaryTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCustomBoundaryTicks: Self = this.set("showCustomBoundaryTicks", js.undefined)
    
    @scala.inline
    def setSingleWorkdaysVarargs(value: (js.Date | Double | String)*): Self = this.set("singleWorkdays", js.Array(value :_*))
    
    @scala.inline
    def setSingleWorkdays(value: js.Array[js.Date | Double | String]): Self = this.set("singleWorkdays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleWorkdays: Self = this.set("singleWorkdays", js.undefined)
    
    @scala.inline
    def setStartValueDate(value: js.Date): Self = this.set("startValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartValue(value: Double | js.Date | String): Self = this.set("startValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartValue: Self = this.set("startValue", js.undefined)
    
    @scala.inline
    def setTick(value: OpacityWidth): Self = this.set("tick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTick: Self = this.set("tick", js.undefined)
    
    @scala.inline
    def setTickInterval(
      value: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
    ): Self = this.set("tickInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickInterval: Self = this.set("tickInterval", js.undefined)
    
    @scala.inline
    def setType(value: continuous | discrete | logarithmic | semidiscrete): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValueType(value: datetime | numeric | string_): Self = this.set("valueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueType: Self = this.set("valueType", js.undefined)
    
    @scala.inline
    def setWorkWeekVarargs(value: Double*): Self = this.set("workWeek", js.Array(value :_*))
    
    @scala.inline
    def setWorkWeek(value: js.Array[Double]): Self = this.set("workWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkWeek: Self = this.set("workWeek", js.undefined)
    
    @scala.inline
    def setWorkdaysOnly(value: Boolean): Self = this.set("workdaysOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkdaysOnly: Self = this.set("workdaysOnly", js.undefined)
  }
}
