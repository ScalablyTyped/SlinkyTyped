package typingsSlinky.appletvjs.AppleTVJS

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuBarDocument extends js.Object {
  /**
  		 * Retrieves the document associated with the specified menu item.
  		 * */
  def getDocument(menuItem: Element): Document = js.native
  /**
  		 * Associates a document with a menu item.
  		 * */
  def setDocument(document: Document, menuItem: Element): Unit = js.native
  /**
  		 * Sets the focus in a menu bar to the specified menu item.
  		 * */
  def setSelectedItem(menuItem: Element): Unit = js.native
}

object MenuBarDocument {
  @scala.inline
  def apply(
    getDocument: Element => Document,
    setDocument: (Document, Element) => Unit,
    setSelectedItem: Element => Unit
  ): MenuBarDocument = {
    val __obj = js.Dynamic.literal(getDocument = js.Any.fromFunction1(getDocument), setDocument = js.Any.fromFunction2(setDocument), setSelectedItem = js.Any.fromFunction1(setSelectedItem))
    __obj.asInstanceOf[MenuBarDocument]
  }
  @scala.inline
  implicit class MenuBarDocumentOps[Self <: MenuBarDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDocument(value: Element => Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDocument")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDocument(value: (Document, Element) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDocument")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetSelectedItem(value: Element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelectedItem")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

