package typingsSlinky.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubnetGroup extends StObject {
  
  /**
    * The description of the subnet group.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The name of the subnet group.
    */
  var SubnetGroupName: js.UndefOr[String] = js.native
  
  /**
    * A list of subnets associated with the subnet group. 
    */
  var Subnets: js.UndefOr[SubnetList] = js.native
  
  /**
    * The Amazon Virtual Private Cloud identifier (VPC ID) of the subnet group.
    */
  var VpcId: js.UndefOr[String] = js.native
}
object SubnetGroup {
  
  @scala.inline
  def apply(): SubnetGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubnetGroup]
  }
  
  @scala.inline
  implicit class SubnetGroupMutableBuilder[Self <: SubnetGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setSubnetGroupName(value: String): Self = StObject.set(x, "SubnetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetGroupNameUndefined: Self = StObject.set(x, "SubnetGroupName", js.undefined)
    
    @scala.inline
    def setSubnets(value: SubnetList): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetsUndefined: Self = StObject.set(x, "Subnets", js.undefined)
    
    @scala.inline
    def setSubnetsVarargs(value: Subnet*): Self = StObject.set(x, "Subnets", js.Array(value :_*))
    
    @scala.inline
    def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
