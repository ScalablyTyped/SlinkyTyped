package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuItem extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  var Caption: String = js.native
  var Checked: Boolean = js.native
  val Creator: XlCreator = js.native
  var Enabled: Boolean = js.native
  @JSName("Excel.MenuItem_typekey")
  var ExcelDotMenuItem_typekey: MenuItem = js.native
  var HelpContextID: Double = js.native
  var HelpFile: String = js.native
  val Index: Double = js.native
  var OnAction: String = js.native
  val Parent: js.Any = js.native
  var StatusBar: String = js.native
  def Delete(): Unit = js.native
}

object MenuItem {
  @scala.inline
  def apply(
    Application: Application,
    Caption: String,
    Checked: Boolean,
    Creator: XlCreator,
    Delete: () => Unit,
    Enabled: Boolean,
    ExcelDotMenuItem_typekey: MenuItem,
    HelpContextID: Double,
    HelpFile: String,
    Index: Double,
    OnAction: String,
    Parent: js.Any,
    StatusBar: String
  ): MenuItem = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Checked = Checked.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Enabled = Enabled.asInstanceOf[js.Any], HelpContextID = HelpContextID.asInstanceOf[js.Any], HelpFile = HelpFile.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], OnAction = OnAction.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], StatusBar = StatusBar.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.MenuItem_typekey")(ExcelDotMenuItem_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItem]
  }
  @scala.inline
  implicit class MenuItemOps[Self <: MenuItem] (val x: Self) extends AnyVal {
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
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: XlCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotMenuItem_typekey(value: MenuItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.MenuItem_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelpContextID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HelpContextID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelpFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HelpFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusBar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusBar")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

