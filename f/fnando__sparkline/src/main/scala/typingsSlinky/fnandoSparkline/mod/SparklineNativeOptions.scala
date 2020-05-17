package typingsSlinky.fnandoSparkline.mod

import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fnandoSparkline.mod.SparklineOptions
  - typingsSlinky.std.Partial[typingsSlinky.fnandoSparkline.mod.SparklineOptionsFetch[TEntry]]
*/
trait SparklineNativeOptions[TEntry] extends js.Object

object SparklineNativeOptions {
  @scala.inline
  implicit def apply[TEntry](value: Partial[SparklineOptionsFetch[TEntry]]): SparklineNativeOptions[TEntry] = value.asInstanceOf[SparklineNativeOptions[TEntry]]
  @scala.inline
  implicit def apply[TEntry](value: SparklineOptions): SparklineNativeOptions[TEntry] = value.asInstanceOf[SparklineNativeOptions[TEntry]]
}

