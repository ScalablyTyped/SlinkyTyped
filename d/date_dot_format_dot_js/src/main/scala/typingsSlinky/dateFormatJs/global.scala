package typingsSlinky.dateFormatJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  /**
    * Accepts a date, a mask, or a date and a mask.
    * Returns a formatted version of the given date.
    * The date defaults to the current date/time.
    * The mask defaults to dateFormat.masks.default.
    * @param {Date=} date
    * @param {string=} mask
    * @param {boolean=} utc
    */
  @js.native
  object dateFormat extends js.Object {
    
    def apply(): String = js.native
    def apply(date: js.UndefOr[scala.Nothing], mask: js.UndefOr[scala.Nothing], utc: Boolean): String = js.native
    def apply(date: js.UndefOr[scala.Nothing], mask: String): String = js.native
    def apply(date: js.UndefOr[scala.Nothing], mask: String, utc: Boolean): String = js.native
    def apply(date: js.Any): String = js.native
    def apply(date: js.Any, mask: js.UndefOr[scala.Nothing], utc: Boolean): String = js.native
    def apply(date: js.Any, mask: String): String = js.native
    def apply(date: js.Any, mask: String, utc: Boolean): String = js.native
    
    var i18n: DateFormatI18n = js.native
    
    var masks: DateFormatMasks = js.native
  }
}
