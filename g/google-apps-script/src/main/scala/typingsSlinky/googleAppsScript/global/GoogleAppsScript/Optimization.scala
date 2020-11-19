package typingsSlinky.googleAppsScript.global.GoogleAppsScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("GoogleAppsScript.Optimization")
@js.native
object Optimization extends js.Object {
  
  /**
    * Status of the solution. Before solving a problem the status will be NOT_SOLVED;
    * afterwards it will take any of the other values depending if it successfully found a solution and
    * if the solution is optimal.
    */
  @js.native
  object Status extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Optimization.Status with Double] = js.native
    
    /* 4 */ val ABNORMAL: typingsSlinky.googleAppsScript.GoogleAppsScript.Optimization.Status.ABNORMAL with Double = js.native
    
    /* 1 */ val FEASIBLE: typingsSlinky.googleAppsScript.GoogleAppsScript.Optimization.Status.FEASIBLE with Double = js.native
    
    /* 2 */ val INFEASIBLE: typingsSlinky.googleAppsScript.GoogleAppsScript.Optimization.Status.INFEASIBLE with Double = js.native
    
    /* 5 */ val MODEL_INVALID: typingsSlinky.googleAppsScript.GoogleAppsScript.Optimization.Status.MODEL_INVALID with Double = js.native
    
    /* 6 */ val NOT_SOLVED: typingsSlinky.googleAppsScript.GoogleAppsScript.Optimization.Status.NOT_SOLVED with Double = js.native
    
    /* 0 */ val OPTIMAL: typingsSlinky.googleAppsScript.GoogleAppsScript.Optimization.Status.OPTIMAL with Double = js.native
    
    /* 3 */ val UNBOUNDED: typingsSlinky.googleAppsScript.GoogleAppsScript.Optimization.Status.UNBOUNDED with Double = js.native
  }
  
  /**
    * Type of variables created by the engine.
    */
  @js.native
  object VariableType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Optimization.VariableType with Double
      ] = js.native
    
    /* 1 */ val CONTINUOUS: typingsSlinky.googleAppsScript.GoogleAppsScript.Optimization.VariableType.CONTINUOUS with Double = js.native
    
    /* 0 */ val INTEGER: typingsSlinky.googleAppsScript.GoogleAppsScript.Optimization.VariableType.INTEGER with Double = js.native
  }
}
