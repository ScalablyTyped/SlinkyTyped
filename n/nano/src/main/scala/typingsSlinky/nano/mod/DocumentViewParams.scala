package typingsSlinky.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/ddoc/views.html#get--db-_design-ddoc-_view-view
@js.native
trait DocumentViewParams extends js.Object {
  // Include encoding information in attachment stubs if include_docs is true and the particular attachment is
  // compressed. Ignored if include_docs isn’t true. Default is false.
  var att_encoding_info: js.UndefOr[Boolean] = js.native
  // Include the Base64-encoded content of attachments in the documents that are included if include_docs is
  // true. Ignored if include_docs isn’t true. Default is false.
  var attachments: js.UndefOr[Boolean] = js.native
  // Includes conflicts information in response. Ignored if include_docs isn’t true. Default is false.
  var conflicts: js.UndefOr[Boolean] = js.native
  // Return the documents in descending by key order. Default is false.
  var descending: js.UndefOr[Boolean] = js.native
  // Alias for endkey param.
  var end_key: js.UndefOr[js.Any] = js.native
  // Alias for endkey_docid param.
  var end_key_doc_id: js.UndefOr[String] = js.native
  // Stop returning records when the specified key is reached.
  var endkey: js.UndefOr[js.Any] = js.native
  // Stop returning records when the specified document ID is reached. Requires endkey to be specified for this
  // to have any effect.
  var endkey_docid: js.UndefOr[String] = js.native
  // Group the results using the reduce function to a group or single row. Default is false.
  var group: js.UndefOr[Boolean] = js.native
  // Specify the group level to be used.
  var group_level: js.UndefOr[Double] = js.native
  // Include the associated document with each row. Default is false.
  var include_docs: js.UndefOr[Boolean] = js.native
  // Specifies whether the specified end key should be included in the result. Default is true.
  var inclusive_end: js.UndefOr[Boolean] = js.native
  // Return only documents that match the specified key.
  var key: js.UndefOr[js.Any] = js.native
  // Return only documents where the key matches one of the keys specified in the array.
  var keys: js.UndefOr[js.Array[_]] = js.native
  // Limit the number of the returned documents to the specified number.
  var limit: js.UndefOr[Double] = js.native
  // Use the reduction function. Default is true.
  var reduce: js.UndefOr[Boolean] = js.native
  // Skip this number of records before starting to return the results. Default is 0.
  var skip: js.UndefOr[Double] = js.native
  // Sort returned rows. Setting this to false offers a performance boost. The total_rows and offset fields are
  // not available when this is set to false. Default is true.
  var sorted: js.UndefOr[Boolean] = js.native
  // Whether or not the view results should be returned from a stable set of shards. Default is false.
  var stable: js.UndefOr[Boolean] = js.native
  // Allow the results from a stale view to be used. Supported values: ok, update_after and false. ok is
  // equivalent to stable=true&update=false. update_after is equivalent to stable=true&update=lazy. false is
  // equivalent to stable=false&update=true.
  var stale: js.UndefOr[String] = js.native
  // Alias for startkey param
  var start_key: js.UndefOr[js.Any] = js.native
  // Alias for startkey_docid param
  var start_key_doc_id: js.UndefOr[String] = js.native
  // Return records starting with the specified key.
  var startkey: js.UndefOr[js.Any] = js.native
  // Return records starting with the specified document ID. Requires startkey to be specified for this to have
  // any effect.
  var startkey_docid: js.UndefOr[String] = js.native
  //  Whether or not the view in question should be updated prior to responding to the user. Supported values:
  // true, false, lazy. Default is true.
  var update: js.UndefOr[String] = js.native
  // Response includes an update_seq value indicating which sequence id of the database the view reflects.
  // Default is false.
  var update_seq: js.UndefOr[Boolean] = js.native
}

object DocumentViewParams {
  @scala.inline
  def apply(): DocumentViewParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentViewParams]
  }
  @scala.inline
  implicit class DocumentViewParamsOps[Self <: DocumentViewParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAtt_encoding_info(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("att_encoding_info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAtt_encoding_info: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("att_encoding_info")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(js.undefined)
        ret
    }
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
    def withEnd_key(value: js.Any): Self = {
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
    def withEndkey(value: js.Any): Self = {
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
    def withEndkey_docid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endkey_docid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndkey_docid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endkey_docid")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup_level(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group_level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup_level: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group_level")(js.undefined)
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
    def withKey(value: js.Any): Self = {
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
    def withKeys(value: js.Array[_]): Self = {
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
    def withReduce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReduce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduce")(js.undefined)
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
    def withSorted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSorted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorted")(js.undefined)
        ret
    }
    @scala.inline
    def withStable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stable")(js.undefined)
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
    def withStart_key(value: js.Any): Self = {
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
    def withStartkey(value: js.Any): Self = {
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
    def withStartkey_docid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startkey_docid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartkey_docid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startkey_docid")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
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

