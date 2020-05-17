package typingsSlinky.nano.mod

import typingsSlinky.nano.anon.Rev
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentResponseRow[D] extends DocumentResponseRowMeta {
  var doc: js.UndefOr[D with Document] = js.native
}

object DocumentResponseRow {
  @scala.inline
  def apply[D](id: String, key: String, value: Rev): DocumentResponseRow[D] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentResponseRow[D]]
  }
  @scala.inline
  implicit class DocumentResponseRowOps[Self[d] <: DocumentResponseRow[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withDoc(value: D with Document): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoc: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc")(js.undefined)
        ret
    }
  }
  
}

