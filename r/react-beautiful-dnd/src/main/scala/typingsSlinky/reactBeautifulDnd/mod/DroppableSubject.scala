package typingsSlinky.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DroppableSubject extends js.Object {
  // The hitbox for a droppable
  // - page margin box
  // - with scroll changes
  // - with any additional droppable placeholder
  // - clipped by frame
  // The subject will be null if the hit area is completely empty
  var active: js.UndefOr[Rect] = js.native
  // raw, unchanging
  var page: BoxModel = js.native
  var withPlaceholder: js.UndefOr[PlaceholderInSubject] = js.native
}

object DroppableSubject {
  @scala.inline
  def apply(page: BoxModel): DroppableSubject = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableSubject]
  }
  @scala.inline
  implicit class DroppableSubjectOps[Self <: DroppableSubject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPage(value: BoxModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActive(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withWithPlaceholder(value: PlaceholderInSubject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withPlaceholder")(js.undefined)
        ret
    }
  }
  
}

