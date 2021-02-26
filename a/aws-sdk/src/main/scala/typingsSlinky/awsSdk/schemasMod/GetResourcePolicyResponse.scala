package typingsSlinky.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResourcePolicyResponse extends StObject {
  
  /**
    * The resource-based policy.
    */
  var Policy: js.UndefOr[string] = js.native
  
  /**
    * The revision ID.
    */
  var RevisionId: js.UndefOr[string] = js.native
}
object GetResourcePolicyResponse {
  
  @scala.inline
  def apply(): GetResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourcePolicyResponse]
  }
  
  @scala.inline
  implicit class GetResourcePolicyResponseMutableBuilder[Self <: GetResourcePolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: string): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
    
    @scala.inline
    def setRevisionId(value: string): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
  }
}
