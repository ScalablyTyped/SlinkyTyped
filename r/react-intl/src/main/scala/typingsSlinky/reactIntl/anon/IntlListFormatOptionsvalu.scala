package typingsSlinky.reactIntl.anon

import slinky.core.facade.ReactElement
import typingsSlinky.reactIntl.reactIntlStrings.`best fit`
import typingsSlinky.reactIntl.reactIntlStrings.conjunction
import typingsSlinky.reactIntl.reactIntlStrings.disjunction
import typingsSlinky.reactIntl.reactIntlStrings.long
import typingsSlinky.reactIntl.reactIntlStrings.lookup
import typingsSlinky.reactIntl.reactIntlStrings.narrow
import typingsSlinky.reactIntl.reactIntlStrings.short
import typingsSlinky.reactIntl.reactIntlStrings.unit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @formatjs/intl-listformat.@formatjs/intl-listformat.IntlListFormatOptions & {  value :std.Array<react.react.ReactNode>} */
@js.native
trait IntlListFormatOptionsvalu extends StObject {
  
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
  
  var value: js.Array[ReactElement] = js.native
}
object IntlListFormatOptionsvalu {
  
  @scala.inline
  def apply(value: js.Array[ReactElement]): IntlListFormatOptionsvalu = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntlListFormatOptionsvalu]
  }
  
  @scala.inline
  implicit class IntlListFormatOptionsvaluMutableBuilder[Self <: IntlListFormatOptionsvalu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocaleMatcher(value: (`best fit`) | lookup): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
    
    @scala.inline
    def setStyle(value: long | short | narrow): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setType(value: conjunction | disjunction | unit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: js.Array[ReactElement]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: ReactElement*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
