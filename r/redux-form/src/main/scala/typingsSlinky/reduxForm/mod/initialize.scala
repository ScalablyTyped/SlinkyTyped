package typingsSlinky.reduxForm.mod

import typingsSlinky.reduxForm.actionsMod.FormAction
import typingsSlinky.reduxForm.anon.PartialInitializeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form", "initialize")
@js.native
object initialize extends js.Object {
  def apply(form: String, data: js.Any): FormAction = js.native
  def apply(form: String, data: js.Any, keepDirty: Boolean): FormAction = js.native
  def apply(form: String, data: js.Any, keepDirty: Boolean, options: PartialInitializeOptions): FormAction = js.native
  def apply(form: String, data: js.Any, options: PartialInitializeOptions): FormAction = js.native
}

