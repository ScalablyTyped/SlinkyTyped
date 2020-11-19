package typingsSlinky.consumableStream.mod

import typingsSlinky.std.AsyncIterable
import typingsSlinky.std.AsyncIterator
import typingsSlinky.std.IteratorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsumableStream[T]
  extends AsyncIterator[T, js.Any, js.UndefOr[scala.Nothing]]
     with AsyncIterable[T] {
  
  def createConsumable(): AsyncIterable[T] = js.native
  def createConsumable(timeout: Double): AsyncIterable[T] = js.native
  
  def createConsumer(): Consumer[T] = js.native
  def createConsumer(timeout: Double): Consumer[T] = js.native
  
  def next(): js.Promise[IteratorResult[T, _]] = js.native
  def next(timeout: Double): js.Promise[IteratorResult[T, _]] = js.native
  
  def once(): js.Promise[T] = js.native
  def once(timeout: Double): js.Promise[T] = js.native
}
