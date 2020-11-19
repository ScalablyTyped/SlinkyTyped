package typingsSlinky.apolloReact.apolloProviderMod

import typingsSlinky.apolloReact.anon.Store
import typingsSlinky.react.mod.Component
import typingsSlinky.redux.mod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApolloProvider
  extends Component[ProviderProps, js.Any, js.Any] {
  
  var client: typingsSlinky.apolloClient.mod.default[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for TCacheShape */ _
  ] = js.native
  
  def getChildContext(): Store = js.native
  
  var store: typingsSlinky.redux.mod.Store[_, AnyAction] = js.native
}
