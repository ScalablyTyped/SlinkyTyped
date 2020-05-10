package typingsSlinky.grommet.formMod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLFormElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.FormHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Form", "Form")
@js.native
class Form protected ()
  extends Component[
      FormProps with (DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement]), 
      js.Object, 
      js.Any
    ] {
  def this(props: FormProps with (DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement])) = this()
  def this(
    props: FormProps with (DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/components/Form", "Form")
@js.native
object Form extends TopLevel[
      ReactComponentClass[
        FormProps with (DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement])
      ]
    ]

