package typingsSlinky.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionSettings extends js.Object {
  /** Gets or sets a value that indicates to define active cell in spreadsheet.
    */
  var activeCell: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates to define animation time while selection in the Spreadsheet.
    * @Default {0.001}
    */
  var animationTime: js.UndefOr[Double] = js.native
  /** Gets or sets a value that indicates to enable or disable animation while selection.
    * @Default {false}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates to set selection type in Spreadsheet. It has three types which are Column, Row and Default.
    * @Default {ej.Spreadsheet.SelectionType.Default}
    */
  var selectionType: js.UndefOr[SelectionType | String] = js.native
  /** Gets or sets a value that indicates to set selection unit in Spreadsheet. It has three types which are Single, Range and MultiRange.
    * @Default {ej.Spreadsheet.SelectionUnit.MultiRange}
    */
  var selectionUnit: js.UndefOr[SelectionUnit | String] = js.native
}

object SelectionSettings {
  @scala.inline
  def apply(): SelectionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectionSettings]
  }
  @scala.inline
  implicit class SelectionSettingsOps[Self <: SelectionSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveCell(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeCell")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionType(value: SelectionType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionType")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionUnit(value: SelectionUnit | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionUnit")(js.undefined)
        ret
    }
  }
  
}

