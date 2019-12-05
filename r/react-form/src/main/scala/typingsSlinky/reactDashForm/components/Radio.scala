package typingsSlinky.reactDashForm.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.InputHTMLAttributes
import typingsSlinky.reactDashForm.Anon_Group
import typingsSlinky.reactDashForm.reactDashFormMod.FieldProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object Radio
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-form", "Radio")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = FieldProps with InputHTMLAttributes[HTMLInputElement] with Anon_Group
}

