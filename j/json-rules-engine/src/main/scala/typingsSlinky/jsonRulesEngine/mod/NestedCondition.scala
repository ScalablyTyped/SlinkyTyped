package typingsSlinky.jsonRulesEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsonRulesEngine.mod.ConditionProperties
  - typingsSlinky.jsonRulesEngine.mod.TopLevelCondition
*/
trait NestedCondition extends js.Object

object NestedCondition {
  @scala.inline
  implicit def apply(value: ConditionProperties): NestedCondition = value.asInstanceOf[NestedCondition]
  @scala.inline
  implicit def apply(value: TopLevelCondition): NestedCondition = value.asInstanceOf[NestedCondition]
}

