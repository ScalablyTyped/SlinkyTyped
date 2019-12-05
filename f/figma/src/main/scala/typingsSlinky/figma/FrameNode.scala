package typingsSlinky.figma

import typingsSlinky.figma.figmaStrings.FRAME
import typingsSlinky.figma.figmaStrings.GROUP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameNode
  extends SceneNode
     with BaseNodeMixin
     with SceneNodeMixin
     with ChildrenMixin
     with FrameMixin
     with BlendMixin
     with ConstraintMixin
     with LayoutMixin
     with ExportMixin {
  val `type`: FRAME | GROUP = js.native
}

