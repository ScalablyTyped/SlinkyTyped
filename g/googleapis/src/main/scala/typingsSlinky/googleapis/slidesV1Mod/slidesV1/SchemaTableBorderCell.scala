package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of each border cell.
  */
@js.native
trait SchemaTableBorderCell extends js.Object {
  /**
    * The location of the border within the border table.
    */
  var location: js.UndefOr[SchemaTableCellLocation] = js.native
  /**
    * The border properties.
    */
  var tableBorderProperties: js.UndefOr[SchemaTableBorderProperties] = js.native
}

object SchemaTableBorderCell {
  @scala.inline
  def apply(): SchemaTableBorderCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableBorderCell]
  }
  @scala.inline
  implicit class SchemaTableBorderCellOps[Self <: SchemaTableBorderCell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withTableBorderProperties(value: SchemaTableBorderProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBorderProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableBorderProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBorderProperties")(js.undefined)
        ret
    }
  }
  
}

