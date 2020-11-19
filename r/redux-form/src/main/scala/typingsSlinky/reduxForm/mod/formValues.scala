package typingsSlinky.reduxForm.mod

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.reduxForm.reduxFormStrings.append
import typingsSlinky.reduxForm.reduxFormStrings.delete
import typingsSlinky.reduxForm.reduxFormStrings.entries
import typingsSlinky.reduxForm.reduxFormStrings.forEach
import typingsSlinky.reduxForm.reduxFormStrings.get
import typingsSlinky.reduxForm.reduxFormStrings.getAll
import typingsSlinky.reduxForm.reduxFormStrings.has
import typingsSlinky.reduxForm.reduxFormStrings.keys
import typingsSlinky.reduxForm.reduxFormStrings.set
import typingsSlinky.reduxForm.reduxFormStrings.values
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-form", "formValues")
@js.native
object formValues extends js.Object {
  
  def apply[Values, P](obj: Values): js.Function1[
    /* component */ ReactComponentClass[P with typingsSlinky.reduxForm.reduxFormStrings.formValues with TopLevel[js.Any]], 
    ReactComponentClass[P with typingsSlinky.reduxForm.reduxFormStrings.formValues with TopLevel[js.Any]]
  ] = js.native
  def apply[FormData, K /* <: /* keyof FormData */ append | delete | get | getAll | has | set | forEach | entries | keys | values */, P](names: K*): js.Function1[
    /* component */ ReactComponentClass[P with (Pick[FormData, K])], 
    ReactComponentClass[P with (Pick[FormData, K])]
  ] = js.native
}
