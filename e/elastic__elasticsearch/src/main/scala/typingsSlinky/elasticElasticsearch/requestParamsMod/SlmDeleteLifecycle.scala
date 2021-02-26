package typingsSlinky.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlmDeleteLifecycle extends Generic {
  
  var policy_id: String = js.native
}
object SlmDeleteLifecycle {
  
  @scala.inline
  def apply(policy_id: String): SlmDeleteLifecycle = {
    val __obj = js.Dynamic.literal(policy_id = policy_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlmDeleteLifecycle]
  }
  
  @scala.inline
  implicit class SlmDeleteLifecycleMutableBuilder[Self <: SlmDeleteLifecycle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy_id(value: String): Self = StObject.set(x, "policy_id", value.asInstanceOf[js.Any])
  }
}
