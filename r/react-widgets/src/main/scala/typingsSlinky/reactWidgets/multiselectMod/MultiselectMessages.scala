package typingsSlinky.reactWidgets.multiselectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiselectMessages extends js.Object {
  /**
    * The text label for creating new tags.
    * @default "(create new tag)"
    */
  var createNew: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.native
  var createOption: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.native
  /**
    * Text to display when the the current filter does not return any results.
    * @default "The filter returned no results"
    */
  var emptyFilter: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.native
  /**
    * Text to display when the data prop array is empty.
    * @default "There are no items in this list"
    */
  var emptyList: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.native
  var noneSelected: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.native
  var open: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.native
  var removeLabel: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.native
  var selectedItems: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.native
  var tagsLabel: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.native
}

object MultiselectMessages {
  @scala.inline
  def apply(): MultiselectMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiselectMessages]
  }
  @scala.inline
  implicit class MultiselectMessagesOps[Self <: MultiselectMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateNewFunction1(value: /* props */ MultiselectProps => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNew")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateNew(value: String | (js.Function1[/* props */ MultiselectProps, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNew")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateNew: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNew")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateOptionFunction1(value: /* props */ MultiselectProps => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createOption")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateOption(value: String | (js.Function1[/* props */ MultiselectProps, String])): Self = {
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
    def withEmptyFilterFunction1(value: /* props */ MultiselectProps => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEmptyFilter(value: String | (js.Function1[/* props */ MultiselectProps, String])): Self = {
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
    def withEmptyListFunction1(value: /* props */ MultiselectProps => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEmptyList(value: String | (js.Function1[/* props */ MultiselectProps, String])): Self = {
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
    def withNoneSelectedFunction1(value: /* props */ MultiselectProps => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noneSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNoneSelected(value: String | (js.Function1[/* props */ MultiselectProps, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noneSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoneSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noneSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenFunction1(value: /* props */ MultiselectProps => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOpen(value: String | (js.Function1[/* props */ MultiselectProps, String])): Self = {
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
    @scala.inline
    def withRemoveLabelFunction1(value: /* props */ MultiselectProps => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveLabel(value: String | (js.Function1[/* props */ MultiselectProps, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedItemsFunction1(value: /* props */ MultiselectProps => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItems")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelectedItems(value: String | (js.Function1[/* props */ MultiselectProps, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItems")(js.undefined)
        ret
    }
    @scala.inline
    def withTagsLabelFunction1(value: /* props */ MultiselectProps => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagsLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTagsLabel(value: String | (js.Function1[/* props */ MultiselectProps, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagsLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagsLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagsLabel")(js.undefined)
        ret
    }
  }
  
}

