package typingsSlinky.pulumiAws.dynamodbMixinsMod

import typingsSlinky.pulumiAws.pulumiAwsStrings.LATEST
import typingsSlinky.pulumiAws.pulumiAwsStrings.TRIM_HORIZON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableEventSubscriptionArgs extends js.Object {
  /**
    * The largest number of records that Lambda will retrieve from your event source at the time of invocation. Defaults to `100` for DynamoDB.
    */
  val batchSize: js.UndefOr[Double] = js.native
  /**
    * The position in the stream where AWS Lambda should start reading. Must be one of either `TRIM_HORIZON` or `LATEST`.
    */
  val startingPosition: TRIM_HORIZON | LATEST = js.native
}

object TableEventSubscriptionArgs {
  @scala.inline
  def apply(startingPosition: TRIM_HORIZON | LATEST): TableEventSubscriptionArgs = {
    val __obj = js.Dynamic.literal(startingPosition = startingPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableEventSubscriptionArgs]
  }
  @scala.inline
  implicit class TableEventSubscriptionArgsOps[Self <: TableEventSubscriptionArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStartingPosition(value: TRIM_HORIZON | LATEST): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatchSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchSize")(js.undefined)
        ret
    }
  }
  
}

