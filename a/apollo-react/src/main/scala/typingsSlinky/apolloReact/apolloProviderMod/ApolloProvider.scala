package typingsSlinky.apolloReact.apolloProviderMod

import typingsSlinky.apolloReact.AnonStore
import typingsSlinky.react.mod.Component
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApolloProvider
  extends Component[ProviderProps, js.Any, js.Any] {
  var client: typingsSlinky.apolloClient.mod.default[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for TCacheShape */ _
  ] = js.native
  var store: Store[_, AnyAction] = js.native
  def getChildContext(): AnonStore = js.native
}

