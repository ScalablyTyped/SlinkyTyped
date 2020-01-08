package typingsSlinky.formik

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.formik.formikStrings.onReset
import typingsSlinky.formik.formikStrings.onSubmit
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.react.reactMod.ComponentType
import typingsSlinky.react.reactMod.FormHTMLAttributes
import typingsSlinky.std.Exclude
import typingsSlinky.std.HTMLFormElement
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formik/dist/Form", JSImport.Namespace)
@js.native
object distFormMod extends js.Object {
  @js.native
  class Form protected ()
    extends Component[
          Pick[
            FormHTMLAttributes[HTMLFormElement], 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 255 */ js.Any
          ], 
          ComponentState, 
          js.Any
        ] {
    def this(props: Pick[
            FormHTMLAttributes[org.scalajs.dom.raw.HTMLFormElement], 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 255 */ js.Any
          ]) = this()
    def this(
      props: Pick[
            FormHTMLAttributes[org.scalajs.dom.raw.HTMLFormElement], 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 255 */ js.Any
          ],
      context: js.Any
    ) = this()
  }
  
  @js.native
  object Form
    extends TopLevel[
          ComponentType[
            Pick[
              FormHTMLAttributes[HTMLFormElement], 
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 255 */ js.Any
            ]
          ]
        ]
  
  type FormikFormProps = Pick[
    FormHTMLAttributes[org.scalajs.dom.raw.HTMLFormElement], 
    Exclude[String, onReset | onSubmit]
  ]
}

