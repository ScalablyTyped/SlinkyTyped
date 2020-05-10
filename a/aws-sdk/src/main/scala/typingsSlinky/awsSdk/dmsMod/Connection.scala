package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends js.Object {
  /**
    * The ARN string that uniquely identifies the endpoint.
    */
  var EndpointArn: js.UndefOr[String] = js.native
  /**
    * The identifier of the endpoint. Identifiers must begin with a letter and must contain only ASCII letters, digits, and hyphens. They can't end with a hyphen or contain two consecutive hyphens.
    */
  var EndpointIdentifier: js.UndefOr[String] = js.native
  /**
    * The error message when the connection last failed.
    */
  var LastFailureMessage: js.UndefOr[String] = js.native
  /**
    * The ARN of the replication instance.
    */
  var ReplicationInstanceArn: js.UndefOr[String] = js.native
  /**
    * The replication instance identifier. This parameter is stored as a lowercase string.
    */
  var ReplicationInstanceIdentifier: js.UndefOr[String] = js.native
  /**
    * The connection status.
    */
  var Status: js.UndefOr[String] = js.native
}

object Connection {
  @scala.inline
  def apply(): Connection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connection]
  }
  @scala.inline
  implicit class ConnectionOps[Self <: Connection] (val x: Self) extends AnyVal {
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
    def withEndpointIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointIdentifier")(js.undefined)
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
    def withReplicationInstanceIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationInstanceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationInstanceIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationInstanceIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
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

