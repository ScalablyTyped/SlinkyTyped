package typingsSlinky.reactBootstrapTable.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchPanelProps extends js.Object {
  /**
  	 * Default clear search field button component.
  	 */
  var clearBtn: ReactElement = js.native
  /**
  	 * The default search text.
  	 */
  var defaultValue: String = js.native
  /**
  	 * The placeholder text for the search field.
  	 */
  var placeholder: String = js.native
  /**
  	 * Default search field component.
  	 */
  var searchField: ReactElement = js.native
  /**
  	 * A callback to trigger the clear search field event.
  	 */
  def clearBtnClick(): Unit = js.native
  /**
  	 * A callback to trigger a search, takes the search text as an input.
  	 */
  def search(searchText: String): Unit = js.native
}

object SearchPanelProps {
  @scala.inline
  def apply(
    clearBtn: ReactElement,
    clearBtnClick: () => Unit,
    defaultValue: String,
    placeholder: String,
    search: String => Unit,
    searchField: ReactElement
  ): SearchPanelProps = {
    val __obj = js.Dynamic.literal(clearBtn = clearBtn.asInstanceOf[js.Any], clearBtnClick = js.Any.fromFunction0(clearBtnClick), defaultValue = defaultValue.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], search = js.Any.fromFunction1(search), searchField = searchField.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPanelProps]
  }
  @scala.inline
  implicit class SearchPanelPropsOps[Self <: SearchPanelProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearBtn(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearBtnClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearBtnClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDefaultValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearch(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSearchField(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchField")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

