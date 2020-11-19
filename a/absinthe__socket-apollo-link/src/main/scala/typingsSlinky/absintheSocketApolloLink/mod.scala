package typingsSlinky.absintheSocketApolloLink

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.absintheSocket.mod.AbsintheSocket
import typingsSlinky.absintheSocket.mod.Notifier
import typingsSlinky.apolloLink.typesMod.FetchResult
import typingsSlinky.apolloLink.typesMod.NextLink
import typingsSlinky.apolloLink.typesMod.Operation
import typingsSlinky.std.Record
import typingsSlinky.zenObservableTs.zenObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@absinthe/socket-apollo-link", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def createAbsintheSocketLink(absintheSocket: AbsintheSocket[js.Object]): AbsintheSocketLink = js.native
  def createAbsintheSocketLink(
    absintheSocket: AbsintheSocket[js.Object],
    onError: js.UndefOr[scala.Nothing],
    onStart: js.Function1[/* notifier */ Notifier[js.Object, js.Object], _]
  ): AbsintheSocketLink = js.native
  def createAbsintheSocketLink(absintheSocket: AbsintheSocket[js.Object], onError: js.Function1[/* error */ js.Error, _]): AbsintheSocketLink = js.native
  def createAbsintheSocketLink(
    absintheSocket: AbsintheSocket[js.Object],
    onError: js.Function1[/* error */ js.Error, _],
    onStart: js.Function1[/* notifier */ Notifier[js.Object, js.Object], _]
  ): AbsintheSocketLink = js.native
  
  @js.native
  trait AbsintheSocketLink extends js.Object {
    
    def request(operation: Operation): (Observable[FetchResult[StringDictionary[_], Record[String, _], Record[String, _]]]) | Null = js.native
    def request(operation: Operation, forward: NextLink): (Observable[FetchResult[StringDictionary[_], Record[String, _], Record[String, _]]]) | Null = js.native
  }
}
