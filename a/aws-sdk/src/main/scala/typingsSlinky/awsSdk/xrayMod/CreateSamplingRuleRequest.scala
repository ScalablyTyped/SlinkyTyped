package typingsSlinky.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSamplingRuleRequest extends StObject {
  
  /**
    * The rule definition.
    */
  var SamplingRule: typingsSlinky.awsSdk.xrayMod.SamplingRule = js.native
  
  /**
    * A map that contains one or more tag keys and tag values to attach to an X-Ray sampling rule. For more information about ways to use tags, see Tagging AWS resources in the AWS General Reference. The following restrictions apply to tags:   Maximum number of user-applied tags per resource: 50   Maximum tag key length: 128 Unicode characters   Maximum tag value length: 256 Unicode characters   Valid values for key and value: a-z, A-Z, 0-9, space, and the following characters: _ . : / = + - and @   Tag keys and values are case sensitive.   Don't use aws: as a prefix for keys; it's reserved for AWS use.  
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateSamplingRuleRequest {
  
  @scala.inline
  def apply(SamplingRule: SamplingRule): CreateSamplingRuleRequest = {
    val __obj = js.Dynamic.literal(SamplingRule = SamplingRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSamplingRuleRequest]
  }
  
  @scala.inline
  implicit class CreateSamplingRuleRequestMutableBuilder[Self <: CreateSamplingRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSamplingRule(value: SamplingRule): Self = StObject.set(x, "SamplingRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
