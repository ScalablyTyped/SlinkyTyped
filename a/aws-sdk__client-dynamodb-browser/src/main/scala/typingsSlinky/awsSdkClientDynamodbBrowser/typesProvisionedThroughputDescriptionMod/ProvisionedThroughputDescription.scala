package typingsSlinky.awsSdkClientDynamodbBrowser.typesProvisionedThroughputDescriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionedThroughputDescription extends js.Object {
  /**
    * <p>The date and time of the last provisioned throughput decrease for this table.</p>
    */
  var LastDecreaseDateTime: js.UndefOr[js.Date | String | Double] = js.native
  /**
    * <p>The date and time of the last provisioned throughput increase for this table.</p>
    */
  var LastIncreaseDateTime: js.UndefOr[js.Date | String | Double] = js.native
  /**
    * <p>The number of provisioned throughput decreases for this table during this UTC calendar day. For current maximums on provisioned throughput decreases, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var NumberOfDecreasesToday: js.UndefOr[Double] = js.native
  /**
    * <p>The maximum number of strongly consistent reads consumed per second before DynamoDB returns a <code>ThrottlingException</code>. Eventually consistent reads require less effort than strongly consistent reads, so a setting of 50 <code>ReadCapacityUnits</code> per second provides 100 eventually consistent <code>ReadCapacityUnits</code> per second.</p>
    */
  var ReadCapacityUnits: js.UndefOr[Double] = js.native
  /**
    * <p>The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException</code>.</p>
    */
  var WriteCapacityUnits: js.UndefOr[Double] = js.native
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
    def withLastDecreaseDateTimeDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastDecreaseDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastDecreaseDateTime(value: js.Date | String | Double): Self = {
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
    def withLastIncreaseDateTimeDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastIncreaseDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastIncreaseDateTime(value: js.Date | String | Double): Self = {
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
    def withNumberOfDecreasesToday(value: Double): Self = {
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
    def withReadCapacityUnits(value: Double): Self = {
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
    def withWriteCapacityUnits(value: Double): Self = {
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

