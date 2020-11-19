package typingsSlinky.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://foundation.zurb.com/docs/components/abide.html#optional-javascript-configuration
@js.native
trait AbidePatterns extends js.Object {
  
  var alpha: js.UndefOr[js.RegExp] = js.native
  
  var alpha_numeric: js.UndefOr[js.RegExp] = js.native
  
  var card: js.UndefOr[js.RegExp] = js.native
  
  var color: js.UndefOr[js.RegExp] = js.native
  
  var cvv: js.UndefOr[js.RegExp] = js.native
  
  var date: js.UndefOr[js.RegExp] = js.native
  
  var dateISO: js.UndefOr[js.RegExp] = js.native
  
  var datetime: js.UndefOr[js.RegExp] = js.native
  
  var domain: js.UndefOr[js.RegExp] = js.native
  
  var email: js.UndefOr[js.RegExp] = js.native
  
  var integer: js.UndefOr[js.RegExp] = js.native
  
  var month_day_year: js.UndefOr[js.RegExp] = js.native
  
  var number: js.UndefOr[js.RegExp] = js.native
  
  var time: js.UndefOr[js.RegExp] = js.native
  
  var url: js.UndefOr[js.RegExp] = js.native
}
object AbidePatterns {
  
  @scala.inline
  def apply(): AbidePatterns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbidePatterns]
  }
  
  @scala.inline
  implicit class AbidePatternsOps[Self <: AbidePatterns] (val x: Self) extends AnyVal {
    
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
    def setAlpha(value: js.RegExp): Self = this.set("alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    
    @scala.inline
    def setAlpha_numeric(value: js.RegExp): Self = this.set("alpha_numeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlpha_numeric: Self = this.set("alpha_numeric", js.undefined)
    
    @scala.inline
    def setCard(value: js.RegExp): Self = this.set("card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCard: Self = this.set("card", js.undefined)
    
    @scala.inline
    def setColor(value: js.RegExp): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setCvv(value: js.RegExp): Self = this.set("cvv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCvv: Self = this.set("cvv", js.undefined)
    
    @scala.inline
    def setDate(value: js.RegExp): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDateISO(value: js.RegExp): Self = this.set("dateISO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateISO: Self = this.set("dateISO", js.undefined)
    
    @scala.inline
    def setDatetime(value: js.RegExp): Self = this.set("datetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatetime: Self = this.set("datetime", js.undefined)
    
    @scala.inline
    def setDomain(value: js.RegExp): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setEmail(value: js.RegExp): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setInteger(value: js.RegExp): Self = this.set("integer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteger: Self = this.set("integer", js.undefined)
    
    @scala.inline
    def setMonth_day_year(value: js.RegExp): Self = this.set("month_day_year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonth_day_year: Self = this.set("month_day_year", js.undefined)
    
    @scala.inline
    def setNumber(value: js.RegExp): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    
    @scala.inline
    def setTime(value: js.RegExp): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    
    @scala.inline
    def setUrl(value: js.RegExp): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
