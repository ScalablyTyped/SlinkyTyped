package typingsSlinky.atLinguiCore

import typingsSlinky.atLinguiCore.i18nMod.setupI18nProps
import typingsSlinky.std.Intl.DateTimeFormatOptions
import typingsSlinky.std.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lingui/core", JSImport.Namespace)
@js.native
object atLinguiCoreMod extends js.Object {
  @js.native
  class I18n ()
    extends typingsSlinky.atLinguiCore.i18nMod.I18n
  
  val i18n: typingsSlinky.atLinguiCore.i18nMod.I18n = js.native
  def date(language: String): js.Function1[/* value */ js.Date, String] = js.native
  def date(language: String, format: DateTimeFormatOptions): js.Function1[/* value */ js.Date, String] = js.native
  def i18nMark(id: String): String = js.native
  def number(language: String): js.Function1[/* value */ Double, String] = js.native
  def number(language: String, format: NumberFormatOptions): js.Function1[/* value */ Double, String] = js.native
  def setupI18n(): typingsSlinky.atLinguiCore.i18nMod.I18n = js.native
  def setupI18n(params: setupI18nProps): typingsSlinky.atLinguiCore.i18nMod.I18n = js.native
}

