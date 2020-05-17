package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlDataBinding extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.XmlDataBinding_typekey")
  var ExcelDotXmlDataBinding_typekey: XmlDataBinding = js.native
  val Parent: js.Any = js.native
  val SourceUrl: String = js.native
  val _Default: String = js.native
  def ClearSettings(): Unit = js.native
  def LoadSettings(Url: String): Unit = js.native
  def Refresh(): XlXmlImportResult = js.native
}

object XmlDataBinding {
  @scala.inline
  def apply(
    Application: Application,
    ClearSettings: () => Unit,
    Creator: XlCreator,
    ExcelDotXmlDataBinding_typekey: XmlDataBinding,
    LoadSettings: String => Unit,
    Parent: js.Any,
    Refresh: () => XlXmlImportResult,
    SourceUrl: String,
    _Default: String
  ): XmlDataBinding = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ClearSettings = js.Any.fromFunction0(ClearSettings), Creator = Creator.asInstanceOf[js.Any], LoadSettings = js.Any.fromFunction1(LoadSettings), Parent = Parent.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), SourceUrl = SourceUrl.asInstanceOf[js.Any], _Default = _Default.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.XmlDataBinding_typekey")(ExcelDotXmlDataBinding_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlDataBinding]
  }
  @scala.inline
  implicit class XmlDataBindingOps[Self <: XmlDataBinding] (val x: Self) extends AnyVal {
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
    def withClearSettings(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClearSettings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreator(value: XlCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotXmlDataBinding_typekey(value: XmlDataBinding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.XmlDataBinding_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadSettings(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadSettings")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefresh(value: () => XlXmlImportResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Refresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSourceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_Default(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_Default")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

