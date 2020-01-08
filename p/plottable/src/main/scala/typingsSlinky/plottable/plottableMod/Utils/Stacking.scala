package typingsSlinky.plottable.plottableMod.Utils

import typingsSlinky.lodash.lodashMod.MemoizedFunction
import typingsSlinky.plottable.Anon_MaximumExtents
import typingsSlinky.plottable.buildSrcCoreDatasetMod.Dataset
import typingsSlinky.plottable.buildSrcCoreInterfacesMod.IAccessor
import typingsSlinky.plottable.buildSrcUtilsStackingUtilsMod.GenericStackingResult
import typingsSlinky.plottable.buildSrcUtilsStackingUtilsMod.IStackingOrder
import typingsSlinky.plottable.buildSrcUtilsStackingUtilsMod.StackingResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "Utils.Stacking")
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
  def stackedExtents[D](stackingResult: GenericStackingResult[D]): Anon_MaximumExtents[D] = js.native
  @js.native
  object IStackingOrder extends js.Object {
    var bottomup: typingsSlinky.plottable.plottableStrings.bottomup = js.native
    var topdown: typingsSlinky.plottable.plottableStrings.topdown = js.native
  }
  
}

