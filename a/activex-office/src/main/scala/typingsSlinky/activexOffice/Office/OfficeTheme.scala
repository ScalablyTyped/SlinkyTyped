package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OfficeTheme extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  @JSName("Office.OfficeTheme_typekey")
  var OfficeDotOfficeTheme_typekey: OfficeTheme = js.native
  val Parent: js.Any = js.native
  @JSName("ThemeColorScheme")
  val ThemeColorScheme_Original: ThemeColorScheme = js.native
  val ThemeEffectScheme: typingsSlinky.activexOffice.Office.ThemeEffectScheme = js.native
  val ThemeFontScheme: typingsSlinky.activexOffice.Office.ThemeFontScheme = js.native
  def ThemeColorScheme(Index: MsoThemeColorSchemeIndex): ThemeColor = js.native
}

