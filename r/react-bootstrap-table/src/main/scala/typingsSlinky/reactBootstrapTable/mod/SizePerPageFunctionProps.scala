package typingsSlinky.reactBootstrapTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizePerPageFunctionProps extends js.Object {
  /**
  	 * Current size per page as a string value.
  	 */
  var currSizePerPage: String = js.native
  /**
  	 * Flag indicating that the sizePerPage dropdown should be hidden.
  	 */
  var hideSizePerPage: Boolean = js.native
  /**
  	 * Flag to indicate that the sizePerPage dropdown should currently be 'open'.
  	 */
  var open: Boolean = js.native
  /**
  	 * Array of the size per page options to display in the dropdown.
  	 */
  var sizePerPageList: SizePerPageList = js.native
  /**
  	 * Callback function to use to change the current size per page.
  	 */
  def changeSizePerPage(newSizePerPage: Double): Unit = js.native
  /**
  	 * On-click toggle function callback to open/close the size per page dropdown list.
  	 */
  def toggleDropDown(): Unit = js.native
}

object SizePerPageFunctionProps {
  @scala.inline
  def apply(
    changeSizePerPage: Double => Unit,
    currSizePerPage: String,
    hideSizePerPage: Boolean,
    open: Boolean,
    sizePerPageList: SizePerPageList,
    toggleDropDown: () => Unit
  ): SizePerPageFunctionProps = {
    val __obj = js.Dynamic.literal(changeSizePerPage = js.Any.fromFunction1(changeSizePerPage), currSizePerPage = currSizePerPage.asInstanceOf[js.Any], hideSizePerPage = hideSizePerPage.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], sizePerPageList = sizePerPageList.asInstanceOf[js.Any], toggleDropDown = js.Any.fromFunction0(toggleDropDown))
    __obj.asInstanceOf[SizePerPageFunctionProps]
  }
  @scala.inline
  implicit class SizePerPageFunctionPropsOps[Self <: SizePerPageFunctionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeSizePerPage(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeSizePerPage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCurrSizePerPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currSizePerPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideSizePerPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSizePerPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizePerPageList(value: SizePerPageList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizePerPageList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleDropDown(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleDropDown")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

