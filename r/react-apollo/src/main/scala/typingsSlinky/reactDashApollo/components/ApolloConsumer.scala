package typingsSlinky.reactDashApollo.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ApolloConsumer
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-apollo", "ApolloConsumer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

