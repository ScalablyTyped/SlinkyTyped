package typingsSlinky.dropboxjs.Dropbox.Http

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PulledChanges extends js.Object {
  var blankSlate: Boolean = js.native
  var cursorTag: String = js.native
  var shouldBackOff: Boolean = js.native
  var shouldPullAgain: Boolean = js.native
  def cursor(): String = js.native
}

object PulledChanges {
  @scala.inline
  def apply(
    blankSlate: Boolean,
    cursor: () => String,
    cursorTag: String,
    shouldBackOff: Boolean,
    shouldPullAgain: Boolean
  ): PulledChanges = {
    val __obj = js.Dynamic.literal(blankSlate = blankSlate.asInstanceOf[js.Any], cursor = js.Any.fromFunction0(cursor), cursorTag = cursorTag.asInstanceOf[js.Any], shouldBackOff = shouldBackOff.asInstanceOf[js.Any], shouldPullAgain = shouldPullAgain.asInstanceOf[js.Any])
    __obj.asInstanceOf[PulledChanges]
  }
  @scala.inline
  implicit class PulledChangesOps[Self <: PulledChanges] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlankSlate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blankSlate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursor(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCursorTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShouldBackOff(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldBackOff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShouldPullAgain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldPullAgain")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

