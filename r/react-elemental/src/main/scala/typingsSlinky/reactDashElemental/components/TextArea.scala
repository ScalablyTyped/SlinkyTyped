package typingsSlinky.reactDashElemental.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashElemental.reactDashElementalMod.TextAreaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashElemental), Name(reactDashElementalMod), Name(TextAreaProps))) was not a @ScalaJSDefined trait */
object TextArea
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-elemental", "TextArea")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = TextAreaProps
}

