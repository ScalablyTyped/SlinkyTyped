package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGlobalTableSettingsOutput extends js.Object {
  /**
    * The name of the global table.
    */
  var GlobalTableName: js.UndefOr[TableName] = js.native
  /**
    * The Region-specific settings for the global table.
    */
  var ReplicaSettings: js.UndefOr[ReplicaSettingsDescriptionList] = js.native
}

object UpdateGlobalTableSettingsOutput {
  @scala.inline
  def apply(): UpdateGlobalTableSettingsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGlobalTableSettingsOutput]
  }
  @scala.inline
  implicit class UpdateGlobalTableSettingsOutputOps[Self <: UpdateGlobalTableSettingsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobalTableName(value: TableName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableName")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicaSettings(value: ReplicaSettingsDescriptionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicaSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaSettings")(js.undefined)
        ret
    }
  }
  
}

