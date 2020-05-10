package typingsSlinky.markdownlint

import typingsSlinky.markdownlint.markdownlintStrings.atx
import typingsSlinky.markdownlint.markdownlintStrings.atx_closed
import typingsSlinky.markdownlint.markdownlintStrings.consistent
import typingsSlinky.markdownlint.markdownlintStrings.setext
import typingsSlinky.markdownlint.markdownlintStrings.setext_with_atx
import typingsSlinky.markdownlint.markdownlintStrings.setext_with_atx_closed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStyle extends js.Object {
  var style: js.UndefOr[
    consistent | atx | atx_closed | setext | setext_with_atx | setext_with_atx_closed
  ] = js.native
}

object AnonStyle {
  @scala.inline
  def apply(): AnonStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonStyle]
  }
  @scala.inline
  implicit class AnonStyleOps[Self <: AnonStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyle(value: consistent | atx | atx_closed | setext | setext_with_atx | setext_with_atx_closed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

