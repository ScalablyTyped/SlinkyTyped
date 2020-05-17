package typingsSlinky.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Screen extends js.Object {
  @JSName("Access.Screen_typekey")
  var AccessDotScreen_typekey: Screen = js.native
  val ActiveControl: Control = js.native
  val ActiveDataAccessPage: DataAccessPage = js.native
  val ActiveDatasheet: Form = js.native
  val ActiveForm: Form = js.native
  val ActiveReport: Report = js.native
  val Application: typingsSlinky.activexAccess.Access.Application = js.native
  var MousePointer: Double = js.native
  val Parent: js.Any = js.native
  val PreviousControl: Control = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
}

object Screen {
  @scala.inline
  def apply(
    AccessDotScreen_typekey: Screen,
    ActiveControl: Control,
    ActiveDataAccessPage: DataAccessPage,
    ActiveDatasheet: Form,
    ActiveForm: Form,
    ActiveReport: Report,
    Application: Application,
    IsMemberSafe: Double => Boolean,
    MousePointer: Double,
    Parent: js.Any,
    PreviousControl: Control
  ): Screen = {
    val __obj = js.Dynamic.literal(ActiveControl = ActiveControl.asInstanceOf[js.Any], ActiveDataAccessPage = ActiveDataAccessPage.asInstanceOf[js.Any], ActiveDatasheet = ActiveDatasheet.asInstanceOf[js.Any], ActiveForm = ActiveForm.asInstanceOf[js.Any], ActiveReport = ActiveReport.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), MousePointer = MousePointer.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PreviousControl = PreviousControl.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.Screen_typekey")(AccessDotScreen_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Screen]
  }
  @scala.inline
  implicit class ScreenOps[Self <: Screen] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessDotScreen_typekey(value: Screen): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Access.Screen_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveControl(value: Control): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveDataAccessPage(value: DataAccessPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveDataAccessPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveDatasheet(value: Form): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveDatasheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveForm(value: Form): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveForm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveReport(value: Report): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveReport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMemberSafe(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsMemberSafe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMousePointer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MousePointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousControl(value: Control): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreviousControl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

