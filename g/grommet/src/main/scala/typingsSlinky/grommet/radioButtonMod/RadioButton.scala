package typingsSlinky.grommet.radioButtonMod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.InputHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/RadioButton", "RadioButton")
@js.native
class RadioButton protected ()
  extends Component[
      RadioButtonProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]), 
      js.Object, 
      js.Any
    ] {
  def this(props: RadioButtonProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement])) = this()
  def this(
    props: RadioButtonProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/components/RadioButton", "RadioButton")
@js.native
object RadioButton extends TopLevel[
      ReactComponentClass[
        RadioButtonProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement])
      ]
    ]

