package typingsSlinky.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Group extends StObject {
  
  /**
    * The description of the resource group.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.resourcegroupsMod.Description] = js.native
  
  /**
    * The ARN of the resource group.
    */
  var GroupArn: typingsSlinky.awsSdk.resourcegroupsMod.GroupArn = js.native
  
  /**
    * The name of the resource group.
    */
  var Name: GroupName = js.native
}
object Group {
  
  @scala.inline
  def apply(GroupArn: GroupArn, Name: GroupName): Group = {
    val __obj = js.Dynamic.literal(GroupArn = GroupArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
  
  @scala.inline
  implicit class GroupMutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setGroupArn(value: GroupArn): Self = StObject.set(x, "GroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: GroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
