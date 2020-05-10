package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopDBInstanceMessage extends js.Object {
  /**
    *  The user-supplied instance identifier. 
    */
  var DBInstanceIdentifier: String = js.native
  /**
    *  The user-supplied instance identifier of the DB Snapshot created immediately before the DB instance is stopped. 
    */
  var DBSnapshotIdentifier: js.UndefOr[String] = js.native
}

object StopDBInstanceMessage {
  @scala.inline
  def apply(DBInstanceIdentifier: String): StopDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDBInstanceMessage]
  }
  @scala.inline
  implicit class StopDBInstanceMessageOps[Self <: StopDBInstanceMessage] (val x: Self) extends AnyVal {
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
    def withDBSnapshotIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSnapshotIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBSnapshotIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSnapshotIdentifier")(js.undefined)
        ret
    }
  }
  
}

