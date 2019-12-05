package typingsSlinky.reactDashForm.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashForm.Anon_ChildrenProps
import typingsSlinky.reactDashForm.reactDashFormMod.StyledProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object StyledRadioGroup
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashForm.reactDashFormMod.StyledRadioGroup] {
  @JSImport("react-form", "StyledRadioGroup")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = StyledProps with Anon_ChildrenProps
}

