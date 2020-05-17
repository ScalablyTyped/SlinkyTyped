package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartTagOptions extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  var DisplaySmartTags: XlSmartTagDisplayMode = js.native
  var EmbedSmartTags: Boolean = js.native
  @JSName("Excel.SmartTagOptions_typekey")
  var ExcelDotSmartTagOptions_typekey: SmartTagOptions = js.native
  val Parent: js.Any = js.native
}

object SmartTagOptions {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    DisplaySmartTags: XlSmartTagDisplayMode,
    EmbedSmartTags: Boolean,
    ExcelDotSmartTagOptions_typekey: SmartTagOptions,
    Parent: js.Any
  ): SmartTagOptions = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DisplaySmartTags = DisplaySmartTags.asInstanceOf[js.Any], EmbedSmartTags = EmbedSmartTags.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SmartTagOptions_typekey")(ExcelDotSmartTagOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagOptions]
  }
  @scala.inline
  implicit class SmartTagOptionsOps[Self <: SmartTagOptions] (val x: Self) extends AnyVal {
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
    def withDisplaySmartTags(value: XlSmartTagDisplayMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplaySmartTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmbedSmartTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmbedSmartTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotSmartTagOptions_typekey(value: SmartTagOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.SmartTagOptions_typekey")(value.asInstanceOf[js.Any])
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

