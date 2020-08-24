package typingsSlinky.hdrHistogramJs.abstractHistogramEncodingMod

import typingsSlinky.hdrHistogramJs.abstractHistogramMod.AbstractHistogram
import typingsSlinky.hdrHistogramJs.abstractHistogramMod.HistogramConstructor
import typingsSlinky.hdrHistogramJs.byteBufferMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hdr-histogram-js/AbstractHistogram.encoding", "doDecodeFromCompressedByteBuffer")
@js.native
object doDecodeFromCompressedByteBuffer extends js.Object {
  def apply(buffer: default, histogramConstr: HistogramConstructor, minBarForHighestTrackableValue: Double): AbstractHistogram = js.native
}

