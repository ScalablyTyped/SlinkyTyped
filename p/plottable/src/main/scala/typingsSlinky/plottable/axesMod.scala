package typingsSlinky.plottable

import typingsSlinky.plottable.axisMod.AxisOrientation
import typingsSlinky.plottable.plottableStrings.between
import typingsSlinky.plottable.plottableStrings.bottom
import typingsSlinky.plottable.plottableStrings.center
import typingsSlinky.plottable.plottableStrings.day
import typingsSlinky.plottable.plottableStrings.hour
import typingsSlinky.plottable.plottableStrings.minute
import typingsSlinky.plottable.plottableStrings.month
import typingsSlinky.plottable.plottableStrings.second
import typingsSlinky.plottable.plottableStrings.top
import typingsSlinky.plottable.plottableStrings.week
import typingsSlinky.plottable.plottableStrings.year
import typingsSlinky.plottable.quantitativeScaleMod.QuantitativeScale
import typingsSlinky.plottable.timeAxisMod.TimeAxisOrientation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object axesMod {
  
  @JSImport("plottable/build/src/axes", "Category")
  @js.native
  class Category protected ()
    extends typingsSlinky.plottable.categoryAxisMod.Category {
    /**
      * Constructs a Category Axis.
      *
      * A Category Axis is a visual representation of a Category Scale.
      *
      * @constructor
      * @param {Scales.Category} scale
      * @param {AxisOrientation} [orientation="bottom"] Orientation of this Category Axis.
      */
    def this(scale: typingsSlinky.plottable.scalesMod.Category) = this()
    def this(scale: typingsSlinky.plottable.scalesMod.Category, orientation: AxisOrientation) = this()
  }
  /* static members */
  object Category {
    
    @JSImport("plottable/build/src/axes", "Category")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * How many pixels to give labels at minimum before downsampling takes effect.
      */
    @JSImport("plottable/build/src/axes", "Category._MINIMUM_WIDTH_PER_LABEL_PX")
    @js.native
    def _MINIMUM_WIDTH_PER_LABEL_PX: js.Any = js.native
    @scala.inline
    def _MINIMUM_WIDTH_PER_LABEL_PX_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MINIMUM_WIDTH_PER_LABEL_PX")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/axes", "Numeric")
  @js.native
  class Numeric protected ()
    extends typingsSlinky.plottable.numericAxisMod.Numeric {
    /**
      * Constructs a Numeric Axis.
      *
      * A Numeric Axis is a visual representation of a QuantitativeScale.
      *
      * @constructor
      * @param {QuantitativeScale} scale
      * @param {AxisOrientation} orientation Orientation of this Numeric Axis.
      */
    def this(scale: QuantitativeScale[Double], orientation: AxisOrientation) = this()
  }
  
  object TierLabelPosition {
    
    @JSImport("plottable/build/src/axes", "TierLabelPosition")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/axes", "TierLabelPosition.between")
    @js.native
    def between: typingsSlinky.plottable.plottableStrings.between = js.native
    @scala.inline
    def between_=(x: between): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("between")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes", "TierLabelPosition.center")
    @js.native
    def center: typingsSlinky.plottable.plottableStrings.center = js.native
    @scala.inline
    def center_=(x: center): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("center")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/axes", "Time")
  @js.native
  class Time protected ()
    extends typingsSlinky.plottable.timeAxisMod.Time {
    /**
      * Constructs a Time Axis.
      *
      * A Time Axis is a visual representation of a Time Scale.
      *
      * @constructor
      * @param {Scales.Time} scale
      * @param {AxisOrientation} orientation Orientation of this Time Axis. Time Axes can only have "top" or "bottom"
      * @param {boolean} useUTC Displays date object in UTC if true, local time if false. Defaults to false.
      * orientations.
      */
    def this(scale: typingsSlinky.plottable.scalesMod.Time, orientation: TimeAxisOrientation) = this()
    def this(scale: typingsSlinky.plottable.scalesMod.Time, orientation: TimeAxisOrientation, useUTC: Boolean) = this()
  }
  /* static members */
  object Time {
    
    @JSImport("plottable/build/src/axes", "Time")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The CSS class applied to each Time Axis tier
      */
    @JSImport("plottable/build/src/axes", "Time.TIME_AXIS_TIER_CLASS")
    @js.native
    def TIME_AXIS_TIER_CLASS: String = js.native
    @scala.inline
    def TIME_AXIS_TIER_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIME_AXIS_TIER_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes", "Time._DEFAULT_TIME_AXIS_CONFIGURATIONS")
    @js.native
    def _DEFAULT_TIME_AXIS_CONFIGURATIONS: js.Any = js.native
    @scala.inline
    def _DEFAULT_TIME_AXIS_CONFIGURATIONS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DEFAULT_TIME_AXIS_CONFIGURATIONS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes", "Time._LONG_DATE")
    @js.native
    def _LONG_DATE: js.Any = js.native
    @scala.inline
    def _LONG_DATE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LONG_DATE")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes", "Time._SORTED_TIME_INTERVAL_INDEX")
    @js.native
    def _SORTED_TIME_INTERVAL_INDEX: js.Any = js.native
    @scala.inline
    def _SORTED_TIME_INTERVAL_INDEX_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SORTED_TIME_INTERVAL_INDEX")(x.asInstanceOf[js.Any])
  }
  
  object TimeAxisOrientation {
    
    @JSImport("plottable/build/src/axes", "TimeAxisOrientation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/axes", "TimeAxisOrientation.bottom")
    @js.native
    def bottom: typingsSlinky.plottable.plottableStrings.bottom = js.native
    @scala.inline
    def bottom_=(x: bottom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottom")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes", "TimeAxisOrientation.top")
    @js.native
    def top: typingsSlinky.plottable.plottableStrings.top = js.native
    @scala.inline
    def top_=(x: top): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("top")(x.asInstanceOf[js.Any])
  }
  
  object TimeInterval {
    
    @JSImport("plottable/build/src/axes", "TimeInterval")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/axes", "TimeInterval.day")
    @js.native
    def day: typingsSlinky.plottable.plottableStrings.day = js.native
    @scala.inline
    def day_=(x: day): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("day")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes", "TimeInterval.hour")
    @js.native
    def hour: typingsSlinky.plottable.plottableStrings.hour = js.native
    @scala.inline
    def hour_=(x: hour): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hour")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes", "TimeInterval.minute")
    @js.native
    def minute: typingsSlinky.plottable.plottableStrings.minute = js.native
    @scala.inline
    def minute_=(x: minute): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minute")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes", "TimeInterval.month")
    @js.native
    def month: typingsSlinky.plottable.plottableStrings.month = js.native
    @scala.inline
    def month_=(x: month): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("month")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes", "TimeInterval.second")
    @js.native
    def second: typingsSlinky.plottable.plottableStrings.second = js.native
    @scala.inline
    def second_=(x: second): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("second")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes", "TimeInterval.week")
    @js.native
    def week: typingsSlinky.plottable.plottableStrings.week = js.native
    @scala.inline
    def week_=(x: week): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("week")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes", "TimeInterval.year")
    @js.native
    def year: typingsSlinky.plottable.plottableStrings.year = js.native
    @scala.inline
    def year_=(x: year): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("year")(x.asInstanceOf[js.Any])
  }
}
