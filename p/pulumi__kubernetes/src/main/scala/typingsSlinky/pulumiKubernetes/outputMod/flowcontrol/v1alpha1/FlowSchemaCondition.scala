package typingsSlinky.pulumiKubernetes.outputMod.flowcontrol.v1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FlowSchemaCondition describes conditions for a FlowSchema.
  */
@js.native
trait FlowSchemaCondition extends StObject {
  
  /**
    * `lastTransitionTime` is the last time the condition transitioned from one status to another.
    */
  var lastTransitionTime: String = js.native
  
  /**
    * `message` is a human-readable message indicating details about last transition.
    */
  var message: String = js.native
  
  /**
    * `reason` is a unique, one-word, CamelCase reason for the condition's last transition.
    */
  var reason: String = js.native
  
  /**
    * `status` is the status of the condition. Can be True, False, Unknown. Required.
    */
  var status: String = js.native
  
  /**
    * `type` is the type of the condition. Required.
    */
  var `type`: String = js.native
}
object FlowSchemaCondition {
  
  @scala.inline
  def apply(lastTransitionTime: String, message: String, reason: String, status: String, `type`: String): FlowSchemaCondition = {
    val __obj = js.Dynamic.literal(lastTransitionTime = lastTransitionTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowSchemaCondition]
  }
  
  @scala.inline
  implicit class FlowSchemaConditionMutableBuilder[Self <: FlowSchemaCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastTransitionTime(value: String): Self = StObject.set(x, "lastTransitionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
