package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ɵDirectRenderer extends js.Object {
  def appendChild(node: js.Any, parent: js.Any): Unit
  def insertBefore(node: js.Any, refNode: js.Any): Unit
  def nextSibling(node: js.Any): js.Any
  def parentElement(node: js.Any): js.Any
  def remove(node: js.Any): Unit
}

object ɵDirectRenderer {
  @scala.inline
  def apply(
    appendChild: (js.Any, js.Any) => Unit,
    insertBefore: (js.Any, js.Any) => Unit,
    nextSibling: js.Any => js.Any,
    parentElement: js.Any => js.Any,
    remove: js.Any => Unit
  ): ɵDirectRenderer = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction2(appendChild), insertBefore = js.Any.fromFunction2(insertBefore), nextSibling = js.Any.fromFunction1(nextSibling), parentElement = js.Any.fromFunction1(parentElement), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[ɵDirectRenderer]
  }
  @scala.inline
  implicit class ɵDirectRendererOps[Self <: ɵDirectRenderer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppendChild(value: (js.Any, js.Any) => Unit): Self = this.set("appendChild", js.Any.fromFunction2(value))
    @scala.inline
    def setInsertBefore(value: (js.Any, js.Any) => Unit): Self = this.set("insertBefore", js.Any.fromFunction2(value))
    @scala.inline
    def setNextSibling(value: js.Any => js.Any): Self = this.set("nextSibling", js.Any.fromFunction1(value))
    @scala.inline
    def setParentElement(value: js.Any => js.Any): Self = this.set("parentElement", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: js.Any => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
  }
  
}

