package typingsSlinky.apolloReactHooks.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.apolloReactCommon.apolloConsumerMod.ApolloConsumerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ApolloConsumer {
  @JSImport("@apollo/react-hooks", "ApolloConsumer")
  @js.native
  object component extends js.Object
  
  def withProps(p: ApolloConsumerProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ApolloConsumer.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}

