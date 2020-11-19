package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`segment-drag`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.drag
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistogramRangeSliderSegmentDragEvent extends js.Object {
  
  var index: Double = js.native
  
  var state: start | drag = js.native
  
  var thumbIndices: js.Array[Double] = js.native
  
  var `type`: `segment-drag` = js.native
}
object HistogramRangeSliderSegmentDragEvent {
  
  @scala.inline
  def apply(index: Double, state: start | drag, thumbIndices: js.Array[Double], `type`: `segment-drag`): HistogramRangeSliderSegmentDragEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], thumbIndices = thumbIndices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistogramRangeSliderSegmentDragEvent]
  }
  
  @scala.inline
  implicit class HistogramRangeSliderSegmentDragEventOps[Self <: HistogramRangeSliderSegmentDragEvent] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: start | drag): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbIndicesVarargs(value: Double*): Self = this.set("thumbIndices", js.Array(value :_*))
    
    @scala.inline
    def setThumbIndices(value: js.Array[Double]): Self = this.set("thumbIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `segment-drag`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
