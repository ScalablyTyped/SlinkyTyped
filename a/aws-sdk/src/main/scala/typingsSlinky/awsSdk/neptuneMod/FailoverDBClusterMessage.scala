package typingsSlinky.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailoverDBClusterMessage extends js.Object {
  /**
    * A DB cluster identifier to force a failover for. This parameter is not case-sensitive. Constraints:   Must match the identifier of an existing DBCluster.  
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * The name of the instance to promote to the primary instance. You must specify the instance identifier for an Read Replica in the DB cluster. For example, mydbcluster-replica1.
    */
  var TargetDBInstanceIdentifier: js.UndefOr[String] = js.native
}

object FailoverDBClusterMessage {
  @scala.inline
  def apply(): FailoverDBClusterMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailoverDBClusterMessage]
  }
  @scala.inline
  implicit class FailoverDBClusterMessageOps[Self <: FailoverDBClusterMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBClusterIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBClusterIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetDBInstanceIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetDBInstanceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetDBInstanceIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetDBInstanceIdentifier")(js.undefined)
        ret
    }
  }
  
}

