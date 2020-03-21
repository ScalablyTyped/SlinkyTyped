package typingsSlinky.reduxForm

import typingsSlinky.reduxForm.actionsMod.FormAction
import typingsSlinky.reduxForm.mod.FormErrors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallFromSyncErrorsError extends js.Object {
  def apply[T](from: String, syncErrors: FormErrors[_, T], error: T): FormAction = js.native
}

