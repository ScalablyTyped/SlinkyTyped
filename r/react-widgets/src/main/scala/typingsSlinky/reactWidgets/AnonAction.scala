package typingsSlinky.reactWidgets

import typingsSlinky.reactWidgets.reactWidgetsStrings.insert
import typingsSlinky.reactWidgets.reactWidgetsStrings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAction extends js.Object {
  var action: insert | remove = js.native
  var dataItem: js.Any = js.native
  var lastValue: js.UndefOr[js.Array[_]] = js.native
  var originalEvent: js.UndefOr[js.Any] = js.native
  var searchTerm: js.UndefOr[String] = js.native
}

object AnonAction {
  @scala.inline
  def apply(action: insert | remove, dataItem: js.Any): AnonAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], dataItem = dataItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAction]
  }
  @scala.inline
  implicit class AnonActionOps[Self <: AnonAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: insert | remove): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataItem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastValue(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchTerm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTerm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchTerm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTerm")(js.undefined)
        ret
    }
  }
  
}

