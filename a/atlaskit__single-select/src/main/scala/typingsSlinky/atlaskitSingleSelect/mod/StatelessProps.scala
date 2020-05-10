package typingsSlinky.atlaskitSingleSelect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatelessProps extends Props {
  /** Value to be used when filtering the items. Compared against 'content'. */
  var filterValue: js.UndefOr[String] = js.native
  /**
    * Sets whether the field is loading data. The same property is used
    * for either initial fetch (when no options are available) as well for
    * subsequent loading of more options. The component reacts accordingly
    * based on the `items` provided.
    */
  var isLoading: js.UndefOr[Boolean] = js.native
  /** Sets whether the Select dropdown is open. */
  var isOpen: js.UndefOr[Boolean] = js.native
  /**
    * Message to be displayed when the component is set to its loading state.
    * The message might be displayed differently depending on whether or not
    * there are items already being rendered.
    */
  var loadingMessage: js.UndefOr[String] = js.native
  /** The selected item data */
  var selectedItem: js.UndefOr[ItemType] = js.native
}

object StatelessProps {
  @scala.inline
  def apply(): StatelessProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatelessProps]
  }
  @scala.inline
  implicit class StatelessPropsOps[Self <: StatelessProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterValue")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedItem(value: ItemType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItem")(js.undefined)
        ret
    }
  }
  
}

