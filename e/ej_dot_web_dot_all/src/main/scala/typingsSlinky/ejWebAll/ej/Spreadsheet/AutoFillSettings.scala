package typingsSlinky.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoFillSettings extends js.Object {
  /** This property is used to set fillType unit in Spreadsheet. It has five types which are CopyCells, FillSeries, FillFormattingOnly, FillWithoutFormatting and FlashFill.
    * @Default {ej.Spreadsheet.AutoFillOptions.FillSeries}
    */
  var fillType: js.UndefOr[AutoFillOptions | String] = js.native
  /** Gets or sets a value that indicates to enable or disable auto fill options in the Spreadsheet.
    * @Default {true}
    */
  var showFillOptions: js.UndefOr[Boolean] = js.native
}

object AutoFillSettings {
  @scala.inline
  def apply(): AutoFillSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoFillSettings]
  }
  @scala.inline
  implicit class AutoFillSettingsOps[Self <: AutoFillSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFillType(value: AutoFillOptions | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillType")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFillOptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFillOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFillOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFillOptions")(js.undefined)
        ret
    }
  }
  
}

