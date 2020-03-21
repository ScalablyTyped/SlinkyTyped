package typingsSlinky.graphqlTools

import typingsSlinky.std.AsyncIterator
import typingsSlinky.zenObservableTs.zenObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/stitching/observableToAsyncIterable", JSImport.Namespace)
@js.native
object observableToAsyncIterableMod extends js.Object {
  def observableToAsyncIterable[T](observable: Observable[T]): AsyncIterator[T, _, js.UndefOr[scala.Nothing]] = js.native
}

