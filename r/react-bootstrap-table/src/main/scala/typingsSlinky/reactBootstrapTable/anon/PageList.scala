package typingsSlinky.reactBootstrapTable.anon

import org.scalajs.dom.raw.HTMLUListElement
import slinky.core.facade.ReactElement
import typingsSlinky.reactBootstrapTable.mod.SizePerPageDropDown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageList extends js.Object {
  /**
    * The default list of page change buttons.
    */
  var pageList: HTMLUListElement
  /**
    * Default sizePerPageDropdown component.
    */
  var sizePerPageDropDown: SizePerPageDropDown
  /**
    * Text/element to display when displaying the total number of rows.
    */
  var totalText: String | ReactElement
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
}

