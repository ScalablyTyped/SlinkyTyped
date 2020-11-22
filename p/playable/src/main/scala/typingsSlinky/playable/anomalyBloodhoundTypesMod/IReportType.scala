package typingsSlinky.playable.anomalyBloodhoundTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IReportType extends js.Object {
  
  var id: String = js.native
  
  var timeoutTime: Double = js.native
}
object IReportType {
  
  @scala.inline
  def apply(id: String, timeoutTime: Double): IReportType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timeoutTime = timeoutTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReportType]
  }
  
  @scala.inline
  implicit class IReportTypeOps[Self <: IReportType] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutTime(value: Double): Self = this.set("timeoutTime", value.asInstanceOf[js.Any])
  }
}
