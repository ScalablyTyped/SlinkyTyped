package typingsSlinky.ckeditor.CKEDITOR.ui.panel

import typingsSlinky.ckeditor.CKEDITOR.dom.nodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait block extends js.Object {
  def getItems(): nodeList = js.native
  def markItem(index: Double): Unit = js.native
}

object block {
  @scala.inline
  def apply(getItems: () => nodeList, markItem: Double => Unit): block = {
    val __obj = js.Dynamic.literal(getItems = js.Any.fromFunction0(getItems), markItem = js.Any.fromFunction1(markItem))
    __obj.asInstanceOf[block]
  }
  @scala.inline
  implicit class blockOps[Self <: block] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetItems(value: () => nodeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMarkItem(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markItem")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

