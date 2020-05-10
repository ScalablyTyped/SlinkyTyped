package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterMenuMessages extends js.Object {
  var additionalOperator: js.UndefOr[String] = js.native
  var additionalValue: js.UndefOr[String] = js.native
  var and: js.UndefOr[String] = js.native
  var clear: js.UndefOr[String] = js.native
  var filter: js.UndefOr[String] = js.native
  var info: js.UndefOr[String] = js.native
  var isFalse: js.UndefOr[String] = js.native
  var isTrue: js.UndefOr[String] = js.native
  var logic: js.UndefOr[String] = js.native
  var or: js.UndefOr[String] = js.native
  var selectValue: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object FilterMenuMessages {
  @scala.inline
  def apply(): FilterMenuMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterMenuMessages]
  }
  @scala.inline
  implicit class FilterMenuMessagesOps[Self <: FilterMenuMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalOperator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalOperator")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditionalValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalValue")(js.undefined)
        ret
    }
    @scala.inline
    def withAnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("and")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("and")(js.undefined)
        ret
    }
    @scala.inline
    def withClear(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFalse(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFalse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFalse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFalse")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTrue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTrue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTrue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTrue")(js.undefined)
        ret
    }
    @scala.inline
    def withLogic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logic")(js.undefined)
        ret
    }
    @scala.inline
    def withOr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("or")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("or")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

