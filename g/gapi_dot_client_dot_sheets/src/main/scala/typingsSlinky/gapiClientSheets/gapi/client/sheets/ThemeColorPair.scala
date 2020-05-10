package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeColorPair extends js.Object {
  /** The concrete color corresponding to the theme color type. */
  var color: js.UndefOr[ColorStyle] = js.native
  /** The type of the spreadsheet theme color. */
  var colorType: js.UndefOr[String] = js.native
}

object ThemeColorPair {
  @scala.inline
  def apply(): ThemeColorPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeColorPair]
  }
  @scala.inline
  implicit class ThemeColorPairOps[Self <: ThemeColorPair] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: ColorStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withColorType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorType")(js.undefined)
        ret
    }
  }
  
}

