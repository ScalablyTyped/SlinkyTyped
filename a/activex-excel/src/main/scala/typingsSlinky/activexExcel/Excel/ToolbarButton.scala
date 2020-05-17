package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarButton extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  val BuiltIn: Boolean = js.native
  var BuiltInFace: Boolean = js.native
  val Creator: XlCreator = js.native
  var Enabled: Boolean = js.native
  @JSName("Excel.ToolbarButton_typekey")
  var ExcelDotToolbarButton_typekey: ToolbarButton = js.native
  var HelpContextID: Double = js.native
  var HelpFile: String = js.native
  val ID: Double = js.native
  val IsGap: Boolean = js.native
  var Name: String = js.native
  var OnAction: String = js.native
  val Parent: js.Any = js.native
  var Pushed: Boolean = js.native
  var StatusBar: String = js.native
  var Width: Double = js.native
  def Copy(Toolbar: Toolbar, Before: Double): Unit = js.native
  def CopyFace(): Unit = js.native
  def Delete(): Unit = js.native
  def Edit(): Unit = js.native
  def Move(Toolbar: Toolbar, Before: Double): Unit = js.native
  def PasteFace(): Unit = js.native
  def Reset(): Unit = js.native
}

object ToolbarButton {
  @scala.inline
  def apply(
    Application: Application,
    BuiltIn: Boolean,
    BuiltInFace: Boolean,
    Copy: (Toolbar, Double) => Unit,
    CopyFace: () => Unit,
    Creator: XlCreator,
    Delete: () => Unit,
    Edit: () => Unit,
    Enabled: Boolean,
    ExcelDotToolbarButton_typekey: ToolbarButton,
    HelpContextID: Double,
    HelpFile: String,
    ID: Double,
    IsGap: Boolean,
    Move: (Toolbar, Double) => Unit,
    Name: String,
    OnAction: String,
    Parent: js.Any,
    PasteFace: () => Unit,
    Pushed: Boolean,
    Reset: () => Unit,
    StatusBar: String,
    Width: Double
  ): ToolbarButton = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BuiltIn = BuiltIn.asInstanceOf[js.Any], BuiltInFace = BuiltInFace.asInstanceOf[js.Any], Copy = js.Any.fromFunction2(Copy), CopyFace = js.Any.fromFunction0(CopyFace), Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Edit = js.Any.fromFunction0(Edit), Enabled = Enabled.asInstanceOf[js.Any], HelpContextID = HelpContextID.asInstanceOf[js.Any], HelpFile = HelpFile.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], IsGap = IsGap.asInstanceOf[js.Any], Move = js.Any.fromFunction2(Move), Name = Name.asInstanceOf[js.Any], OnAction = OnAction.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PasteFace = js.Any.fromFunction0(PasteFace), Pushed = Pushed.asInstanceOf[js.Any], Reset = js.Any.fromFunction0(Reset), StatusBar = StatusBar.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ToolbarButton_typekey")(ExcelDotToolbarButton_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarButton]
  }
  @scala.inline
  implicit class ToolbarButtonOps[Self <: ToolbarButton] (val x: Self) extends AnyVal {
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
    def withBuiltIn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BuiltIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuiltInFace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BuiltInFace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopy(value: (Toolbar, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Copy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCopyFace(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyFace")(js.Any.fromFunction0(value))
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
    def withEdit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Edit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotToolbarButton_typekey(value: ToolbarButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.ToolbarButton_typekey")(value.asInstanceOf[js.Any])
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
    def withID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsGap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMove(value: (Toolbar, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Move")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
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
    def withPasteFace(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PasteFace")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPushed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pushed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStatusBar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

