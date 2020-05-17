package typingsSlinky.atom.linterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[typingsSlinky.atom.linterMod.Message]
  - scala.Null
*/
trait LintResult extends js.Object

object LintResult {
  @scala.inline
  implicit def apply(value: js.Array[Message]): LintResult = value.asInstanceOf[LintResult]
  @scala.inline
  implicit def apply(value: Null): LintResult = value.asInstanceOf[LintResult]
}

