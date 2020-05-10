package typingsSlinky.googleapis.v1beta3Mod.datastoreV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A batch of results produced by a query.
  */
@js.native
trait SchemaQueryResultBatch extends js.Object {
  /**
    * A cursor that points to the position after the last result in the batch.
    */
  var endCursor: js.UndefOr[String] = js.native
  /**
    * The result type for every entity in `entity_results`.
    */
  var entityResultType: js.UndefOr[String] = js.native
  /**
    * The results for this batch.
    */
  var entityResults: js.UndefOr[js.Array[SchemaEntityResult]] = js.native
  /**
    * The state of the query after the current batch.
    */
  var moreResults: js.UndefOr[String] = js.native
  /**
    * A cursor that points to the position after the last skipped result. Will
    * be set when `skipped_results` != 0.
    */
  var skippedCursor: js.UndefOr[String] = js.native
  /**
    * The number of results skipped, typically because of an offset.
    */
  var skippedResults: js.UndefOr[Double] = js.native
  /**
    * The version number of the snapshot this batch was returned from. This
    * applies to the range of results from the query&#39;s `start_cursor` (or
    * the beginning of the query if no cursor was given) to this batch&#39;s
    * `end_cursor` (not the query&#39;s `end_cursor`).  In a single
    * transaction, subsequent query result batches for the same query can have
    * a greater snapshot version number. Each batch&#39;s snapshot version is
    * valid for all preceding batches. The value will be zero for eventually
    * consistent queries.
    */
  var snapshotVersion: js.UndefOr[String] = js.native
}

object SchemaQueryResultBatch {
  @scala.inline
  def apply(): SchemaQueryResultBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryResultBatch]
  }
  @scala.inline
  implicit class SchemaQueryResultBatchOps[Self <: SchemaQueryResultBatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endCursor")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityResultType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityResultType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityResultType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityResultType")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityResults(value: js.Array[SchemaEntityResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityResults")(js.undefined)
        ret
    }
    @scala.inline
    def withMoreResults(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoreResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreResults")(js.undefined)
        ret
    }
    @scala.inline
    def withSkippedCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skippedCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkippedCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skippedCursor")(js.undefined)
        ret
    }
    @scala.inline
    def withSkippedResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skippedResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkippedResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skippedResults")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotVersion")(js.undefined)
        ret
    }
  }
  
}

