package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.modelDocumentMod.Document
import typingsSlinky.firebaseFirestore.utilErrorMod.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonErrorCode extends js.Object {
  var added: js.UndefOr[js.Array[Document]] = js.native
  var errorCode: js.UndefOr[Code] = js.native
  var fromCache: js.UndefOr[Boolean] = js.native
  var hasPendingWrites: js.UndefOr[Boolean] = js.native
  var metadata: js.UndefOr[js.Array[Document]] = js.native
  var modified: js.UndefOr[js.Array[Document]] = js.native
  var removed: js.UndefOr[js.Array[Document]] = js.native
}

object AnonErrorCode {
  @scala.inline
  def apply(): AnonErrorCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonErrorCode]
  }
  @scala.inline
  implicit class AnonErrorCodeOps[Self <: AnonErrorCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdded(value: js.Array[Document]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("added")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("added")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorCode(value: Code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withFromCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromCache")(js.undefined)
        ret
    }
    @scala.inline
    def withHasPendingWrites(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPendingWrites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasPendingWrites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPendingWrites")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: js.Array[Document]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withModified(value: js.Array[Document]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoved(value: js.Array[Document]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(js.undefined)
        ret
    }
  }
  
}

