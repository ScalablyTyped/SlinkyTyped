package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBProxyTarget extends js.Object {
  /**
    * The writer endpoint for the RDS DB instance or Aurora DB cluster.
    */
  var Endpoint: js.UndefOr[String] = js.native
  /**
    * The port that the RDS Proxy uses to connect to the target RDS DB instance or Aurora DB cluster.
    */
  var Port: js.UndefOr[Integer] = js.native
  /**
    * The identifier representing the target. It can be the instance identifier for an RDS DB instance, or the cluster identifier for an Aurora DB cluster.
    */
  var RdsResourceId: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the RDS DB instance or Aurora DB cluster.
    */
  var TargetArn: js.UndefOr[String] = js.native
  /**
    * The DB cluster identifier when the target represents an Aurora DB cluster. This field is blank when the target represents an RDS DB instance.
    */
  var TrackedClusterId: js.UndefOr[String] = js.native
  /**
    * Specifies the kind of database, such as an RDS DB instance or an Aurora DB cluster, that the target represents.
    */
  var Type: js.UndefOr[TargetType] = js.native
}

object DBProxyTarget {
  @scala.inline
  def apply(): DBProxyTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBProxyTarget]
  }
  @scala.inline
  implicit class DBProxyTargetOps[Self <: DBProxyTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(js.undefined)
        ret
    }
    @scala.inline
    def withRdsResourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RdsResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRdsResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RdsResourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetArn")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackedClusterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrackedClusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackedClusterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrackedClusterId")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: TargetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

