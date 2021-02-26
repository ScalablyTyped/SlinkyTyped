package typingsSlinky.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeUserHierarchyStructureResponse extends StObject {
  
  /**
    * Information about the hierarchy structure.
    */
  var HierarchyStructure: js.UndefOr[typingsSlinky.awsSdk.connectMod.HierarchyStructure] = js.native
}
object DescribeUserHierarchyStructureResponse {
  
  @scala.inline
  def apply(): DescribeUserHierarchyStructureResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserHierarchyStructureResponse]
  }
  
  @scala.inline
  implicit class DescribeUserHierarchyStructureResponseMutableBuilder[Self <: DescribeUserHierarchyStructureResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHierarchyStructure(value: HierarchyStructure): Self = StObject.set(x, "HierarchyStructure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchyStructureUndefined: Self = StObject.set(x, "HierarchyStructure", js.undefined)
  }
}
