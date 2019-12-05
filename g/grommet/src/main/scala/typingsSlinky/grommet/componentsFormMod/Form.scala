package typingsSlinky.grommet.componentsFormMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.ComponentClass
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.react.reactMod.DetailedHTMLProps
import typingsSlinky.react.reactMod.FormHTMLAttributes
import typingsSlinky.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Form", "Form")
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

@JSImport("grommet/components/Form", "Form")
@js.native
object Form extends TopLevel[
      ComponentClass[
        FormProps with (DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement]), 
        ComponentState
      ]
    ]

