package typingsSlinky.grommet.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.grommet.componentsMaskedInputMod.MaskedInputProps
import typingsSlinky.grommet.grommetStrings.id
import typingsSlinky.grommet.grommetStrings.mask
import typingsSlinky.grommet.grommetStrings.name
import typingsSlinky.grommet.grommetStrings.plain
import typingsSlinky.grommet.grommetStrings.size
import typingsSlinky.grommet.grommetStrings.value
import typingsSlinky.react.reactMod.DetailedHTMLProps
import typingsSlinky.react.reactMod.InputHTMLAttributes
import typingsSlinky.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object MaskedInput
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.grommet.grommetMod.MaskedInput] {
  @JSImport("grommet", "MaskedInput")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = MaskedInputProps with (Omit[
    DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
    id | mask | name | plain | size | value
  ])
}

