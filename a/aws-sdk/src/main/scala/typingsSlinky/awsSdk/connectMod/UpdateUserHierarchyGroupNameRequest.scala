package typingsSlinky.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateUserHierarchyGroupNameRequest extends StObject {
  
  /**
    * The identifier of the hierarchy group.
    */
  var HierarchyGroupId: typingsSlinky.awsSdk.connectMod.HierarchyGroupId = js.native
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typingsSlinky.awsSdk.connectMod.InstanceId = js.native
  
  /**
    * The name of the hierarchy group. Must not be more than 100 characters.
    */
  var Name: HierarchyGroupName = js.native
}
object UpdateUserHierarchyGroupNameRequest {
  
  @scala.inline
  def apply(HierarchyGroupId: HierarchyGroupId, InstanceId: InstanceId, Name: HierarchyGroupName): UpdateUserHierarchyGroupNameRequest = {
    val __obj = js.Dynamic.literal(HierarchyGroupId = HierarchyGroupId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserHierarchyGroupNameRequest]
  }
  
  @scala.inline
  implicit class UpdateUserHierarchyGroupNameRequestMutableBuilder[Self <: UpdateUserHierarchyGroupNameRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHierarchyGroupId(value: HierarchyGroupId): Self = StObject.set(x, "HierarchyGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: HierarchyGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
