package typingsSlinky.plottable

import typingsSlinky.plottable.axisMod.AxisOrientation
import typingsSlinky.plottable.quantitativeScaleMod.QuantitativeScale
import typingsSlinky.plottable.timeAxisMod.TimeAxisOrientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/axes", JSImport.Namespace)
@js.native
object axesMod extends js.Object {
  
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
  @js.native
  object Category extends js.Object {
    
    /**
      * How many pixels to give labels at minimum before downsampling takes effect.
      */
    var _MINIMUM_WIDTH_PER_LABEL_PX: js.Any = js.native
  }
  
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
  
  @js.native
  object TierLabelPosition extends js.Object {
    
    var between: typingsSlinky.plottable.plottableStrings.between = js.native
    
    var center: typingsSlinky.plottable.plottableStrings.center = js.native
  }
  
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
  @js.native
  object Time extends js.Object {
    
    /**
      * The CSS class applied to each Time Axis tier
      */
    var TIME_AXIS_TIER_CLASS: String = js.native
    
    var _DEFAULT_TIME_AXIS_CONFIGURATIONS: js.Any = js.native
    
    var _LONG_DATE: js.Any = js.native
    
    var _SORTED_TIME_INTERVAL_INDEX: js.Any = js.native
  }
  
  @js.native
  object TimeAxisOrientation extends js.Object {
    
    var bottom: typingsSlinky.plottable.plottableStrings.bottom = js.native
    
    var top: typingsSlinky.plottable.plottableStrings.top = js.native
  }
  
  @js.native
  object TimeInterval extends js.Object {
    
    var day: typingsSlinky.plottable.plottableStrings.day = js.native
    
    var hour: typingsSlinky.plottable.plottableStrings.hour = js.native
    
    var minute: typingsSlinky.plottable.plottableStrings.minute = js.native
    
    var month: typingsSlinky.plottable.plottableStrings.month = js.native
    
    var second: typingsSlinky.plottable.plottableStrings.second = js.native
    
    var week: typingsSlinky.plottable.plottableStrings.week = js.native
    
    var year: typingsSlinky.plottable.plottableStrings.year = js.native
  }
}
