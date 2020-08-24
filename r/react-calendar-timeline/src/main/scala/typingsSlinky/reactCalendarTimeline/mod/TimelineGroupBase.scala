package typingsSlinky.reactCalendarTimeline.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineGroupBase extends js.Object {
  var id: Id = js.native
  var rightTitle: js.UndefOr[ReactElement] = js.native
  var title: ReactElement = js.native
}

object TimelineGroupBase {
  @scala.inline
  def apply(id: Id): TimelineGroupBase = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineGroupBase]
  }
  @scala.inline
  implicit class TimelineGroupBaseOps[Self <: TimelineGroupBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: Id): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightTitleReactElement(value: ReactElement): Self = this.set("rightTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightTitle(value: ReactElement): Self = this.set("rightTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightTitle: Self = this.set("rightTitle", js.undefined)
    @scala.inline
    def setTitle(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

