package typingsSlinky.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDetachPolicy extends StObject {
  
  /**
    * Reference that identifies the object whose policy object will be detached.
    */
  var ObjectReference: typingsSlinky.awsSdk.clouddirectoryMod.ObjectReference = js.native
  
  /**
    * Reference that identifies the policy object.
    */
  var PolicyReference: ObjectReference = js.native
}
object BatchDetachPolicy {
  
  @scala.inline
  def apply(ObjectReference: ObjectReference, PolicyReference: ObjectReference): BatchDetachPolicy = {
    val __obj = js.Dynamic.literal(ObjectReference = ObjectReference.asInstanceOf[js.Any], PolicyReference = PolicyReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetachPolicy]
  }
  
  @scala.inline
  implicit class BatchDetachPolicyMutableBuilder[Self <: BatchDetachPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectReference(value: ObjectReference): Self = StObject.set(x, "ObjectReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyReference(value: ObjectReference): Self = StObject.set(x, "PolicyReference", value.asInstanceOf[js.Any])
  }
}
