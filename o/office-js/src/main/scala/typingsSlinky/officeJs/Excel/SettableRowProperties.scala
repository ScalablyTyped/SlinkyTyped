package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.anon.CellPropertiesFormatrowHe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the input parameter of setRowProperties.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait SettableRowProperties extends SettableCellProperties {
  /**
    *
    * Represents the `format` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  @JSName("format")
  var format_SettableRowProperties: js.UndefOr[CellPropertiesFormatrowHe] = js.native
  /**
    *
    * Represents the `rowHidden` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rowHidden: js.UndefOr[Boolean] = js.native
}

object SettableRowProperties {
  @scala.inline
  def apply(): SettableRowProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettableRowProperties]
  }
  @scala.inline
  implicit class SettableRowPropertiesOps[Self <: SettableRowProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: CellPropertiesFormatrowHe): Self = {
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
  }
  
}

