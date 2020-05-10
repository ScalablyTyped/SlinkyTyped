package typingsSlinky.naja.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryHandler extends js.Object {
  var uiCache: Boolean = js.native
}

object HistoryHandler {
  @scala.inline
  def apply(uiCache: Boolean): HistoryHandler = {
    val __obj = js.Dynamic.literal(uiCache = uiCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryHandler]
  }
  @scala.inline
  implicit class HistoryHandlerOps[Self <: HistoryHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUiCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uiCache")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

