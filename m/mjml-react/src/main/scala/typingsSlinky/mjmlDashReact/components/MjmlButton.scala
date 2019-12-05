package typingsSlinky.mjmlDashReact.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.mjmlDashReact.mjmlDashReactMod.BorderProps
import typingsSlinky.mjmlDashReact.mjmlDashReactMod.ClassNameProps
import typingsSlinky.mjmlDashReact.mjmlDashReactMod.HrefProps
import typingsSlinky.mjmlDashReact.mjmlDashReactMod.MjmlButtonProps
import typingsSlinky.mjmlDashReact.mjmlDashReactMod.PaddingProps
import typingsSlinky.mjmlDashReact.mjmlDashReactMod.RequiredChildrenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object MjmlButton
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.mjmlDashReact.mjmlDashReactMod.MjmlButton] {
  @JSImport("mjml-react", "MjmlButton")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = RequiredChildrenProps with MjmlButtonProps with PaddingProps with ClassNameProps with HrefProps with BorderProps
}

