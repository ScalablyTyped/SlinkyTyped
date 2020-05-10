package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableCellProperties extends js.Object {
  /**
    * The background fill of the table cell. The default fill matches the fill
    * for newly created table cells in the Slides editor.
    */
  var tableCellBackgroundFill: js.UndefOr[TableCellBackgroundFill] = js.native
}

object TableCellProperties {
  @scala.inline
  def apply(): TableCellProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellProperties]
  }
  @scala.inline
  implicit class TableCellPropertiesOps[Self <: TableCellProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTableCellBackgroundFill(value: TableCellBackgroundFill): Self = {
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

