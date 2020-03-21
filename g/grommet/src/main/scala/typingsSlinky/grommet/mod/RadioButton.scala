package typingsSlinky.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.grommet.radioButtonMod.RadioButtonProps
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ComponentState
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "RadioButton")
@js.native
class RadioButton protected ()
  extends Component[
      RadioButtonProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: RadioButtonProps with (DetailedHTMLProps[
        InputHTMLAttributes[org.scalajs.dom.raw.HTMLInputElement], 
        org.scalajs.dom.raw.HTMLInputElement
      ])) = this()
  def this(
    props: RadioButtonProps with (DetailedHTMLProps[
        InputHTMLAttributes[org.scalajs.dom.raw.HTMLInputElement], 
        org.scalajs.dom.raw.HTMLInputElement
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet", "RadioButton")
@js.native
object RadioButton extends TopLevel[
      ComponentClass[
        RadioButtonProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]), 
        ComponentState
      ]
    ]

