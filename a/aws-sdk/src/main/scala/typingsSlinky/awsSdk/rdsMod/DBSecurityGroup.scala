package typingsSlinky.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBSecurityGroup extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the DB security group.
    */
  var DBSecurityGroupArn: js.UndefOr[String] = js.native
  
  /**
    * Provides the description of the DB security group.
    */
  var DBSecurityGroupDescription: js.UndefOr[String] = js.native
  
  /**
    * Specifies the name of the DB security group.
    */
  var DBSecurityGroupName: js.UndefOr[String] = js.native
  
  /**
    *  Contains a list of EC2SecurityGroup elements. 
    */
  var EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList] = js.native
  
  /**
    *  Contains a list of IPRange elements. 
    */
  var IPRanges: js.UndefOr[IPRangeList] = js.native
  
  /**
    * Provides the AWS ID of the owner of a specific DB security group.
    */
  var OwnerId: js.UndefOr[String] = js.native
  
  /**
    * Provides the VpcId of the DB security group.
    */
  var VpcId: js.UndefOr[String] = js.native
}
object DBSecurityGroup {
  
  @scala.inline
  def apply(): DBSecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBSecurityGroup]
  }
  
  @scala.inline
  implicit class DBSecurityGroupMutableBuilder[Self <: DBSecurityGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBSecurityGroupArn(value: String): Self = StObject.set(x, "DBSecurityGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSecurityGroupArnUndefined: Self = StObject.set(x, "DBSecurityGroupArn", js.undefined)
    
    @scala.inline
    def setDBSecurityGroupDescription(value: String): Self = StObject.set(x, "DBSecurityGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSecurityGroupDescriptionUndefined: Self = StObject.set(x, "DBSecurityGroupDescription", js.undefined)
    
    @scala.inline
    def setDBSecurityGroupName(value: String): Self = StObject.set(x, "DBSecurityGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSecurityGroupNameUndefined: Self = StObject.set(x, "DBSecurityGroupName", js.undefined)
    
    @scala.inline
    def setEC2SecurityGroups(value: EC2SecurityGroupList): Self = StObject.set(x, "EC2SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEC2SecurityGroupsUndefined: Self = StObject.set(x, "EC2SecurityGroups", js.undefined)
    
    @scala.inline
    def setEC2SecurityGroupsVarargs(value: EC2SecurityGroup*): Self = StObject.set(x, "EC2SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setIPRanges(value: IPRangeList): Self = StObject.set(x, "IPRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPRangesUndefined: Self = StObject.set(x, "IPRanges", js.undefined)
    
    @scala.inline
    def setIPRangesVarargs(value: IPRange*): Self = StObject.set(x, "IPRanges", js.Array(value :_*))
    
    @scala.inline
    def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    @scala.inline
    def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
