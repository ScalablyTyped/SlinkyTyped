package typingsSlinky.activexOutlook.Outlook

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exception extends js.Object {
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val AppointmentItem: typingsSlinky.activexOutlook.Outlook.AppointmentItem = js.native
  val Class: OlObjectClass = js.native
  val Deleted: Boolean = js.native
  val ItemProperties: typingsSlinky.activexOutlook.Outlook.ItemProperties = js.native
  val OriginalDate: VarDate = js.native
  @JSName("Outlook.Exception_typekey")
  var OutlookDotException_typekey: Exception = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
}

object Exception {
  @scala.inline
  def apply(
    Application: Application,
    AppointmentItem: AppointmentItem,
    Class: OlObjectClass,
    Deleted: Boolean,
    ItemProperties: ItemProperties,
    OriginalDate: VarDate,
    OutlookDotException_typekey: Exception,
    Parent: js.Any,
    Session: NameSpace
  ): Exception = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AppointmentItem = AppointmentItem.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Deleted = Deleted.asInstanceOf[js.Any], ItemProperties = ItemProperties.asInstanceOf[js.Any], OriginalDate = OriginalDate.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Exception_typekey")(OutlookDotException_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exception]
  }
  @scala.inline
  implicit class ExceptionOps[Self <: Exception] (val x: Self) extends AnyVal {
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
    def withAppointmentItem(value: AppointmentItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppointmentItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClass(value: OlObjectClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemProperties(value: ItemProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalDate(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginalDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlookDotException_typekey(value: Exception): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.Exception_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: NameSpace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Session")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

