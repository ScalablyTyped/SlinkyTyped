package typingsSlinky.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactTable.mod.AggregatorFn[D]
  - typingsSlinky.reactTable.mod.DefaultAggregators
  - java.lang.String
*/
trait Aggregator[D /* <: js.Object */] extends js.Object

object Aggregator {
  @scala.inline
  implicit def apply[D](value: AggregatorFn[D]): Aggregator[D] = value.asInstanceOf[Aggregator[D]]
  @scala.inline
  implicit def apply[D](value: DefaultAggregators): Aggregator[D] = value.asInstanceOf[Aggregator[D]]
  @scala.inline
  implicit def apply[D](value: String): Aggregator[D] = value.asInstanceOf[Aggregator[D]]
}

