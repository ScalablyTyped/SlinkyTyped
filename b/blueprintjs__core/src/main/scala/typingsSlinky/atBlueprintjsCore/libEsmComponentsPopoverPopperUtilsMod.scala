package typingsSlinky.atBlueprintjsCore

import typingsSlinky.atBlueprintjsCore.atBlueprintjsCoreStrings.bottom
import typingsSlinky.atBlueprintjsCore.atBlueprintjsCoreStrings.center
import typingsSlinky.atBlueprintjsCore.atBlueprintjsCoreStrings.left
import typingsSlinky.atBlueprintjsCore.atBlueprintjsCoreStrings.right
import typingsSlinky.atBlueprintjsCore.atBlueprintjsCoreStrings.top
import typingsSlinky.popperDotJs.popperDotJsMod.Popper.Data
import typingsSlinky.popperDotJs.popperDotJsMod.Popper.ModifierFn
import typingsSlinky.popperDotJs.popperDotJsMod.Popper.Placement
import typingsSlinky.popperDotJs.popperDotJsMod.Popper.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/popover/popperUtils", JSImport.Namespace)
@js.native
object libEsmComponentsPopoverPopperUtilsMod extends js.Object {
  val arrowOffsetModifier: ModifierFn = js.native
  def getAlignment(placement: Placement): center | left | right = js.native
  def getOppositePosition(side: Position): left | right | bottom | top = js.native
  def getPosition(placement: Placement): left | right | bottom | top = js.native
  def getTransformOrigin(data: Data): String = js.native
  def isVerticalPosition(side: Position): Boolean = js.native
}

