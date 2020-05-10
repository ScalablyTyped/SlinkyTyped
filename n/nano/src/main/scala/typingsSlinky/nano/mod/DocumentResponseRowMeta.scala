package typingsSlinky.nano.mod

import typingsSlinky.nano.AnonRev
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// -------------------------------------
// Document scope request and response
// -------------------------------------
@js.native
trait DocumentResponseRowMeta extends js.Object {
  var id: String = js.native
  var key: String = js.native
  var value: AnonRev = js.native
}

object DocumentResponseRowMeta {
  @scala.inline
  def apply(id: String, key: String, value: AnonRev): DocumentResponseRowMeta = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentResponseRowMeta]
  }
  @scala.inline
  implicit class DocumentResponseRowMetaOps[Self <: DocumentResponseRowMeta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: AnonRev): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

