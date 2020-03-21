package typingsSlinky.awsSdk

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
    * The action name prefix.
    */
  var ActionPrefix: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.ActionPrefix] = js.native
  /**
    * The alarm name prefix. If this parameter is specified, you cannot specify AlarmNames.
    */
  var AlarmNamePrefix: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.AlarmNamePrefix] = js.native
  /**
    * The names of the alarms.
    */
  var AlarmNames: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.AlarmNames] = js.native
  /**
    * The maximum number of alarm descriptions to retrieve.
    */
  var MaxRecords: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.MaxRecords] = js.native
  /**
    * The token returned by a previous call to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.NextToken] = js.native
  /**
    * The state value to be used in matching alarms.
    */
  var StateValue: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.StateValue] = js.native
}

