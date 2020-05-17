package typingsSlinky.pulumiQuery.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Iterable[TSource]
  - typingsSlinky.pulumiQuery.interfacesMod.AsyncIterable[TSource]
  - js.Promise[
typingsSlinky.pulumiQuery.interfacesMod.AsyncIterable[TSource] | typingsSlinky.std.Iterable[TSource]]
*/
trait AsyncQuerySource[TSource] extends js.Object

object AsyncQuerySource {
  @scala.inline
  implicit def apply[TSource](value: AsyncIterable[TSource]): AsyncQuerySource[TSource] = value.asInstanceOf[AsyncQuerySource[TSource]]
  @scala.inline
  implicit def apply[TSource](value: js.Iterable[TSource]): AsyncQuerySource[TSource] = value.asInstanceOf[AsyncQuerySource[TSource]]
  @scala.inline
  implicit def apply[TSource](value: js.Promise[AsyncIterable[TSource] | js.Iterable[TSource]]): AsyncQuerySource[TSource] = value.asInstanceOf[AsyncQuerySource[TSource]]
}

