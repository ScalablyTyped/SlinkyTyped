package typingsSlinky.apolloReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.apolloClient.mod.default
import typingsSlinky.apolloReact.apolloProviderMod.ProviderProps
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ApolloProvider {
  
  @JSImport("apollo-react", "ApolloProvider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.apolloReact.mod.ApolloProvider] {
    
    @scala.inline
    def immutable(value: Boolean): this.type = set("immutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def store(value: Store[_, AnyAction]): this.type = set("store", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    client: default[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for TCacheShape */ _
    ]
  ): Builder = {
    val __props = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ProviderProps]))
  }
}
