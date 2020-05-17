package typingsSlinky.plottable.utilsMod

import typingsSlinky.lodash.mod.MemoizedFunction
import typingsSlinky.plottable.anon.MaximumExtents
import typingsSlinky.plottable.datasetMod.Dataset
import typingsSlinky.plottable.interfacesMod.IAccessor
import typingsSlinky.plottable.stackingUtilsMod.GenericStackingResult
import typingsSlinky.plottable.stackingUtilsMod.IStackingOrder
import typingsSlinky.plottable.stackingUtilsMod.StackingResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils", "Stacking")
@js.native
object Stacking extends js.Object {
  val normalizeKey: (js.Function1[/* key */ js.Any, String]) with MemoizedFunction = js.native
  def stack(datasets: js.Array[Dataset], keyAccessor: IAccessor[_], valueAccessor: IAccessor[Double]): StackingResult = js.native
  def stack(
    datasets: js.Array[Dataset],
    keyAccessor: IAccessor[_],
    valueAccessor: IAccessor[Double],
    stackingOrder: IStackingOrder
  ): StackingResult = js.native
  def stackedExtent(stackingResult: StackingResult, keyAccessor: IAccessor[_], filter: IAccessor[Boolean]): js.Array[Double] = js.native
  def stackedExtents[D](stackingResult: GenericStackingResult[D]): MaximumExtents[D] = js.native
  @js.native
  object IStackingOrder extends js.Object {
    var bottomup: typingsSlinky.plottable.plottableStrings.bottomup = js.native
    var topdown: typingsSlinky.plottable.plottableStrings.topdown = js.native
  }
  
}

