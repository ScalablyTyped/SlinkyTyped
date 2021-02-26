package typingsSlinky.awsSdk.autoscalingplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateScalingPlanResponse extends StObject {
  
  /**
    * The version number of the scaling plan. This value is always 1. Currently, you cannot specify multiple scaling plan versions.
    */
  var ScalingPlanVersion: typingsSlinky.awsSdk.autoscalingplansMod.ScalingPlanVersion = js.native
}
object CreateScalingPlanResponse {
  
  @scala.inline
  def apply(ScalingPlanVersion: ScalingPlanVersion): CreateScalingPlanResponse = {
    val __obj = js.Dynamic.literal(ScalingPlanVersion = ScalingPlanVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateScalingPlanResponse]
  }
  
  @scala.inline
  implicit class CreateScalingPlanResponseMutableBuilder[Self <: CreateScalingPlanResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScalingPlanVersion(value: ScalingPlanVersion): Self = StObject.set(x, "ScalingPlanVersion", value.asInstanceOf[js.Any])
  }
}
