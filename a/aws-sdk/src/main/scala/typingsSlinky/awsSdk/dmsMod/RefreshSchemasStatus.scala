package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshSchemasStatus extends js.Object {
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
    */
  var EndpointArn: js.UndefOr[String] = js.native
  /**
    * The last failure message for the schema.
    */
  var LastFailureMessage: js.UndefOr[String] = js.native
  /**
    * The date the schema was last refreshed.
    */
  var LastRefreshDate: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  var ReplicationInstanceArn: js.UndefOr[String] = js.native
  /**
    * The status of the schema.
    */
  var Status: js.UndefOr[RefreshSchemasStatusTypeValue] = js.native
}

object RefreshSchemasStatus {
  @scala.inline
  def apply(): RefreshSchemasStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshSchemasStatus]
  }
  @scala.inline
  implicit class RefreshSchemasStatusOps[Self <: RefreshSchemasStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpointArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointArn")(js.undefined)
        ret
    }
    @scala.inline
    def withLastFailureMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastFailureMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastFailureMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastFailureMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withLastRefreshDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastRefreshDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastRefreshDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastRefreshDate")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationInstanceArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationInstanceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationInstanceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationInstanceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: RefreshSchemasStatusTypeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

