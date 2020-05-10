package typingsSlinky.reactBootstrapTable

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-bootstrap-table.react-bootstrap-table.ButtonGroupProps & {  searchPanel  :react.react.ReactElement,   btnGroup  :react.react.ReactElement,   searchField  :react.react.ReactElement,   clearBtn  :react.react.ReactElement} */
@js.native
trait ButtonGroupPropssearchPan extends js.Object {
  /**
  		 * Button group components.
  		 */
  var btnGroup: ReactElement = js.native
   // search field JSX
  /**
  		 * The button to clear the search field.
  		 */
  var clearBtn: ReactElement = js.native
  /**
  	 * Delete button.
  	 */
  var deleteBtn: ReactElement = js.native
  /**
  	 * Export to CSV button.
  	 */
  var exportCSVBtn: ReactElement = js.native
  /**
  	 * Insert button (to add a row).
  	 */
  var insertBtn: ReactElement = js.native
   // button groups JSX
  /**
  		 * The individual search field.
  		 */
  var searchField: ReactElement = js.native
  /**
  		 * Search panel component.
  		 */
  var searchPanel: ReactElement = js.native
  /**
  	 * Toggle button to switch between showing all rows and showing selected rows only.
  	 */
  var showSelectedOnlyBtn: ReactElement = js.native
}

object ButtonGroupPropssearchPan {
  @scala.inline
  def apply(
    btnGroup: ReactElement,
    clearBtn: ReactElement,
    deleteBtn: ReactElement,
    exportCSVBtn: ReactElement,
    insertBtn: ReactElement,
    searchField: ReactElement,
    searchPanel: ReactElement,
    showSelectedOnlyBtn: ReactElement
  ): ButtonGroupPropssearchPan = {
    val __obj = js.Dynamic.literal(btnGroup = btnGroup.asInstanceOf[js.Any], clearBtn = clearBtn.asInstanceOf[js.Any], deleteBtn = deleteBtn.asInstanceOf[js.Any], exportCSVBtn = exportCSVBtn.asInstanceOf[js.Any], insertBtn = insertBtn.asInstanceOf[js.Any], searchField = searchField.asInstanceOf[js.Any], searchPanel = searchPanel.asInstanceOf[js.Any], showSelectedOnlyBtn = showSelectedOnlyBtn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonGroupPropssearchPan]
  }
  @scala.inline
  implicit class ButtonGroupPropssearchPanOps[Self <: ButtonGroupPropssearchPan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBtnGroup(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearBtn(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteBtn(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportCSVBtn(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportCSVBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertBtn(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchField(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchPanel(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowSelectedOnlyBtn(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSelectedOnlyBtn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

