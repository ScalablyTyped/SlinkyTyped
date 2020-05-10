package typingsSlinky.rockset.mod

import typingsSlinky.rockset.rocksetStrings.ADDED
import typingsSlinky.rockset.rocksetStrings.DELETED
import typingsSlinky.rockset.rocksetStrings.ERROR
import typingsSlinky.rockset.rocksetStrings.REPLACED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentStatus extends js.Object {
  // collection name
  var _collection: js.UndefOr[String] = js.native
  // unique document ID
  var _id: js.UndefOr[String] = js.native
  // error message, if any
  var error: js.UndefOr[ErrorModel] = js.native
  // status, one of ADDED, REPLACED, DELETED, ERROR
  var status: js.UndefOr[ADDED | REPLACED | DELETED | ERROR] = js.native
}

object DocumentStatus {
  @scala.inline
  def apply(): DocumentStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentStatus]
  }
  @scala.inline
  implicit class DocumentStatusOps[Self <: DocumentStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_collection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_collection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_collection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_collection")(js.undefined)
        ret
    }
    @scala.inline
    def with_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: ErrorModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ADDED | REPLACED | DELETED | ERROR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

