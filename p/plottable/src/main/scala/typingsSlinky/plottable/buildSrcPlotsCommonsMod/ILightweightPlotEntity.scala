package typingsSlinky.plottable.buildSrcPlotsCommonsMod

import typingsSlinky.plottable.buildSrcCoreDatasetMod.Dataset
import typingsSlinky.plottable.buildSrcCoreInterfacesMod.Point
import typingsSlinky.plottable.buildSrcDrawersDrawerMod.IDrawer
import typingsSlinky.plottable.buildSrcPlotsPlotMod.Plot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILightweightPlotEntity extends js.Object {
  var component: Plot
  var dataset: Dataset
  var datasetIndex: Double
  var datum: js.Any
  var drawer: IDrawer
  var index: Double
  var position: Point
  var validDatumIndex: Double
}

object ILightweightPlotEntity {
  @scala.inline
  def apply(
    component: Plot,
    dataset: Dataset,
    datasetIndex: Double,
    datum: js.Any,
    drawer: IDrawer,
    index: Double,
    position: Point,
    validDatumIndex: Double
  ): ILightweightPlotEntity = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], datasetIndex = datasetIndex.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], drawer = drawer.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], validDatumIndex = validDatumIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ILightweightPlotEntity]
  }
}

