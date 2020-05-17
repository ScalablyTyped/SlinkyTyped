package typingsSlinky.exceljs.anon

import typingsSlinky.exceljs.mod.Row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Address extends js.Object {
  var address: String = js.native
  var col: typingsSlinky.exceljs.mod.Column = js.native
  var row: Row = js.native
  var sheetName: String = js.native
}

object Address {
  @scala.inline
  def apply(address: String, col: typingsSlinky.exceljs.mod.Column, row: Row, sheetName: String): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], sheetName = sheetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  @scala.inline
  implicit class AddressOps[Self <: Address] (val x: Self) extends AnyVal {
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
    def withCol(value: typingsSlinky.exceljs.mod.Column): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("col")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRow(value: Row): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSheetName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

