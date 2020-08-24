package typingsSlinky.hdrHistogramJs

import typingsSlinky.hdrHistogramJs.abstractHistogramMod.AbstractHistogram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hdr-histogram-js/Int16Histogram", JSImport.Namespace)
@js.native
object int16HistogramMod extends js.Object {
  @js.native
  trait Int16Histogram extends AbstractHistogram {
    var counts: js.typedarray.Uint16Array = js.native
    var totalCount: Double = js.native
  }
  
  @js.native
  class default protected () extends Int16Histogram {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
  }
  
}

