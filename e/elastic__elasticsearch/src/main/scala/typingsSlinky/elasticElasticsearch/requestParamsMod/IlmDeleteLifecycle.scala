package typingsSlinky.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IlmDeleteLifecycle extends Generic {
  
  var policy: String = js.native
}
object IlmDeleteLifecycle {
  
  @scala.inline
  def apply(policy: String): IlmDeleteLifecycle = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[IlmDeleteLifecycle]
  }
  
  @scala.inline
  implicit class IlmDeleteLifecycleMutableBuilder[Self <: IlmDeleteLifecycle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
  }
}
