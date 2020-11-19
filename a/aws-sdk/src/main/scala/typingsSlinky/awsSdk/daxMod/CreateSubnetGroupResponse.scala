package typingsSlinky.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSubnetGroupResponse extends js.Object {
  
  /**
    * Represents the output of a CreateSubnetGroup operation.
    */
  var SubnetGroup: js.UndefOr[typingsSlinky.awsSdk.daxMod.SubnetGroup] = js.native
}
object CreateSubnetGroupResponse {
  
  @scala.inline
  def apply(): CreateSubnetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSubnetGroupResponse]
  }
  
  @scala.inline
  implicit class CreateSubnetGroupResponseOps[Self <: CreateSubnetGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSubnetGroup(value: SubnetGroup): Self = this.set("SubnetGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetGroup: Self = this.set("SubnetGroup", js.undefined)
  }
}
