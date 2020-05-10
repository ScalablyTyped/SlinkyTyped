package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventBatchRecordFailure extends js.Object {
  /**
    * The cause for the update failure.
    * Possible values are:
    * - "TOO_LARGE": A batch request was issued with more events than are allowed in a single batch.
    * - "TIME_PERIOD_EXPIRED": A batch was sent with data too far in the past to record.
    * - "TIME_PERIOD_SHORT": A batch was sent with a time range that was too short.
    * - "TIME_PERIOD_LONG": A batch was sent with a time range that was too long.
    * - "ALREADY_UPDATED": An attempt was made to record a batch of data which was already seen.
    * - "RECORD_RATE_HIGH": An attempt was made to record data faster than the server will apply updates.
    */
  var failureCause: js.UndefOr[String] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#eventBatchRecordFailure. */
  var kind: js.UndefOr[String] = js.native
  /** The time range which was rejected; empty for a request-wide failure. */
  var range: js.UndefOr[EventPeriodRange] = js.native
}

object EventBatchRecordFailure {
  @scala.inline
  def apply(): EventBatchRecordFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventBatchRecordFailure]
  }
  @scala.inline
  implicit class EventBatchRecordFailureOps[Self <: EventBatchRecordFailure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailureCause(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureCause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureCause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureCause")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: EventPeriodRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
  }
  
}

