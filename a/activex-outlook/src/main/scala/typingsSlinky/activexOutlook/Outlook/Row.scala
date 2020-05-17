package typingsSlinky.activexOutlook.Outlook

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Row extends js.Object {
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  @JSName("Outlook.Row_typekey")
  var OutlookDotRow_typekey: Row = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def BinaryToString(Index: js.Any): String = js.native
  def GetValues(): js.Any = js.native
  def Item(Index: js.Any): js.Any = js.native
  def LocalTimeToUTC(Index: js.Any): VarDate = js.native
  def UTCToLocalTime(Index: js.Any): VarDate = js.native
}

object Row {
  @scala.inline
  def apply(
    Application: Application,
    BinaryToString: js.Any => String,
    Class: OlObjectClass,
    GetValues: () => js.Any,
    Item: js.Any => js.Any,
    LocalTimeToUTC: js.Any => VarDate,
    OutlookDotRow_typekey: Row,
    Parent: js.Any,
    Session: NameSpace,
    UTCToLocalTime: js.Any => VarDate
  ): Row = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BinaryToString = js.Any.fromFunction1(BinaryToString), Class = Class.asInstanceOf[js.Any], GetValues = js.Any.fromFunction0(GetValues), Item = js.Any.fromFunction1(Item), LocalTimeToUTC = js.Any.fromFunction1(LocalTimeToUTC), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], UTCToLocalTime = js.Any.fromFunction1(UTCToLocalTime))
    __obj.updateDynamic("Outlook.Row_typekey")(OutlookDotRow_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Row]
  }
  @scala.inline
  implicit class RowOps[Self <: Row] (val x: Self) extends AnyVal {
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
    def withBinaryToString(value: js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BinaryToString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClass(value: OlObjectClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetValues(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetValues")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withItem(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLocalTimeToUTC(value: js.Any => VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalTimeToUTC")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOutlookDotRow_typekey(value: Row): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.Row_typekey")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withUTCToLocalTime(value: js.Any => VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UTCToLocalTime")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

