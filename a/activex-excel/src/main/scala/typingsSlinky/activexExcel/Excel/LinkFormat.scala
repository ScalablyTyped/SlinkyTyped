package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkFormat extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  var AutoUpdate: Boolean = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.LinkFormat_typekey")
  var ExcelDotLinkFormat_typekey: LinkFormat = js.native
  var Locked: Boolean = js.native
  val Parent: js.Any = js.native
  def Update(): Unit = js.native
}

object LinkFormat {
  @scala.inline
  def apply(
    Application: Application,
    AutoUpdate: Boolean,
    Creator: XlCreator,
    ExcelDotLinkFormat_typekey: LinkFormat,
    Locked: Boolean,
    Parent: js.Any,
    Update: () => Unit
  ): LinkFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoUpdate = AutoUpdate.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Update = js.Any.fromFunction0(Update))
    __obj.updateDynamic("Excel.LinkFormat_typekey")(ExcelDotLinkFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkFormat]
  }
  @scala.inline
  implicit class LinkFormatOps[Self <: LinkFormat] (val x: Self) extends AnyVal {
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
    def withAutoUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: XlCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotLinkFormat_typekey(value: LinkFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.LinkFormat_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Update")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

