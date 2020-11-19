package typingsSlinky.plottable.scatterPlotMod

import typingsSlinky.plottable.commonsMod.ILightweightPlotEntity
import typingsSlinky.plottable.datasetMod.Dataset
import typingsSlinky.plottable.drawerMod.IDrawer
import typingsSlinky.plottable.interfacesMod.Point
import typingsSlinky.plottable.plotMod.Plot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILightweightScatterPlotEntity extends ILightweightPlotEntity {
  
  var diameter: Double = js.native
}
object ILightweightScatterPlotEntity {
  
  @scala.inline
  def apply(
    component: Plot,
    dataset: Dataset,
    datasetIndex: Double,
    datum: js.Any,
    diameter: Double,
    drawer: IDrawer,
    index: Double,
    position: Point,
    validDatumIndex: Double
  ): ILightweightScatterPlotEntity = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], datasetIndex = datasetIndex.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], diameter = diameter.asInstanceOf[js.Any], drawer = drawer.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], validDatumIndex = validDatumIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILightweightScatterPlotEntity]
  }
  
  @scala.inline
  implicit class ILightweightScatterPlotEntityOps[Self <: ILightweightScatterPlotEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDiameter(value: Double): Self = this.set("diameter", value.asInstanceOf[js.Any])
  }
}
