package typingsSlinky.reactAlbus.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactAlbus.mod.StepProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. Support for combinations of intersection and union types not implemented */
object Step
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactAlbus.mod.Step] {
  @JSImport("react-albus", "Step")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = StepProps
}

