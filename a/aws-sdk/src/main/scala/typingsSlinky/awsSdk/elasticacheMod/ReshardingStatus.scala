package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReshardingStatus extends js.Object {
  /**
    * Represents the progress of an online resharding operation.
    */
  var SlotMigration: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.SlotMigration] = js.native
}

object ReshardingStatus {
  @scala.inline
  def apply(): ReshardingStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReshardingStatus]
  }
  @scala.inline
  implicit class ReshardingStatusOps[Self <: ReshardingStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSlotMigration(value: SlotMigration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlotMigration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlotMigration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlotMigration")(js.undefined)
        ret
    }
  }
  
}

