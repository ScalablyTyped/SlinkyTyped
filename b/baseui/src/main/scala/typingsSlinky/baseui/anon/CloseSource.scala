package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.backdrop
import typingsSlinky.baseui.baseuiStrings.closeButton
import typingsSlinky.baseui.baseuiStrings.escape_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseSource extends js.Object {
  var closeSource: js.UndefOr[closeButton | backdrop | escape_] = js.native
}

object CloseSource {
  @scala.inline
  def apply(): CloseSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseSource]
  }
  @scala.inline
  implicit class CloseSourceOps[Self <: CloseSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseSource(value: closeButton | backdrop | escape_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeSource")(js.undefined)
        ret
    }
  }
  
}

