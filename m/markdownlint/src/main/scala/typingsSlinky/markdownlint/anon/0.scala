package typingsSlinky.markdownlint.anon

import typingsSlinky.markdownlint.markdownlintStrings.asterisk
import typingsSlinky.markdownlint.markdownlintStrings.consistent
import typingsSlinky.markdownlint.markdownlintStrings.dash
import typingsSlinky.markdownlint.markdownlintStrings.plus
import typingsSlinky.markdownlint.markdownlintStrings.sublist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends js.Object {
  var style: js.UndefOr[consistent | asterisk | plus | dash | sublist] = js.undefined
}

object `0` {
  @scala.inline
  def apply(style: consistent | asterisk | plus | dash | sublist = null): `0` = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
}

