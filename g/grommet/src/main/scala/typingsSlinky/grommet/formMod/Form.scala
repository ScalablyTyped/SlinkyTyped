package typingsSlinky.grommet.formMod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLFormElement
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.grommetStrings.onChange
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.FormHTMLAttributes
import typingsSlinky.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grommet/es6/components/Form", "Form")
@js.native
class Form protected ()
  extends Component[
      FormProps[_] with (Omit[DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], onChange]), 
      js.Object, 
      js.Any
    ] {
  def this(props: FormProps[_] with (Omit[DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], onChange])) = this()
  def this(
    props: FormProps[_] with (Omit[DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], onChange]),
    context: js.Any
  ) = this()
}
@JSImport("grommet/es6/components/Form", "Form")
@js.native
object Form
  extends TopLevel[
      ReactComponentClass[
        FormProps[js.Any] with (Omit[DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], onChange])
      ]
    ]
