package typingsSlinky.businessDashRulesDashEngine.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CompareOperator extends js.Object

@JSImport("business-rules-engine", "CompareOperator")
@js.native
object CompareOperator extends js.Object {
  @js.native
  sealed trait Equal extends CompareOperator
  
  @js.native
  sealed trait GreaterThan extends CompareOperator
  
  @js.native
  sealed trait GreaterThanEqual extends CompareOperator
  
  @js.native
  sealed trait LessThan extends CompareOperator
  
  @js.native
  sealed trait LessThanEqual extends CompareOperator
  
  @js.native
  sealed trait NotEqual extends CompareOperator
  
  /* 2 */ val Equal: typingsSlinky.businessDashRulesDashEngine.businessDashRulesDashEngineMod.CompareOperator.Equal with Double = js.native
  /* 5 */ val GreaterThan: typingsSlinky.businessDashRulesDashEngine.businessDashRulesDashEngineMod.CompareOperator.GreaterThan with Double = js.native
  /* 4 */ val GreaterThanEqual: typingsSlinky.businessDashRulesDashEngine.businessDashRulesDashEngineMod.CompareOperator.GreaterThanEqual with Double = js.native
  /* 0 */ val LessThan: typingsSlinky.businessDashRulesDashEngine.businessDashRulesDashEngineMod.CompareOperator.LessThan with Double = js.native
  /* 1 */ val LessThanEqual: typingsSlinky.businessDashRulesDashEngine.businessDashRulesDashEngineMod.CompareOperator.LessThanEqual with Double = js.native
  /* 3 */ val NotEqual: typingsSlinky.businessDashRulesDashEngine.businessDashRulesDashEngineMod.CompareOperator.NotEqual with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompareOperator with Double] = js.native
}

