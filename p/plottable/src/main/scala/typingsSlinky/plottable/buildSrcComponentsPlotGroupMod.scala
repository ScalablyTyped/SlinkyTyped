package typingsSlinky.plottable

import typingsSlinky.plottable.buildSrcComponentsGroupMod.Group
import typingsSlinky.plottable.buildSrcCoreInterfacesMod.Point
import typingsSlinky.plottable.buildSrcPlotsCommonsMod.IPlotEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/components/plotGroup", JSImport.Namespace)
@js.native
object buildSrcComponentsPlotGroupMod extends js.Object {
  @js.native
  class PlotGroup () extends Group {
    def entityNearest(point: Point): IPlotEntity = js.native
  }
  
}

