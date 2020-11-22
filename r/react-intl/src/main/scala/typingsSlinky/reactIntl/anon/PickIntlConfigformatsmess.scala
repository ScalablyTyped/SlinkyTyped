package typingsSlinky.reactIntl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-intl.react-intl/src/types.IntlConfig, 'formats' | 'messages' | 'timeZone' | 'textComponent' | 'defaultLocale' | 'defaultFormats' | 'onError'> */
@js.native
trait PickIntlConfigformatsmess extends js.Object {
  
  var defaultFormats: js.UndefOr[js.Any] = js.native
  
  var defaultLocale: js.UndefOr[js.Any] = js.native
  
  var formats: js.UndefOr[js.Any] = js.native
  
  var messages: js.UndefOr[js.Any] = js.native
  
  var onError: js.UndefOr[js.Any] = js.native
  
  var textComponent: js.UndefOr[js.Any] = js.native
  
  var timeZone: js.UndefOr[js.Any] = js.native
}
object PickIntlConfigformatsmess {
  
  @scala.inline
  def apply(): PickIntlConfigformatsmess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickIntlConfigformatsmess]
  }
  
  @scala.inline
  implicit class PickIntlConfigformatsmessOps[Self <: PickIntlConfigformatsmess] (val x: Self) extends AnyVal {
    
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
    def setDefaultFormats(value: js.Any): Self = this.set("defaultFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultFormats: Self = this.set("defaultFormats", js.undefined)
    
    @scala.inline
    def setDefaultLocale(value: js.Any): Self = this.set("defaultLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLocale: Self = this.set("defaultLocale", js.undefined)
    
    @scala.inline
    def setFormats(value: js.Any): Self = this.set("formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormats: Self = this.set("formats", js.undefined)
    
    @scala.inline
    def setMessages(value: js.Any): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setOnError(value: js.Any): Self = this.set("onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setTextComponent(value: js.Any): Self = this.set("textComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextComponent: Self = this.set("textComponent", js.undefined)
    
    @scala.inline
    def setTimeZone(value: js.Any): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
  }
}
