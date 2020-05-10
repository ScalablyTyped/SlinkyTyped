package typingsSlinky.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentMask extends js.Object {
  var fieldPaths: js.UndefOr[js.Array[String]] = js.native
}

object DocumentMask {
  @scala.inline
  def apply(): DocumentMask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentMask]
  }
  @scala.inline
  implicit class DocumentMaskOps[Self <: DocumentMask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFieldPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldPaths")(js.undefined)
        ret
    }
  }
  
}

