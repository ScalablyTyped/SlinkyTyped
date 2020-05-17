package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartTagRecognizer extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  var Enabled: Boolean = js.native
  @JSName("Excel.SmartTagRecognizer_typekey")
  var ExcelDotSmartTagRecognizer_typekey: SmartTagRecognizer = js.native
  val FullName: String = js.native
  val Parent: js.Any = js.native
  val _Default: String = js.native
  val progID: String = js.native
}

object SmartTagRecognizer {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    Enabled: Boolean,
    ExcelDotSmartTagRecognizer_typekey: SmartTagRecognizer,
    FullName: String,
    Parent: js.Any,
    _Default: String,
    progID: String
  ): SmartTagRecognizer = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], FullName = FullName.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], _Default = _Default.asInstanceOf[js.Any], progID = progID.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SmartTagRecognizer_typekey")(ExcelDotSmartTagRecognizer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagRecognizer]
  }
  @scala.inline
  implicit class SmartTagRecognizerOps[Self <: SmartTagRecognizer] (val x: Self) extends AnyVal {
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
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotSmartTagRecognizer_typekey(value: SmartTagRecognizer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.SmartTagRecognizer_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_Default(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_Default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

