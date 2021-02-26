package typingsSlinky.hdrHistogramJs

import typingsSlinky.hdrHistogramJs.abstractHistogramMod.AbstractHistogram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object percentileIteratorMod {
  
  /**
    * Used for iterating through histogram values according to percentile levels. The iteration is
    * performed in steps that start at 0% and reduce their distance to 100% according to the
    * <i>percentileTicksPerHalfDistance</i> parameter, ultimately reaching 100% when all recorded histogram
    * values are exhausted.
    */
  @JSImport("hdr-histogram-js/PercentileIterator", JSImport.Default)
  @js.native
  class default protected () extends PercentileIterator {
    /**
      * @param histogram The histogram this iterator will operate on
      * @param percentileTicksPerHalfDistance The number of equal-sized iteration steps per half-distance to 100%.
      */
    def this(histogram: AbstractHistogram, percentileTicksPerHalfDistance: Double) = this()
  }
  
  /**
    * Used for iterating through histogram values according to percentile levels. The iteration is
    * performed in steps that start at 0% and reduce their distance to 100% according to the
    * <i>percentileTicksPerHalfDistance</i> parameter, ultimately reaching 100% when all recorded histogram
    * values are exhausted.
    */
  @js.native
  trait PercentileIterator
    extends typingsSlinky.hdrHistogramJs.abstractHistogramIteratorMod.default {
    
    var doReset: js.Any = js.native
    
    var percentileLevelToIterateFrom: Double = js.native
    
    var percentileLevelToIterateTo: Double = js.native
    
    var percentileTicksPerHalfDistance: Double = js.native
    
    var reachedLastRecordedValue: Boolean = js.native
    
    /**
      * Reset iterator for re-use in a fresh iteration over the same histogram data set.
      *
      * @param percentileTicksPerHalfDistance The number of iteration steps per half-distance to 100%.
      */
    def reset(percentileTicksPerHalfDistance: Double): Unit = js.native
  }
}
