package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.backdrop
import typingsSlinky.baseui.baseuiStrings.closeButton
import typingsSlinky.baseui.baseuiStrings.escape_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCloseSource extends js.Object {
  var closeSource: js.UndefOr[closeButton | backdrop | escape_] = js.undefined
}

object AnonCloseSource {
  @scala.inline
  def apply(closeSource: closeButton | backdrop | escape_ = null): AnonCloseSource = {
    val __obj = js.Dynamic.literal()
    if (closeSource != null) __obj.updateDynamic("closeSource")(closeSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCloseSource]
  }
}

