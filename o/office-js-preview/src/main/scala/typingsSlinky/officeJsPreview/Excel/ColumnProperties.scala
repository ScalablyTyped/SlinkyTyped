package typingsSlinky.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the returned properties of getColumnProperties.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait ColumnProperties extends SettableColumnProperties {
  /**
    *
    * Represents the `address` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var address: js.UndefOr[String] = js.native
  /**
    *
    * Represents the `addressLocal` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var addressLocal: js.UndefOr[String] = js.native
  /**
    *
    * Represents the `columnIndex` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var columnIndex: js.UndefOr[Double] = js.native
}

object ColumnProperties {
  @scala.inline
  def apply(): ColumnProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnProperties]
  }
  @scala.inline
  implicit class ColumnPropertiesOps[Self <: ColumnProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withAddressLocal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressLocal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressLocal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressLocal")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnIndex(value: Double): Self = {
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
  }
  
}

