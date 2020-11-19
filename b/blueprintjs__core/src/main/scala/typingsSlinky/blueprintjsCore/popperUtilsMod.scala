package typingsSlinky.blueprintjsCore

import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.bottom
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.center
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.left
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.right
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.top
import typingsSlinky.popperJs.mod.Popper.Data
import typingsSlinky.popperJs.mod.Popper.ModifierFn
import typingsSlinky.popperJs.mod.Popper.Placement
import typingsSlinky.popperJs.mod.Popper.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components/popover/popperUtils", JSImport.Namespace)
@js.native
object popperUtilsMod extends js.Object {
  
  val arrowOffsetModifier: ModifierFn = js.native
  
  def getAlignment(placement: Placement): center | left | right = js.native
  
  def getOppositePosition(side: Position): left | right | bottom | top = js.native
  
  def getPosition(placement: Placement): left | right | bottom | top = js.native
  
  def getTransformOrigin(data: Data): String = js.native
  
  def isVerticalPosition(side: Position): Boolean = js.native
}
