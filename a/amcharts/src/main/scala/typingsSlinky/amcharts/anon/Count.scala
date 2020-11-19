package typingsSlinky.amcharts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Count extends js.Object {
  
  var count: Double = js.native
  
  var endDate: js.Date = js.native
  
  var predefinedPeriod: String = js.native
  
  var startDate: js.Date = js.native
  
  var `type`: String = js.native
}
object Count {
  
  @scala.inline
  def apply(count: Double, endDate: js.Date, predefinedPeriod: String, startDate: js.Date, `type`: String): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], predefinedPeriod = predefinedPeriod.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
  
  @scala.inline
  implicit class CountOps[Self <: Count] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDate(value: js.Date): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredefinedPeriod(value: String): Self = this.set("predefinedPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDate(value: js.Date): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
