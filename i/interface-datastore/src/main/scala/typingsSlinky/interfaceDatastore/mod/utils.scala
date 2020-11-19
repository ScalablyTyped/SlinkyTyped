package typingsSlinky.interfaceDatastore.mod

import typingsSlinky.std.AsyncGenerator
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("interface-datastore", "utils")
@js.native
object utils extends js.Object {
  
  def filter[T](iterable: AsyncIterable[T], filterer: js.Function1[/* item */ T, Boolean]): AsyncGenerator[T, _, _] = js.native
  
  def map[T, O](iterable: AsyncIterable[T], mapper: js.Function1[/* item */ T, O]): AsyncGenerator[O, _, _] = js.native
  
  def replaceStartWith(s: String, r: js.RegExp): String = js.native
  
  def sortAll[T](iterable: AsyncIterable[T], sorter: js.Function1[/* items */ js.Array[T], js.Array[T]]): AsyncGenerator[T, _, _] = js.native
  
  def take[T](iterable: AsyncIterable[T], n: Double): AsyncGenerator[T, _, _] = js.native
  
  def tmpdir(): String = js.native
}
