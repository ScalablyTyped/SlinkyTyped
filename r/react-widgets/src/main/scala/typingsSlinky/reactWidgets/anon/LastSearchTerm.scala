package typingsSlinky.reactWidgets.anon

import typingsSlinky.reactWidgets.reactWidgetsStrings.clear
import typingsSlinky.reactWidgets.reactWidgetsStrings.input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LastSearchTerm extends js.Object {
  var action: clear | input = js.native
  var lastSearchTerm: js.UndefOr[String] = js.native
  var originalEvent: js.UndefOr[js.Any] = js.native
}

object LastSearchTerm {
  @scala.inline
  def apply(action: clear | input): LastSearchTerm = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastSearchTerm]
  }
  @scala.inline
  implicit class LastSearchTermOps[Self <: LastSearchTerm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: clear | input): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastSearchTerm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSearchTerm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSearchTerm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSearchTerm")(js.undefined)
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
  }
  
}

