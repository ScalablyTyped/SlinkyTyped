package typingsSlinky.pulumiAws.kinesisMixinsMod

import typingsSlinky.pulumiAws.pulumiAwsStrings.AT_TIMESTAMP
import typingsSlinky.pulumiAws.pulumiAwsStrings.LATEST
import typingsSlinky.pulumiAws.pulumiAwsStrings.TRIM_HORIZON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamEventSubscriptionArgs extends js.Object {
  /**
    * The largest number of records that Lambda will retrieve from your event source at the time of
    * invocation. Defaults to `100` for Kinesis.
    */
  val batchSize: js.UndefOr[Double] = js.native
  /**
    * The position in the stream where AWS Lambda should start reading. Must be one of either
    * `TRIM_HORIZON`, `LATEST` or `AT_TIMESTAMP`.  If `AT_TIMESTAMP` is provided,
    * [startingPositionTimestamp] must be provided as well.
    */
  val startingPosition: TRIM_HORIZON | LATEST | AT_TIMESTAMP = js.native
  /**
    * A timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of the
    * data record which to start reading when using `starting_position` set to `AT_TIMESTAMP`.
    * If a record with this exact timestamp does not exist, the next later record is chosen.
    * If the timestamp is older than the current trim horizon, the oldest available record is
    * chosen.
    */
  val startingPositionTimestamp: js.UndefOr[String] = js.native
}

object StreamEventSubscriptionArgs {
  @scala.inline
  def apply(startingPosition: TRIM_HORIZON | LATEST | AT_TIMESTAMP): StreamEventSubscriptionArgs = {
    val __obj = js.Dynamic.literal(startingPosition = startingPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamEventSubscriptionArgs]
  }
  @scala.inline
  implicit class StreamEventSubscriptionArgsOps[Self <: StreamEventSubscriptionArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStartingPosition(value: TRIM_HORIZON | LATEST | AT_TIMESTAMP): Self = {
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
    @scala.inline
    def withStartingPositionTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingPositionTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartingPositionTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingPositionTimestamp")(js.undefined)
        ret
    }
  }
  
}

