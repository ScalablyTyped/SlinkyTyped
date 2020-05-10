package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties and contents of each table cell.
  */
@js.native
trait SchemaTableCell extends js.Object {
  /**
    * Column span of the cell.
    */
  var columnSpan: js.UndefOr[Double] = js.native
  /**
    * The location of the cell within the table.
    */
  var location: js.UndefOr[SchemaTableCellLocation] = js.native
  /**
    * Row span of the cell.
    */
  var rowSpan: js.UndefOr[Double] = js.native
  /**
    * The properties of the table cell.
    */
  var tableCellProperties: js.UndefOr[SchemaTableCellProperties] = js.native
  /**
    * The text content of the cell.
    */
  var text: js.UndefOr[SchemaTextContent] = js.native
}

object SchemaTableCell {
  @scala.inline
  def apply(): SchemaTableCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableCell]
  }
  @scala.inline
  implicit class SchemaTableCellOps[Self <: SchemaTableCell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnSpan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: SchemaTableCellLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSpan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withTableCellProperties(value: SchemaTableCellProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCellProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableCellProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCellProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: SchemaTextContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

