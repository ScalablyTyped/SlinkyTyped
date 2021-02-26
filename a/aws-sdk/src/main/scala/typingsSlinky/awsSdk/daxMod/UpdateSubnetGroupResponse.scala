package typingsSlinky.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSubnetGroupResponse extends StObject {
  
  /**
    * The subnet group that has been modified.
    */
  var SubnetGroup: js.UndefOr[typingsSlinky.awsSdk.daxMod.SubnetGroup] = js.native
}
object UpdateSubnetGroupResponse {
  
  @scala.inline
  def apply(): UpdateSubnetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSubnetGroupResponse]
  }
  
  @scala.inline
  implicit class UpdateSubnetGroupResponseMutableBuilder[Self <: UpdateSubnetGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubnetGroup(value: SubnetGroup): Self = StObject.set(x, "SubnetGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetGroupUndefined: Self = StObject.set(x, "SubnetGroup", js.undefined)
  }
}
