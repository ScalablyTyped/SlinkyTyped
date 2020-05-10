package typingsSlinky.pouchdbCore.PouchDB.Core

import typingsSlinky.pouchdbCore.pouchdbCoreStrings.all
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOpenRevisions extends Options {
  /**
    * Fetch all leaf revisions if open_revs="all" or fetch all leaf
    * revisions specified in open_revs array. Leaves will be returned
    * in the same order as specified in input array.
    */
  var open_revs: all | js.Array[RevisionId] = js.native
  /** Include revision history of the document. */
  var revs: js.UndefOr[Boolean] = js.native
}

object GetOpenRevisions {
  @scala.inline
  def apply(open_revs: all | js.Array[RevisionId]): GetOpenRevisions = {
    val __obj = js.Dynamic.literal(open_revs = open_revs.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOpenRevisions]
  }
  @scala.inline
  implicit class GetOpenRevisionsOps[Self <: GetOpenRevisions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpen_revs(value: all | js.Array[RevisionId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open_revs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revs")(js.undefined)
        ret
    }
  }
  
}

