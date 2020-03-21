package typingsSlinky.reactInteractive.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactInteractive.mod.InteractiveProps
import typingsSlinky.reactInteractive.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. Support for combinations of intersection and union types not implemented */
object ReactInteractive
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-interactive", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = InteractiveProps
}

