package typingsSlinky.formSerialize.mod

import org.scalajs.dom.raw.HTMLFormElement
import typingsSlinky.formSerialize.formSerializeBooleans.`false`
import typingsSlinky.formSerialize.formSerializeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("form-serialize", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(form: HTMLFormElement): String = js.native
  def apply(form: HTMLFormElement, options: `false`): String = js.native
  def apply(form: HTMLFormElement, options: `true`): ResultHash = js.native
  def apply(form: HTMLFormElement, options: OptionsHash): ResultHash = js.native
  def apply(form: HTMLFormElement, options: OptionsString): String = js.native
  def apply[Result](form: HTMLFormElement, options: Boolean): Result = js.native
  def apply[Result](form: HTMLFormElement, options: Options[Result]): Result = js.native
}
