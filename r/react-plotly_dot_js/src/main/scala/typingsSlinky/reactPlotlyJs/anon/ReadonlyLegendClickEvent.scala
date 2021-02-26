package typingsSlinky.reactPlotlyJs.anon

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.plotlyJs.mod.Data
import typingsSlinky.plotlyJs.mod.Frame
import typingsSlinky.plotlyJs.mod.PlotlyHTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<plotly.js.plotly.js.LegendClickEvent> */
@js.native
trait ReadonlyLegendClickEvent extends StObject {
  
  val config: typingsSlinky.plotlyJs.anon.PartialConfig = js.native
  
  val curveNumber: Double = js.native
  
  val data: js.Array[Data] = js.native
  
  val event: MouseEvent = js.native
  
  val expandedIndex: Double = js.native
  
  val frames: js.Array[Frame] = js.native
  
  val fullData: js.Array[Data] = js.native
  
  val fullLayout: typingsSlinky.plotlyJs.anon.PartialLayout = js.native
  
  val layout: typingsSlinky.plotlyJs.anon.PartialLayout = js.native
  
  val node: PlotlyHTMLElement = js.native
}
object ReadonlyLegendClickEvent {
  
  @scala.inline
  def apply(
    config: typingsSlinky.plotlyJs.anon.PartialConfig,
    curveNumber: Double,
    data: js.Array[Data],
    event: MouseEvent,
    expandedIndex: Double,
    frames: js.Array[Frame],
    fullData: js.Array[Data],
    fullLayout: typingsSlinky.plotlyJs.anon.PartialLayout,
    layout: typingsSlinky.plotlyJs.anon.PartialLayout,
    node: PlotlyHTMLElement
  ): ReadonlyLegendClickEvent = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], curveNumber = curveNumber.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], expandedIndex = expandedIndex.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], fullData = fullData.asInstanceOf[js.Any], fullLayout = fullLayout.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyLegendClickEvent]
  }
  
  @scala.inline
  implicit class ReadonlyLegendClickEventMutableBuilder[Self <: ReadonlyLegendClickEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: typingsSlinky.plotlyJs.anon.PartialConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
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
    def setFullLayout(value: typingsSlinky.plotlyJs.anon.PartialLayout): Self = StObject.set(x, "fullLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout(value: typingsSlinky.plotlyJs.anon.PartialLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: PlotlyHTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
