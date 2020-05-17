package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartTagAction extends js.Object {
  val ActiveXControl: js.Any = js.native
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  var CheckboxState: Boolean = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.SmartTagAction_typekey")
  var ExcelDotSmartTagAction_typekey: SmartTagAction = js.native
  var ExpandHelp: Boolean = js.native
  var ListSelection: Double = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  val PresentInPane: Boolean = js.native
  var RadioGroupSelection: Double = js.native
  var TextboxText: String = js.native
  val Type: XlSmartTagControlType = js.native
  val _Default: String = js.native
  def Execute(): Unit = js.native
}

object SmartTagAction {
  @scala.inline
  def apply(
    ActiveXControl: js.Any,
    Application: Application,
    CheckboxState: Boolean,
    Creator: XlCreator,
    ExcelDotSmartTagAction_typekey: SmartTagAction,
    Execute: () => Unit,
    ExpandHelp: Boolean,
    ListSelection: Double,
    Name: String,
    Parent: js.Any,
    PresentInPane: Boolean,
    RadioGroupSelection: Double,
    TextboxText: String,
    Type: XlSmartTagControlType,
    _Default: String
  ): SmartTagAction = {
    val __obj = js.Dynamic.literal(ActiveXControl = ActiveXControl.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], CheckboxState = CheckboxState.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Execute = js.Any.fromFunction0(Execute), ExpandHelp = ExpandHelp.asInstanceOf[js.Any], ListSelection = ListSelection.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PresentInPane = PresentInPane.asInstanceOf[js.Any], RadioGroupSelection = RadioGroupSelection.asInstanceOf[js.Any], TextboxText = TextboxText.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], _Default = _Default.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SmartTagAction_typekey")(ExcelDotSmartTagAction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagAction]
  }
  @scala.inline
  implicit class SmartTagActionOps[Self <: SmartTagAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveXControl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveXControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckboxState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckboxState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: XlCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotSmartTagAction_typekey(value: SmartTagAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.SmartTagAction_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecute(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Execute")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExpandHelp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpandHelp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListSelection(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListSelection")(value.asInstanceOf[js.Any])
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
    def withPresentInPane(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PresentInPane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadioGroupSelection(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RadioGroupSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextboxText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextboxText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: XlSmartTagControlType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
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

