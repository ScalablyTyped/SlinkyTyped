package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInputSecurityGroupResponse extends StObject {
  
  /**
    * Unique ARN of Input Security Group
    */
  var Arn: js.UndefOr[string] = js.native
  
  /**
    * The Id of the Input Security Group
    */
  var Id: js.UndefOr[string] = js.native
  
  /**
    * The list of inputs currently using this Input Security Group.
    */
  var Inputs: js.UndefOr[listOfString] = js.native
  
  /**
    * The current state of the Input Security Group.
    */
  var State: js.UndefOr[InputSecurityGroupState] = js.native
  
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Tags] = js.native
  
  /**
    * Whitelist rules and their sync status
    */
  var WhitelistRules: js.UndefOr[listOfInputWhitelistRule] = js.native
}
object DescribeInputSecurityGroupResponse {
  
  @scala.inline
  def apply(): DescribeInputSecurityGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInputSecurityGroupResponse]
  }
  
  @scala.inline
  implicit class DescribeInputSecurityGroupResponseMutableBuilder[Self <: DescribeInputSecurityGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setInputs(value: listOfString): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsUndefined: Self = StObject.set(x, "Inputs", js.undefined)
    
    @scala.inline
    def setInputsVarargs(value: string*): Self = StObject.set(x, "Inputs", js.Array(value :_*))
    
    @scala.inline
    def setState(value: InputSecurityGroupState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setWhitelistRules(value: listOfInputWhitelistRule): Self = StObject.set(x, "WhitelistRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhitelistRulesUndefined: Self = StObject.set(x, "WhitelistRules", js.undefined)
    
    @scala.inline
    def setWhitelistRulesVarargs(value: InputWhitelistRule*): Self = StObject.set(x, "WhitelistRules", js.Array(value :_*))
  }
}
