package typingsSlinky.figma.mod.global

import typingsSlinky.figma.figmaStrings.RECTANGLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RectangleNode
  extends SceneNode
     with BaseNodeMixin
     with SceneNodeMixin
     with ReactionMixin
     with BlendMixin
     with GeometryMixin
     with LayoutMixin
     with ExportMixin
     with ConstraintMixin
     with CornerMixin
     with RectangleCornerMixin {
  
  val `type`: RECTANGLE = js.native
}
