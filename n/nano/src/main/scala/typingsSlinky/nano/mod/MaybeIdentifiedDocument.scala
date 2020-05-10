package typingsSlinky.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// -------------------------------------
// Document
// -------------------------------------
@js.native
trait MaybeIdentifiedDocument extends js.Object {
  var _id: js.UndefOr[String] = js.native
}

object MaybeIdentifiedDocument {
  @scala.inline
  def apply(): MaybeIdentifiedDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaybeIdentifiedDocument]
  }
  @scala.inline
  implicit class MaybeIdentifiedDocumentOps[Self <: MaybeIdentifiedDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

