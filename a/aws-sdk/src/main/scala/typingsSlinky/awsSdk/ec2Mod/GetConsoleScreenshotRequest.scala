package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConsoleScreenshotRequest extends js.Object {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the instance.
    */
  var InstanceId: typingsSlinky.awsSdk.ec2Mod.InstanceId = js.native
  
  /**
    * When set to true, acts as keystroke input and wakes up an instance that's in standby or "sleep" mode.
    */
  var WakeUp: js.UndefOr[Boolean] = js.native
}
object GetConsoleScreenshotRequest {
  
  @scala.inline
  def apply(InstanceId: InstanceId): GetConsoleScreenshotRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConsoleScreenshotRequest]
  }
  
  @scala.inline
  implicit class GetConsoleScreenshotRequestOps[Self <: GetConsoleScreenshotRequest] (val x: Self) extends AnyVal {
    
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
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setWakeUp(value: Boolean): Self = this.set("WakeUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWakeUp: Self = this.set("WakeUp", js.undefined)
  }
}
