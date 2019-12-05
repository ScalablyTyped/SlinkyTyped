package typingsSlinky.atPulumiQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesMod {
  type AsyncQuerySource[TSource] = js.Iterable[TSource] | AsyncIterable[TSource] | (js.Promise[AsyncIterable[TSource] | js.Iterable[TSource]])
  type Evaluator[TSource, TResult] = js.Function1[/* source */ AsyncIterableIterator[TSource], js.Promise[TResult]]
  type Operator[TSource, TResult] = js.Function1[/* source */ AsyncIterableIterator[TSource], AsyncIterableIterator[TResult]]
  type OrderKey = String | Double
}
