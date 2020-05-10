package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpreadsheetTheme extends js.Object {
  /** / Name of the primary font family. */
  var primaryFontFamily: js.UndefOr[String] = js.native
  /**
    * The spreadsheet theme color pairs. To update you must provide all theme
    * color pairs.
    */
  var themeColors: js.UndefOr[js.Array[ThemeColorPair]] = js.native
}

object SpreadsheetTheme {
  @scala.inline
  def apply(): SpreadsheetTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetTheme]
  }
  @scala.inline
  implicit class SpreadsheetThemeOps[Self <: SpreadsheetTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrimaryFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryFontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryFontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withThemeColors(value: js.Array[ThemeColorPair]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThemeColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeColors")(js.undefined)
        ret
    }
  }
  
}

