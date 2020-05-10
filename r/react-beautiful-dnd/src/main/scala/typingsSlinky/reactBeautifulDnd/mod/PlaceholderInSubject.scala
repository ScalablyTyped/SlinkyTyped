package typingsSlinky.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaceholderInSubject extends js.Object {
  // might not actually be increased by
  // placeholder if there is no required space
  var increasedBy: js.UndefOr[Position] = js.native
  // max scroll before placeholder added
  // will be null if there was no frame
  var oldFrameMaxScroll: js.UndefOr[Position] = js.native
  var placeholderSize: Position = js.native
}

object PlaceholderInSubject {
  @scala.inline
  def apply(placeholderSize: Position): PlaceholderInSubject = {
    val __obj = js.Dynamic.literal(placeholderSize = placeholderSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceholderInSubject]
  }
  @scala.inline
  implicit class PlaceholderInSubjectOps[Self <: PlaceholderInSubject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlaceholderSize(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncreasedBy(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increasedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncreasedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increasedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withOldFrameMaxScroll(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldFrameMaxScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldFrameMaxScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldFrameMaxScroll")(js.undefined)
        ret
    }
  }
  
}

