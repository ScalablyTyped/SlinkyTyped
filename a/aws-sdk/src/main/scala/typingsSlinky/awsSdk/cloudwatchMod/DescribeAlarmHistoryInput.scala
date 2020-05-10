package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAlarmHistoryInput extends js.Object {
  /**
    * The name of the alarm.
    */
  var AlarmName: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.AlarmName] = js.native
  /**
    * Use this parameter to specify whether you want the operation to return metric alarms or composite alarms. If you omit this parameter, only metric alarms are returned.
    */
  var AlarmTypes: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.AlarmTypes] = js.native
  /**
    * The ending date to retrieve alarm history.
    */
  var EndDate: js.UndefOr[js.Date] = js.native
  /**
    * The type of alarm histories to retrieve.
    */
  var HistoryItemType: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.HistoryItemType] = js.native
  /**
    * The maximum number of alarm history records to retrieve.
    */
  var MaxRecords: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.MaxRecords] = js.native
  /**
    * The token returned by a previous call to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.NextToken] = js.native
  /**
    * Specified whether to return the newest or oldest alarm history first. Specify TimestampDescending to have the newest event history returned first, and specify TimestampAscending to have the oldest history returned first.
    */
  var ScanBy: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.ScanBy] = js.native
  /**
    * The starting date to retrieve alarm history.
    */
  var StartDate: js.UndefOr[js.Date] = js.native
}

object DescribeAlarmHistoryInput {
  @scala.inline
  def apply(): DescribeAlarmHistoryInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAlarmHistoryInput]
  }
  @scala.inline
  implicit class DescribeAlarmHistoryInputOps[Self <: DescribeAlarmHistoryInput] (val x: Self) extends AnyVal {
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
    def withAlarmTypes(value: AlarmTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlarmTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndDate")(js.undefined)
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
    def withMaxRecords(value: MaxRecords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withScanBy(value: ScanBy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScanBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScanBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScanBy")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartDate")(js.undefined)
        ret
    }
  }
  
}

