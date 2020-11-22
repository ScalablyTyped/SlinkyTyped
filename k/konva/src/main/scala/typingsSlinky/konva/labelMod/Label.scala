package typingsSlinky.konva.labelMod

import typingsSlinky.konva.groupMod.Group
import typingsSlinky.konva.nodeMod.Node
import typingsSlinky.konva.nodeMod.NodeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva/types/shapes/Label", "Label")
@js.native
class Label protected () extends Group {
  def this(config: js.Any) = this()
  
  def _addListeners(text: js.Any): Unit = js.native
  
  def _sync(): Unit = js.native
  
  def getHeight(): Double = js.native
  
  def getTag(): Tag = js.native
  
  def getText(): Node[NodeConfig] = js.native
  
  def getWidth(): Double = js.native
}
