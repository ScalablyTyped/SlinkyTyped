package typingsSlinky.reduxForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object formMod {
  
  type FormProps[FormData, P, ErrorType] = (typingsSlinky.reduxForm.mod.Omit[
    typingsSlinky.react.mod.FormHTMLAttributes[org.scalajs.dom.raw.HTMLFormElement], 
    typingsSlinky.reduxForm.reduxFormStrings.onSubmit
  ]) with (typingsSlinky.reduxForm.formMod.FormSubmitProp[FormData, P, ErrorType])
}
