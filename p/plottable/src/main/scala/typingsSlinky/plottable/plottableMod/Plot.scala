package typingsSlinky.plottable.plottableMod

import typingsSlinky.plottable.buildSrcCoreInterfacesMod.IAccessor
import typingsSlinky.plottable.buildSrcDrawersDrawStepMod.AppliedDrawStep
import typingsSlinky.plottable.buildSrcDrawersDrawStepMod.DrawStep
import typingsSlinky.plottable.buildSrcPlotsCommonsMod.IAccessorScaleBinding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "Plot")
@js.native
/**
  * A Plot draws some visualization of the inputted Datasets.
  *
  * @constructor
  */
class Plot ()
  extends typingsSlinky.plottable.buildSrcPlotsPlotMod.Plot

/* static members */
@JSImport("plottable", "Plot")
@js.native
object Plot extends js.Object {
  var OPTIMIZE_MEMOIZE_PROJECTORS: Boolean = js.native
  var _ANIMATION_MAX_DURATION: Double = js.native
  /* protected */ def _scaledAccessor[D, R](binding: IAccessorScaleBinding[D, R]): IAccessor[_] = js.native
  def applyDrawSteps(drawSteps: js.Array[DrawStep], dataset: typingsSlinky.plottable.buildSrcCoreDatasetMod.Dataset): js.Array[AppliedDrawStep] = js.native
  def getTotalDrawTime(data: js.Array[_], drawSteps: js.Array[DrawStep]): Double = js.native
}

