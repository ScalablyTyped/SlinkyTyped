package typingsSlinky.apolloReactHoc.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.apolloClient.mod.default
import typingsSlinky.apolloReactCommon.apolloProviderMod.ApolloProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ApolloProvider {
  @JSImport("@apollo/react-hoc", "ApolloProvider")
  @js.native
  object component extends js.Object
  
  def withProps(p: ApolloProviderProps[js.Any]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(client: default[js.Any]): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ApolloProviderProps[js.Any]]))
  }
}

