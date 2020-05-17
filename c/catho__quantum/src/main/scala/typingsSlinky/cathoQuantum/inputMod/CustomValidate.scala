package typingsSlinky.cathoQuantum.inputMod

import typingsSlinky.cathoQuantum.anon.Error
import typingsSlinky.cathoQuantum.anon.ValueString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[
/ * param * / js.UndefOr[typingsSlinky.cathoQuantum.anon.ValueString], 
java.lang.String]
  - typingsSlinky.cathoQuantum.anon.Error
*/
trait CustomValidate extends js.Object

object CustomValidate {
  @scala.inline
  implicit def apply(value: Error): CustomValidate = value.asInstanceOf[CustomValidate]
  @scala.inline
  implicit def apply(value: js.Function1[/* param */ js.UndefOr[ValueString], String]): CustomValidate = value.asInstanceOf[CustomValidate]
}

