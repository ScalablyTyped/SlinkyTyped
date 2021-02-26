package typingsSlinky.businessRulesEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompareOperator extends StObject
@JSImport("business-rules-engine", "CompareOperator")
@js.native
object CompareOperator extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompareOperator with Double] = js.native
  
  @js.native
  sealed trait Equal extends CompareOperator
  /* 2 */ val Equal: typingsSlinky.businessRulesEngine.mod.CompareOperator.Equal with Double = js.native
  
  @js.native
  sealed trait GreaterThan extends CompareOperator
  /* 5 */ val GreaterThan: typingsSlinky.businessRulesEngine.mod.CompareOperator.GreaterThan with Double = js.native
  
  @js.native
  sealed trait GreaterThanEqual extends CompareOperator
  /* 4 */ val GreaterThanEqual: typingsSlinky.businessRulesEngine.mod.CompareOperator.GreaterThanEqual with Double = js.native
  
  @js.native
  sealed trait LessThan extends CompareOperator
  /* 0 */ val LessThan: typingsSlinky.businessRulesEngine.mod.CompareOperator.LessThan with Double = js.native
  
  @js.native
  sealed trait LessThanEqual extends CompareOperator
  /* 1 */ val LessThanEqual: typingsSlinky.businessRulesEngine.mod.CompareOperator.LessThanEqual with Double = js.native
  
  @js.native
  sealed trait NotEqual extends CompareOperator
  /* 3 */ val NotEqual: typingsSlinky.businessRulesEngine.mod.CompareOperator.NotEqual with Double = js.native
}
