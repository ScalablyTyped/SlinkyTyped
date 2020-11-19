package typingsSlinky.memwatchNext.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeakInformation extends js.Object {
  
  /**
    * End date.
    * @type {Date}
    */
  var end: js.Date = js.native
  
  /**
    * Growth.
    * @type {number}
    */
  var growth: Double = js.native
  
  /**
    * Reason leak.
    * @type {string}
    */
  var reason: String = js.native
  
  /**
    * Start date.
    * @type {Date}
    */
  var start: js.Date = js.native
}
object LeakInformation {
  
  @scala.inline
  def apply(end: js.Date, growth: Double, reason: String, start: js.Date): LeakInformation = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], growth = growth.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeakInformation]
  }
  
  @scala.inline
  implicit class LeakInformationOps[Self <: LeakInformation] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: js.Date): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrowth(value: Double): Self = this.set("growth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: js.Date): Self = this.set("start", value.asInstanceOf[js.Any])
  }
}
