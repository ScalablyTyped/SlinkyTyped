package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlarmHistoryItem extends js.Object {
  /**
    * The descriptive name for the alarm.
    */
  var AlarmName: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.AlarmName] = js.native
  /**
    * The type of alarm, either metric alarm or composite alarm.
    */
  var AlarmType: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.AlarmType] = js.native
  /**
    * Data about the alarm, in JSON format.
    */
  var HistoryData: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.HistoryData] = js.native
  /**
    * The type of alarm history item.
    */
  var HistoryItemType: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.HistoryItemType] = js.native
  /**
    * A summary of the alarm history, in text format.
    */
  var HistorySummary: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.HistorySummary] = js.native
  /**
    * The time stamp for the alarm history item.
    */
  var Timestamp: js.UndefOr[js.Date] = js.native
}

object AlarmHistoryItem {
  @scala.inline
  def apply(): AlarmHistoryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlarmHistoryItem]
  }
  @scala.inline
  implicit class AlarmHistoryItemOps[Self <: AlarmHistoryItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlarmName(value: AlarmName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlarmName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmName")(js.undefined)
        ret
    }
    @scala.inline
    def withAlarmType(value: AlarmType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlarmType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmType")(js.undefined)
        ret
    }
    @scala.inline
    def withHistoryData(value: HistoryData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HistoryData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistoryData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HistoryData")(js.undefined)
        ret
    }
    @scala.inline
    def withHistoryItemType(value: HistoryItemType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HistoryItemType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistoryItemType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HistoryItemType")(js.undefined)
        ret
    }
    @scala.inline
    def withHistorySummary(value: HistorySummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HistorySummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistorySummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HistorySummary")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(js.undefined)
        ret
    }
  }
  
}

