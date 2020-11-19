package typingsSlinky.plottable.commonsMod

import typingsSlinky.plottable.datasetMod.Dataset
import typingsSlinky.plottable.interfacesMod.IEntity
import typingsSlinky.plottable.interfacesMod.IEntityBounds
import typingsSlinky.plottable.interfacesMod.Point
import typingsSlinky.plottable.interfacesMod.SimpleSelection
import typingsSlinky.plottable.plotMod.Plot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPlotEntity extends IEntity[Plot] {
  
  var dataset: Dataset = js.native
  
  var datasetIndex: Double = js.native
  
  var index: Double = js.native
}
object IPlotEntity {
  
  @scala.inline
  def apply(
    bounds: IEntityBounds,
    component: Plot,
    dataset: Dataset,
    datasetIndex: Double,
    datum: js.Any,
    index: Double,
    position: Point,
    selection: SimpleSelection[_]
  ): IPlotEntity = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], datasetIndex = datasetIndex.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlotEntity]
  }
  
  @scala.inline
  implicit class IPlotEntityOps[Self <: IPlotEntity] (val x: Self) extends AnyVal {
    
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
    def setDataset(value: Dataset): Self = this.set("dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetIndex(value: Double): Self = this.set("datasetIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
  }
}
