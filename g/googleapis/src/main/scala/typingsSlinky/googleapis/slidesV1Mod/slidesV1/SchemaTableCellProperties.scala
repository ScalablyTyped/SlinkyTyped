package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of the TableCell.
  */
@js.native
trait SchemaTableCellProperties extends js.Object {
  /**
    * The alignment of the content in the table cell. The default alignment
    * matches the alignment for newly created table cells in the Slides editor.
    */
  var contentAlignment: js.UndefOr[String] = js.native
  /**
    * The background fill of the table cell. The default fill matches the fill
    * for newly created table cells in the Slides editor.
    */
  var tableCellBackgroundFill: js.UndefOr[SchemaTableCellBackgroundFill] = js.native
}

object SchemaTableCellProperties {
  @scala.inline
  def apply(): SchemaTableCellProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableCellProperties]
  }
  @scala.inline
  implicit class SchemaTableCellPropertiesOps[Self <: SchemaTableCellProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withTableCellBackgroundFill(value: SchemaTableCellBackgroundFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCellBackgroundFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableCellBackgroundFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCellBackgroundFill")(js.undefined)
        ret
    }
  }
  
}

