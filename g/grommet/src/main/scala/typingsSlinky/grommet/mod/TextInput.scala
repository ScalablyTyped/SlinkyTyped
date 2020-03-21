package typingsSlinky.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.grommet.grommetStrings.onSelect
import typingsSlinky.grommet.grommetStrings.placeholder
import typingsSlinky.grommet.grommetStrings.size
import typingsSlinky.grommet.textInputMod.TextInputProps
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ComponentState
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "TextInput")
@js.native
class TextInput protected ()
  extends Component[
      TextInputProps with (Omit[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        onSelect | size | placeholder
      ]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: TextInputProps with (Omit[
        DetailedHTMLProps[
          InputHTMLAttributes[org.scalajs.dom.raw.HTMLInputElement], 
          org.scalajs.dom.raw.HTMLInputElement
        ], 
        onSelect | size | placeholder
      ])) = this()
  def this(
    props: TextInputProps with (Omit[
        DetailedHTMLProps[
          InputHTMLAttributes[org.scalajs.dom.raw.HTMLInputElement], 
          org.scalajs.dom.raw.HTMLInputElement
        ], 
        onSelect | size | placeholder
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet", "TextInput")
@js.native
object TextInput extends TopLevel[
      ComponentClass[
        TextInputProps with (Omit[
          DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
          onSelect | size | placeholder
        ]), 
        ComponentState
      ]
    ]

