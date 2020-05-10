package typingsSlinky.nano.mod

import typingsSlinky.nano.nanoStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/common.html#post--db
// http://docs.couchdb.org/en/latest/api/document/common.html#put--db-docid
@js.native
trait DocumentInsertParams extends js.Object {
  // Stores document in batch mode.
  var batch: js.UndefOr[ok] = js.native
  // Prevents insertion of a conflicting document. Possible values: true (default) and false. If false, a
  // well-formed _rev must be included in the document. new_edits=false is used by the replicator to insert
  // documents into the target database even if that leads to the creation of conflicts.
  var new_edits: js.UndefOr[Boolean] = js.native
  // Document’s revision if updating an existing document. Alternative to If-Match header or document key.
  var rev: js.UndefOr[String] = js.native
}

object DocumentInsertParams {
  @scala.inline
  def apply(): DocumentInsertParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentInsertParams]
  }
  @scala.inline
  implicit class DocumentInsertParamsOps[Self <: DocumentInsertParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatch(value: ok): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_edits(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_edits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_edits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_edits")(js.undefined)
        ret
    }
    @scala.inline
    def withRev(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rev")(js.undefined)
        ret
    }
  }
  
}

