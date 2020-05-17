package typingsSlinky.figma.mod.global

import typingsSlinky.figma.figmaStrings.BOOLEAN_OPERATION
import typingsSlinky.figma.figmaStrings.EXCLUDE
import typingsSlinky.figma.figmaStrings.INTERSECT
import typingsSlinky.figma.figmaStrings.SUBTRACT
import typingsSlinky.figma.figmaStrings.UNION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BooleanOperationNode
  extends SceneNode
     with BaseNodeMixin
     with SceneNodeMixin
     with ReactionMixin
     with BlendMixin
     with GeometryMixin
     with LayoutMixin
     with ExportMixin
     with ChildrenMixin
     with CornerMixin {
  var booleanOperation: UNION | INTERSECT | SUBTRACT | EXCLUDE = js.native
  var expanded: Boolean = js.native
  val `type`: BOOLEAN_OPERATION = js.native
}

