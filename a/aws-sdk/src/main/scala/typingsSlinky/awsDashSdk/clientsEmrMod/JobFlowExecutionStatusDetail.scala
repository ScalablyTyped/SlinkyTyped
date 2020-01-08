package typingsSlinky.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobFlowExecutionStatusDetail extends js.Object {
  /**
    * The creation date and time of the job flow.
    */
  var CreationDateTime: js.Date = js.native
  /**
    * The completion date and time of the job flow.
    */
  var EndDateTime: js.UndefOr[js.Date] = js.native
  /**
    * Description of the job flow last changed state.
    */
  var LastStateChangeReason: js.UndefOr[XmlString] = js.native
  /**
    * The date and time when the job flow was ready to start running bootstrap actions.
    */
  var ReadyDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The start date and time of the job flow.
    */
  var StartDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The state of the job flow.
    */
  var State: JobFlowExecutionState = js.native
}

object JobFlowExecutionStatusDetail {
  @scala.inline
  def apply(
    CreationDateTime: js.Date,
    State: JobFlowExecutionState,
    EndDateTime: js.Date = null,
    LastStateChangeReason: XmlString = null,
    ReadyDateTime: js.Date = null,
    StartDateTime: js.Date = null
  ): JobFlowExecutionStatusDetail = {
    val __obj = js.Dynamic.literal(CreationDateTime = CreationDateTime.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    if (EndDateTime != null) __obj.updateDynamic("EndDateTime")(EndDateTime.asInstanceOf[js.Any])
    if (LastStateChangeReason != null) __obj.updateDynamic("LastStateChangeReason")(LastStateChangeReason.asInstanceOf[js.Any])
    if (ReadyDateTime != null) __obj.updateDynamic("ReadyDateTime")(ReadyDateTime.asInstanceOf[js.Any])
    if (StartDateTime != null) __obj.updateDynamic("StartDateTime")(StartDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobFlowExecutionStatusDetail]
  }
}

