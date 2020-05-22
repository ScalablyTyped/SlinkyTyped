package typingsSlinky.reactD3Graph.mod

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphEventCallbacks extends js.Object {
  def onClickLink(source: String, target: String): Unit
  def onClickNode(nodeId: String): Unit
  def onDoubleClickNode(nodeId: String): Unit
  def onMouseOutLink(source: String, target: String): Unit
  def onMouseOutNode(nodeId: String): Unit
  def onMouseOverLink(source: String, target: String): Unit
  def onMouseOverNode(nodeId: String): Unit
  def onNodePositionChange(nodeId: String, x: Double, y: Double): Unit
  def onRightClickLink(event: SyntheticMouseEvent[Element], source: String, target: String): Unit
  def onRightClickNode(event: SyntheticMouseEvent[Element], nodeId: String): Unit
}

object GraphEventCallbacks {
  @scala.inline
  def apply(
    onClickLink: (String, String) => Unit,
    onClickNode: String => Unit,
    onDoubleClickNode: String => Unit,
    onMouseOutLink: (String, String) => Unit,
    onMouseOutNode: String => Unit,
    onMouseOverLink: (String, String) => Unit,
    onMouseOverNode: String => Unit,
    onNodePositionChange: (String, Double, Double) => Unit,
    onRightClickLink: (SyntheticMouseEvent[Element], String, String) => Unit,
    onRightClickNode: (SyntheticMouseEvent[Element], String) => Unit
  ): GraphEventCallbacks = {
    val __obj = js.Dynamic.literal(onClickLink = js.Any.fromFunction2(onClickLink), onClickNode = js.Any.fromFunction1(onClickNode), onDoubleClickNode = js.Any.fromFunction1(onDoubleClickNode), onMouseOutLink = js.Any.fromFunction2(onMouseOutLink), onMouseOutNode = js.Any.fromFunction1(onMouseOutNode), onMouseOverLink = js.Any.fromFunction2(onMouseOverLink), onMouseOverNode = js.Any.fromFunction1(onMouseOverNode), onNodePositionChange = js.Any.fromFunction3(onNodePositionChange), onRightClickLink = js.Any.fromFunction3(onRightClickLink), onRightClickNode = js.Any.fromFunction2(onRightClickNode))
    __obj.asInstanceOf[GraphEventCallbacks]
  }
}

