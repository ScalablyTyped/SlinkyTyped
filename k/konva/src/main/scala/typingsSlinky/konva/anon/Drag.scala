package typingsSlinky.konva.anon

import typingsSlinky.konva.nodeMod.Node
import typingsSlinky.konva.nodeMod.NodeConfig
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Drag extends js.Object {
  
  def _drag(evt: js.Any): Unit = js.native
  
  var _dragElements: Map[Double, DragStatus] = js.native
  
  def _endDragAfter(evt: js.Any): Unit = js.native
  
  def _endDragBefore(): Unit = js.native
  def _endDragBefore(evt: js.Any): Unit = js.native
  
  val isDragging: Boolean = js.native
  
  var justDragged: Boolean = js.native
  
  val node: Node[NodeConfig] = js.native
}
