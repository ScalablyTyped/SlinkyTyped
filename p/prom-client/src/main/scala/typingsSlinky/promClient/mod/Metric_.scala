package typingsSlinky.promClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.promClient.mod.Counter
  - typingsSlinky.promClient.mod.Gauge
  - typingsSlinky.promClient.mod.Summary
  - typingsSlinky.promClient.mod.Histogram
*/
trait Metric_ extends js.Object

object Metric_ {
  @scala.inline
  implicit def apply(value: Counter): Metric_ = value.asInstanceOf[Metric_]
  @scala.inline
  implicit def apply(value: Gauge): Metric_ = value.asInstanceOf[Metric_]
  @scala.inline
  implicit def apply(value: Histogram): Metric_ = value.asInstanceOf[Metric_]
  @scala.inline
  implicit def apply(value: Summary): Metric_ = value.asInstanceOf[Metric_]
}

