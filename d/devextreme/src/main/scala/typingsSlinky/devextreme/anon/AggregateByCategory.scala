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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregateByCategory extends StObject {
  
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
  implicit class AggregateByCategoryMutableBuilder[Self <: AggregateByCategory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregateByCategory(value: Boolean): Self = StObject.set(x, "aggregateByCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateByCategoryUndefined: Self = StObject.set(x, "aggregateByCategory", js.undefined)
    
    @scala.inline
    def setAggregationGroupWidth(value: Double): Self = StObject.set(x, "aggregationGroupWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationGroupWidthUndefined: Self = StObject.set(x, "aggregationGroupWidth", js.undefined)
    
    @scala.inline
    def setAggregationInterval(
      value: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
    ): Self = StObject.set(x, "aggregationInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationIntervalUndefined: Self = StObject.set(x, "aggregationInterval", js.undefined)
    
    @scala.inline
    def setAllowDecimals(value: Boolean): Self = StObject.set(x, "allowDecimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDecimalsUndefined: Self = StObject.set(x, "allowDecimals", js.undefined)
    
    @scala.inline
    def setBreakStyle(value: Line): Self = StObject.set(x, "breakStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakStyleUndefined: Self = StObject.set(x, "breakStyle", js.undefined)
    
    @scala.inline
    def setBreaks(value: js.Array[ScaleBreak]): Self = StObject.set(x, "breaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreaksUndefined: Self = StObject.set(x, "breaks", js.undefined)
    
    @scala.inline
    def setBreaksVarargs(value: ScaleBreak*): Self = StObject.set(x, "breaks", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: js.Array[Double | String | js.Date]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: (Double | String | js.Date)*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setEndOnTick(value: Boolean): Self = StObject.set(x, "endOnTick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOnTickUndefined: Self = StObject.set(x, "endOnTick", js.undefined)
    
    @scala.inline
    def setEndValue(value: Double | js.Date | String): Self = StObject.set(x, "endValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndValueDate(value: js.Date): Self = StObject.set(x, "endValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndValueUndefined: Self = StObject.set(x, "endValue", js.undefined)
    
    @scala.inline
    def setHolidays(value: js.Array[js.Date | Double | String]): Self = StObject.set(x, "holidays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHolidaysUndefined: Self = StObject.set(x, "holidays", js.undefined)
    
    @scala.inline
    def setHolidaysVarargs(value: (js.Date | Double | String)*): Self = StObject.set(x, "holidays", js.Array(value :_*))
    
    @scala.inline
    def setLabel(value: OverlappingBehavior): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLinearThreshold(value: Double): Self = StObject.set(x, "linearThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearThresholdUndefined: Self = StObject.set(x, "linearThreshold", js.undefined)
    
    @scala.inline
    def setLogarithmBase(value: Double): Self = StObject.set(x, "logarithmBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogarithmBaseUndefined: Self = StObject.set(x, "logarithmBase", js.undefined)
    
    @scala.inline
    def setMarker(value: Label): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    @scala.inline
    def setMaxRange(
      value: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
    ): Self = StObject.set(x, "maxRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRangeUndefined: Self = StObject.set(x, "maxRange", js.undefined)
    
    @scala.inline
    def setMinRange(
      value: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
    ): Self = StObject.set(x, "minRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinRangeUndefined: Self = StObject.set(x, "minRange", js.undefined)
    
    @scala.inline
    def setMinorTick(value: ColorOpacity): Self = StObject.set(x, "minorTick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTickCount(value: Double): Self = StObject.set(x, "minorTickCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTickCountUndefined: Self = StObject.set(x, "minorTickCount", js.undefined)
    
    @scala.inline
    def setMinorTickInterval(
      value: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
    ): Self = StObject.set(x, "minorTickInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTickIntervalUndefined: Self = StObject.set(x, "minorTickInterval", js.undefined)
    
    @scala.inline
    def setMinorTickUndefined: Self = StObject.set(x, "minorTick", js.undefined)
    
    @scala.inline
    def setPlaceholderHeight(value: Double): Self = StObject.set(x, "placeholderHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderHeightUndefined: Self = StObject.set(x, "placeholderHeight", js.undefined)
    
    @scala.inline
    def setShowCustomBoundaryTicks(value: Boolean): Self = StObject.set(x, "showCustomBoundaryTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCustomBoundaryTicksUndefined: Self = StObject.set(x, "showCustomBoundaryTicks", js.undefined)
    
    @scala.inline
    def setSingleWorkdays(value: js.Array[js.Date | Double | String]): Self = StObject.set(x, "singleWorkdays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleWorkdaysUndefined: Self = StObject.set(x, "singleWorkdays", js.undefined)
    
    @scala.inline
    def setSingleWorkdaysVarargs(value: (js.Date | Double | String)*): Self = StObject.set(x, "singleWorkdays", js.Array(value :_*))
    
    @scala.inline
    def setStartValue(value: Double | js.Date | String): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartValueDate(value: js.Date): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
    
    @scala.inline
    def setTick(value: OpacityWidth): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickInterval(
      value: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
    ): Self = StObject.set(x, "tickInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickIntervalUndefined: Self = StObject.set(x, "tickInterval", js.undefined)
    
    @scala.inline
    def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
    
    @scala.inline
    def setType(value: continuous | discrete | logarithmic | semidiscrete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValueType(value: datetime | numeric | string_): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
    
    @scala.inline
    def setWorkWeek(value: js.Array[Double]): Self = StObject.set(x, "workWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkWeekUndefined: Self = StObject.set(x, "workWeek", js.undefined)
    
    @scala.inline
    def setWorkWeekVarargs(value: Double*): Self = StObject.set(x, "workWeek", js.Array(value :_*))
    
    @scala.inline
    def setWorkdaysOnly(value: Boolean): Self = StObject.set(x, "workdaysOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkdaysOnlyUndefined: Self = StObject.set(x, "workdaysOnly", js.undefined)
  }
}
