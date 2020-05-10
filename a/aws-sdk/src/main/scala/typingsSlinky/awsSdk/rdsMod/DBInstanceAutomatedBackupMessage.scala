package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBInstanceAutomatedBackupMessage extends js.Object {
  /**
    *  A list of DBInstanceAutomatedBackup instances. 
    */
  var DBInstanceAutomatedBackups: js.UndefOr[DBInstanceAutomatedBackupList] = js.native
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords . 
    */
  var Marker: js.UndefOr[String] = js.native
}

object DBInstanceAutomatedBackupMessage {
  @scala.inline
  def apply(): DBInstanceAutomatedBackupMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBInstanceAutomatedBackupMessage]
  }
  @scala.inline
  implicit class DBInstanceAutomatedBackupMessageOps[Self <: DBInstanceAutomatedBackupMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBInstanceAutomatedBackups(value: DBInstanceAutomatedBackupList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBInstanceAutomatedBackups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBInstanceAutomatedBackups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBInstanceAutomatedBackups")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
  }
  
}

