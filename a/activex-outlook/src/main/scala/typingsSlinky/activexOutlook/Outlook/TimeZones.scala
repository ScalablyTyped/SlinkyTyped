package typingsSlinky.activexOutlook.Outlook

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeZones extends js.Object {
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  val CurrentTimeZone: TimeZone = js.native
  @JSName("Outlook.TimeZones_typekey")
  var OutlookDotTimeZones_typekey: TimeZones = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def ConvertTime(SourceDateTime: VarDate, SourceTimeZone: TimeZone, DestinationTimeZone: TimeZone): VarDate = js.native
  def Item(Index: js.Any): TimeZone = js.native
}

object TimeZones {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    ConvertTime: (VarDate, TimeZone, TimeZone) => VarDate,
    Count: Double,
    CurrentTimeZone: TimeZone,
    Item: js.Any => TimeZone,
    OutlookDotTimeZones_typekey: TimeZones,
    Parent: js.Any,
    Session: NameSpace
  ): TimeZones = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ConvertTime = js.Any.fromFunction3(ConvertTime), Count = Count.asInstanceOf[js.Any], CurrentTimeZone = CurrentTimeZone.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.TimeZones_typekey")(OutlookDotTimeZones_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeZones]
  }
  @scala.inline
  implicit class TimeZonesOps[Self <: TimeZones] (val x: Self) extends AnyVal {
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
    def withClass(value: OlObjectClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConvertTime(value: (VarDate, TimeZone, TimeZone) => VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConvertTime")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentTimeZone(value: TimeZone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentTimeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: js.Any => TimeZone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOutlookDotTimeZones_typekey(value: TimeZones): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.TimeZones_typekey")(value.asInstanceOf[js.Any])
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

