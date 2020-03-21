package typingsSlinky.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.grommet.formMod.FormProps
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ComponentState
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.FormHTMLAttributes
import typingsSlinky.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "Form")
@js.native
class Form protected ()
  extends Component[
      FormProps with (DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: FormProps with (DetailedHTMLProps[
        FormHTMLAttributes[org.scalajs.dom.raw.HTMLFormElement], 
        org.scalajs.dom.raw.HTMLFormElement
      ])) = this()
  def this(
    props: FormProps with (DetailedHTMLProps[
        FormHTMLAttributes[org.scalajs.dom.raw.HTMLFormElement], 
        org.scalajs.dom.raw.HTMLFormElement
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet", "Form")
@js.native
object Form extends TopLevel[
      ComponentClass[
        FormProps with (DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement]), 
        ComponentState
      ]
    ]

