package typingsSlinky.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterMember extends js.Object {
  /**
    * Specifies the status of the DB cluster parameter group for this member of the DB cluster.
    */
  var DBClusterParameterGroupStatus: js.UndefOr[String] = js.native
  /**
    * Specifies the instance identifier for this member of the DB cluster.
    */
  var DBInstanceIdentifier: js.UndefOr[String] = js.native
  /**
    * Value that is true if the cluster member is the primary instance for the DB cluster and false otherwise.
    */
  var IsClusterWriter: js.UndefOr[Boolean] = js.native
  /**
    * A value that specifies the order in which a Read Replica is promoted to the primary instance after a failure of the existing primary instance.
    */
  var PromotionTier: js.UndefOr[IntegerOptional] = js.native
}

object DBClusterMember {
  @scala.inline
  def apply(): DBClusterMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterMember]
  }
  @scala.inline
  implicit class DBClusterMemberOps[Self <: DBClusterMember] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBClusterParameterGroupStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterParameterGroupStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBClusterParameterGroupStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterParameterGroupStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withDBInstanceIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBInstanceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBInstanceIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBInstanceIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withIsClusterWriter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsClusterWriter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsClusterWriter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsClusterWriter")(js.undefined)
        ret
    }
    @scala.inline
    def withPromotionTier(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PromotionTier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromotionTier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PromotionTier")(js.undefined)
        ret
    }
  }
  
}

