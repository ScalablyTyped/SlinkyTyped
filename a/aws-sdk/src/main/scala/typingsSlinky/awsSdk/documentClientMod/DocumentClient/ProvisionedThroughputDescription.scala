package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionedThroughputDescription extends js.Object {
  /**
    * The date and time of the last provisioned throughput decrease for this table.
    */
  var LastDecreaseDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The date and time of the last provisioned throughput increase for this table.
    */
  var LastIncreaseDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The number of provisioned throughput decreases for this table during this UTC calendar day. For current maximums on provisioned throughput decreases, see Limits in the Amazon DynamoDB Developer Guide.
    */
  var NumberOfDecreasesToday: js.UndefOr[PositiveLongObject] = js.native
  /**
    * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException. Eventually consistent reads require less effort than strongly consistent reads, so a setting of 50 ReadCapacityUnits per second provides 100 eventually consistent ReadCapacityUnits per second.
    */
  var ReadCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.native
  /**
    * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException.
    */
  var WriteCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.native
}

object ProvisionedThroughputDescription {
  @scala.inline
  def apply(): ProvisionedThroughputDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedThroughputDescription]
  }
  @scala.inline
  implicit class ProvisionedThroughputDescriptionOps[Self <: ProvisionedThroughputDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastDecreaseDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastDecreaseDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastDecreaseDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastDecreaseDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastIncreaseDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastIncreaseDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastIncreaseDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastIncreaseDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfDecreasesToday(value: PositiveLongObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfDecreasesToday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfDecreasesToday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfDecreasesToday")(js.undefined)
        ret
    }
    @scala.inline
    def withReadCapacityUnits(value: NonNegativeLongObject): Self = {
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
    @scala.inline
    def withWriteCapacityUnits(value: NonNegativeLongObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WriteCapacityUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteCapacityUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WriteCapacityUnits")(js.undefined)
        ret
    }
  }
  
}

