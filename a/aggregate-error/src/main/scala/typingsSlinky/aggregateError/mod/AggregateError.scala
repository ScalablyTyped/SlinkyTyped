package typingsSlinky.aggregateError.mod

import typingsSlinky.std.Error
import typingsSlinky.std.Iterable
import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregateError
  extends Error
     with Iterable[js.Error] {
  
  @JSName(js.Symbol.iterator)
  var iterator_AggregateError: js.Function0[IterableIterator[js.Error]] = js.native
  
  @JSName("name")
  val name_AggregateError: typingsSlinky.aggregateError.aggregateErrorStrings.AggregateError = js.native
}
