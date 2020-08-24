package typingsSlinky.apolloReactCommon.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.apolloClient.mod.default
import typingsSlinky.apolloReactCommon.apolloProviderMod.ApolloProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ApolloProvider {
  @JSImport("@apollo/react-common", "ApolloProvider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def childrenVarargs(value: ReactElement*): this.type = set("children", js.Array(value :_*))
    @scala.inline
    def children(value: ReactElement | js.Array[ReactElement]): this.type = set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def childrenNull: this.type = set("children", null)
  }
  
  def withProps(p: ApolloProviderProps[js.Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(client: default[js.Any]): Builder = {
    val __props = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ApolloProviderProps[js.Any]]))
  }
}

