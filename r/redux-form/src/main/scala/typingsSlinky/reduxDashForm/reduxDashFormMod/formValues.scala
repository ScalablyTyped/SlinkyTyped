package typingsSlinky.reduxDashForm.reduxDashFormMod

import slinky.core.ReactComponentClass
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form", "formValues")
@js.native
object formValues extends js.Object {
  def apply[Values, P](obj: Values): js.Function1[
    /* component */ ReactComponentClass[P with typingsSlinky.reduxDashForm.reduxDashFormStrings.formValues with js.Any], 
    ReactComponentClass[P with typingsSlinky.reduxDashForm.reduxDashFormStrings.formValues with js.Any]
  ] = js.native
  def apply[FormData, K /* <: String */, P](names: K*): js.Function1[
    /* component */ ReactComponentClass[P with (Pick[FormData, K])], 
    ReactComponentClass[P with (Pick[FormData, K])]
  ] = js.native
}

