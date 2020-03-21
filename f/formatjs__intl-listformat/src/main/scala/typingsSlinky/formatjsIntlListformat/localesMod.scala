package typingsSlinky.formatjsIntlListformat

import typingsSlinky.formatjsIntlListformat.coreMod.IntlListFormatOptions
import typingsSlinky.formatjsIntlUtils.listTypesMod.ListPatternFieldsData
import typingsSlinky.formatjsIntlUtils.listTypesMod.ListPatternLocaleData
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-listformat/lib/locales", JSImport.Namespace)
@js.native
object localesMod extends js.Object {
  @js.native
  class default ()
    extends typingsSlinky.formatjsIntlListformat.coreMod.default {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: String, options: IntlListFormatOptions) = this()
    def this(locales: js.Array[String], options: IntlListFormatOptions) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    val __INTERNAL_SLOT_MAP__ : js.Any = js.native
    var __defaultLocale: js.Any = js.native
    var availableLocales: js.Any = js.native
    var getDefaultLocale: js.Any = js.native
    var localeData: Record[String, ListPatternFieldsData] = js.native
    var polyfilled: Boolean = js.native
    var relevantExtensionKeys: js.Any = js.native
    def __addLocaleData(data: ListPatternLocaleData*): Unit = js.native
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: PickIntlListFormatOptions): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: PickIntlListFormatOptions): js.Array[String] = js.native
  }
  
}

