package typingsSlinky.nivoAxes.mod

import typingsSlinky.nivoCore.mod.Dimensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxesProps
  extends Dimensions
     with AxisPositions
     with Scales
object AxesProps {
  
  @scala.inline
  def apply(
    bottom: AxisProps,
    height: Double,
    left: AxisProps,
    right: AxisProps,
    top: AxisProps,
    width: Double
  ): AxesProps = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxesProps]
  }
}
