package typingsSlinky.awsSdk.apigatewaymanagementapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectionResponse extends js.Object {
  /**
    * The time in ISO 8601 format for when the connection was established.
    */
  var ConnectedAt: js.UndefOr[js.Date] = js.native
  var Identity: js.UndefOr[typingsSlinky.awsSdk.apigatewaymanagementapiMod.Identity] = js.native
  /**
    * The time in ISO 8601 format for when the connection was last active.
    */
  var LastActiveAt: js.UndefOr[js.Date] = js.native
}

object GetConnectionResponse {
  @scala.inline
  def apply(ConnectedAt: js.Date = null, Identity: Identity = null, LastActiveAt: js.Date = null): GetConnectionResponse = {
    val __obj = js.Dynamic.literal()
    if (ConnectedAt != null) __obj.updateDynamic("ConnectedAt")(ConnectedAt.asInstanceOf[js.Any])
    if (Identity != null) __obj.updateDynamic("Identity")(Identity.asInstanceOf[js.Any])
    if (LastActiveAt != null) __obj.updateDynamic("LastActiveAt")(LastActiveAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectionResponse]
  }
}

