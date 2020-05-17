package typingsSlinky.activexExcel.anon

import typingsSlinky.activexExcel.Excel.Workbook
import typingsSlinky.activexExcel.Excel.XlXmlExportResult
import typingsSlinky.activexExcel.Excel.XmlMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Map extends js.Object {
  val Map: XmlMap = js.native
  val Result: XlXmlExportResult = js.native
  val Url: String = js.native
  val Wb: Workbook = js.native
}

object Map {
  @scala.inline
  def apply(Map: XmlMap, Result: XlXmlExportResult, Url: String, Wb: Workbook): Map = {
    val __obj = js.Dynamic.literal(Map = Map.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Map]
  }
  @scala.inline
  implicit class MapOps[Self <: Map] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMap(value: XmlMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: XlXmlExportResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Result")(value.asInstanceOf[js.Any])
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

