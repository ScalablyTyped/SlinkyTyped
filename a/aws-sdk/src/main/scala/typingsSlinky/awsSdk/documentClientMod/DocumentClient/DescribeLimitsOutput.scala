package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLimitsOutput extends js.Object {
  /**
    * The maximum total read capacity units that your account allows you to provision across all of your tables in this Region.
    */
  var AccountMaxReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
  /**
    * The maximum total write capacity units that your account allows you to provision across all of your tables in this Region.
    */
  var AccountMaxWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
  /**
    * The maximum read capacity units that your account allows you to provision for a new table that you are creating in this Region, including the read capacity units provisioned for its global secondary indexes (GSIs).
    */
  var TableMaxReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
  /**
    * The maximum write capacity units that your account allows you to provision for a new table that you are creating in this Region, including the write capacity units provisioned for its global secondary indexes (GSIs).
    */
  var TableMaxWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
}

object DescribeLimitsOutput {
  @scala.inline
  def apply(): DescribeLimitsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLimitsOutput]
  }
  @scala.inline
  implicit class DescribeLimitsOutputOps[Self <: DescribeLimitsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountMaxReadCapacityUnits(value: PositiveLongObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountMaxReadCapacityUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountMaxReadCapacityUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountMaxReadCapacityUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withAccountMaxWriteCapacityUnits(value: PositiveLongObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountMaxWriteCapacityUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountMaxWriteCapacityUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountMaxWriteCapacityUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withTableMaxReadCapacityUnits(value: PositiveLongObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableMaxReadCapacityUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableMaxReadCapacityUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableMaxReadCapacityUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withTableMaxWriteCapacityUnits(value: PositiveLongObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableMaxWriteCapacityUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableMaxWriteCapacityUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableMaxWriteCapacityUnits")(js.undefined)
        ret
    }
  }
  
}

