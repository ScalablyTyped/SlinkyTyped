package typingsSlinky.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatSettings extends js.Object {
  /** Gets or sets a value that indicates whether to enable or disable cell border feature in the Spreadsheet.
    * @Default {true}
    */
  var allowCellBorder: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable decimal places in the Spreadsheet.
    * @Default {true}
    */
  var allowDecimalPlaces: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable font family feature in Spreadsheet.
    * @Default {true}
    */
  var allowFontFamily: js.UndefOr[Boolean] = js.native
}

object FormatSettings {
  @scala.inline
  def apply(): FormatSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatSettings]
  }
  @scala.inline
  implicit class FormatSettingsOps[Self <: FormatSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowCellBorder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCellBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCellBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCellBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDecimalPlaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDecimalPlaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDecimalPlaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDecimalPlaces")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowFontFamily(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFontFamily")(js.undefined)
        ret
    }
  }
  
}

