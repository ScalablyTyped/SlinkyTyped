package typingsSlinky.reduxDashForm.reduxDashFormMod

import typingsSlinky.reduxDashForm.libActionsMod.FormAction
import typingsSlinky.reduxDashForm.libActionsMod.InitializeOptions
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form", "initialize")
@js.native
object initialize extends js.Object {
  def apply(form: String, data: js.Any): FormAction = js.native
  def apply(form: String, data: js.Any, keepDirty: Boolean): FormAction = js.native
  def apply(form: String, data: js.Any, keepDirty: Boolean, options: Partial[InitializeOptions]): FormAction = js.native
  def apply(form: String, data: js.Any, options: Partial[InitializeOptions]): FormAction = js.native
}

