package typingsSlinky.grommet.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.grommet.componentsTextInputMod.TextInputProps
import typingsSlinky.grommet.grommetStrings.onSelect
import typingsSlinky.grommet.grommetStrings.placeholder
import typingsSlinky.grommet.grommetStrings.size
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.react.reactMod.DetailedHTMLProps
import typingsSlinky.react.reactMod.InputHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object TextInput
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.grommet.grommetMod.TextInput] {
  @JSImport("grommet", "TextInput")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = TextInputProps with (Omit[
    DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
    onSelect | size | placeholder
  ])
}

