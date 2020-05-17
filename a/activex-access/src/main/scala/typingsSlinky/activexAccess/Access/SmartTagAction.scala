package typingsSlinky.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartTagAction extends js.Object {
  @JSName("Access.SmartTagAction_typekey")
  var AccessDotSmartTagAction_typekey: SmartTagAction = js.native
  val Application: typingsSlinky.activexAccess.Access.Application = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  def Execute(): Unit = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
}

object SmartTagAction {
  @scala.inline
  def apply(
    AccessDotSmartTagAction_typekey: SmartTagAction,
    Application: Application,
    Execute: () => Unit,
    IsMemberSafe: Double => Boolean,
    Name: String,
    Parent: js.Any
  ): SmartTagAction = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Execute = js.Any.fromFunction0(Execute), IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.SmartTagAction_typekey")(AccessDotSmartTagAction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagAction]
  }
  @scala.inline
  implicit class SmartTagActionOps[Self <: SmartTagAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessDotSmartTagAction_typekey(value: SmartTagAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Access.SmartTagAction_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecute(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Execute")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsMemberSafe(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsMemberSafe")(js.Any.fromFunction1(value))
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
  }
  
}

