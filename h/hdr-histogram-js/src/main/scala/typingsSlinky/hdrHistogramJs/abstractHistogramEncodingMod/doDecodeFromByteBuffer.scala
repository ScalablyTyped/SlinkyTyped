package typingsSlinky.hdrHistogramJs.abstractHistogramEncodingMod

import typingsSlinky.hdrHistogramJs.abstractHistogramMod.AbstractHistogram
import typingsSlinky.hdrHistogramJs.abstractHistogramMod.HistogramConstructor
import typingsSlinky.hdrHistogramJs.byteBufferMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hdr-histogram-js/AbstractHistogram.encoding", "doDecodeFromByteBuffer")
@js.native
object doDecodeFromByteBuffer extends js.Object {
  
  def apply(buffer: default, histogramConstr: HistogramConstructor, minBarForHighestTrackableValue: Double): AbstractHistogram = js.native
}
