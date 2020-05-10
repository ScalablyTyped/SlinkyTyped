package typingsSlinky.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the `format.borders` properties of `getCellProperties`, `getRowProperties`, and `getColumnProperties` or the `format.borders` input parameter of `setCellProperties`, `setRowProperties`, and `setColumnProperties`.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait CellBorderCollection extends js.Object {
  /**
    *
    * Represents the `format.borders.bottom` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bottom: js.UndefOr[CellBorder] = js.native
  /**
    *
    * Represents the `format.borders.diagonalDown` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var diagonalDown: js.UndefOr[CellBorder] = js.native
  /**
    *
    * Represents the `format.borders.diagonalUp` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var diagonalUp: js.UndefOr[CellBorder] = js.native
  /**
    *
    * Represents the `format.borders.horizontal` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontal: js.UndefOr[CellBorder] = js.native
  /**
    *
    * Represents the `format.borders.left` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var left: js.UndefOr[CellBorder] = js.native
  /**
    *
    * Represents the `format.borders.right` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var right: js.UndefOr[CellBorder] = js.native
  /**
    *
    * Represents the `format.borders.top` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var top: js.UndefOr[CellBorder] = js.native
  /**
    *
    * Represents the `format.borders.vertical` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var vertical: js.UndefOr[CellBorder] = js.native
}

object CellBorderCollection {
  @scala.inline
  def apply(): CellBorderCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellBorderCollection]
  }
  @scala.inline
  implicit class CellBorderCollectionOps[Self <: CellBorderCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottom(value: CellBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.undefined)
        ret
    }
    @scala.inline
    def withDiagonalDown(value: CellBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagonalDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiagonalDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagonalDown")(js.undefined)
        ret
    }
    @scala.inline
    def withDiagonalUp(value: CellBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagonalUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiagonalUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagonalUp")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontal(value: CellBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: CellBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: CellBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: CellBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical(value: CellBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
  }
  
}

