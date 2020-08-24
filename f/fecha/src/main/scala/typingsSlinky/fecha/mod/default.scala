package typingsSlinky.fecha.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.fecha.anon.PartialI18nSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fecha", JSImport.Default)
@js.native
object default extends js.Object {
  var defaultI18n: I18nSettings = js.native
  @JSName("parse")
  var parse_Original: js.Function3[
    /* dateStr */ String, 
    /* format */ String, 
    /* i18n */ js.UndefOr[I18nSettingsOptional], 
    js.Date | Null
  ] = js.native
  def format(dateObj: js.Date): String = js.native
  def format(dateObj: js.Date, mask: js.UndefOr[scala.Nothing], i18n: PartialI18nSettings): String = js.native
  def format(dateObj: js.Date, mask: String): String = js.native
  def format(dateObj: js.Date, mask: String, i18n: PartialI18nSettings): String = js.native
  def parse(dateStr: String, format: String): js.Date | Null = js.native
  def parse(dateStr: String, format: String, i18n: I18nSettingsOptional): js.Date | Null = js.native
  def setGlobalDateI18n(i18n: PartialI18nSettings): I18nSettings = js.native
  def setGlobalDateMasks(masks: StringDictionary[String]): StringDictionary[String] = js.native
}

