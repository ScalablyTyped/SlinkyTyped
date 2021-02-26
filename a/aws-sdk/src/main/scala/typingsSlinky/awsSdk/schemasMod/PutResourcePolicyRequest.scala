package typingsSlinky.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutResourcePolicyRequest extends StObject {
  
  /**
    * The resource-based policy.
    */
  var Policy: string = js.native
  
  /**
    * The name of the registry.
    */
  var RegistryName: js.UndefOr[string] = js.native
  
  /**
    * The revision ID of the policy.
    */
  var RevisionId: js.UndefOr[string] = js.native
}
object PutResourcePolicyRequest {
  
  @scala.inline
  def apply(Policy: string): PutResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(Policy = Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourcePolicyRequest]
  }
  
  @scala.inline
  implicit class PutResourcePolicyRequestMutableBuilder[Self <: PutResourcePolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: string): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryName(value: string): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryNameUndefined: Self = StObject.set(x, "RegistryName", js.undefined)
    
    @scala.inline
    def setRevisionId(value: string): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
  }
}
