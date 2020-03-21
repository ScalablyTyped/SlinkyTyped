package typingsSlinky.reactIntl

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.formatjsIntlListformat.PickIntlListFormatOptions
import typingsSlinky.formatjsIntlListformat.mod.default
import typingsSlinky.formatjsIntlUtils.listTypesMod.ListPatternFieldsData
import typingsSlinky.formatjsIntlUtils.listTypesMod.ListPatternLocaleData
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofIntlListFormat extends Instantiable0[default] {
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

