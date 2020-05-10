package typingsSlinky.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Document has been deleted.  May be the result of multiple writes,
  * including updates, the last of which deleted the Document.  Multiple
  * DocumentDelete messages may be returned for the same logical delete, if
  * multiple targets are affected.
  */
@js.native
trait SchemaDocumentDelete extends js.Object {
  /**
    * The resource name of the Document that was deleted.
    */
  var document: js.UndefOr[String] = js.native
  /**
    * The read timestamp at which the delete was observed.  Greater or equal to
    * the `commit_time` of the delete.
    */
  var readTime: js.UndefOr[String] = js.native
  /**
    * A set of target IDs for targets that previously matched this entity.
    */
  var removedTargetIds: js.UndefOr[js.Array[Double]] = js.native
}

object SchemaDocumentDelete {
  @scala.inline
  def apply(): SchemaDocumentDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocumentDelete]
  }
  @scala.inline
  implicit class SchemaDocumentDeleteOps[Self <: SchemaDocumentDelete] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocument(value: String): Self = {
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
    def withRemovedTargetIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedTargetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemovedTargetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedTargetIds")(js.undefined)
        ret
    }
  }
  
}

