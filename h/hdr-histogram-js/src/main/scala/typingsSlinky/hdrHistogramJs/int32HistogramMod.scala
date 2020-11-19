package typingsSlinky.hdrHistogramJs

import typingsSlinky.hdrHistogramJs.abstractHistogramMod.AbstractHistogram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hdr-histogram-js/Int32Histogram", JSImport.Namespace)
@js.native
object int32HistogramMod extends js.Object {
  
  @js.native
  trait Int32Histogram extends AbstractHistogram {
    
    var counts: js.typedarray.Uint32Array = js.native
    
    var totalCount: Double = js.native
  }
  
  @js.native
  class default protected () extends Int32Histogram {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
  }
}
