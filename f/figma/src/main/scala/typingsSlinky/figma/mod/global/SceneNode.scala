package typingsSlinky.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.figma.mod.global.SliceNode
  - typingsSlinky.figma.mod.global.FrameNode
  - typingsSlinky.figma.mod.global.GroupNode
  - typingsSlinky.figma.mod.global.ComponentNode
  - typingsSlinky.figma.mod.global.InstanceNode
  - typingsSlinky.figma.mod.global.BooleanOperationNode
  - typingsSlinky.figma.mod.global.VectorNode
  - typingsSlinky.figma.mod.global.StarNode
  - typingsSlinky.figma.mod.global.LineNode
  - typingsSlinky.figma.mod.global.EllipseNode
  - typingsSlinky.figma.mod.global.PolygonNode
  - typingsSlinky.figma.mod.global.RectangleNode
  - typingsSlinky.figma.mod.global.TextNode
*/
trait SceneNode extends BaseNode

object SceneNode {
  @scala.inline
  implicit def apply(value: BooleanOperationNode): SceneNode = value.asInstanceOf[SceneNode]
  @scala.inline
  implicit def apply(value: ComponentNode): SceneNode = value.asInstanceOf[SceneNode]
  @scala.inline
  implicit def apply(value: EllipseNode): SceneNode = value.asInstanceOf[SceneNode]
  @scala.inline
  implicit def apply(value: FrameNode): SceneNode = value.asInstanceOf[SceneNode]
  @scala.inline
  implicit def apply(value: GroupNode): SceneNode = value.asInstanceOf[SceneNode]
  @scala.inline
  implicit def apply(value: InstanceNode): SceneNode = value.asInstanceOf[SceneNode]
  @scala.inline
  implicit def apply(value: LineNode): SceneNode = value.asInstanceOf[SceneNode]
  @scala.inline
  implicit def apply(value: PolygonNode): SceneNode = value.asInstanceOf[SceneNode]
  @scala.inline
  implicit def apply(value: RectangleNode): SceneNode = value.asInstanceOf[SceneNode]
  @scala.inline
  implicit def apply(value: SliceNode): SceneNode = value.asInstanceOf[SceneNode]
  @scala.inline
  implicit def apply(value: StarNode): SceneNode = value.asInstanceOf[SceneNode]
  @scala.inline
  implicit def apply(value: TextNode): SceneNode = value.asInstanceOf[SceneNode]
  @scala.inline
  implicit def apply(value: VectorNode): SceneNode = value.asInstanceOf[SceneNode]
}

