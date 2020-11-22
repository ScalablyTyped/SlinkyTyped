package typingsSlinky.finalFormFocus.mod

import typingsSlinky.finalForm.mod.Decorator
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("final-form-focus", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply[FormValues](): Decorator[FormValues, Partial[FormValues]] = js.native
  def apply[FormValues](getInputs: js.UndefOr[scala.Nothing], findInput: FindInput): Decorator[FormValues, Partial[FormValues]] = js.native
  def apply[FormValues](getInputs: GetInputs): Decorator[FormValues, Partial[FormValues]] = js.native
  def apply[FormValues](getInputs: GetInputs, findInput: FindInput): Decorator[FormValues, Partial[FormValues]] = js.native
}
