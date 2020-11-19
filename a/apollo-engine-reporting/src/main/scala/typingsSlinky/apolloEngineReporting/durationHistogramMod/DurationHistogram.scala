package typingsSlinky.apolloEngineReporting.durationHistogramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-engine-reporting/dist/durationHistogram", "DurationHistogram")
@js.native
class DurationHistogram () extends js.Object {
  def this(options: DurationHistogramOptions) = this()
  
  val buckets: js.Any = js.native
  
  def combine(otherHistogram: DurationHistogram): Unit = js.native
  
  def incrementBucket(bucket: Double): Unit = js.native
  def incrementBucket(bucket: Double, value: Double): Unit = js.native
  
  def incrementDuration(durationNs: Double): Unit = js.native
  
  def toArray(): js.Array[Double] = js.native
}
/* static members */
@JSImport("apollo-engine-reporting/dist/durationHistogram", "DurationHistogram")
@js.native
object DurationHistogram extends js.Object {
  
  val BUCKET_COUNT: /* 384 */ Double = js.native
  
  val EXPONENT_LOG: Double = js.native
  
  def durationToBucket(durationNs: Double): Double = js.native
}
