package typingsSlinky.plotlyJs.mod

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.plotlyJs.anon.PartialConfig
import typingsSlinky.plotlyJs.anon.PartialLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegendClickEvent extends StObject {
  
  var config: PartialConfig = js.native
  
  var curveNumber: Double = js.native
  
  var data: js.Array[Data] = js.native
  
  var event: MouseEvent = js.native
  
  var expandedIndex: Double = js.native
  
  var frames: js.Array[Frame] = js.native
  
  var fullData: js.Array[Data] = js.native
  
  var fullLayout: PartialLayout = js.native
  
  var layout: PartialLayout = js.native
  
  var node: PlotlyHTMLElement = js.native
}
object LegendClickEvent {
  
  @scala.inline
  def apply(
    config: PartialConfig,
    curveNumber: Double,
    data: js.Array[Data],
    event: MouseEvent,
    expandedIndex: Double,
    frames: js.Array[Frame],
    fullData: js.Array[Data],
    fullLayout: PartialLayout,
    layout: PartialLayout,
    node: PlotlyHTMLElement
  ): LegendClickEvent = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], curveNumber = curveNumber.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], expandedIndex = expandedIndex.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], fullData = fullData.asInstanceOf[js.Any], fullLayout = fullLayout.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendClickEvent]
  }
  
  @scala.inline
  implicit class LegendClickEventMutableBuilder[Self <: LegendClickEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: PartialConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurveNumber(value: Double): Self = StObject.set(x, "curveNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Array[Data]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Data*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setEvent(value: MouseEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedIndex(value: Double): Self = StObject.set(x, "expandedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrames(value: js.Array[Frame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesVarargs(value: Frame*): Self = StObject.set(x, "frames", js.Array(value :_*))
    
    @scala.inline
    def setFullData(value: js.Array[Data]): Self = StObject.set(x, "fullData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullDataVarargs(value: Data*): Self = StObject.set(x, "fullData", js.Array(value :_*))
    
    @scala.inline
    def setFullLayout(value: PartialLayout): Self = StObject.set(x, "fullLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout(value: PartialLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: PlotlyHTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
