package typingsSlinky.mjmlDashReact.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.mjmlDashReact.mjmlDashReactMod.ClassNameProps
import typingsSlinky.mjmlDashReact.mjmlDashReactMod.MjmlHeroProps
import typingsSlinky.mjmlDashReact.mjmlDashReactMod.PaddingProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object MjmlHero
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.mjmlDashReact.mjmlDashReactMod.MjmlHero] {
  @JSImport("mjml-react", "MjmlHero")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = MjmlHeroProps with ClassNameProps with PaddingProps
}

