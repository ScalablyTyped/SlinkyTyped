package typingsSlinky.knockoutPreRendered.anon

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddDisposeCallback extends js.Object {
  def addDisposeCallback(node: org.scalajs.dom.raw.Element, callback: js.Function): Unit
  def cleanNode(node: Node): org.scalajs.dom.raw.Element
  def removeDisposeCallback(node: org.scalajs.dom.raw.Element, callback: js.Function): Unit
  def removeNode(node: Node): Unit
}

object AddDisposeCallback {
  @scala.inline
  def apply(
    addDisposeCallback: (org.scalajs.dom.raw.Element, js.Function) => Unit,
    cleanNode: Node => org.scalajs.dom.raw.Element,
    removeDisposeCallback: (org.scalajs.dom.raw.Element, js.Function) => Unit,
    removeNode: Node => Unit
  ): AddDisposeCallback = {
    val __obj = js.Dynamic.literal(addDisposeCallback = js.Any.fromFunction2(addDisposeCallback), cleanNode = js.Any.fromFunction1(cleanNode), removeDisposeCallback = js.Any.fromFunction2(removeDisposeCallback), removeNode = js.Any.fromFunction1(removeNode))
    __obj.asInstanceOf[AddDisposeCallback]
  }
}

