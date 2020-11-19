package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupNameAndArn extends js.Object {
  
  /**
    * The group ARN.
    */
  var groupArn: js.UndefOr[ThingGroupArn] = js.native
  
  /**
    * The group name.
    */
  var groupName: js.UndefOr[ThingGroupName] = js.native
}
object GroupNameAndArn {
  
  @scala.inline
  def apply(): GroupNameAndArn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupNameAndArn]
  }
  
  @scala.inline
  implicit class GroupNameAndArnOps[Self <: GroupNameAndArn] (val x: Self) extends AnyVal {
    
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
    def setGroupArn(value: ThingGroupArn): Self = this.set("groupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupArn: Self = this.set("groupArn", js.undefined)
    
    @scala.inline
    def setGroupName(value: ThingGroupName): Self = this.set("groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupName: Self = this.set("groupName", js.undefined)
  }
}
