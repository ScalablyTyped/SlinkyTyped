package typingsSlinky.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeltaSyncConfig extends js.Object {
  /**
    * The number of minutes an Item is stored in the datasource.
    */
  var baseTableTTL: js.UndefOr[Long] = js.native
  /**
    * The Delta Sync table name.
    */
  var deltaSyncTableName: js.UndefOr[String] = js.native
  /**
    * The number of minutes a Delta Sync log entry is stored in the Delta Sync table.
    */
  var deltaSyncTableTTL: js.UndefOr[Long] = js.native
}

object DeltaSyncConfig {
  @scala.inline
  def apply(): DeltaSyncConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeltaSyncConfig]
  }
  @scala.inline
  implicit class DeltaSyncConfigOps[Self <: DeltaSyncConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseTableTTL(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseTableTTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseTableTTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseTableTTL")(js.undefined)
        ret
    }
    @scala.inline
    def withDeltaSyncTableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaSyncTableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeltaSyncTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaSyncTableName")(js.undefined)
        ret
    }
    @scala.inline
    def withDeltaSyncTableTTL(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaSyncTableTTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeltaSyncTableTTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaSyncTableTTL")(js.undefined)
        ret
    }
  }
  
}

