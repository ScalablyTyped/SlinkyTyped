package typingsSlinky.knockout.anon

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddDisposeCallback extends js.Object {
  def addDisposeCallback(node: Node, callback: js.Function): Unit = js.native
  def cleanNode(node: Node): Node = js.native
  def removeDisposeCallback(node: Node, callback: js.Function): Unit = js.native
  def removeNode(node: Node): Unit = js.native
}

object AddDisposeCallback {
  @scala.inline
  def apply(
    addDisposeCallback: (Node, js.Function) => Unit,
    cleanNode: Node => Node,
    removeDisposeCallback: (Node, js.Function) => Unit,
    removeNode: Node => Unit
  ): AddDisposeCallback = {
    val __obj = js.Dynamic.literal(addDisposeCallback = js.Any.fromFunction2(addDisposeCallback), cleanNode = js.Any.fromFunction1(cleanNode), removeDisposeCallback = js.Any.fromFunction2(removeDisposeCallback), removeNode = js.Any.fromFunction1(removeNode))
    __obj.asInstanceOf[AddDisposeCallback]
  }
  @scala.inline
  implicit class AddDisposeCallbackOps[Self <: AddDisposeCallback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddDisposeCallback(value: (Node, js.Function) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDisposeCallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCleanNode(value: Node => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveDisposeCallback(value: (Node, js.Function) => Unit): Self = {
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

