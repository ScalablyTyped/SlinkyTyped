package typingsSlinky.azure.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LastSyncTime extends js.Object {
  
  var LastSyncTime: js.Date = js.native
  
  var Status: String = js.native
}
object LastSyncTime {
  
  @scala.inline
  def apply(LastSyncTime: js.Date, Status: String): LastSyncTime = {
    val __obj = js.Dynamic.literal(LastSyncTime = LastSyncTime.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastSyncTime]
  }
  
  @scala.inline
  implicit class LastSyncTimeOps[Self <: LastSyncTime] (val x: Self) extends AnyVal {
    
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
    def setLastSyncTime(value: js.Date): Self = this.set("LastSyncTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
  }
}
