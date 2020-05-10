package typingsSlinky.entriaRelayExperimental

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCursor extends js.Object {
  var cursor: String | Null = js.native
  var hasMore: Boolean = js.native
}

object AnonCursor {
  @scala.inline
  def apply(hasMore: Boolean): AnonCursor = {
    val __obj = js.Dynamic.literal(hasMore = hasMore.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCursor]
  }
  @scala.inline
  implicit class AnonCursorOps[Self <: AnonCursor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasMore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(null)
        ret
    }
  }
  
}

