package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientComboBox.ItemFiltering and ASPxClientListBox.ItemFiltering events.
  */
@js.native
trait ASPxClientListEditItemFilteringEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a string that is a filter condition for the editor's items typed by a user.
    */
  var filter: String = js.native
  /**
    * Specifies whether the item should be shown in the search result.
    */
  var isFit: Boolean = js.native
  /**
    * Gets the editor item object related to the event.
    */
  var item: ASPxClientListEditItem = js.native
}

object ASPxClientListEditItemFilteringEventArgs {
  @scala.inline
  def apply(filter: String, isFit: Boolean, item: ASPxClientListEditItem): ASPxClientListEditItemFilteringEventArgs = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], isFit = isFit.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientListEditItemFilteringEventArgs]
  }
  @scala.inline
  implicit class ASPxClientListEditItemFilteringEventArgsOps[Self <: ASPxClientListEditItemFilteringEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: ASPxClientListEditItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

