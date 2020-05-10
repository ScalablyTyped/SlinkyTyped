package typingsSlinky.reactWidgets.dropdownListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropdownListMessages extends js.Object {
  /**
    * Text to display for the create option
    * @default: "Create option {text}"
    */
  var createOption: js.UndefOr[String | (js.Function1[/* props */ DropdownListProps, String])] = js.native
  /**
    * Text to display when the the current filter does not return any results.
    * @default: "The filter returned no results"
    */
  var emptyFilter: js.UndefOr[String | (js.Function1[/* props */ DropdownListProps, String])] = js.native
  /**
    * Text to display when the data prop array is empty.
    * @default: "There are no items in this list"
    */
  var emptyList: js.UndefOr[String | (js.Function1[/* props */ DropdownListProps, String])] = js.native
  /**
    * The placeholder text for the filter input.
    */
  var filterPlaceholder: js.UndefOr[String | (js.Function1[/* props */ DropdownListProps, String])] = js.native
  /**
    * Dropdown button text for screen readers.
    * @default: "Open Dropdown"
    */
  var open: js.UndefOr[String | (js.Function1[/* props */ DropdownListProps, String])] = js.native
}

object DropdownListMessages {
  @scala.inline
  def apply(): DropdownListMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropdownListMessages]
  }
  @scala.inline
  implicit class DropdownListMessagesOps[Self <: DropdownListMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateOptionFunction1(value: /* props */ DropdownListProps => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createOption")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateOption(value: String | (js.Function1[/* props */ DropdownListProps, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createOption")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyFilterFunction1(value: /* props */ DropdownListProps => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEmptyFilter(value: String | (js.Function1[/* props */ DropdownListProps, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyListFunction1(value: /* props */ DropdownListProps => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEmptyList(value: String | (js.Function1[/* props */ DropdownListProps, String])): Self = {
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
    @scala.inline
    def withFilterPlaceholderFunction1(value: /* props */ DropdownListProps => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPlaceholder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFilterPlaceholder(value: String | (js.Function1[/* props */ DropdownListProps, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenFunction1(value: /* props */ DropdownListProps => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOpen(value: String | (js.Function1[/* props */ DropdownListProps, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
  }
  
}

