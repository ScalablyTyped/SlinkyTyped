package typingsSlinky.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Write extends js.Object {
  var currentDocument: js.UndefOr[Precondition] = js.native
  var delete: js.UndefOr[String] = js.native
  var transform: js.UndefOr[DocumentTransform] = js.native
  var update: js.UndefOr[Document] = js.native
  var updateMask: js.UndefOr[DocumentMask] = js.native
  var verify: js.UndefOr[String] = js.native
}

object Write {
  @scala.inline
  def apply(): Write = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Write]
  }
  @scala.inline
  implicit class WriteOps[Self <: Write] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentDocument(value: Precondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDocument")(js.undefined)
        ret
    }
    @scala.inline
    def withDelete(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: DocumentTransform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateMask(value: DocumentMask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(js.undefined)
        ret
    }
    @scala.inline
    def withVerify(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify")(js.undefined)
        ret
    }
  }
  
}

