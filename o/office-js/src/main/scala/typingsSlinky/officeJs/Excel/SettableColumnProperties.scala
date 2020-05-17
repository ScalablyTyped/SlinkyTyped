package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.anon.CellPropertiesFormatcolum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the input parameter of setColumnProperties.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait SettableColumnProperties extends SettableCellProperties {
  /**
    *
    * Represents the `columnHidden` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var columnHidden: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the `format` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  @JSName("format")
  var format_SettableColumnProperties: js.UndefOr[CellPropertiesFormatcolum] = js.native
}

object SettableColumnProperties {
  @scala.inline
  def apply(): SettableColumnProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettableColumnProperties]
  }
  @scala.inline
  implicit class SettableColumnPropertiesOps[Self <: SettableColumnProperties] (val x: Self) extends AnyVal {
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
    def withFormat(value: CellPropertiesFormatcolum): Self = {
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

