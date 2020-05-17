package typingsSlinky.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreserveLeadingWhitespace extends js.Object {
  var preserveLeadingWhitespace: js.UndefOr[Boolean] = js.native
}

object PreserveLeadingWhitespace {
  @scala.inline
  def apply(): PreserveLeadingWhitespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreserveLeadingWhitespace]
  }
  @scala.inline
  implicit class PreserveLeadingWhitespaceOps[Self <: PreserveLeadingWhitespace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreserveLeadingWhitespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveLeadingWhitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveLeadingWhitespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveLeadingWhitespace")(js.undefined)
        ret
    }
  }
  
}

