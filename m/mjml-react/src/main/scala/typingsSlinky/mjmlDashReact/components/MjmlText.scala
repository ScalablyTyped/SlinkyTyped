package typingsSlinky.mjmlDashReact.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.mjmlDashReact.mjmlDashReactMod.ClassNameProps
import typingsSlinky.mjmlDashReact.mjmlDashReactMod.MjmlTextProps
import typingsSlinky.mjmlDashReact.mjmlDashReactMod.PaddingProps
import typingsSlinky.mjmlDashReact.mjmlDashReactMod.RequiredChildrenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object MjmlText
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.mjmlDashReact.mjmlDashReactMod.MjmlText] {
  @JSImport("mjml-react", "MjmlText")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = MjmlTextProps with RequiredChildrenProps with PaddingProps with ClassNameProps
}

