package typingsSlinky.mongodb.mod

import typingsSlinky.mongodb.anon.BatchSizeNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionAggregationOptions extends js.Object {
  /**
    * Lets the server know if it can use disk to store
    * temporary results for the aggregation (requires mongodb 2.6 >).
    */
  var allowDiskUse: js.UndefOr[Boolean] = js.native
  /**
    * Allow driver to bypass schema validation in MongoDB 3.2 or higher.
    */
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.native
  var collation: js.UndefOr[CollationDocument] = js.native
  var comment: js.UndefOr[String] = js.native
  /**
    * Return the query as cursor, on 2.6 > it returns as a real cursor
    * on pre 2.6 it returns as an emulated cursor.
    */
  var cursor: js.UndefOr[BatchSizeNumber] = js.native
  /**
    * Explain returns the aggregation execution plan (requires mongodb 2.6 >).
    */
  var explain: js.UndefOr[Boolean] = js.native
  var hint: js.UndefOr[String | js.Object] = js.native
  /**
    * specifies a cumulative time limit in milliseconds for processing operations
    * on the cursor. MongoDB interrupts the operation at the earliest following interrupt point.
    */
  var maxTimeMS: js.UndefOr[scala.Double] = js.native
  var promoteBuffers: js.UndefOr[Boolean] = js.native
  var promoteLongs: js.UndefOr[Boolean] = js.native
  var promoteValues: js.UndefOr[Boolean] = js.native
  var raw: js.UndefOr[Boolean] = js.native
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.native
  var session: js.UndefOr[ClientSession] = js.native
}

object CollectionAggregationOptions {
  @scala.inline
  def apply(): CollectionAggregationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionAggregationOptions]
  }
  @scala.inline
  implicit class CollectionAggregationOptionsOps[Self <: CollectionAggregationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowDiskUse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDiskUse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDiskUse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDiskUse")(js.undefined)
        ret
    }
    @scala.inline
    def withBypassDocumentValidation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bypassDocumentValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBypassDocumentValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bypassDocumentValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withCollation(value: CollationDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collation")(js.undefined)
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withCursor(value: BatchSizeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withExplain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explain")(js.undefined)
        ret
    }
    @scala.inline
    def withHint(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hint")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTimeMS(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTimeMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTimeMS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTimeMS")(js.undefined)
        ret
    }
    @scala.inline
    def withPromoteBuffers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promoteBuffers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromoteBuffers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promoteBuffers")(js.undefined)
        ret
    }
    @scala.inline
    def withPromoteLongs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promoteLongs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromoteLongs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promoteLongs")(js.undefined)
        ret
    }
    @scala.inline
    def withPromoteValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promoteValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromoteValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promoteValues")(js.undefined)
        ret
    }
    @scala.inline
    def withRaw(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
    @scala.inline
    def withReadPreference(value: ReadPreferenceOrMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readPreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadPreference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readPreference")(js.undefined)
        ret
    }
    @scala.inline
    def withSession(value: ClientSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(js.undefined)
        ret
    }
  }
  
}

