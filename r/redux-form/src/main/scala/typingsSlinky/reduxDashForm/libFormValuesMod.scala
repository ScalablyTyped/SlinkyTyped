package typingsSlinky.reduxDashForm

import slinky.core.ReactComponentClass
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form/lib/formValues", JSImport.Namespace)
@js.native
object libFormValuesMod extends js.Object {
  def formValues[Values, P](obj: Values): js.Function1[
    /* component */ ReactComponentClass[P with typingsSlinky.reduxDashForm.reduxDashFormStrings.formValues with js.Any], 
    ReactComponentClass[P with typingsSlinky.reduxDashForm.reduxDashFormStrings.formValues with js.Any]
  ] = js.native
  def formValues[FormData, K /* <: String */, P](names: K*): js.Function1[
    /* component */ ReactComponentClass[P with (Pick[FormData, K])], 
    ReactComponentClass[P with (Pick[FormData, K])]
  ] = js.native
}

