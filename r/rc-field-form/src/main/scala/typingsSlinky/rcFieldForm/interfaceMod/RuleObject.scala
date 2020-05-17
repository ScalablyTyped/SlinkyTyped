package typingsSlinky.rcFieldForm.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rcFieldForm.interfaceMod.BaseRule
  - typingsSlinky.rcFieldForm.interfaceMod.ArrayRule
*/
trait RuleObject extends Rule

object RuleObject {
  @scala.inline
  implicit def apply(value: ArrayRule): RuleObject = value.asInstanceOf[RuleObject]
  @scala.inline
  implicit def apply(value: BaseRule): RuleObject = value.asInstanceOf[RuleObject]
}

