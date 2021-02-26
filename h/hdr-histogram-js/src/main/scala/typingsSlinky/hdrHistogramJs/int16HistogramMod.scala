package typingsSlinky.hdrHistogramJs

import typingsSlinky.hdrHistogramJs.abstractHistogramMod.AbstractHistogram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object int16HistogramMod {
  
  @JSImport("hdr-histogram-js/Int16Histogram", JSImport.Default)
  @js.native
  class default protected () extends Int16Histogram {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
  }
  
  @js.native
  trait Int16Histogram extends AbstractHistogram {
    
    var counts: js.typedarray.Uint16Array = js.native
    
    var totalCount: Double = js.native
  }
}
