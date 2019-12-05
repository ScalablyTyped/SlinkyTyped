package typingsSlinky.mjmlDashReact.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.mjmlDashReact.mjmlDashReactMod.HrefProps
import typingsSlinky.mjmlDashReact.mjmlDashReactMod.MjmlSocialElementProps
import typingsSlinky.mjmlDashReact.mjmlDashReactMod.PaddingProps
import typingsSlinky.mjmlDashReact.mjmlDashReactMod.RequiredChildrenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object MjmlSocialElement
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.mjmlDashReact.mjmlDashReactMod.MjmlSocialElement] {
  @JSImport("mjml-react", "MjmlSocialElement")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = MjmlSocialElementProps with RequiredChildrenProps with HrefProps with PaddingProps
}

