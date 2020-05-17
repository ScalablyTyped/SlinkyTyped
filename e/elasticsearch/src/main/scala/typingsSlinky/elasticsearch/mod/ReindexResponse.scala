package typingsSlinky.elasticsearch.mod

import typingsSlinky.elasticsearch.anon.Bulk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReindexResponse extends ReindexResponseBase {
  var failures: js.Array[_] = js.native
  var slices: js.UndefOr[js.Array[ReindexOrByQueryResponseSlice]] = js.native
  var timed_out: Boolean = js.native
  var took: Double = js.native
}

object ReindexResponse {
  @scala.inline
  def apply(
    batches: Double,
    deleted: Double,
    failures: js.Array[_],
    noops: Double,
    requests_per_second: Double,
    retries: Bulk,
    throttled_millis: Double,
    throttled_until_millis: Double,
    timed_out: Boolean,
    took: Double,
    total: Double,
    updated: Double,
    version_conflicts: Double
  ): ReindexResponse = {
    val __obj = js.Dynamic.literal(batches = batches.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], noops = noops.asInstanceOf[js.Any], requests_per_second = requests_per_second.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], throttled_millis = throttled_millis.asInstanceOf[js.Any], throttled_until_millis = throttled_until_millis.asInstanceOf[js.Any], timed_out = timed_out.asInstanceOf[js.Any], took = took.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], version_conflicts = version_conflicts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReindexResponse]
  }
  @scala.inline
  implicit class ReindexResponseOps[Self <: ReindexResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailures(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimed_out(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timed_out")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTook(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("took")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlices(value: js.Array[ReindexOrByQueryResponseSlice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slices")(js.undefined)
        ret
    }
  }
  
}

