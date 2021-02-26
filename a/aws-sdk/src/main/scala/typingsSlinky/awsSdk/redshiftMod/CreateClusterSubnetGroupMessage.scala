package typingsSlinky.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateClusterSubnetGroupMessage extends StObject {
  
  /**
    * The name for the subnet group. Amazon Redshift stores the value as a lowercase string. Constraints:   Must contain no more than 255 alphanumeric characters or hyphens.   Must not be "Default".   Must be unique for all subnet groups that are created by your AWS account.   Example: examplesubnetgroup 
    */
  var ClusterSubnetGroupName: String = js.native
  
  /**
    * A description for the subnet group.
    */
  var Description: String = js.native
  
  /**
    * An array of VPC subnet IDs. A maximum of 20 subnets can be modified in a single request.
    */
  var SubnetIds: SubnetIdentifierList = js.native
  
  /**
    * A list of tag instances.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateClusterSubnetGroupMessage {
  
  @scala.inline
  def apply(ClusterSubnetGroupName: String, Description: String, SubnetIds: SubnetIdentifierList): CreateClusterSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(ClusterSubnetGroupName = ClusterSubnetGroupName.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterSubnetGroupMessage]
  }
  
  @scala.inline
  implicit class CreateClusterSubnetGroupMessageMutableBuilder[Self <: CreateClusterSubnetGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterSubnetGroupName(value: String): Self = StObject.set(x, "ClusterSubnetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIds(value: SubnetIdentifierList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
