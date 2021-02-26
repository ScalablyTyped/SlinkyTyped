package typingsSlinky.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateWebACLRequest extends StObject {
  
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typingsSlinky.awsSdk.wafMod.ChangeToken = js.native
  
  /**
    * The action that you want AWS WAF to take when a request doesn't match the criteria specified in any of the Rule objects that are associated with the WebACL.
    */
  var DefaultAction: WafAction = js.native
  
  /**
    * A friendly name or description for the metrics for this WebACL.The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128 and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF, including "All" and "Default_Action." You can't change MetricName after you create the WebACL.
    */
  var MetricName: typingsSlinky.awsSdk.wafMod.MetricName = js.native
  
  /**
    * A friendly name or description of the WebACL. You can't change Name after you create the WebACL.
    */
  var Name: ResourceName = js.native
  
  /**
    * 
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateWebACLRequest {
  
  @scala.inline
  def apply(ChangeToken: ChangeToken, DefaultAction: WafAction, MetricName: MetricName, Name: ResourceName): CreateWebACLRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], DefaultAction = DefaultAction.asInstanceOf[js.Any], MetricName = MetricName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWebACLRequest]
  }
  
  @scala.inline
  implicit class CreateWebACLRequestMutableBuilder[Self <: CreateWebACLRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultAction(value: WafAction): Self = StObject.set(x, "DefaultAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
