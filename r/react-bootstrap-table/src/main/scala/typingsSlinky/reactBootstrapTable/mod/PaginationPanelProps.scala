package typingsSlinky.reactBootstrapTable.mod

import typingsSlinky.reactBootstrapTable.anon.PageList
import typingsSlinky.reactBootstrapTable.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginationPanelProps extends StObject {
  
  /**
    * Callback function to use to change page.
    */
  def changePage(pageNum: Double): Unit = js.native
  
  /**
    * Callback function to use to set a new size per page.
    */
  def changeSizePerPage(sizePerPage: Double): Unit = js.native
  
  /**
    * The basic components for the pagination panel, provided here so that you have the option to use some of them
    * if you don't want to customize all of them.
    */
  var components: PageList = js.native
  
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
    * Callback function to trigger the toggle on sizePerPage dropdown button
    */
  def toggleDropDown(): Unit = js.native
}
object PaginationPanelProps {
  
  @scala.inline
  def apply(
    changePage: Double => Unit,
    changeSizePerPage: Double => Unit,
    components: PageList,
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
  implicit class PaginationPanelPropsMutableBuilder[Self <: PaginationPanelProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangePage(value: Double => Unit): Self = StObject.set(x, "changePage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeSizePerPage(value: Double => Unit): Self = StObject.set(x, "changeSizePerPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponents(value: PageList): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrPage(value: Double): Self = StObject.set(x, "currPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageStartIndex(value: Double): Self = StObject.set(x, "pageStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizePerPage(value: Double): Self = StObject.set(x, "sizePerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizePerPageList(value: SizePerPageList): Self = StObject.set(x, "sizePerPageList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizePerPageListVarargs(value: (Double | Text)*): Self = StObject.set(x, "sizePerPageList", js.Array(value :_*))
    
    @scala.inline
    def setToggleDropDown(value: () => Unit): Self = StObject.set(x, "toggleDropDown", js.Any.fromFunction0(value))
  }
}
