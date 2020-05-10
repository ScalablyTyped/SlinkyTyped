package typingsSlinky.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenResponse extends js.Object {
  /** A Document has changed. */
  var documentChange: js.UndefOr[DocumentChange] = js.native
  /** A Document has been deleted. */
  var documentDelete: js.UndefOr[DocumentDelete] = js.native
  /**
    * A Document has been removed from a target (because it is no longer
    * relevant to that target).
    */
  var documentRemove: js.UndefOr[DocumentRemove] = js.native
  /**
    * A filter to apply to the set of documents previously returned for the
    * given target.
    *
    * Returned when documents may have been removed from the given target, but
    * the exact documents are unknown.
    */
  var filter: js.UndefOr[ExistenceFilter] = js.native
  /** Targets have changed. */
  var targetChange: js.UndefOr[TargetChange] = js.native
}

object ListenResponse {
  @scala.inline
  def apply(): ListenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenResponse]
  }
  @scala.inline
  implicit class ListenResponseOps[Self <: ListenResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentChange(value: DocumentChange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentChange")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentDelete(value: DocumentDelete): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentRemove(value: DocumentRemove): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: ExistenceFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetChange(value: TargetChange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetChange")(js.undefined)
        ret
    }
  }
  
}

