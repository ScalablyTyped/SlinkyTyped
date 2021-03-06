package typingsSlinky.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://docs.couchdb.org/en/latest/api/ddoc/views.html#get--db-_design-ddoc-_view-view
@js.native
trait DocumentViewParams extends StObject {
  
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
  implicit class DocumentViewParamsMutableBuilder[Self <: DocumentViewParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAtt_encoding_info(value: Boolean): Self = StObject.set(x, "att_encoding_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtt_encoding_infoUndefined: Self = StObject.set(x, "att_encoding_info", js.undefined)
    
    @scala.inline
    def setAttachments(value: Boolean): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    @scala.inline
    def setConflicts(value: Boolean): Self = StObject.set(x, "conflicts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConflictsUndefined: Self = StObject.set(x, "conflicts", js.undefined)
    
    @scala.inline
    def setDescending(value: Boolean): Self = StObject.set(x, "descending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescendingUndefined: Self = StObject.set(x, "descending", js.undefined)
    
    @scala.inline
    def setEnd_key(value: js.Any): Self = StObject.set(x, "end_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_keyUndefined: Self = StObject.set(x, "end_key", js.undefined)
    
    @scala.inline
    def setEnd_key_doc_id(value: String): Self = StObject.set(x, "end_key_doc_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_key_doc_idUndefined: Self = StObject.set(x, "end_key_doc_id", js.undefined)
    
    @scala.inline
    def setEndkey(value: js.Any): Self = StObject.set(x, "endkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndkeyUndefined: Self = StObject.set(x, "endkey", js.undefined)
    
    @scala.inline
    def setEndkey_docid(value: String): Self = StObject.set(x, "endkey_docid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndkey_docidUndefined: Self = StObject.set(x, "endkey_docid", js.undefined)
    
    @scala.inline
    def setGroup(value: Boolean): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setGroup_level(value: Double): Self = StObject.set(x, "group_level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup_levelUndefined: Self = StObject.set(x, "group_level", js.undefined)
    
    @scala.inline
    def setInclude_docs(value: Boolean): Self = StObject.set(x, "include_docs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_docsUndefined: Self = StObject.set(x, "include_docs", js.undefined)
    
    @scala.inline
    def setInclusive_end(value: Boolean): Self = StObject.set(x, "inclusive_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclusive_endUndefined: Self = StObject.set(x, "inclusive_end", js.undefined)
    
    @scala.inline
    def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setKeys(value: js.Array[_]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: js.Any*): Self = StObject.set(x, "keys", js.Array(value :_*))
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setReduce(value: Boolean): Self = StObject.set(x, "reduce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReduceUndefined: Self = StObject.set(x, "reduce", js.undefined)
    
    @scala.inline
    def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    @scala.inline
    def setSorted(value: Boolean): Self = StObject.set(x, "sorted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortedUndefined: Self = StObject.set(x, "sorted", js.undefined)
    
    @scala.inline
    def setStable(value: Boolean): Self = StObject.set(x, "stable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStableUndefined: Self = StObject.set(x, "stable", js.undefined)
    
    @scala.inline
    def setStale(value: String): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaleUndefined: Self = StObject.set(x, "stale", js.undefined)
    
    @scala.inline
    def setStart_key(value: js.Any): Self = StObject.set(x, "start_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_keyUndefined: Self = StObject.set(x, "start_key", js.undefined)
    
    @scala.inline
    def setStart_key_doc_id(value: String): Self = StObject.set(x, "start_key_doc_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_key_doc_idUndefined: Self = StObject.set(x, "start_key_doc_id", js.undefined)
    
    @scala.inline
    def setStartkey(value: js.Any): Self = StObject.set(x, "startkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartkeyUndefined: Self = StObject.set(x, "startkey", js.undefined)
    
    @scala.inline
    def setStartkey_docid(value: String): Self = StObject.set(x, "startkey_docid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartkey_docidUndefined: Self = StObject.set(x, "startkey_docid", js.undefined)
    
    @scala.inline
    def setUpdate(value: String): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    @scala.inline
    def setUpdate_seq(value: Boolean): Self = StObject.set(x, "update_seq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate_seqUndefined: Self = StObject.set(x, "update_seq", js.undefined)
  }
}
