package typingsSlinky.apolloDashReact.libApolloProviderMod

import typingsSlinky.apolloDashReact.Anon_ClientStore
import typingsSlinky.react.reactMod.Component
import typingsSlinky.redux.reduxMod.AnyAction
import typingsSlinky.redux.reduxMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApolloProvider
  extends Component[ProviderProps, js.Any, js.Any] {
  var client: typingsSlinky.apolloDashClient.apolloDashClientMod.default[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for TCacheShape */ _
  ] = js.native
  var store: Store[_, AnyAction] = js.native
  def getChildContext(): Anon_ClientStore = js.native
}

