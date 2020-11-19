package typingsSlinky.plottable

import typingsSlinky.plottable.commonsMod.IPlotEntity
import typingsSlinky.plottable.groupMod.Group
import typingsSlinky.plottable.interfacesMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/components/plotGroup", JSImport.Namespace)
@js.native
object plotGroupMod extends js.Object {
  
  @js.native
  class PlotGroup () extends Group {
    
    def entityNearest(point: Point): IPlotEntity = js.native
  }
}
