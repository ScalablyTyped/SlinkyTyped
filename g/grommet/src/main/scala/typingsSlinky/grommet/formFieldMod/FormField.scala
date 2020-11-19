package typingsSlinky.grommet.formFieldMod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.grommetStrings.placeholder
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.InputHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grommet/es6/components/FormField", "FormField")
@js.native
class FormField protected ()
  extends Component[
      FormFieldProps with (Omit[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        placeholder
      ]), 
      js.Object, 
      js.Any
    ] {
  def this(props: FormFieldProps with (Omit[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        placeholder
      ])) = this()
  def this(
    props: FormFieldProps with (Omit[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        placeholder
      ]),
    context: js.Any
  ) = this()
}
@JSImport("grommet/es6/components/FormField", "FormField")
@js.native
object FormField extends TopLevel[
      ReactComponentClass[
        FormFieldProps with (Omit[
          DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
          placeholder
        ])
      ]
    ]
