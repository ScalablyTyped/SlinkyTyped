package typingsSlinky.formatjsIntlListformat

import typingsSlinky.formatjsIntlListformat.formatjsIntlListformatStrings.`best fit`
import typingsSlinky.formatjsIntlListformat.formatjsIntlListformatStrings.lookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Pick<@formatjs/intl-listformat.@formatjs/intl-listformat/lib.IntlListFormatOptions, 'localeMatcher'> */
  @js.native
  trait PickIntlListFormatOptions extends StObject {
    
    var localeMatcher: js.UndefOr[(`best fit`) | lookup] = js.native
  }
  object PickIntlListFormatOptions {
    
    @scala.inline
    def apply(): PickIntlListFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickIntlListFormatOptions]
    }
    
    @scala.inline
    implicit class PickIntlListFormatOptionsMutableBuilder[Self <: PickIntlListFormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocaleMatcher(value: (`best fit`) | lookup): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
    }
  }
}
