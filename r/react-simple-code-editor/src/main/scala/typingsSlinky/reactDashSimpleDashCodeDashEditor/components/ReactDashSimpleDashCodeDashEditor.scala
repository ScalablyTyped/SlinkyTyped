package typingsSlinky.reactDashSimpleDashCodeDashEditor.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.DetailedHTMLProps
import typingsSlinky.react.reactMod.HTMLAttributes
import typingsSlinky.reactDashSimpleDashCodeDashEditor.Anon_AutoFocus
import typingsSlinky.reactDashSimpleDashCodeDashEditor.reactDashSimpleDashCodeDashEditorMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object ReactDashSimpleDashCodeDashEditor
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-simple-code-editor", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) with Anon_AutoFocus
}

