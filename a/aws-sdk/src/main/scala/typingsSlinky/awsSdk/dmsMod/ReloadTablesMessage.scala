package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReloadTablesMessage extends js.Object {
  /**
    * Options for reload. Specify data-reload to reload the data and re-validate it if validation is enabled. Specify validate-only to re-validate the table. This option applies only when validation is enabled for the task.  Valid values: data-reload, validate-only Default value is data-reload.
    */
  var ReloadOption: js.UndefOr[ReloadOptionValue] = js.native
  /**
    * The Amazon Resource Name (ARN) of the replication task. 
    */
  var ReplicationTaskArn: String = js.native
  /**
    * The name and schema of the table to be reloaded. 
    */
  var TablesToReload: TableListToReload = js.native
}

object ReloadTablesMessage {
  @scala.inline
  def apply(ReplicationTaskArn: String, TablesToReload: TableListToReload): ReloadTablesMessage = {
    val __obj = js.Dynamic.literal(ReplicationTaskArn = ReplicationTaskArn.asInstanceOf[js.Any], TablesToReload = TablesToReload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReloadTablesMessage]
  }
  @scala.inline
  implicit class ReloadTablesMessageOps[Self <: ReloadTablesMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplicationTaskArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationTaskArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTablesToReload(value: TableListToReload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TablesToReload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReloadOption(value: ReloadOptionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReloadOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReloadOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReloadOption")(js.undefined)
        ret
    }
  }
  
}

