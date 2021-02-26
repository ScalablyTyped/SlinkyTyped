package typingsSlinky.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateEvaluationOutput extends StObject {
  
  /**
    * The ID assigned to the Evaluation during creation. This value should be identical to the value of the Evaluation in the request.
    */
  var EvaluationId: js.UndefOr[EntityId] = js.native
}
object UpdateEvaluationOutput {
  
  @scala.inline
  def apply(): UpdateEvaluationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEvaluationOutput]
  }
  
  @scala.inline
  implicit class UpdateEvaluationOutputMutableBuilder[Self <: UpdateEvaluationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvaluationId(value: EntityId): Self = StObject.set(x, "EvaluationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationIdUndefined: Self = StObject.set(x, "EvaluationId", js.undefined)
  }
}
