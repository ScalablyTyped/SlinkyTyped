package typingsSlinky.eslint.mod.Linter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.eslint.mod.Linter.RuleLevel
  - typingsSlinky.eslint.mod.Linter.RuleLevelAndOptions
*/
trait RuleEntry extends js.Object

object RuleEntry {
  @scala.inline
  implicit def apply(value: RuleLevel): RuleEntry = value.asInstanceOf[RuleEntry]
  @scala.inline
  implicit def apply(value: RuleLevelAndOptions): RuleEntry = value.asInstanceOf[RuleEntry]
}

