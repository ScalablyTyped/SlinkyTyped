package typingsSlinky.reactBootstrapTable.anon

import org.scalajs.dom.raw.HTMLUListElement
import slinky.core.facade.ReactElement
import typingsSlinky.reactBootstrapTable.mod.SizePerPageDropDown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageList extends js.Object {
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
  implicit class PageListOps[Self <: PageList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPageList(value: HTMLUListElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizePerPageDropDown(value: SizePerPageDropDown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizePerPageDropDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalTextReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalText(value: String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

