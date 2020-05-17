package typingsSlinky.activexOutlook.Outlook

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeZone extends js.Object {
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val Bias: Double = js.native
  val Class: OlObjectClass = js.native
  val DaylightBias: Double = js.native
  val DaylightDate: VarDate = js.native
  val DaylightDesignation: String = js.native
  val ID: String = js.native
  val Name: String = js.native
  @JSName("Outlook.TimeZone_typekey")
  var OutlookDotTimeZone_typekey: TimeZone = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  val StandardBias: Double = js.native
  val StandardDate: VarDate = js.native
  val StandardDesignation: String = js.native
}

object TimeZone {
  @scala.inline
  def apply(
    Application: Application,
    Bias: Double,
    Class: OlObjectClass,
    DaylightBias: Double,
    DaylightDate: VarDate,
    DaylightDesignation: String,
    ID: String,
    Name: String,
    OutlookDotTimeZone_typekey: TimeZone,
    Parent: js.Any,
    Session: NameSpace,
    StandardBias: Double,
    StandardDate: VarDate,
    StandardDesignation: String
  ): TimeZone = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Bias = Bias.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], DaylightBias = DaylightBias.asInstanceOf[js.Any], DaylightDate = DaylightDate.asInstanceOf[js.Any], DaylightDesignation = DaylightDesignation.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], StandardBias = StandardBias.asInstanceOf[js.Any], StandardDate = StandardDate.asInstanceOf[js.Any], StandardDesignation = StandardDesignation.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.TimeZone_typekey")(OutlookDotTimeZone_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeZone]
  }
  @scala.inline
  implicit class TimeZoneOps[Self <: TimeZone] (val x: Self) extends AnyVal {
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
    def withBias(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClass(value: OlObjectClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDaylightBias(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DaylightBias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDaylightDate(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DaylightDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDaylightDesignation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DaylightDesignation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlookDotTimeZone_typekey(value: TimeZone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.TimeZone_typekey")(value.asInstanceOf[js.Any])
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
    def withStandardBias(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardBias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStandardDate(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStandardDesignation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardDesignation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

