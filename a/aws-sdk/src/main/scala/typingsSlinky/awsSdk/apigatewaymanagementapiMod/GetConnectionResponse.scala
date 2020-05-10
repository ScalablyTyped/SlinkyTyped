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
  def apply(): GetConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectionResponse]
  }
  @scala.inline
  implicit class GetConnectionResponseOps[Self <: GetConnectionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentity(value: Identity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Identity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Identity")(js.undefined)
        ret
    }
    @scala.inline
    def withLastActiveAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastActiveAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastActiveAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastActiveAt")(js.undefined)
        ret
    }
  }
  
}

