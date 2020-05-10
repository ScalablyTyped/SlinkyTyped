package typingsSlinky.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunQueryResponse extends js.Object {
  /**
    * A query result.
    * Not set when reporting partial progress.
    */
  var document: js.UndefOr[Document] = js.native
  /**
    * The time at which the document was read. This may be monotonically
    * increasing; in this case, the previous documents in the result stream are
    * guaranteed not to have changed between their `read_time` and this one.
    *
    * If the query returns no results, a response with `read_time` and no
    * `document` will be sent, and this represents the time at which the query
    * was run.
    */
  var readTime: js.UndefOr[String] = js.native
  /**
    * The number of results that have been skipped due to an offset between
    * the last response and the current response.
    */
  var skippedResults: js.UndefOr[Double] = js.native
  /**
    * The transaction that was started as part of this request.
    * Can only be set in the first response, and only if
    * RunQueryRequest.new_transaction was set in the request.
    * If set, no other fields will be set in this response.
    */
  var transaction: js.UndefOr[String] = js.native
}

object RunQueryResponse {
  @scala.inline
  def apply(): RunQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunQueryResponse]
  }
  @scala.inline
  implicit class RunQueryResponseOps[Self <: RunQueryResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocument(value: Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(js.undefined)
        ret
    }
    @scala.inline
    def withReadTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTime")(js.undefined)
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
    def withTransaction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(js.undefined)
        ret
    }
  }
  
}

