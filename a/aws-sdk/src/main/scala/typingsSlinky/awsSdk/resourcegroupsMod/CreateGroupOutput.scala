package typingsSlinky.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateGroupOutput extends StObject {
  
  /**
    * The description of the resource group.
    */
  var Group: js.UndefOr[typingsSlinky.awsSdk.resourcegroupsMod.Group] = js.native
  
  /**
    * The service configuration associated with the resource group. AWS Resource Groups supports adding service configurations for the following resource group types:    AWS::EC2::CapacityReservationPool - Amazon EC2 capacity reservation pools. For more information, see Working with capacity reservation groups in the EC2 Users Guide.  
    */
  var GroupConfiguration: js.UndefOr[typingsSlinky.awsSdk.resourcegroupsMod.GroupConfiguration] = js.native
  
  /**
    * The resource query associated with the group.
    */
  var ResourceQuery: js.UndefOr[typingsSlinky.awsSdk.resourcegroupsMod.ResourceQuery] = js.native
  
  /**
    * The tags associated with the group.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.resourcegroupsMod.Tags] = js.native
}
object CreateGroupOutput {
  
  @scala.inline
  def apply(): CreateGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGroupOutput]
  }
  
  @scala.inline
  implicit class CreateGroupOutputMutableBuilder[Self <: CreateGroupOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: Group): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupConfiguration(value: GroupConfiguration): Self = StObject.set(x, "GroupConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupConfigurationUndefined: Self = StObject.set(x, "GroupConfiguration", js.undefined)
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
    
    @scala.inline
    def setResourceQuery(value: ResourceQuery): Self = StObject.set(x, "ResourceQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceQueryUndefined: Self = StObject.set(x, "ResourceQuery", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
