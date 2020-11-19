package typingsSlinky.intlRelativeformat.mod

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.formatjsIntlRelativetimeformat.anon.PickIntlRelativeTimeForma
import typingsSlinky.formatjsIntlRelativetimeformat.mod.LocaleFieldsData
import typingsSlinky.formatjsIntlRelativetimeformat.mod.RelativeTimeLocaleData
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object Intl extends js.Object {
    
    @js.native
    class RelativeTimeFormat ()
      extends typingsSlinky.formatjsIntlRelativetimeformat.mod.default
    @js.native
    object RelativeTimeFormat
      extends Instantiable0[typingsSlinky.formatjsIntlRelativetimeformat.mod.default] {
      
      val __INTERNAL_SLOT_MAP__ : js.Any = js.native
      
      def __addLocaleData(data: RelativeTimeLocaleData*): Unit = js.native
      
      var __defaultLocale: js.Any = js.native
      
      var availableLocales: js.Any = js.native
      
      var getDefaultLocale: js.Any = js.native
      
      var localeData: Record[String, LocaleFieldsData] = js.native
      
      var polyfilled: Boolean = js.native
      
      var relevantExtensionKeys: js.Any = js.native
      
      def supportedLocalesOf(locales: String): js.Array[String] = js.native
      def supportedLocalesOf(locales: String, options: PickIntlRelativeTimeForma): js.Array[String] = js.native
      def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
      def supportedLocalesOf(locales: js.Array[String], options: PickIntlRelativeTimeForma): js.Array[String] = js.native
    }
  }
}
