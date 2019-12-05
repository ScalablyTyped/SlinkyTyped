package typingsSlinky.reactDashGa.components

import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.HTMLProps
import typingsSlinky.reactDashGa.reactDashGaMod.OutboundLinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object OutboundLink
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashGa.reactDashGaMod.OutboundLink] {
  @JSImport("react-ga", "OutboundLink")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = OutboundLinkProps with HTMLProps[HTMLAnchorElement]
}

