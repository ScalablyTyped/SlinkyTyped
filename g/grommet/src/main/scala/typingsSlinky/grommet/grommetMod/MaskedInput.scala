package typingsSlinky.grommet.grommetMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.grommet.componentsMaskedInputMod.MaskedInputProps
import typingsSlinky.grommet.grommetStrings.id
import typingsSlinky.grommet.grommetStrings.mask
import typingsSlinky.grommet.grommetStrings.name
import typingsSlinky.grommet.grommetStrings.plain
import typingsSlinky.grommet.grommetStrings.size
import typingsSlinky.grommet.grommetStrings.value
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.ComponentClass
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.react.reactMod.DetailedHTMLProps
import typingsSlinky.react.reactMod.InputHTMLAttributes
import typingsSlinky.std.HTMLInputElement
import typingsSlinky.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "MaskedInput")
@js.native
class MaskedInput protected ()
  extends Component[
      MaskedInputProps with (Omit[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        id | mask | name | plain | size | value
      ]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: MaskedInputProps with (Omit[
        DetailedHTMLProps[
          InputHTMLAttributes[org.scalajs.dom.raw.HTMLInputElement], 
          org.scalajs.dom.raw.HTMLInputElement
        ], 
        id | mask | name | plain | size | value
      ])) = this()
  def this(
    props: MaskedInputProps with (Omit[
        DetailedHTMLProps[
          InputHTMLAttributes[org.scalajs.dom.raw.HTMLInputElement], 
          org.scalajs.dom.raw.HTMLInputElement
        ], 
        id | mask | name | plain | size | value
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet", "MaskedInput")
@js.native
object MaskedInput extends TopLevel[
      ComponentClass[
        MaskedInputProps with (Omit[
          DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
          id | mask | name | plain | size | value
        ]), 
        ComponentState
      ]
    ]

