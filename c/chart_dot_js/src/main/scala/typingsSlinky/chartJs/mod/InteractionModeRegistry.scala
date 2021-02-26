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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Allow extending the IteractionMode type alias
// see https://github.com/microsoft/TypeScript/issues/28078#issuecomment-432339564
@js.native
trait InteractionModeRegistry extends StObject {
  
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
  implicit class InteractionModeRegistryMutableBuilder[Self <: InteractionModeRegistry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataset(value: dataset): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: index): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearest(value: nearest): Self = StObject.set(x, "nearest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingle(value: single): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: typingsSlinky.chartJs.chartJsStrings.x): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setX-axis`(value: `x-axis`): Self = StObject.set(x, "x-axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: y): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
