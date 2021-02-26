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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popperUtilsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/popover/popperUtils", "arrowOffsetModifier")
  @js.native
  val arrowOffsetModifier: ModifierFn = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/popover/popperUtils", "getAlignment")
  @js.native
  def getAlignment(placement: Placement): center | left | right = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/popover/popperUtils", "getOppositePosition")
  @js.native
  def getOppositePosition(side: Position): left | right | bottom | top = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/popover/popperUtils", "getPosition")
  @js.native
  def getPosition(placement: Placement): left | right | bottom | top = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/popover/popperUtils", "getTransformOrigin")
  @js.native
  def getTransformOrigin(data: Data): String = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/popover/popperUtils", "isVerticalPosition")
  @js.native
  def isVerticalPosition(side: Position): Boolean = js.native
}
