package typingsSlinky.rockset.mod

import typingsSlinky.rockset.rocksetStrings.COMPLETED
import typingsSlinky.rockset.rocksetStrings.ERROR
import typingsSlinky.rockset.rocksetStrings.INITIALIZING
import typingsSlinky.rockset.rocksetStrings.PROCESSING
import typingsSlinky.rockset.rocksetStrings.WATCHING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Status extends js.Object {
  // ISO-8601 date when last error occurred
  var last_error_at: js.UndefOr[String] = js.native
  // last source item that errored
  var last_error_item: js.UndefOr[String] = js.native
  // reason for the last error
  var last_error_reason: js.UndefOr[String] = js.native
  // ISO-8601 date when source was last processed
  var last_processed_at: js.UndefOr[String] = js.native
  // last source item processed by ingester
  var last_processed_item: js.UndefOr[String] = js.native
  // state message
  var message: js.UndefOr[String] = js.native
  // ISO-8601 date when state was triggered
  var since: js.UndefOr[String] = js.native
  // Status of the Source's ingestion, one of: INITIALIZING, WATCHING, PROCESSING, COMPLETED, ERROR
  var state: js.UndefOr[INITIALIZING | WATCHING | PROCESSING | COMPLETED | ERROR] = js.native
  // Total items that errored
  var total_error_items: js.UndefOr[Double] = js.native
  // Total items processed of source
  var total_processed_items: js.UndefOr[Double] = js.native
}

object Status {
  @scala.inline
  def apply(): Status = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Status]
  }
  @scala.inline
  implicit class StatusOps[Self <: Status] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLast_error_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_error_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_error_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_error_at")(js.undefined)
        ret
    }
    @scala.inline
    def withLast_error_item(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_error_item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_error_item: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_error_item")(js.undefined)
        ret
    }
    @scala.inline
    def withLast_error_reason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_error_reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_error_reason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_error_reason")(js.undefined)
        ret
    }
    @scala.inline
    def withLast_processed_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_processed_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_processed_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_processed_at")(js.undefined)
        ret
    }
    @scala.inline
    def withLast_processed_item(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_processed_item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_processed_item: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_processed_item")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withSince(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: INITIALIZING | WATCHING | PROCESSING | COMPLETED | ERROR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal_error_items(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_error_items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal_error_items: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_error_items")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal_processed_items(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_processed_items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal_processed_items: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_processed_items")(js.undefined)
        ret
    }
  }
  
}

