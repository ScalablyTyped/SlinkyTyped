package typingsSlinky.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HealthCounts extends js.Object {
  
  var errorCount: Double = js.native
  
  var errorPercentage: Double = js.native
  
  var totalCount: Double = js.native
}
object HealthCounts {
  
  @scala.inline
  def apply(errorCount: Double, errorPercentage: Double, totalCount: Double): HealthCounts = {
    val __obj = js.Dynamic.literal(errorCount = errorCount.asInstanceOf[js.Any], errorPercentage = errorPercentage.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealthCounts]
  }
  
  @scala.inline
  implicit class HealthCountsOps[Self <: HealthCounts] (val x: Self) extends AnyVal {
    
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
    def setErrorCount(value: Double): Self = this.set("errorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorPercentage(value: Double): Self = this.set("errorPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCount(value: Double): Self = this.set("totalCount", value.asInstanceOf[js.Any])
  }
}
