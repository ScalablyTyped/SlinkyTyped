package typingsSlinky.reactBigScheduler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait View extends js.Object {
  var isEventPerspective: Boolean = js.native
  var showAgenda: Boolean = js.native
  var viewName: js.UndefOr[String] = js.native
  var viewType: ViewTypes = js.native
}

object View {
  @scala.inline
  def apply(isEventPerspective: Boolean, showAgenda: Boolean, viewType: ViewTypes): View = {
    val __obj = js.Dynamic.literal(isEventPerspective = isEventPerspective.asInstanceOf[js.Any], showAgenda = showAgenda.asInstanceOf[js.Any], viewType = viewType.asInstanceOf[js.Any])
    __obj.asInstanceOf[View]
  }
  @scala.inline
  implicit class ViewOps[Self <: View] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsEventPerspective(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEventPerspective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowAgenda(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAgenda")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewType(value: ViewTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewName")(js.undefined)
        ret
    }
  }
  
}

