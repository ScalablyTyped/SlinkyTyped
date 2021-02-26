package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelingJobStoppingConditions extends StObject {
  
  /**
    * The maximum number of objects that can be labeled by human workers.
    */
  var MaxHumanLabeledObjectCount: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.MaxHumanLabeledObjectCount] = js.native
  
  /**
    * The maximum number of input data objects that should be labeled.
    */
  var MaxPercentageOfInputDatasetLabeled: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.MaxPercentageOfInputDatasetLabeled] = js.native
}
object LabelingJobStoppingConditions {
  
  @scala.inline
  def apply(): LabelingJobStoppingConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelingJobStoppingConditions]
  }
  
  @scala.inline
  implicit class LabelingJobStoppingConditionsMutableBuilder[Self <: LabelingJobStoppingConditions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxHumanLabeledObjectCount(value: MaxHumanLabeledObjectCount): Self = StObject.set(x, "MaxHumanLabeledObjectCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHumanLabeledObjectCountUndefined: Self = StObject.set(x, "MaxHumanLabeledObjectCount", js.undefined)
    
    @scala.inline
    def setMaxPercentageOfInputDatasetLabeled(value: MaxPercentageOfInputDatasetLabeled): Self = StObject.set(x, "MaxPercentageOfInputDatasetLabeled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPercentageOfInputDatasetLabeledUndefined: Self = StObject.set(x, "MaxPercentageOfInputDatasetLabeled", js.undefined)
  }
}
