package typingsSlinky.reactDashAlbus.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashAlbus.reactDashAlbusMod.StepProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashAlbus), Name(reactDashAlbusMod), Name(StepProps))) was not a @ScalaJSDefined trait */
object Step
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashAlbus.reactDashAlbusMod.Step] {
  @JSImport("react-albus", "Step")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = StepProps
}

