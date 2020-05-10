package typingsSlinky.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaybeRevisionedDocument extends js.Object {
  var _rev: js.UndefOr[String] = js.native
}

object MaybeRevisionedDocument {
  @scala.inline
  def apply(): MaybeRevisionedDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaybeRevisionedDocument]
  }
  @scala.inline
  implicit class MaybeRevisionedDocumentOps[Self <: MaybeRevisionedDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_rev(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_rev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rev")(js.undefined)
        ret
    }
  }
  
}

