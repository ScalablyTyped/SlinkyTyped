package typingsSlinky.awsSdk.autoscalingplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateScalingPlanRequest extends StObject {
  
  /**
    * A CloudFormation stack or set of tags.
    */
  var ApplicationSource: js.UndefOr[typingsSlinky.awsSdk.autoscalingplansMod.ApplicationSource] = js.native
  
  /**
    * The scaling instructions.
    */
  var ScalingInstructions: js.UndefOr[typingsSlinky.awsSdk.autoscalingplansMod.ScalingInstructions] = js.native
  
  /**
    * The name of the scaling plan.
    */
  var ScalingPlanName: typingsSlinky.awsSdk.autoscalingplansMod.ScalingPlanName = js.native
  
  /**
    * The version number of the scaling plan.
    */
  var ScalingPlanVersion: typingsSlinky.awsSdk.autoscalingplansMod.ScalingPlanVersion = js.native
}
object UpdateScalingPlanRequest {
  
  @scala.inline
  def apply(ScalingPlanName: ScalingPlanName, ScalingPlanVersion: ScalingPlanVersion): UpdateScalingPlanRequest = {
    val __obj = js.Dynamic.literal(ScalingPlanName = ScalingPlanName.asInstanceOf[js.Any], ScalingPlanVersion = ScalingPlanVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateScalingPlanRequest]
  }
  
  @scala.inline
  implicit class UpdateScalingPlanRequestMutableBuilder[Self <: UpdateScalingPlanRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationSource(value: ApplicationSource): Self = StObject.set(x, "ApplicationSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationSourceUndefined: Self = StObject.set(x, "ApplicationSource", js.undefined)
    
    @scala.inline
    def setScalingInstructions(value: ScalingInstructions): Self = StObject.set(x, "ScalingInstructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingInstructionsUndefined: Self = StObject.set(x, "ScalingInstructions", js.undefined)
    
    @scala.inline
    def setScalingInstructionsVarargs(value: ScalingInstruction*): Self = StObject.set(x, "ScalingInstructions", js.Array(value :_*))
    
    @scala.inline
    def setScalingPlanName(value: ScalingPlanName): Self = StObject.set(x, "ScalingPlanName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingPlanVersion(value: ScalingPlanVersion): Self = StObject.set(x, "ScalingPlanVersion", value.asInstanceOf[js.Any])
  }
}
