package typingsSlinky.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupIdentifier extends js.Object {
  
  /**
    * The ARN of the resource group.
    */
  var GroupArn: js.UndefOr[typingsSlinky.awsSdk.resourcegroupsMod.GroupArn] = js.native
  
  /**
    * The name of the resource group.
    */
  var GroupName: js.UndefOr[typingsSlinky.awsSdk.resourcegroupsMod.GroupName] = js.native
}
object GroupIdentifier {
  
  @scala.inline
  def apply(): GroupIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupIdentifier]
  }
  
  @scala.inline
  implicit class GroupIdentifierOps[Self <: GroupIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGroupArn(value: GroupArn): Self = this.set("GroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupArn: Self = this.set("GroupArn", js.undefined)
    
    @scala.inline
    def setGroupName(value: GroupName): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupName: Self = this.set("GroupName", js.undefined)
  }
}
