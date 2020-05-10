package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RebootDBInstanceMessage extends js.Object {
  /**
    * The DB instance identifier. This parameter is stored as a lowercase string. Constraints:   Must match the identifier of an existing DBInstance.  
    */
  var DBInstanceIdentifier: String = js.native
  /**
    *  A value that indicates whether the reboot is conducted through a Multi-AZ failover.  Constraint: You can't enable force failover if the instance isn't configured for Multi-AZ.
    */
  var ForceFailover: js.UndefOr[BooleanOptional] = js.native
}

object RebootDBInstanceMessage {
  @scala.inline
  def apply(DBInstanceIdentifier: String): RebootDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootDBInstanceMessage]
  }
  @scala.inline
  implicit class RebootDBInstanceMessageOps[Self <: RebootDBInstanceMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBInstanceIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBInstanceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceFailover(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForceFailover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceFailover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForceFailover")(js.undefined)
        ret
    }
  }
  
}

