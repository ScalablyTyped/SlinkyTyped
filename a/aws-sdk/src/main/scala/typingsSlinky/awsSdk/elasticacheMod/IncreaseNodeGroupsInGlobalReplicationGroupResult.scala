package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncreaseNodeGroupsInGlobalReplicationGroupResult extends js.Object {
  
  var GlobalReplicationGroup: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.GlobalReplicationGroup] = js.native
}
object IncreaseNodeGroupsInGlobalReplicationGroupResult {
  
  @scala.inline
  def apply(): IncreaseNodeGroupsInGlobalReplicationGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncreaseNodeGroupsInGlobalReplicationGroupResult]
  }
  
  @scala.inline
  implicit class IncreaseNodeGroupsInGlobalReplicationGroupResultOps[Self <: IncreaseNodeGroupsInGlobalReplicationGroupResult] (val x: Self) extends AnyVal {
    
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
    def setGlobalReplicationGroup(value: GlobalReplicationGroup): Self = this.set("GlobalReplicationGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalReplicationGroup: Self = this.set("GlobalReplicationGroup", js.undefined)
  }
}
