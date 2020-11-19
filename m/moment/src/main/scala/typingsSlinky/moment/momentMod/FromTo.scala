package typingsSlinky.moment.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FromTo extends _DurationInputArg1 {
  
  var from: MomentInput = js.native
  
  var to: MomentInput = js.native
}
object FromTo {
  
  @scala.inline
  def apply(): FromTo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FromTo]
  }
  
  @scala.inline
  implicit class FromToOps[Self <: FromTo] (val x: Self) extends AnyVal {
    
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
    def setFromVarargs(value: (Double | String)*): Self = this.set("from", js.Array(value :_*))
    
    @scala.inline
    def setFromDate(value: js.Date): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: MomentInput): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setFromNull: Self = this.set("from", null)
    
    @scala.inline
    def setToVarargs(value: (Double | String)*): Self = this.set("to", js.Array(value :_*))
    
    @scala.inline
    def setToDate(value: js.Date): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: MomentInput): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    
    @scala.inline
    def setToNull: Self = this.set("to", null)
  }
}
