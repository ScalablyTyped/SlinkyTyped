package typingsSlinky.reactDashRadioDashGroup.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashRadioDashGroup.reactDashRadioDashGroupMod.RadioGroup.RadioGroupProps
import typingsSlinky.reactDashRadioDashGroup.reactDashRadioDashGroupMod.RadioGroup.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashRadioDashGroup), Name(reactDashRadioDashGroupMod), Name(RadioGroup), Name(RadioGroupProps))) was not a @ScalaJSDefined trait */
object RadioGroup
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-radio-group", "RadioGroup")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = RadioGroupProps
}

