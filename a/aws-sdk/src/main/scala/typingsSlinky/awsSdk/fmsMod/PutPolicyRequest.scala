package typingsSlinky.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutPolicyRequest extends StObject {
  
  /**
    * The details of the AWS Firewall Manager policy to be created.
    */
  var Policy: typingsSlinky.awsSdk.fmsMod.Policy = js.native
  
  /**
    * The tags to add to the AWS resource.
    */
  var TagList: js.UndefOr[typingsSlinky.awsSdk.fmsMod.TagList] = js.native
}
object PutPolicyRequest {
  
  @scala.inline
  def apply(Policy: Policy): PutPolicyRequest = {
    val __obj = js.Dynamic.literal(Policy = Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPolicyRequest]
  }
  
  @scala.inline
  implicit class PutPolicyRequestMutableBuilder[Self <: PutPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: Policy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagListUndefined: Self = StObject.set(x, "TagList", js.undefined)
    
    @scala.inline
    def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value :_*))
  }
}
