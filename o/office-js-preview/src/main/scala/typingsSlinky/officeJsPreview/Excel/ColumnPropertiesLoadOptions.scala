package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.CellPropertiesFormatLoadOAutoIndent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents which column properties to load, when used as part of a "range.getColumnProperties" method.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait ColumnPropertiesLoadOptions extends CellPropertiesLoadOptions {
  /**
    *
    * Specifies whether to load on the `columnHidden` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var columnHidden: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether to load on the `columnIndex` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var columnIndex: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether to load on the `format` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  @JSName("format")
  var format_ColumnPropertiesLoadOptions: js.UndefOr[CellPropertiesFormatLoadOAutoIndent] = js.native
}

object ColumnPropertiesLoadOptions {
  @scala.inline
  def apply(): ColumnPropertiesLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnPropertiesLoadOptions]
  }
  @scala.inline
  implicit class ColumnPropertiesLoadOptionsOps[Self <: ColumnPropertiesLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: CellPropertiesFormatLoadOAutoIndent): Self = {
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
  }
  
}

