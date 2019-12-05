package typingsSlinky.reduxDashForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFormMod {
  import org.scalajs.dom.raw.HTMLFormElement
  import typingsSlinky.react.reactMod.FormHTMLAttributes
  import typingsSlinky.reduxDashForm.reduxDashFormMod.Omit
  import typingsSlinky.reduxDashForm.reduxDashFormStrings.onSubmit

  type FormProps[FormData, P, ErrorType] = (Omit[FormHTMLAttributes[HTMLFormElement], onSubmit]) with (FormSubmitProp[FormData, P, ErrorType])
}
