package typingsSlinky.grommet.maskedInputMod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.grommetStrings.icon
import typingsSlinky.grommet.grommetStrings.id
import typingsSlinky.grommet.grommetStrings.mask
import typingsSlinky.grommet.grommetStrings.name
import typingsSlinky.grommet.grommetStrings.plain
import typingsSlinky.grommet.grommetStrings.reverse
import typingsSlinky.grommet.grommetStrings.size
import typingsSlinky.grommet.grommetStrings.value
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/MaskedInput", "MaskedInput")
@js.native
class MaskedInput protected ()
  extends Component[
      MaskedInputProps with (Omit[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        icon | id | mask | name | plain | reverse | size | value
      ]), 
      js.Object, 
      js.Any
    ] {
  def this(props: MaskedInputProps with (Omit[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        icon | id | mask | name | plain | reverse | size | value
      ])) = this()
  def this(
    props: MaskedInputProps with (Omit[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        icon | id | mask | name | plain | reverse | size | value
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/components/MaskedInput", "MaskedInput")
@js.native
object MaskedInput extends TopLevel[
      ReactComponentClass[
        MaskedInputProps with (Omit[
          DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
          icon | id | mask | name | plain | reverse | size | value
        ])
      ]
    ]

