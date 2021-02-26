package typingsSlinky.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStepInput extends StObject {
  
  /**
    * The identifier of the cluster with steps to describe.
    */
  var ClusterId: typingsSlinky.awsSdk.emrMod.ClusterId = js.native
  
  /**
    * The identifier of the step to describe.
    */
  var StepId: typingsSlinky.awsSdk.emrMod.StepId = js.native
}
object DescribeStepInput {
  
  @scala.inline
  def apply(ClusterId: ClusterId, StepId: StepId): DescribeStepInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any], StepId = StepId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStepInput]
  }
  
  @scala.inline
  implicit class DescribeStepInputMutableBuilder[Self <: DescribeStepInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepId(value: StepId): Self = StObject.set(x, "StepId", value.asInstanceOf[js.Any])
  }
}
