package typingsSlinky.hdrHistogramJs.mod

import typingsSlinky.hdrHistogramJs.abstractHistogramMod.HistogramConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hdr-histogram-js", "decodeFromCompressedBase64")
@js.native
object decodeFromCompressedBase64 extends js.Object {
  def apply(base64String: String): typingsSlinky.hdrHistogramJs.abstractHistogramMod.AbstractHistogram = js.native
  def apply(
    base64String: String,
    histogramConstr: js.UndefOr[scala.Nothing],
    minBarForHighestTrackableValue: Double
  ): typingsSlinky.hdrHistogramJs.abstractHistogramMod.AbstractHistogram = js.native
  def apply(base64String: String, histogramConstr: HistogramConstructor): typingsSlinky.hdrHistogramJs.abstractHistogramMod.AbstractHistogram = js.native
  def apply(
    base64String: String,
    histogramConstr: HistogramConstructor,
    minBarForHighestTrackableValue: Double
  ): typingsSlinky.hdrHistogramJs.abstractHistogramMod.AbstractHistogram = js.native
}

