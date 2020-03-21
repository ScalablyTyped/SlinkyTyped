package typingsSlinky.intlRelativeformat.mod._Global_

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.formatjsIntlRelativetimeformat.PickIntlRelativeTimeForma
import typingsSlinky.formatjsIntlRelativetimeformat.mod.default
import typingsSlinky.formatjsIntlUtils.relativeTimeTypesMod.RelativeTimeLocaleData
import typingsSlinky.formatjsIntlUtils.relativeTimeTypesMod.UnpackedLocaleFieldsData
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Intl")
@js.native
object Intl extends js.Object {
  @js.native
  class RelativeTimeFormat () extends default
  
  @js.native
  object RelativeTimeFormat extends Instantiable0[default] {
    val __INTERNAL_SLOT_MAP__ : js.Any = js.native
    var __defaultLocale: js.Any = js.native
    var availableLocales: js.Any = js.native
    var getDefaultLocale: js.Any = js.native
    var localeData: Record[String, UnpackedLocaleFieldsData] = js.native
    var polyfilled: Boolean = js.native
    var relevantExtensionKeys: js.Any = js.native
    def __addLocaleData(data: RelativeTimeLocaleData*): Unit = js.native
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: PickIntlRelativeTimeForma): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: PickIntlRelativeTimeForma): js.Array[String] = js.native
  }
  
}

