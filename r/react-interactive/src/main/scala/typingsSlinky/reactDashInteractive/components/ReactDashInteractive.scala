package typingsSlinky.reactDashInteractive.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashInteractive.reactDashInteractiveMod.InteractiveProps
import typingsSlinky.reactDashInteractive.reactDashInteractiveMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashInteractive), Name(reactDashInteractiveMod), Name(InteractiveProps))) was not a @ScalaJSDefined trait */
object ReactDashInteractive
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-interactive", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = InteractiveProps
}

