package typingsSlinky.apolloServer.mod

import typingsSlinky.graphqlToolsUtils.observableToAsyncIterableMod.Observable
import typingsSlinky.std.AsyncIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server", "observableToAsyncIterable")
@js.native
object observableToAsyncIterable extends js.Object {
  
  def apply[T](observable: Observable[T]): (AsyncIterator[T, _, js.UndefOr[scala.Nothing]]) with typingsSlinky.graphqlToolsUtils.anon.AsyncIterator[T] = js.native
}
