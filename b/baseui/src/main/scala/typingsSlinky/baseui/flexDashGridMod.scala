package typingsSlinky.baseui

import slinky.core.ReactComponentClass
import typingsSlinky.baseui.blockMod.BlockProps
import typingsSlinky.baseui.blockMod.Responsive
import typingsSlinky.baseui.blockMod.Scale
import typingsSlinky.baseui.flexDashGridMod.FlexGridProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/flex-grid", JSImport.Namespace)
@js.native
object flexDashGridMod extends js.Object {
  @js.native
  trait FlexGridProps extends BlockProps {
    var flexGridColumnCount: js.UndefOr[Responsive[Double]] = js.native
    var flexGridColumnGap: js.UndefOr[Responsive[Scale]] = js.native
    var flexGridRowGap: js.UndefOr[Responsive[Scale]] = js.native
  }
  
  val FlexGrid: ReactComponentClass[FlexGridProps] = js.native
  val FlexGridItem: ReactComponentClass[FlexGridProps] = js.native
  type FlexGridItemProps = FlexGridProps
}

