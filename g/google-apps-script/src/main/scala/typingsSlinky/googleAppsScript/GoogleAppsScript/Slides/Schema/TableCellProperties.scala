package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableCellProperties extends js.Object {
  var contentAlignment: js.UndefOr[String] = js.native
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

