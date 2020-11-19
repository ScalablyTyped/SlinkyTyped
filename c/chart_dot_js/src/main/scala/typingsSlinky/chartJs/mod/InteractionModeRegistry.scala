package typingsSlinky.chartJs.mod

import typingsSlinky.chartJs.chartJsStrings.`x-axis`
import typingsSlinky.chartJs.chartJsStrings.dataset
import typingsSlinky.chartJs.chartJsStrings.index
import typingsSlinky.chartJs.chartJsStrings.label
import typingsSlinky.chartJs.chartJsStrings.nearest
import typingsSlinky.chartJs.chartJsStrings.point
import typingsSlinky.chartJs.chartJsStrings.single
import typingsSlinky.chartJs.chartJsStrings.x
import typingsSlinky.chartJs.chartJsStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Allow extending the IteractionMode type alias
// see https://github.com/microsoft/TypeScript/issues/28078#issuecomment-432339564
@js.native
trait InteractionModeRegistry extends js.Object {
  
  var dataset: typingsSlinky.chartJs.chartJsStrings.dataset = js.native
  
  var index: typingsSlinky.chartJs.chartJsStrings.index = js.native
  
  var label: typingsSlinky.chartJs.chartJsStrings.label = js.native
  
  var nearest: typingsSlinky.chartJs.chartJsStrings.nearest = js.native
  
  var point: typingsSlinky.chartJs.chartJsStrings.point = js.native
  
  var single: typingsSlinky.chartJs.chartJsStrings.single = js.native
  
  var x: typingsSlinky.chartJs.chartJsStrings.x = js.native
  
  var `x-axis`: typingsSlinky.chartJs.chartJsStrings.`x-axis` = js.native
  
  var y: typingsSlinky.chartJs.chartJsStrings.y = js.native
}
object InteractionModeRegistry {
  
  @scala.inline
  def apply(
    dataset: dataset,
    index: index,
    label: label,
    nearest: nearest,
    point: point,
    single: single,
    x: x,
    `x-axis`: `x-axis`,
    y: y
  ): InteractionModeRegistry = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], nearest = nearest.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], single = single.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("x-axis")(`x-axis`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionModeRegistry]
  }
  
  @scala.inline
  implicit class InteractionModeRegistryOps[Self <: InteractionModeRegistry] (val x: Self) extends AnyVal {
    
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
    def setDataset(value: dataset): Self = this.set("dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: index): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: label): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearest(value: nearest): Self = this.set("nearest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: point): Self = this.set("point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingle(value: single): Self = this.set("single", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: typingsSlinky.chartJs.chartJsStrings.x): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setX-axis`(value: `x-axis`): Self = this.set("x-axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: y): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
