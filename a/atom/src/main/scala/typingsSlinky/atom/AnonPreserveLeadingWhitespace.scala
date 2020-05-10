package typingsSlinky.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPreserveLeadingWhitespace extends js.Object {
  var preserveLeadingWhitespace: js.UndefOr[Boolean] = js.native
}

object AnonPreserveLeadingWhitespace {
  @scala.inline
  def apply(): AnonPreserveLeadingWhitespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonPreserveLeadingWhitespace]
  }
  @scala.inline
  implicit class AnonPreserveLeadingWhitespaceOps[Self <: AnonPreserveLeadingWhitespace] (val x: Self) extends AnyVal {
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

