package typingsSlinky.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateBatchPredictionInput extends StObject {
  
  /**
    * The ID assigned to the BatchPrediction during creation.
    */
  var BatchPredictionId: EntityId = js.native
  
  /**
    * A new user-supplied name or description of the BatchPrediction.
    */
  var BatchPredictionName: EntityName = js.native
}
object UpdateBatchPredictionInput {
  
  @scala.inline
  def apply(BatchPredictionId: EntityId, BatchPredictionName: EntityName): UpdateBatchPredictionInput = {
    val __obj = js.Dynamic.literal(BatchPredictionId = BatchPredictionId.asInstanceOf[js.Any], BatchPredictionName = BatchPredictionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBatchPredictionInput]
  }
  
  @scala.inline
  implicit class UpdateBatchPredictionInputMutableBuilder[Self <: UpdateBatchPredictionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchPredictionId(value: EntityId): Self = StObject.set(x, "BatchPredictionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchPredictionName(value: EntityName): Self = StObject.set(x, "BatchPredictionName", value.asInstanceOf[js.Any])
  }
}
