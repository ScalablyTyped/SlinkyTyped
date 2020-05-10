package typingsSlinky.awsSdk

import typingsSlinky.awsSdk.cloudwatchMod.ActionPrefix
import typingsSlinky.awsSdk.cloudwatchMod.AlarmName
import typingsSlinky.awsSdk.cloudwatchMod.AlarmNamePrefix
import typingsSlinky.awsSdk.cloudwatchMod.AlarmNames
import typingsSlinky.awsSdk.cloudwatchMod.AlarmTypes
import typingsSlinky.awsSdk.cloudwatchMod.MaxRecords
import typingsSlinky.awsSdk.cloudwatchMod.NextToken
import typingsSlinky.awsSdk.cloudwatchMod.StateValue
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/cloudwatch.DescribeAlarmsInput & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeAlarmsInputwaiter extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * Use this parameter to filter the results of the operation to only those alarms that use a certain alarm action. For example, you could specify the ARN of an SNS topic to find all alarms that send notifications to that topic.
    */
  var ActionPrefix: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.ActionPrefix] = js.native
  /**
    * An alarm name prefix. If you specify this parameter, you receive information about all alarms that have names that start with this prefix. If this parameter is specified, you cannot specify AlarmNames.
    */
  var AlarmNamePrefix: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.AlarmNamePrefix] = js.native
  /**
    * The names of the alarms to retrieve information about.
    */
  var AlarmNames: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.AlarmNames] = js.native
  /**
    * Use this parameter to specify whether you want the operation to return metric alarms or composite alarms. If you omit this parameter, only metric alarms are returned.
    */
  var AlarmTypes: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.AlarmTypes] = js.native
  /**
    * If you use this parameter and specify the name of a composite alarm, the operation returns information about the "children" alarms of the alarm you specify. These are the metric alarms and composite alarms referenced in the AlarmRule field of the composite alarm that you specify in ChildrenOfAlarmName. Information about the composite alarm that you name in ChildrenOfAlarmName is not returned. If you specify ChildrenOfAlarmName, you cannot specify any other parameters in the request except for MaxRecords and NextToken. If you do so, you will receive a validation error.  Only the Alarm Name, ARN, StateValue (OK/ALARM/INSUFFICIENT_DATA), and StateUpdatedTimestamp information are returned by this operation when you use this parameter. To get complete information about these alarms, perform another DescribeAlarms operation and specify the parent alarm names in the AlarmNames parameter. 
    */
  var ChildrenOfAlarmName: js.UndefOr[AlarmName] = js.native
  /**
    * The maximum number of alarm descriptions to retrieve.
    */
  var MaxRecords: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.MaxRecords] = js.native
  /**
    * The token returned by a previous call to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.NextToken] = js.native
  /**
    * If you use this parameter and specify the name of a metric or composite alarm, the operation returns information about the "parent" alarms of the alarm you specify. These are the composite alarms that have AlarmRule parameters that reference the alarm named in ParentsOfAlarmName. Information about the alarm that you specify in ParentsOfAlarmName is not returned. If you specify ParentsOfAlarmName, you cannot specify any other parameters in the request except for MaxRecords and NextToken. If you do so, you will receive a validation error.  Only the Alarm Name and ARN are returned by this operation when you use this parameter. To get complete information about these alarms, perform another DescribeAlarms operation and specify the parent alarm names in the AlarmNames parameter. 
    */
  var ParentsOfAlarmName: js.UndefOr[AlarmName] = js.native
  /**
    * Specify this parameter to receive information only about alarms that are currently in the state that you specify.
    */
  var StateValue: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.StateValue] = js.native
}

object DescribeAlarmsInputwaiter {
  @scala.inline
  def apply(): DescribeAlarmsInputwaiter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAlarmsInputwaiter]
  }
  @scala.inline
  implicit class DescribeAlarmsInputwaiterOps[Self <: DescribeAlarmsInputwaiter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$waiter(value: WaiterConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$waiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(js.undefined)
        ret
    }
    @scala.inline
    def withActionPrefix(value: ActionPrefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withAlarmNamePrefix(value: AlarmNamePrefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmNamePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlarmNamePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmNamePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withAlarmNames(value: AlarmNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlarmNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmNames")(js.undefined)
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
    def withChildrenOfAlarmName(value: AlarmName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChildrenOfAlarmName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildrenOfAlarmName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChildrenOfAlarmName")(js.undefined)
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
    def withParentsOfAlarmName(value: AlarmName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentsOfAlarmName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentsOfAlarmName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentsOfAlarmName")(js.undefined)
        ret
    }
    @scala.inline
    def withStateValue(value: StateValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateValue")(js.undefined)
        ret
    }
  }
  
}

