package typingsSlinky.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceGraphRequest extends js.Object {
  /**
    * The end of the timeframe for which to generate a graph.
    */
  var EndTime: js.Date = js.native
  /**
    * The ARN of a group to generate a graph based on.
    */
  var GroupARN: js.UndefOr[typingsSlinky.awsDashSdk.clientsXrayMod.GroupARN] = js.native
  /**
    * The name of a group to generate a graph based on.
    */
  var GroupName: js.UndefOr[typingsSlinky.awsDashSdk.clientsXrayMod.GroupName] = js.native
  /**
    * Pagination token. Not used.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The start of the time frame for which to generate a graph.
    */
  var StartTime: js.Date = js.native
}

object GetServiceGraphRequest {
  @scala.inline
  def apply(
    EndTime: js.Date,
    StartTime: js.Date,
    GroupARN: GroupARN = null,
    GroupName: GroupName = null,
    NextToken: String = null
  ): GetServiceGraphRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    if (GroupARN != null) __obj.updateDynamic("GroupARN")(GroupARN.asInstanceOf[js.Any])
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceGraphRequest]
  }
}

