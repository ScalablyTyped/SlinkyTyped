package typingsSlinky.markdownlint.anon

import typingsSlinky.markdownlint.markdownlintStrings.atx
import typingsSlinky.markdownlint.markdownlintStrings.atx_closed
import typingsSlinky.markdownlint.markdownlintStrings.consistent
import typingsSlinky.markdownlint.markdownlintStrings.setext
import typingsSlinky.markdownlint.markdownlintStrings.setext_with_atx
import typingsSlinky.markdownlint.markdownlintStrings.setext_with_atx_closed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Style extends js.Object {
  var style: js.UndefOr[
    consistent | atx | atx_closed | setext | setext_with_atx | setext_with_atx_closed
  ] = js.undefined
}

object Style {
  @scala.inline
  def apply(style: consistent | atx | atx_closed | setext | setext_with_atx | setext_with_atx_closed = null): Style = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
}

