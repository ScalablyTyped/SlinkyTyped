package typingsSlinky.hdrHistogramJs

import typingsSlinky.hdrHistogramJs.abstractHistogramMod.AbstractHistogram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object int8HistogramMod {
  
  @JSImport("hdr-histogram-js/Int8Histogram", JSImport.Default)
  @js.native
  class default protected () extends Int8Histogram {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
  }
  
  @js.native
  trait Int8Histogram extends AbstractHistogram {
    
    var counts: js.typedarray.Uint8Array = js.native
    
    var totalCount: Double = js.native
  }
}
