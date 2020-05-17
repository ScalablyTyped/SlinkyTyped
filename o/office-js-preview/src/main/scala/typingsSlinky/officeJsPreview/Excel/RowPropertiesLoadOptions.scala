package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.anon.CellPropertiesFormatLoadO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents which row properties to load, when used as part of a "range.getRowProperties" method.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait RowPropertiesLoadOptions extends CellPropertiesLoadOptions {
  /**
    *
    * Specifies whether to load on the `format` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  @JSName("format")
  var format_RowPropertiesLoadOptions: js.UndefOr[CellPropertiesFormatLoadO] = js.native
  /**
    *
    * Specifies whether to load on the `rowHidden` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rowHidden: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether to load on the `rowIndex` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rowIndex: js.UndefOr[Boolean] = js.native
}

object RowPropertiesLoadOptions {
  @scala.inline
  def apply(): RowPropertiesLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowPropertiesLoadOptions]
  }
  @scala.inline
  implicit class RowPropertiesLoadOptionsOps[Self <: RowPropertiesLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: CellPropertiesFormatLoadO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withRowIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(js.undefined)
        ret
    }
  }
  
}

