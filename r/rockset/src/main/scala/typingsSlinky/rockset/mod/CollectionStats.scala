package typingsSlinky.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionStats extends js.Object {
  // number of documents in the collection
  var doc_count: js.UndefOr[Double] = js.native
  // number between 0 and 1 that indicates progress of collection creation
  var fill_progress: js.UndefOr[Double] = js.native
  // milliseconds since Unix epoch Jan 1, 1970
  var last_queried_ms: js.UndefOr[Double] = js.native
  // milliseconds since Unix epoch Jan 1, 1970
  var last_updated_ms: js.UndefOr[Double] = js.native
  // number of documents purged from the collection
  var purged_doc_count: js.UndefOr[Double] = js.native
  // total collection size in bytes purged
  var purged_doc_size: js.UndefOr[Double] = js.native
  // total collection size in bytes
  var total_size: js.UndefOr[Double] = js.native
}

object CollectionStats {
  @scala.inline
  def apply(): CollectionStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionStats]
  }
  @scala.inline
  implicit class CollectionStatsOps[Self <: CollectionStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoc_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoc_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc_count")(js.undefined)
        ret
    }
    @scala.inline
    def withFill_progress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill_progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill_progress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill_progress")(js.undefined)
        ret
    }
    @scala.inline
    def withLast_queried_ms(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_queried_ms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_queried_ms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_queried_ms")(js.undefined)
        ret
    }
    @scala.inline
    def withLast_updated_ms(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_updated_ms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_updated_ms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_updated_ms")(js.undefined)
        ret
    }
    @scala.inline
    def withPurged_doc_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purged_doc_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurged_doc_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purged_doc_count")(js.undefined)
        ret
    }
    @scala.inline
    def withPurged_doc_size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purged_doc_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurged_doc_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purged_doc_size")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal_size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_size")(js.undefined)
        ret
    }
  }
  
}

