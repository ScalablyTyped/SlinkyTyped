package typingsSlinky.jsonRulesEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsonRulesEngine.mod.AllConditions
  - typingsSlinky.jsonRulesEngine.mod.AnyConditions
*/
trait TopLevelCondition extends NestedCondition

object TopLevelCondition {
  @scala.inline
  implicit def apply(value: AllConditions): TopLevelCondition = value.asInstanceOf[TopLevelCondition]
  @scala.inline
  implicit def apply(value: AnyConditions): TopLevelCondition = value.asInstanceOf[TopLevelCondition]
}

