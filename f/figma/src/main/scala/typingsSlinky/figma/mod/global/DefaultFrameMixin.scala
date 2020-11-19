package typingsSlinky.figma.mod.global

import typingsSlinky.figma.figmaStrings.AUTO
import typingsSlinky.figma.figmaStrings.FIXED
import typingsSlinky.figma.figmaStrings.HORIZONTAL
import typingsSlinky.figma.figmaStrings.NONE
import typingsSlinky.figma.figmaStrings.VERTICAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultFrameMixin
  extends BaseNodeMixin
     with SceneNodeMixin
     with ReactionMixin
     with ChildrenMixin
     with ContainerMixin
     with GeometryMixin
     with CornerMixin
     with RectangleCornerMixin
     with BlendMixin
     with ConstraintMixin
     with LayoutMixin
     with ExportMixin {
  
  var clipsContent: Boolean = js.native
  
  var counterAxisSizingMode: FIXED | AUTO = js.native
  
  var gridStyleId: String = js.native
  
  var guides: js.Array[Guide] = js.native
  
   // applicable only if layoutMode != "NONE"
  var horizontalPadding: Double = js.native
  
   // applicable only if layoutMode != "NONE"
  var itemSpacing: Double = js.native
  
   // applicable only if layoutMode != "NONE"
  var layoutGrids: js.Array[LayoutGrid] = js.native
  
  var layoutMode: NONE | HORIZONTAL | VERTICAL = js.native
  
  var numberOfFixedChildren: Double = js.native
  
  var overflowDirection: OverflowDirection = js.native
  
  val overlayBackground: OverlayBackground = js.native
  
  val overlayBackgroundInteraction: OverlayBackgroundInteraction = js.native
  
  val overlayPositionType: OverlayPositionType = js.native
  
   // applicable only if layoutMode != "NONE"
  var verticalPadding: Double = js.native
}
