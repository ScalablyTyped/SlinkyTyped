package typingsSlinky.grommet.mod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.grommetStrings.onSelect
import typingsSlinky.grommet.grommetStrings.placeholder
import typingsSlinky.grommet.grommetStrings.size
import typingsSlinky.grommet.textInputMod.TextInputProps
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.InputHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grommet/es6", "TextInput")
@js.native
class TextInput protected ()
  extends Component[
      TextInputProps with (Omit[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        onSelect | size | placeholder
      ]), 
      js.Object, 
      js.Any
    ] {
  def this(props: TextInputProps with (Omit[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        onSelect | size | placeholder
      ])) = this()
  def this(
    props: TextInputProps with (Omit[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        onSelect | size | placeholder
      ]),
    context: js.Any
  ) = this()
}
@JSImport("grommet/es6", "TextInput")
@js.native
object TextInput extends TopLevel[
      ReactComponentClass[
        TextInputProps with (Omit[
          DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
          onSelect | size | placeholder
        ])
      ]
    ]
