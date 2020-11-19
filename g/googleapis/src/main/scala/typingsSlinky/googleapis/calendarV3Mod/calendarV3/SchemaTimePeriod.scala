package typingsSlinky.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTimePeriod extends js.Object {
  
  /**
    * The (exclusive) end of the time period.
    */
  var end: js.UndefOr[String] = js.native
  
  /**
    * The (inclusive) start of the time period.
    */
  var start: js.UndefOr[String] = js.native
}
object SchemaTimePeriod {
  
  @scala.inline
  def apply(): SchemaTimePeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimePeriod]
  }
  
  @scala.inline
  implicit class SchemaTimePeriodOps[Self <: SchemaTimePeriod] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
