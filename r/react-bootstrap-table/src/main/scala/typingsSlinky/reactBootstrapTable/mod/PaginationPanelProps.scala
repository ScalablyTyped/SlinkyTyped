package typingsSlinky.reactBootstrapTable.mod

import typingsSlinky.reactBootstrapTable.AnonPageList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationPanelProps extends js.Object {
  /**
  	 * The basic components for the pagination panel, provided here so that you have the option to use some of them
  	 * if you don't want to customize all of them.
  	 */
  var components: AnonPageList = js.native
  /**
  	 * Current page number
  	 */
  var currPage: Double = js.native
  /**
  	 * Index number for the first page of data.
  	 * Comes from Options.pageStartIndex.
  	 */
  var pageStartIndex: Double = js.native
  /**
  	 * Current number of rows to show per page
  	 */
  var sizePerPage: Double = js.native
  /**
  	 * Choices for size per page dropdown component
  	 */
  var sizePerPageList: SizePerPageList = js.native
  /**
  	 * Callback function to use to change page.
  	 */
  def changePage(pageNum: Double): Unit = js.native
  /**
  	 * Callback function to use to set a new size per page.
  	 */
  def changeSizePerPage(sizePerPage: Double): Unit = js.native
  /**
  	 * Callback function to trigger the toggle on sizePerPage dropdown button
  	 */
  def toggleDropDown(): Unit = js.native
}

object PaginationPanelProps {
  @scala.inline
  def apply(
    changePage: Double => Unit,
    changeSizePerPage: Double => Unit,
    components: AnonPageList,
    currPage: Double,
    pageStartIndex: Double,
    sizePerPage: Double,
    sizePerPageList: SizePerPageList,
    toggleDropDown: () => Unit
  ): PaginationPanelProps = {
    val __obj = js.Dynamic.literal(changePage = js.Any.fromFunction1(changePage), changeSizePerPage = js.Any.fromFunction1(changeSizePerPage), components = components.asInstanceOf[js.Any], currPage = currPage.asInstanceOf[js.Any], pageStartIndex = pageStartIndex.asInstanceOf[js.Any], sizePerPage = sizePerPage.asInstanceOf[js.Any], sizePerPageList = sizePerPageList.asInstanceOf[js.Any], toggleDropDown = js.Any.fromFunction0(toggleDropDown))
    __obj.asInstanceOf[PaginationPanelProps]
  }
  @scala.inline
  implicit class PaginationPanelPropsOps[Self <: PaginationPanelProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangePage(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changePage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChangeSizePerPage(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeSizePerPage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponents(value: AnonPageList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageStartIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizePerPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizePerPage")(value.asInstanceOf[js.Any])
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

