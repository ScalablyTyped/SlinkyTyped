package typingsSlinky.apolloServer.exportsMod

import typingsSlinky.std.AsyncIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server/dist/exports", "mapAsyncIterator")
@js.native
object mapAsyncIterator extends js.Object {
  
  def apply[T, U](
    iterator: AsyncIterator[T, _, js.UndefOr[scala.Nothing]],
    callback: js.Function1[/* value */ T, js.Promise[U] | U]
  ): AsyncIterator[U, _, js.UndefOr[scala.Nothing]] = js.native
  def apply[T, U](
    iterator: AsyncIterator[T, _, js.UndefOr[scala.Nothing]],
    callback: js.Function1[/* value */ T, js.Promise[U] | U],
    rejectCallback: js.Any
  ): AsyncIterator[U, _, js.UndefOr[scala.Nothing]] = js.native
}
