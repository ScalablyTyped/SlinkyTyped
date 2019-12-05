package typingsSlinky.reduxDashForm

import typingsSlinky.reduxDashForm.libActionsMod.FormAction
import typingsSlinky.reduxDashForm.reduxDashFormMod.FormErrors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Error extends js.Object {
  def apply[T](from: String, syncErrors: FormErrors[_, T], error: T): FormAction = js.native
}

