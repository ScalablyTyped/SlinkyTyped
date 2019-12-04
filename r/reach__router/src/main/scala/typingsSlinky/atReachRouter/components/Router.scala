package typingsSlinky.atReachRouter.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atReachRouter.atReachRouterMod.RouterProps
import typingsSlinky.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object Router
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atReachRouter.atReachRouterMod.Router] {
  @JSImport("@reach/router", "Router")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = RouterProps with HTMLProps[HTMLDivElement]
}

