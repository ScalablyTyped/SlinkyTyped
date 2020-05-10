package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterCapacityInfo extends js.Object {
  /**
    * The current capacity of the DB cluster.
    */
  var CurrentCapacity: js.UndefOr[IntegerOptional] = js.native
  /**
    * A user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB cluster. 
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * A value that specifies the capacity that the DB cluster scales to next.
    */
  var PendingCapacity: js.UndefOr[IntegerOptional] = js.native
  /**
    * The number of seconds before a call to ModifyCurrentDBClusterCapacity times out.
    */
  var SecondsBeforeTimeout: js.UndefOr[IntegerOptional] = js.native
  /**
    * The timeout action of a call to ModifyCurrentDBClusterCapacity, either ForceApplyCapacityChange or RollbackCapacityChange.
    */
  var TimeoutAction: js.UndefOr[String] = js.native
}

object DBClusterCapacityInfo {
  @scala.inline
  def apply(): DBClusterCapacityInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterCapacityInfo]
  }
  @scala.inline
  implicit class DBClusterCapacityInfoOps[Self <: DBClusterCapacityInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentCapacity(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentCapacity")(js.undefined)
        ret
    }
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
    def withPendingCapacity(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PendingCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PendingCapacity")(js.undefined)
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

