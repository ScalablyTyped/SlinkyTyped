package typingsSlinky.dateFns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Type Aliases
@js.native
trait Interval extends js.Object {
  
  var end: js.Date | Double = js.native
  
  var start: js.Date | Double = js.native
}
object Interval {
  
  @scala.inline
  def apply(end: js.Date | Double, start: js.Date | Double): Interval = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interval]
  }
  
  @scala.inline
  implicit class IntervalOps[Self <: Interval] (val x: Self) extends AnyVal {
    
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
    def setEndDate(value: js.Date): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: js.Date | Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDate(value: js.Date): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: js.Date | Double): Self = this.set("start", value.asInstanceOf[js.Any])
  }
}
