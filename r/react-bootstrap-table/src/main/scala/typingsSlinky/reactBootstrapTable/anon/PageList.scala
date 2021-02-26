package typingsSlinky.reactBootstrapTable.anon

import org.scalajs.dom.raw.HTMLUListElement
import slinky.core.facade.ReactElement
import typingsSlinky.reactBootstrapTable.mod.SizePerPageDropDown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageList extends StObject {
  
  /**
    * The default list of page change buttons.
    */
  var pageList: HTMLUListElement = js.native
  
  /**
    * Default sizePerPageDropdown component.
    */
  var sizePerPageDropDown: SizePerPageDropDown = js.native
  
  /**
    * Text/element to display when displaying the total number of rows.
    */
  var totalText: String | ReactElement = js.native
}
object PageList {
  
  @scala.inline
  def apply(
    pageList: HTMLUListElement,
    sizePerPageDropDown: SizePerPageDropDown,
    totalText: String | ReactElement
  ): PageList = {
    val __obj = js.Dynamic.literal(pageList = pageList.asInstanceOf[js.Any], sizePerPageDropDown = sizePerPageDropDown.asInstanceOf[js.Any], totalText = totalText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageList]
  }
  
  @scala.inline
  implicit class PageListMutableBuilder[Self <: PageList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageList(value: HTMLUListElement): Self = StObject.set(x, "pageList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizePerPageDropDown(value: SizePerPageDropDown): Self = StObject.set(x, "sizePerPageDropDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalText(value: String | ReactElement): Self = StObject.set(x, "totalText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalTextReactElement(value: ReactElement): Self = StObject.set(x, "totalText", value.asInstanceOf[js.Any])
  }
}
