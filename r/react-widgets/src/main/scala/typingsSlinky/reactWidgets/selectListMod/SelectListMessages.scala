package typingsSlinky.reactWidgets.selectListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectListMessages extends js.Object {
  /**
    * @default: "There are no items in this list"
    */
  var emptyList: js.UndefOr[String | (js.Function1[/* props */ SelectListProps, String])] = js.native
}

object SelectListMessages {
  @scala.inline
  def apply(): SelectListMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectListMessages]
  }
  @scala.inline
  implicit class SelectListMessagesOps[Self <: SelectListMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmptyListFunction1(value: /* props */ SelectListProps => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEmptyList(value: String | (js.Function1[/* props */ SelectListProps, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyList")(js.undefined)
        ret
    }
  }
  
}

