package typingsSlinky.ionic.definitionsMod

import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPaginator[T /* <: Response[js.Array[js.Object]] */, S]
  extends IterableIterator[js.Promise[T]] {
  val state: S = js.native
}

