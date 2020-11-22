package typingsSlinky.formatjsIntlDisplaynames.mod

import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.code
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.currency
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.language
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.long
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.narrow
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.none
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.region
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.script
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.short
import typingsSlinky.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayNamesResolvedOptions extends js.Object {
  
  var fallback: NonNullable[js.UndefOr[code | none]] = js.native
  
  var locale: String = js.native
  
  var style: NonNullable[js.UndefOr[narrow | short | long]] = js.native
  
  var `type`: NonNullable[language | region | script | currency] = js.native
}
object DisplayNamesResolvedOptions {
  
  @scala.inline
  def apply(locale: String, `type`: NonNullable[language | region | script | currency]): DisplayNamesResolvedOptions = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayNamesResolvedOptions]
  }
  
  @scala.inline
  implicit class DisplayNamesResolvedOptionsOps[Self <: DisplayNamesResolvedOptions] (val x: Self) extends AnyVal {
    
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
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: NonNullable[language | region | script | currency]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallback(value: NonNullable[js.UndefOr[code | none]]): Self = this.set("fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
    
    @scala.inline
    def setStyle(value: NonNullable[js.UndefOr[narrow | short | long]]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
