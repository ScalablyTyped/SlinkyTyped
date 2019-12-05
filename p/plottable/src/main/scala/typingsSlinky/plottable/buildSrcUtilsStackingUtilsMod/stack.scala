package typingsSlinky.plottable.buildSrcUtilsStackingUtilsMod

import typingsSlinky.plottable.buildSrcCoreDatasetMod.Dataset
import typingsSlinky.plottable.buildSrcCoreInterfacesMod.IAccessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils/stackingUtils", "stack")
@js.native
object stack extends js.Object {
  def apply(datasets: js.Array[Dataset], keyAccessor: IAccessor[_], valueAccessor: IAccessor[Double]): StackingResult = js.native
  def apply(
    datasets: js.Array[Dataset],
    keyAccessor: IAccessor[_],
    valueAccessor: IAccessor[Double],
    stackingOrder: IStackingOrder
  ): StackingResult = js.native
}

