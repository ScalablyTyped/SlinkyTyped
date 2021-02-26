package typingsSlinky.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeUserHierarchyGroupResponse extends StObject {
  
  /**
    * Information about the hierarchy group.
    */
  var HierarchyGroup: js.UndefOr[typingsSlinky.awsSdk.connectMod.HierarchyGroup] = js.native
}
object DescribeUserHierarchyGroupResponse {
  
  @scala.inline
  def apply(): DescribeUserHierarchyGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserHierarchyGroupResponse]
  }
  
  @scala.inline
  implicit class DescribeUserHierarchyGroupResponseMutableBuilder[Self <: DescribeUserHierarchyGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHierarchyGroup(value: HierarchyGroup): Self = StObject.set(x, "HierarchyGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchyGroupUndefined: Self = StObject.set(x, "HierarchyGroup", js.undefined)
  }
}
