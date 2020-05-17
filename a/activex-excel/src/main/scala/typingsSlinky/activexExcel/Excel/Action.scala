package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Action extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  val Caption: String = js.native
  val Content: String = js.native
  val Coordinate: String = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.Action_typekey")
  var ExcelDotAction_typekey: Action = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  val Type: XlActionType = js.native
  def Execute(): Unit = js.native
}

object Action {
  @scala.inline
  def apply(
    Application: Application,
    Caption: String,
    Content: String,
    Coordinate: String,
    Creator: XlCreator,
    ExcelDotAction_typekey: Action,
    Execute: () => Unit,
    Name: String,
    Parent: js.Any,
    Type: XlActionType
  ): Action = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], Coordinate = Coordinate.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Execute = js.Any.fromFunction0(Execute), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Action_typekey")(ExcelDotAction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  implicit class ActionOps[Self <: Action] (val x: Self) extends AnyVal {
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
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoordinate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Coordinate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: XlCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotAction_typekey(value: Action): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.Action_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecute(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Execute")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: XlActionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

