package typingsSlinky.reactPlotlyJs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.plotlyJs.mod.ButtonClickEvent
import typingsSlinky.plotlyJs.mod.Data
import typingsSlinky.plotlyJs.mod.Frame
import typingsSlinky.plotlyJs.mod.PlotRestyleEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactPlotlyJs.anon.PartialConfig
import typingsSlinky.reactPlotlyJs.anon.PartialLayout
import typingsSlinky.reactPlotlyJs.anon.ReadonlyClickAnnotationEv
import typingsSlinky.reactPlotlyJs.anon.ReadonlyError
import typingsSlinky.reactPlotlyJs.anon.ReadonlyFigure
import typingsSlinky.reactPlotlyJs.anon.ReadonlyFrameAnimationEve
import typingsSlinky.reactPlotlyJs.anon.ReadonlyHTMLElement
import typingsSlinky.reactPlotlyJs.anon.ReadonlyLegendClickEvent
import typingsSlinky.reactPlotlyJs.anon.ReadonlyPlotMouseEvent
import typingsSlinky.reactPlotlyJs.anon.ReadonlyPlotRelayoutEvent
import typingsSlinky.reactPlotlyJs.anon.ReadonlyPlotSelectionEven
import typingsSlinky.reactPlotlyJs.anon.ReadonlySliderChangeEvent
import typingsSlinky.reactPlotlyJs.anon.ReadonlySliderEndEvent
import typingsSlinky.reactPlotlyJs.anon.ReadonlySliderStartEvent
import typingsSlinky.reactPlotlyJs.mod.PlotParams
import typingsSlinky.reactPlotlyJs.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactPlotlyDotjs {
  
  @JSImport("react-plotly.js", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def config(value: PartialConfig): this.type = set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def debug(value: Boolean): this.type = set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def divId(value: String): this.type = set("divId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def framesVarargs(value: Frame*): this.type = set("frames", js.Array(value :_*))
    
    @scala.inline
    def frames(value: js.Array[Frame]): this.type = set("frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAfterExport(value: () => Unit): this.type = set("onAfterExport", js.Any.fromFunction0(value))
    
    @scala.inline
    def onAfterPlot(value: () => Unit): this.type = set("onAfterPlot", js.Any.fromFunction0(value))
    
    @scala.inline
    def onAnimated(value: () => Unit): this.type = set("onAnimated", js.Any.fromFunction0(value))
    
    @scala.inline
    def onAnimatingFrame(value: /* event */ ReadonlyFrameAnimationEve => Unit): this.type = set("onAnimatingFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAnimationInterrupted(value: () => Unit): this.type = set("onAnimationInterrupted", js.Any.fromFunction0(value))
    
    @scala.inline
    def onAutoSize(value: () => Unit): this.type = set("onAutoSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def onBeforeExport(value: () => Unit): this.type = set("onBeforeExport", js.Any.fromFunction0(value))
    
    @scala.inline
    def onButtonClicked(value: /* event */ ButtonClickEvent => Unit): this.type = set("onButtonClicked", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClick(value: /* event */ ReadonlyPlotMouseEvent => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClickAnnotation(value: /* event */ ReadonlyClickAnnotationEv => Unit): this.type = set("onClickAnnotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDeselect(value: () => Unit): this.type = set("onDeselect", js.Any.fromFunction0(value))
    
    @scala.inline
    def onDoubleClick(value: () => Unit): this.type = set("onDoubleClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def onError(value: /* err */ ReadonlyError => Unit): this.type = set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFramework(value: () => Unit): this.type = set("onFramework", js.Any.fromFunction0(value))
    
    @scala.inline
    def onHover(value: /* event */ ReadonlyPlotMouseEvent => Unit): this.type = set("onHover", js.Any.fromFunction1(value))
    
    @scala.inline
    def onInitialized(value: (/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement) => Unit): this.type = set("onInitialized", js.Any.fromFunction2(value))
    
    @scala.inline
    def onLegendClick(value: /* event */ ReadonlyLegendClickEvent => Boolean): this.type = set("onLegendClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLegendDoubleClick(value: /* event */ ReadonlyLegendClickEvent => Boolean): this.type = set("onLegendDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPurge(value: (/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement) => Unit): this.type = set("onPurge", js.Any.fromFunction2(value))
    
    @scala.inline
    def onRedraw(value: () => Unit): this.type = set("onRedraw", js.Any.fromFunction0(value))
    
    @scala.inline
    def onRelayout(value: /* event */ ReadonlyPlotRelayoutEvent => Unit): this.type = set("onRelayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRestyle(value: /* event */ PlotRestyleEvent => Unit): this.type = set("onRestyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSelected(value: /* event */ ReadonlyPlotSelectionEven => Unit): this.type = set("onSelected", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSelecting(value: /* event */ ReadonlyPlotSelectionEven => Unit): this.type = set("onSelecting", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSliderChange(value: /* event */ ReadonlySliderChangeEvent => Unit): this.type = set("onSliderChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSliderEnd(value: /* event */ ReadonlySliderEndEvent => Unit): this.type = set("onSliderEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSliderStart(value: /* event */ ReadonlySliderStartEvent => Unit): this.type = set("onSliderStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTransitionInterrupted(value: () => Unit): this.type = set("onTransitionInterrupted", js.Any.fromFunction0(value))
    
    @scala.inline
    def onTransitioning(value: () => Unit): this.type = set("onTransitioning", js.Any.fromFunction0(value))
    
    @scala.inline
    def onUnhover(value: /* event */ ReadonlyPlotMouseEvent => Unit): this.type = set("onUnhover", js.Any.fromFunction1(value))
    
    @scala.inline
    def onUpdate(value: (/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement) => Unit): this.type = set("onUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def revision(value: Double): this.type = set("revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useResizeHandler(value: Boolean): this.type = set("useResizeHandler", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PlotParams): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(data: js.Array[Data], layout: PartialLayout): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PlotParams]))
  }
}
