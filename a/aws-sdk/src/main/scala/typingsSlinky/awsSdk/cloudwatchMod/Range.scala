package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Range extends js.Object {
  
  /**
    * The end time of the range to exclude. The format is yyyy-MM-dd'T'HH:mm:ss. For example, 2019-07-01T23:59:59.
    */
  var EndTime: js.Date = js.native
  
  /**
    * The start time of the range to exclude. The format is yyyy-MM-dd'T'HH:mm:ss. For example, 2019-07-01T23:59:59.
    */
  var StartTime: js.Date = js.native
}
object Range {
  
  @scala.inline
  def apply(EndTime: js.Date, StartTime: js.Date): Range = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
  
  @scala.inline
  implicit class RangeOps[Self <: Range] (val x: Self) extends AnyVal {
    
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
    def setEndTime(value: js.Date): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: js.Date): Self = this.set("StartTime", value.asInstanceOf[js.Any])
  }
}
