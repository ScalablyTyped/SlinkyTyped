package typingsSlinky.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcConfigInput extends StObject {
  
  /**
    * The IDs of the security groups for this canary.
    */
  var SecurityGroupIds: js.UndefOr[typingsSlinky.awsSdk.syntheticsMod.SecurityGroupIds] = js.native
  
  /**
    * The IDs of the subnets where this canary is to run.
    */
  var SubnetIds: js.UndefOr[typingsSlinky.awsSdk.syntheticsMod.SubnetIds] = js.native
}
object VpcConfigInput {
  
  @scala.inline
  def apply(): VpcConfigInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcConfigInput]
  }
  
  @scala.inline
  implicit class VpcConfigInputMutableBuilder[Self <: VpcConfigInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroupIds): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: SubnetIds): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
  }
}
