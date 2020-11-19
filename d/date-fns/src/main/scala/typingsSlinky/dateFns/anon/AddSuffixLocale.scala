package typingsSlinky.dateFns.anon

import typingsSlinky.dateFns.dateFnsStrings.ceil
import typingsSlinky.dateFns.dateFnsStrings.day
import typingsSlinky.dateFns.dateFnsStrings.floor
import typingsSlinky.dateFns.dateFnsStrings.hour
import typingsSlinky.dateFns.dateFnsStrings.minute
import typingsSlinky.dateFns.dateFnsStrings.month
import typingsSlinky.dateFns.dateFnsStrings.round
import typingsSlinky.dateFns.dateFnsStrings.second
import typingsSlinky.dateFns.dateFnsStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddSuffixLocale extends js.Object {
  
  var addSuffix: js.UndefOr[Boolean] = js.native
  
  var locale: js.UndefOr[typingsSlinky.dateFns.Locale] = js.native
  
  var roundingMethod: js.UndefOr[floor | ceil | round] = js.native
  
  var unit: js.UndefOr[second | minute | hour | day | month | year] = js.native
}
object AddSuffixLocale {
  
  @scala.inline
  def apply(): AddSuffixLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddSuffixLocale]
  }
  
  @scala.inline
  implicit class AddSuffixLocaleOps[Self <: AddSuffixLocale] (val x: Self) extends AnyVal {
    
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
    def setAddSuffix(value: Boolean): Self = this.set("addSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddSuffix: Self = this.set("addSuffix", js.undefined)
    
    @scala.inline
    def setLocale(value: typingsSlinky.dateFns.Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setRoundingMethod(value: floor | ceil | round): Self = this.set("roundingMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoundingMethod: Self = this.set("roundingMethod", js.undefined)
    
    @scala.inline
    def setUnit(value: second | minute | hour | day | month | year): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
}
