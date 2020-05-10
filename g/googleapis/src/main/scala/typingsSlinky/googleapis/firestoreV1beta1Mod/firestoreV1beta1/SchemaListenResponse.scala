package typingsSlinky.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for Firestore.Listen.
  */
@js.native
trait SchemaListenResponse extends js.Object {
  /**
    * A Document has changed.
    */
  var documentChange: js.UndefOr[SchemaDocumentChange] = js.native
  /**
    * A Document has been deleted.
    */
  var documentDelete: js.UndefOr[SchemaDocumentDelete] = js.native
  /**
    * A Document has been removed from a target (because it is no longer
    * relevant to that target).
    */
  var documentRemove: js.UndefOr[SchemaDocumentRemove] = js.native
  /**
    * A filter to apply to the set of documents previously returned for the
    * given target.  Returned when documents may have been removed from the
    * given target, but the exact documents are unknown.
    */
  var filter: js.UndefOr[SchemaExistenceFilter] = js.native
  /**
    * Targets have changed.
    */
  var targetChange: js.UndefOr[SchemaTargetChange] = js.native
}

object SchemaListenResponse {
  @scala.inline
  def apply(): SchemaListenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListenResponse]
  }
  @scala.inline
  implicit class SchemaListenResponseOps[Self <: SchemaListenResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentChange(value: SchemaDocumentChange): Self = {
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
    def withDocumentDelete(value: SchemaDocumentDelete): Self = {
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
    def withDocumentRemove(value: SchemaDocumentRemove): Self = {
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
    def withFilter(value: SchemaExistenceFilter): Self = {
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
    def withTargetChange(value: SchemaTargetChange): Self = {
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

