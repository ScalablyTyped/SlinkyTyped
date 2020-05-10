package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a batch update failure resource.
  */
@js.native
trait SchemaEventBatchRecordFailure extends js.Object {
  /**
    * The cause for the update failure. Possible values are:   -
    * &quot;TOO_LARGE&quot;: A batch request was issued with more events than
    * are allowed in a single batch.  - &quot;TIME_PERIOD_EXPIRED&quot;: A
    * batch was sent with data too far in the past to record.  -
    * &quot;TIME_PERIOD_SHORT&quot;: A batch was sent with a time range that
    * was too short.  - &quot;TIME_PERIOD_LONG&quot;: A batch was sent with a
    * time range that was too long.  - &quot;ALREADY_UPDATED&quot;: An attempt
    * was made to record a batch of data which was already seen.  -
    * &quot;RECORD_RATE_HIGH&quot;: An attempt was made to record data faster
    * than the server will apply updates.
    */
  var failureCause: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#eventBatchRecordFailure.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The time range which was rejected; empty for a request-wide failure.
    */
  var range: js.UndefOr[SchemaEventPeriodRange] = js.native
}

object SchemaEventBatchRecordFailure {
  @scala.inline
  def apply(): SchemaEventBatchRecordFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventBatchRecordFailure]
  }
  @scala.inline
  implicit class SchemaEventBatchRecordFailureOps[Self <: SchemaEventBatchRecordFailure] (val x: Self) extends AnyVal {
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
    def withRange(value: SchemaEventPeriodRange): Self = {
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

