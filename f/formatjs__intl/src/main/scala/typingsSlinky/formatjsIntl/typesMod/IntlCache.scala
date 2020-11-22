package typingsSlinky.formatjsIntl.typesMod

import typingsSlinky.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat
import typingsSlinky.formatjsIntlDisplaynames.mod.DisplayNames
import typingsSlinky.formatjsIntlListformat.mod.default
import typingsSlinky.intlMessageformat.mod.IntlMessageFormat
import typingsSlinky.std.Intl.NumberFormat
import typingsSlinky.std.Intl.PluralRules
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntlCache extends js.Object {
  
  var dateTime: Record[String, DateTimeFormat] = js.native
  
  var displayNames: Record[String, DisplayNames] = js.native
  
  var list: Record[String, default] = js.native
  
  var message: Record[String, IntlMessageFormat] = js.native
  
  var number: Record[String, NumberFormat] = js.native
  
  var pluralRules: Record[String, PluralRules] = js.native
  
  var relativeTime: Record[String, typingsSlinky.formatjsIntlRelativetimeformat.mod.default] = js.native
}
object IntlCache {
  
  @scala.inline
  def apply(
    dateTime: Record[String, DateTimeFormat],
    displayNames: Record[String, DisplayNames],
    list: Record[String, default],
    message: Record[String, IntlMessageFormat],
    number: Record[String, NumberFormat],
    pluralRules: Record[String, PluralRules],
    relativeTime: Record[String, typingsSlinky.formatjsIntlRelativetimeformat.mod.default]
  ): IntlCache = {
    val __obj = js.Dynamic.literal(dateTime = dateTime.asInstanceOf[js.Any], displayNames = displayNames.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], pluralRules = pluralRules.asInstanceOf[js.Any], relativeTime = relativeTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntlCache]
  }
  
  @scala.inline
  implicit class IntlCacheOps[Self <: IntlCache] (val x: Self) extends AnyVal {
    
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
    def setDateTime(value: Record[String, DateTimeFormat]): Self = this.set("dateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNames(value: Record[String, DisplayNames]): Self = this.set("displayNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setList(value: Record[String, default]): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: Record[String, IntlMessageFormat]): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Record[String, NumberFormat]): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluralRules(value: Record[String, PluralRules]): Self = this.set("pluralRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeTime(value: Record[String, typingsSlinky.formatjsIntlRelativetimeformat.mod.default]): Self = this.set("relativeTime", value.asInstanceOf[js.Any])
  }
}
