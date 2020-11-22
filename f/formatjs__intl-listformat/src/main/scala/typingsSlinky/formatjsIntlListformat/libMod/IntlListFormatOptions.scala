package typingsSlinky.formatjsIntlListformat.libMod

import typingsSlinky.formatjsIntlListformat.formatjsIntlListformatStrings.`best fit`
import typingsSlinky.formatjsIntlListformat.formatjsIntlListformatStrings.conjunction
import typingsSlinky.formatjsIntlListformat.formatjsIntlListformatStrings.disjunction
import typingsSlinky.formatjsIntlListformat.formatjsIntlListformatStrings.long
import typingsSlinky.formatjsIntlListformat.formatjsIntlListformatStrings.lookup
import typingsSlinky.formatjsIntlListformat.formatjsIntlListformatStrings.narrow
import typingsSlinky.formatjsIntlListformat.formatjsIntlListformatStrings.short
import typingsSlinky.formatjsIntlListformat.formatjsIntlListformatStrings.unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntlListFormatOptions extends js.Object {
  
  /**
    * The locale matching algorithm to use.
    * Possible values are "lookup" and "best fit"; the default is "best fit".
    * For information about this option, see
    * https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_negotiation.
    */
  var localeMatcher: js.UndefOr[(`best fit`) | lookup] = js.native
  
  /**
    * The length of the internationalized message. Possible values are:
    * - "long" (default, e.g., in 1 month)
    * - "short" (e.g., in 1 mo.),
    * - or "narrow" (e.g., in 1 mo.).
    * The narrow style could be similar to the short style for some locales.
    */
  var style: js.UndefOr[long | short | narrow] = js.native
  
  /**
    * The format of output message. Possible values are:
    * - "always" (default, e.g., 1 day ago),
    * - or "auto" (e.g., yesterday).
    * The "auto" value allows to not always have to
    * use numeric values in the output.
    */
  var `type`: js.UndefOr[conjunction | disjunction | unit] = js.native
}
object IntlListFormatOptions {
  
  @scala.inline
  def apply(): IntlListFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntlListFormatOptions]
  }
  
  @scala.inline
  implicit class IntlListFormatOptionsOps[Self <: IntlListFormatOptions] (val x: Self) extends AnyVal {
    
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
    def setLocaleMatcher(value: (`best fit`) | lookup): Self = this.set("localeMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocaleMatcher: Self = this.set("localeMatcher", js.undefined)
    
    @scala.inline
    def setStyle(value: long | short | narrow): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setType(value: conjunction | disjunction | unit): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
