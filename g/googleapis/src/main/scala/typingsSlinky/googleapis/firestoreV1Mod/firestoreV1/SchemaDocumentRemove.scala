package typingsSlinky.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Document has been removed from the view of the targets.  Sent if the
  * document is no longer relevant to a target and is out of view. Can be sent
  * instead of a DocumentDelete or a DocumentChange if the server can not send
  * the new value of the document.  Multiple DocumentRemove messages may be
  * returned for the same logical write or delete, if multiple targets are
  * affected.
  */
@js.native
trait SchemaDocumentRemove extends js.Object {
  /**
    * The resource name of the Document that has gone out of view.
    */
  var document: js.UndefOr[String] = js.native
  /**
    * The read timestamp at which the remove was observed.  Greater or equal to
    * the `commit_time` of the change/delete/remove.
    */
  var readTime: js.UndefOr[String] = js.native
  /**
    * A set of target IDs for targets that previously matched this document.
    */
  var removedTargetIds: js.UndefOr[js.Array[Double]] = js.native
}

object SchemaDocumentRemove {
  @scala.inline
  def apply(): SchemaDocumentRemove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocumentRemove]
  }
  @scala.inline
  implicit class SchemaDocumentRemoveOps[Self <: SchemaDocumentRemove] (val x: Self) extends AnyVal {
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

