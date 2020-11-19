package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRequireCheckIn extends js.Object {
  
  /**
    * Whether require check in is enabled or not.
    */
  var Enabled: Boolean = js.native
  
  /**
    * Duration between 5 and 20 minutes to determine when to release the room if it's not checked into.
    */
  var ReleaseAfterMinutes: Minutes = js.native
}
object CreateRequireCheckIn {
  
  @scala.inline
  def apply(Enabled: Boolean, ReleaseAfterMinutes: Minutes): CreateRequireCheckIn = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], ReleaseAfterMinutes = ReleaseAfterMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRequireCheckIn]
  }
  
  @scala.inline
  implicit class CreateRequireCheckInOps[Self <: CreateRequireCheckIn] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseAfterMinutes(value: Minutes): Self = this.set("ReleaseAfterMinutes", value.asInstanceOf[js.Any])
  }
}
