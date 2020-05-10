package typingsSlinky.knockoutPreRendered

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddDisposeCallback extends js.Object {
  def addDisposeCallback(node: Element, callback: js.Function): Unit = js.native
  def cleanNode(node: Node): Element = js.native
  def removeDisposeCallback(node: Element, callback: js.Function): Unit = js.native
  def removeNode(node: Node): Unit = js.native
}

object AnonAddDisposeCallback {
  @scala.inline
  def apply(
    addDisposeCallback: (Element, js.Function) => Unit,
    cleanNode: Node => Element,
    removeDisposeCallback: (Element, js.Function) => Unit,
    removeNode: Node => Unit
  ): AnonAddDisposeCallback = {
    val __obj = js.Dynamic.literal(addDisposeCallback = js.Any.fromFunction2(addDisposeCallback), cleanNode = js.Any.fromFunction1(cleanNode), removeDisposeCallback = js.Any.fromFunction2(removeDisposeCallback), removeNode = js.Any.fromFunction1(removeNode))
    __obj.asInstanceOf[AnonAddDisposeCallback]
  }
  @scala.inline
  implicit class AnonAddDisposeCallbackOps[Self <: AnonAddDisposeCallback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddDisposeCallback(value: (Element, js.Function) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDisposeCallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCleanNode(value: Node => Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveDisposeCallback(value: (Element, js.Function) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDisposeCallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveNode(value: Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeNode")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

