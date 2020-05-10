package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableCellBackgroundFill extends js.Object {
  var propertyState: js.UndefOr[String] = js.native
  var solidFill: js.UndefOr[SolidFill] = js.native
}

object TableCellBackgroundFill {
  @scala.inline
  def apply(): TableCellBackgroundFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellBackgroundFill]
  }
  @scala.inline
  implicit class TableCellBackgroundFillOps[Self <: TableCellBackgroundFill] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPropertyState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropertyState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyState")(js.undefined)
        ret
    }
    @scala.inline
    def withSolidFill(value: SolidFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solidFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSolidFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solidFill")(js.undefined)
        ret
    }
  }
  
}

