package typingsSlinky.activexExcel.anon

import typingsSlinky.activexExcel.Excel.Workbook
import typingsSlinky.activexExcel.Excel.XmlMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelIsRefresh extends js.Object {
  var Cancel: Boolean = js.native
  val IsRefresh: Boolean = js.native
  val Map: XmlMap = js.native
  val Url: String = js.native
  val Wb: Workbook = js.native
}

object CancelIsRefresh {
  @scala.inline
  def apply(Cancel: Boolean, IsRefresh: Boolean, Map: XmlMap, Url: String, Wb: Workbook): CancelIsRefresh = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], IsRefresh = IsRefresh.asInstanceOf[js.Any], Map = Map.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelIsRefresh]
  }
  @scala.inline
  implicit class CancelIsRefreshOps[Self <: CancelIsRefresh] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRefresh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsRefresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMap(value: XmlMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWb(value: Workbook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Wb")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

