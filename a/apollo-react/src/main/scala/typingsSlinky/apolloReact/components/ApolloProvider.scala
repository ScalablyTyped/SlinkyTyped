package typingsSlinky.apolloReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.apolloReact.apolloProviderMod.ProviderProps
import typingsSlinky.apolloReact.apolloProviderMod.default
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ApolloProvider {
  @JSImport("apollo-react/lib/ApolloProvider", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def immutable(value: Boolean): this.type = set("immutable", value.asInstanceOf[js.Any])
    @scala.inline
    def store(value: Store[_, AnyAction]): this.type = set("store", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    client: typingsSlinky.apolloClient.mod.default[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for TCacheShape */ _
    ]
  ): Builder = {
    val __props = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ProviderProps]))
  }
}

