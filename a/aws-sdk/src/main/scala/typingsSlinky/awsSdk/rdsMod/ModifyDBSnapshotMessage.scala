package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyDBSnapshotMessage extends js.Object {
  /**
    * The identifier of the DB snapshot to modify.
    */
  var DBSnapshotIdentifier: String = js.native
  /**
    * The engine version to upgrade the DB snapshot to.  The following are the database engines and engine versions that are available when you upgrade a DB snapshot.   MySQL     5.5.46 (supported for 5.1 DB snapshots)    Oracle     12.1.0.2.v8 (supported for 12.1.0.1 DB snapshots)    11.2.0.4.v12 (supported for 11.2.0.2 DB snapshots)    11.2.0.4.v11 (supported for 11.2.0.3 DB snapshots)    PostgreSQL  For the list of engine versions that are available for upgrading a DB snapshot, see  Upgrading the PostgreSQL DB Engine for Amazon RDS. 
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * The option group to identify with the upgraded DB snapshot.  You can specify this parameter when you upgrade an Oracle DB snapshot. The same option group considerations apply when upgrading a DB snapshot as when upgrading a DB instance. For more information, see Option Group Considerations in the Amazon RDS User Guide. 
    */
  var OptionGroupName: js.UndefOr[String] = js.native
}

object ModifyDBSnapshotMessage {
  @scala.inline
  def apply(DBSnapshotIdentifier: String): ModifyDBSnapshotMessage = {
    val __obj = js.Dynamic.literal(DBSnapshotIdentifier = DBSnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBSnapshotMessage]
  }
  @scala.inline
  implicit class ModifyDBSnapshotMessageOps[Self <: ModifyDBSnapshotMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBSnapshotIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSnapshotIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEngineVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionGroupName")(js.undefined)
        ret
    }
  }
  
}

