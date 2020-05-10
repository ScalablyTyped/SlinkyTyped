package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyCurrentDBClusterCapacityMessage extends js.Object {
  /**
    * The DB cluster capacity. When you change the capacity of a paused Aurora Serverless DB cluster, it automatically resumes. Constraints:   For Aurora MySQL, valid capacity values are 1, 2, 4, 8, 16, 32, 64, 128, and 256.   For Aurora PostgreSQL, valid capacity values are 2, 4, 8, 16, 32, 64, 192, and 384.  
    */
  var Capacity: js.UndefOr[IntegerOptional] = js.native
  /**
    * The DB cluster identifier for the cluster being modified. This parameter isn't case-sensitive. Constraints:   Must match the identifier of an existing DB cluster.  
    */
  var DBClusterIdentifier: String = js.native
  /**
    * The amount of time, in seconds, that Aurora Serverless tries to find a scaling point to perform seamless scaling before enforcing the timeout action. The default is 300.   Value must be from 10 through 600.  
    */
  var SecondsBeforeTimeout: js.UndefOr[IntegerOptional] = js.native
  /**
    * The action to take when the timeout is reached, either ForceApplyCapacityChange or RollbackCapacityChange.  ForceApplyCapacityChange, the default, sets the capacity to the specified value as soon as possible.  RollbackCapacityChange ignores the capacity change if a scaling point isn't found in the timeout period.
    */
  var TimeoutAction: js.UndefOr[String] = js.native
}

object ModifyCurrentDBClusterCapacityMessage {
  @scala.inline
  def apply(DBClusterIdentifier: String): ModifyCurrentDBClusterCapacityMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyCurrentDBClusterCapacityMessage]
  }
  @scala.inline
  implicit class ModifyCurrentDBClusterCapacityMessageOps[Self <: ModifyCurrentDBClusterCapacityMessage] (val x: Self) extends AnyVal {
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
    def withCapacity(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Capacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Capacity")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondsBeforeTimeout(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecondsBeforeTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondsBeforeTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecondsBeforeTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeoutAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeoutAction")(js.undefined)
        ret
    }
  }
  
}

