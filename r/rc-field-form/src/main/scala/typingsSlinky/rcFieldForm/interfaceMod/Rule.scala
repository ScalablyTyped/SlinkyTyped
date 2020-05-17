package typingsSlinky.rcFieldForm.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rcFieldForm.interfaceMod.RuleObject
  - typingsSlinky.rcFieldForm.interfaceMod.RuleRender
*/
trait Rule extends js.Object

object Rule {
  @scala.inline
  implicit def apply(value: RuleObject): Rule = value.asInstanceOf[Rule]
  @scala.inline
  implicit def apply(value: RuleRender): Rule = value.asInstanceOf[Rule]
}

