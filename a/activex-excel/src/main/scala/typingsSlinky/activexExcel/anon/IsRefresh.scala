package typingsSlinky.activexExcel.anon

import typingsSlinky.activexExcel.Excel.Workbook
import typingsSlinky.activexExcel.Excel.XlXmlImportResult
import typingsSlinky.activexExcel.Excel.XmlMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsRefresh extends js.Object {
  val IsRefresh: Boolean = js.native
  val Map: XmlMap = js.native
  val Result: XlXmlImportResult = js.native
  val Wb: Workbook = js.native
}

object IsRefresh {
  @scala.inline
  def apply(IsRefresh: Boolean, Map: XmlMap, Result: XlXmlImportResult, Wb: Workbook): IsRefresh = {
    val __obj = js.Dynamic.literal(IsRefresh = IsRefresh.asInstanceOf[js.Any], Map = Map.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsRefresh]
  }
  @scala.inline
  implicit class IsRefreshOps[Self <: IsRefresh] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withResult(value: XlXmlImportResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Result")(value.asInstanceOf[js.Any])
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

