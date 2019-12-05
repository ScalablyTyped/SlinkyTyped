package typingsSlinky.reactDashForm.components

import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.TextareaHTMLAttributes
import typingsSlinky.reactDashForm.reactDashFormMod.StyledProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object StyledTextArea
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-form", "StyledTextArea")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = StyledProps with TextareaHTMLAttributes[HTMLTextAreaElement]
}

