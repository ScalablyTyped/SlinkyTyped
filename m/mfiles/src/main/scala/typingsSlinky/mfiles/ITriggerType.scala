package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITriggerType extends js.Object {
  val Daily: IDailyTrigger = js.native
  val MonthlyDOW: IMonthlyDOWTrigger = js.native
  val MonthlyDate: IMonthlyDateTrigger = js.native
  var Type: MFTriggerType = js.native
  val Weekly: IWeeklyTrigger = js.native
  def Clone(): ITriggerType = js.native
  def SetDailyTrigger(DailyTrigger: IDailyTrigger): Unit = js.native
  def SetMonthlyDOW(MonthlyDOWTrigger: IMonthlyDOWTrigger): Unit = js.native
  def SetMonthlyDate(MonthlyDateTrigger: IMonthlyDateTrigger): Unit = js.native
  def SetWeekly(WeeklyTrigger: IWeeklyTrigger): Unit = js.native
}

object ITriggerType {
  @scala.inline
  def apply(
    Clone: () => ITriggerType,
    Daily: IDailyTrigger,
    MonthlyDOW: IMonthlyDOWTrigger,
    MonthlyDate: IMonthlyDateTrigger,
    SetDailyTrigger: IDailyTrigger => Unit,
    SetMonthlyDOW: IMonthlyDOWTrigger => Unit,
    SetMonthlyDate: IMonthlyDateTrigger => Unit,
    SetWeekly: IWeeklyTrigger => Unit,
    Type: MFTriggerType,
    Weekly: IWeeklyTrigger
  ): ITriggerType = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Daily = Daily.asInstanceOf[js.Any], MonthlyDOW = MonthlyDOW.asInstanceOf[js.Any], MonthlyDate = MonthlyDate.asInstanceOf[js.Any], SetDailyTrigger = js.Any.fromFunction1(SetDailyTrigger), SetMonthlyDOW = js.Any.fromFunction1(SetMonthlyDOW), SetMonthlyDate = js.Any.fromFunction1(SetMonthlyDate), SetWeekly = js.Any.fromFunction1(SetWeekly), Type = Type.asInstanceOf[js.Any], Weekly = Weekly.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITriggerType]
  }
  @scala.inline
  implicit class ITriggerTypeOps[Self <: ITriggerType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => ITriggerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDaily(value: IDailyTrigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Daily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonthlyDOW(value: IMonthlyDOWTrigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonthlyDOW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonthlyDate(value: IMonthlyDateTrigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonthlyDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetDailyTrigger(value: IDailyTrigger => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetDailyTrigger")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMonthlyDOW(value: IMonthlyDOWTrigger => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetMonthlyDOW")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMonthlyDate(value: IMonthlyDateTrigger => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetMonthlyDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetWeekly(value: IWeeklyTrigger => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetWeekly")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withType(value: MFTriggerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeekly(value: IWeeklyTrigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Weekly")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

