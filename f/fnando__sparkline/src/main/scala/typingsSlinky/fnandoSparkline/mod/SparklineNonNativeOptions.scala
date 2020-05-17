package typingsSlinky.fnandoSparkline.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fnandoSparkline.mod.SparklineOptions
  - typingsSlinky.fnandoSparkline.mod.SparklineOptionsFetch[TEntry]
*/
trait SparklineNonNativeOptions[TEntry] extends js.Object

object SparklineNonNativeOptions {
  @scala.inline
  implicit def apply[TEntry](value: SparklineOptions): SparklineNonNativeOptions[TEntry] = value.asInstanceOf[SparklineNonNativeOptions[TEntry]]
  @scala.inline
  implicit def apply[TEntry](value: SparklineOptionsFetch[TEntry]): SparklineNonNativeOptions[TEntry] = value.asInstanceOf[SparklineNonNativeOptions[TEntry]]
}

