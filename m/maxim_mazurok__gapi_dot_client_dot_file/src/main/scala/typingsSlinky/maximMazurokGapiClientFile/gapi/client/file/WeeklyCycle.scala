package typingsSlinky.maximMazurokGapiClientFile.gapi.client.file

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WeeklyCycle extends js.Object {
  
  /** User can specify multiple windows in a week. Minimum of 1 window. */
  var schedule: js.UndefOr[js.Array[Schedule]] = js.native
}
object WeeklyCycle {
  
  @scala.inline
  def apply(): WeeklyCycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeeklyCycle]
  }
  
  @scala.inline
  implicit class WeeklyCycleOps[Self <: WeeklyCycle] (val x: Self) extends AnyVal {
    
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
    def setScheduleVarargs(value: Schedule*): Self = this.set("schedule", js.Array(value :_*))
    
    @scala.inline
    def setSchedule(value: js.Array[Schedule]): Self = this.set("schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
  }
}
