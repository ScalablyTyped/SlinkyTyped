package typingsSlinky.builderUtilRuntime.progressCallbackTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressInfo extends js.Object {
  
  var bytesPerSecond: Double = js.native
  
  var delta: Double = js.native
  
  var percent: Double = js.native
  
  var total: Double = js.native
  
  var transferred: Double = js.native
}
object ProgressInfo {
  
  @scala.inline
  def apply(bytesPerSecond: Double, delta: Double, percent: Double, total: Double, transferred: Double): ProgressInfo = {
    val __obj = js.Dynamic.literal(bytesPerSecond = bytesPerSecond.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], transferred = transferred.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressInfo]
  }
  
  @scala.inline
  implicit class ProgressInfoOps[Self <: ProgressInfo] (val x: Self) extends AnyVal {
    
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
    def setBytesPerSecond(value: Double): Self = this.set("bytesPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelta(value: Double): Self = this.set("delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercent(value: Double): Self = this.set("percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferred(value: Double): Self = this.set("transferred", value.asInstanceOf[js.Any])
  }
}
