package typingsSlinky.apolloReactComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.apolloClient.mod.default
import typingsSlinky.apolloReactCommon.apolloConsumerMod.ApolloConsumerProps
import typingsSlinky.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ApolloConsumer {
  
  @JSImport("@apollo/react-components", "ApolloConsumer")
  @js.native
  object component extends js.Object
  
  def withProps(p: ApolloConsumerProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(children: default[js.Object] => ReactChild | Null): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ApolloConsumerProps]))
  }
}
