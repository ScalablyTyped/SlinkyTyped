package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionedThroughputOverride extends js.Object {
  /**
    * Replica-specific read capacity units. If not specified, uses the source table's read capacity settings.
    */
  var ReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
}

object ProvisionedThroughputOverride {
  @scala.inline
  def apply(): ProvisionedThroughputOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedThroughputOverride]
  }
  @scala.inline
  implicit class ProvisionedThroughputOverrideOps[Self <: ProvisionedThroughputOverride] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReadCapacityUnits(value: PositiveLongObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadCapacityUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadCapacityUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadCapacityUnits")(js.undefined)
        ret
    }
  }
  
}

