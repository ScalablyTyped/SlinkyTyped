package typingsSlinky.aggregateError.mod

import typingsSlinky.std.Error
import typingsSlinky.std.Iterable
import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregateError[T /* <: js.Error */]
  extends Error
     with Iterable[T] {
  
  @JSName(js.Symbol.iterator)
  var iterator_AggregateError: js.Function0[IterableIterator[T]] = js.native
  
  @JSName("name")
  val name_AggregateError: typingsSlinky.aggregateError.aggregateErrorStrings.AggregateError = js.native
}
