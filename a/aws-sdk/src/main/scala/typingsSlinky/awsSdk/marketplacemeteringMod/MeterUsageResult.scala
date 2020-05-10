package typingsSlinky.awsSdk.marketplacemeteringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeterUsageResult extends js.Object {
  /**
    * Metering record id.
    */
  var MeteringRecordId: js.UndefOr[String] = js.native
}

object MeterUsageResult {
  @scala.inline
  def apply(): MeterUsageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeterUsageResult]
  }
  @scala.inline
  implicit class MeterUsageResultOps[Self <: MeterUsageResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMeteringRecordId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MeteringRecordId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeteringRecordId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MeteringRecordId")(js.undefined)
        ret
    }
  }
  
}

