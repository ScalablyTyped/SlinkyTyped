package typingsSlinky.plottable.commonsMod

import typingsSlinky.plottable.datasetMod.Dataset
import typingsSlinky.plottable.drawerMod.IDrawer
import typingsSlinky.plottable.interfacesMod.Point
import typingsSlinky.plottable.plotMod.Plot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILightweightPlotEntity extends js.Object {
  var component: Plot = js.native
  var dataset: Dataset = js.native
  var datasetIndex: Double = js.native
  var datum: js.Any = js.native
  var drawer: IDrawer = js.native
  var index: Double = js.native
  var position: Point = js.native
  var validDatumIndex: Double = js.native
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
  @scala.inline
  implicit class ILightweightPlotEntityOps[Self <: ILightweightPlotEntity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponent(value: Plot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataset(value: Dataset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatasetIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatum(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawer(value: IDrawer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidDatumIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validDatumIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

