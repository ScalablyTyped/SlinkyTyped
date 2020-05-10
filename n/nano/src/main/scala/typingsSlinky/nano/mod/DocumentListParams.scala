package typingsSlinky.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/bulk-api.html#get--db-_all_docs
@js.native
trait DocumentListParams extends js.Object {
  // Includes conflicts information in response. Ignored if include_docs isn’t true. Default is false.
  var conflicts: js.UndefOr[Boolean] = js.native
  // Return the documents in descending by key order. Default is false.
  var descending: js.UndefOr[Boolean] = js.native
  // Stop returning records when the specified key is reached. end_key is an alias for endkey
  var end_key: js.UndefOr[String] = js.native
  // Stop returning records when the specified document ID is reached.
  var end_key_doc_id: js.UndefOr[String] = js.native
  // Stop returning records when the specified key is reached.
  var endkey: js.UndefOr[String] = js.native
  // Include the full content of the documents in the return. Default is false.
  var include_docs: js.UndefOr[Boolean] = js.native
  // Specifies whether the specified end key should be included in the result. Default is true.
  var inclusive_end: js.UndefOr[Boolean] = js.native
  // Return only documents that match the specified key.
  var key: js.UndefOr[String] = js.native
  // Return only documents that match the specified keys.
  var keys: js.UndefOr[String | js.Array[String]] = js.native
  // Limit the number of the returned documents to the specified number.
  var limit: js.UndefOr[Double] = js.native
  // Skip this number of records before starting to return the results. Default is 0.
  var skip: js.UndefOr[Double] = js.native
  // Allow the results from a stale view to be used, without triggering a rebuild of all views within the
  // encompassing design doc. Supported values: ok and update_after.
  var stale: js.UndefOr[String] = js.native
  // Return records starting with the specified key. start_key is an alias for startkey
  var start_key: js.UndefOr[String] = js.native
  // Return records starting with the specified document ID.
  var start_key_doc_id: js.UndefOr[String] = js.native
  // Return records starting with the specified key.
  var startkey: js.UndefOr[String] = js.native
  // Response includes an update_seq value indicating which sequence id of the underlying database the view
  // reflects. Default is false.
  var update_seq: js.UndefOr[Boolean] = js.native
}

object DocumentListParams {
  @scala.inline
  def apply(): DocumentListParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentListParams]
  }
  @scala.inline
  implicit class DocumentListParamsOps[Self <: DocumentListParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConflicts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflicts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConflicts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflicts")(js.undefined)
        ret
    }
    @scala.inline
    def withDescending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descending")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd_key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_key")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd_key_doc_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_key_doc_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd_key_doc_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_key_doc_id")(js.undefined)
        ret
    }
    @scala.inline
    def withEndkey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endkey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndkey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endkey")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude_docs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_docs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_docs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_docs")(js.undefined)
        ret
    }
    @scala.inline
    def withInclusive_end(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusive_end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclusive_end: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusive_end")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withKeys(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withSkip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.undefined)
        ret
    }
    @scala.inline
    def withStale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stale")(js.undefined)
        ret
    }
    @scala.inline
    def withStart_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart_key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_key")(js.undefined)
        ret
    }
    @scala.inline
    def withStart_key_doc_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_key_doc_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart_key_doc_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_key_doc_id")(js.undefined)
        ret
    }
    @scala.inline
    def withStartkey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startkey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartkey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startkey")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate_seq(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update_seq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate_seq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update_seq")(js.undefined)
        ret
    }
  }
  
}

