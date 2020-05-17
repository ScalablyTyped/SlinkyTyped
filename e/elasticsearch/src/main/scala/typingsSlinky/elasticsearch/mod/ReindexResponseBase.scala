package typingsSlinky.elasticsearch.mod

import typingsSlinky.elasticsearch.anon.Bulk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReindexResponseBase extends js.Object {
  var batches: Double = js.native
  var deleted: Double = js.native
  var noops: Double = js.native
  var requests_per_second: Double = js.native
  var retries: Bulk = js.native
  var throttled_millis: Double = js.native
  var throttled_until_millis: Double = js.native
  var total: Double = js.native
  var updated: Double = js.native
  var version_conflicts: Double = js.native
}

object ReindexResponseBase {
  @scala.inline
  def apply(
    batches: Double,
    deleted: Double,
    noops: Double,
    requests_per_second: Double,
    retries: Bulk,
    throttled_millis: Double,
    throttled_until_millis: Double,
    total: Double,
    updated: Double,
    version_conflicts: Double
  ): ReindexResponseBase = {
    val __obj = js.Dynamic.literal(batches = batches.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], noops = noops.asInstanceOf[js.Any], requests_per_second = requests_per_second.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], throttled_millis = throttled_millis.asInstanceOf[js.Any], throttled_until_millis = throttled_until_millis.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], version_conflicts = version_conflicts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReindexResponseBase]
  }
  @scala.inline
  implicit class ReindexResponseBaseOps[Self <: ReindexResponseBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatches(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoops(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequests_per_second(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests_per_second")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetries(value: Bulk): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThrottled_millis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttled_millis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThrottled_until_millis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttled_until_millis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion_conflicts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version_conflicts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

