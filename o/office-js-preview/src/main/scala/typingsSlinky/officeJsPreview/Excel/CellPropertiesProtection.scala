package typingsSlinky.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the `format.protection` properties of `getCellProperties`, `getRowProperties`, and `getColumnProperties` or the `format.protection` input parameter of `setCellProperties`, `setRowProperties`, and `setColumnProperties`.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait CellPropertiesProtection extends js.Object {
  /**
    *
    * Represents the `format.protection.formulaHidden` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var formulaHidden: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the `format.protection.locked` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var locked: js.UndefOr[Boolean] = js.native
}

object CellPropertiesProtection {
  @scala.inline
  def apply(): CellPropertiesProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellPropertiesProtection]
  }
  @scala.inline
  implicit class CellPropertiesProtectionOps[Self <: CellPropertiesProtection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormulaHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formulaHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormulaHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formulaHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(js.undefined)
        ret
    }
  }
  
}

