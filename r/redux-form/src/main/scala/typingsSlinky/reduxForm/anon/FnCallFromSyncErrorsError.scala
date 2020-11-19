package typingsSlinky.reduxForm.anon

import typingsSlinky.reduxForm.actionsMod.FormAction
import typingsSlinky.reduxForm.mod.FormErrors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallFromSyncErrorsError extends js.Object {
  
  def apply[T](from: String, syncErrors: FormErrors[_, T], error: T): FormAction = js.native
}
