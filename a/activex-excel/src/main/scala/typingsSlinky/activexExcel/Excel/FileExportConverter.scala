package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileExportConverter extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  val Description: String = js.native
  @JSName("Excel.FileExportConverter_typekey")
  var ExcelDotFileExportConverter_typekey: FileExportConverter = js.native
  val Extensions: String = js.native
  val FileFormat: Double = js.native
  val Parent: js.Any = js.native
}

object FileExportConverter {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    Description: String,
    ExcelDotFileExportConverter_typekey: FileExportConverter,
    Extensions: String,
    FileFormat: Double,
    Parent: js.Any
  ): FileExportConverter = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Extensions = Extensions.asInstanceOf[js.Any], FileFormat = FileFormat.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.FileExportConverter_typekey")(ExcelDotFileExportConverter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileExportConverter]
  }
  @scala.inline
  implicit class FileExportConverterOps[Self <: FileExportConverter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: XlCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotFileExportConverter_typekey(value: FileExportConverter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.FileExportConverter_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileFormat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

