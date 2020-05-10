package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ɵDirectRenderer extends js.Object {
  def appendChild(node: js.Any, parent: js.Any): Unit = js.native
  def insertBefore(node: js.Any, refNode: js.Any): Unit = js.native
  def nextSibling(node: js.Any): js.Any = js.native
  def parentElement(node: js.Any): js.Any = js.native
  def remove(node: js.Any): Unit = js.native
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
    def withAppendChild(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendChild")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInsertBefore(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBefore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNextSibling(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSibling")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParentElement(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

