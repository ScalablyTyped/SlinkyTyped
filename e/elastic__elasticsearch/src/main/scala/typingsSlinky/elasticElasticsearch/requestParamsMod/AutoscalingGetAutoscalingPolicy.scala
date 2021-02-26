package typingsSlinky.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoscalingGetAutoscalingPolicy extends Generic {
  
  var name: String = js.native
}
object AutoscalingGetAutoscalingPolicy {
  
  @scala.inline
  def apply(name: String): AutoscalingGetAutoscalingPolicy = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoscalingGetAutoscalingPolicy]
  }
  
  @scala.inline
  implicit class AutoscalingGetAutoscalingPolicyMutableBuilder[Self <: AutoscalingGetAutoscalingPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
