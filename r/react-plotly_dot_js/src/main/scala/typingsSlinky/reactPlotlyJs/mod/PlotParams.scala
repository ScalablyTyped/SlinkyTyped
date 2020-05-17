package typingsSlinky.reactPlotlyJs.mod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotParams extends js.Object {
  /**
    * applied to the <div> into which the plot is rendered
    */
  var className: js.UndefOr[String] = js.native
  var config: js.UndefOr[PartialConfig] = js.native
  var data: js.Array[Data] = js.native
  /**
    * Assign the graph div to window.gd for debugging
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * id assigned to the <div> into which the plot is rendered.
    */
  var divId: js.UndefOr[String] = js.native
  var frames: js.UndefOr[js.Array[Frame]] = js.native
  var layout: PartialLayout = js.native
  var onAfterExport: js.UndefOr[js.Function0[Unit]] = js.native
  var onAfterPlot: js.UndefOr[js.Function0[Unit]] = js.native
  var onAnimated: js.UndefOr[js.Function0[Unit]] = js.native
  var onAnimatingFrame: js.UndefOr[js.Function1[/* event */ ReadonlyFrameAnimationEve, Unit]] = js.native
  var onAnimationInterrupted: js.UndefOr[js.Function0[Unit]] = js.native
  var onAutoSize: js.UndefOr[js.Function0[Unit]] = js.native
  var onBeforeExport: js.UndefOr[js.Function0[Unit]] = js.native
  var onButtonClicked: js.UndefOr[js.Function1[/* event */ ButtonClickEvent, Unit]] = js.native
  var onClick: js.UndefOr[js.Function1[/* event */ ReadonlyPlotMouseEvent, Unit]] = js.native
  var onClickAnnotation: js.UndefOr[js.Function1[/* event */ ReadonlyClickAnnotationEv, Unit]] = js.native
  var onDeselect: js.UndefOr[js.Function0[Unit]] = js.native
  var onDoubleClick: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback executed when a plotly.js API method rejects
    * @param err Error
    */
  var onError: js.UndefOr[js.Function1[/* err */ ReadonlyError, Unit]] = js.native
  var onFramework: js.UndefOr[js.Function0[Unit]] = js.native
  var onHover: js.UndefOr[js.Function1[/* event */ ReadonlyPlotMouseEvent, Unit]] = js.native
  /**
    * Callback executed after plot is initialized.
    * @param figure Object with three keys corresponding to input props: data, layout and frames.
    * @param graphDiv Reference to the DOM node into which the figure was rendered.
    */
  var onInitialized: js.UndefOr[
    js.Function2[/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement, Unit]
  ] = js.native
  var onLegendClick: js.UndefOr[js.Function1[/* event */ ReadonlyLegendClickEvent, Boolean]] = js.native
  var onLegendDoubleClick: js.UndefOr[js.Function1[/* event */ ReadonlyLegendClickEvent, Boolean]] = js.native
  /**
    * Callback executed when component unmounts, before Plotly.purge strips the graphDiv of all private attributes.
    * @param figure Object with three keys corresponding to input props: data, layout and frames.
    * @param graphDiv Reference to the DOM node into which the figure was rendered.
    */
  var onPurge: js.UndefOr[
    js.Function2[/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement, Unit]
  ] = js.native
  var onRedraw: js.UndefOr[js.Function0[Unit]] = js.native
  var onRelayout: js.UndefOr[js.Function1[/* event */ ReadonlyPlotRelayoutEvent, Unit]] = js.native
  var onRestyle: js.UndefOr[js.Function1[/* event */ PlotRestyleEvent, Unit]] = js.native
  var onSelected: js.UndefOr[js.Function1[/* event */ ReadonlyPlotSelectionEven, Unit]] = js.native
  var onSelecting: js.UndefOr[js.Function1[/* event */ ReadonlyPlotSelectionEven, Unit]] = js.native
  var onSliderChange: js.UndefOr[js.Function1[/* event */ ReadonlySliderChangeEvent, Unit]] = js.native
  var onSliderEnd: js.UndefOr[js.Function1[/* event */ ReadonlySliderEndEvent, Unit]] = js.native
  var onSliderStart: js.UndefOr[js.Function1[/* event */ ReadonlySliderStartEvent, Unit]] = js.native
  var onTransitionInterrupted: js.UndefOr[js.Function0[Unit]] = js.native
  var onTransitioning: js.UndefOr[js.Function0[Unit]] = js.native
  var onUnhover: js.UndefOr[js.Function1[/* event */ ReadonlyPlotMouseEvent, Unit]] = js.native
  /**
    * Callback executed when when a plot is updated due to new data or layout, or when user interacts with a plot.
    * @param figure Object with three keys corresponding to input props: data, layout and frames.
    * @param graphDiv Reference to the DOM node into which the figure was rendered.
    */
  var onUpdate: js.UndefOr[
    js.Function2[/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement, Unit]
  ] = js.native
  /**
    * When provided, causes the plot to update only when the revision is incremented.
    */
  var revision: js.UndefOr[Double] = js.native
  /**
    * used to style the <div> into which the plot is rendered
    */
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * When true, adds a call to Plotly.Plot.resize() as a window.resize event handler
    */
  var useResizeHandler: js.UndefOr[Boolean] = js.native
}

object PlotParams {
  @scala.inline
  def apply(data: js.Array[Data], layout: PartialLayout): PlotParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotParams]
  }
  @scala.inline
  implicit class PlotParamsOps[Self <: PlotParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[Data]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayout(value: PartialLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withConfig(value: PartialConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDivId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDivId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divId")(js.undefined)
        ret
    }
    @scala.inline
    def withFrames(value: js.Array[Frame]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frames")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAfterExport(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfterExport")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnAfterExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfterExport")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAfterPlot(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfterPlot")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnAfterPlot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfterPlot")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimated(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimated")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnAnimated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimated")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimatingFrame(value: /* event */ ReadonlyFrameAnimationEve => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimatingFrame")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAnimatingFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimatingFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationInterrupted(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationInterrupted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnAnimationInterrupted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationInterrupted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAutoSize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAutoSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnAutoSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAutoSize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeExport(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeExport")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeExport")(js.undefined)
        ret
    }
    @scala.inline
    def withOnButtonClicked(value: /* event */ ButtonClickEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onButtonClicked")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnButtonClicked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onButtonClicked")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: /* event */ ReadonlyPlotMouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClickAnnotation(value: /* event */ ReadonlyClickAnnotationEv => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickAnnotation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClickAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDeselect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeselect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDeselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeselect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDoubleClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDoubleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: /* err */ ReadonlyError => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFramework(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFramework")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnFramework: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFramework")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHover(value: /* event */ ReadonlyPlotMouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHover")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInitialized(value: (/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitialized")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnInitialized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitialized")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLegendClick(value: /* event */ ReadonlyLegendClickEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLegendClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLegendClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLegendClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLegendDoubleClick(value: /* event */ ReadonlyLegendClickEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLegendDoubleClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLegendDoubleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLegendDoubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPurge(value: (/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPurge")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPurge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPurge")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRedraw(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRedraw")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnRedraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRedraw")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRelayout(value: /* event */ ReadonlyPlotRelayoutEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRelayout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRelayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRelayout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRestyle(value: /* event */ PlotRestyleEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRestyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRestyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRestyle")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelected(value: /* event */ ReadonlyPlotSelectionEven => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelecting(value: /* event */ ReadonlyPlotSelectionEven => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelecting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelecting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelecting")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSliderChange(value: /* event */ ReadonlySliderChangeEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSliderChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSliderChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSliderChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSliderEnd(value: /* event */ ReadonlySliderEndEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSliderEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSliderEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSliderEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSliderStart(value: /* event */ ReadonlySliderStartEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSliderStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSliderStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSliderStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTransitionInterrupted(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionInterrupted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnTransitionInterrupted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionInterrupted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTransitioning(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitioning")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnTransitioning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitioning")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnhover(value: /* event */ ReadonlyPlotMouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnhover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUnhover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnhover")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdate(value: (/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withRevision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withUseResizeHandler(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useResizeHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseResizeHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useResizeHandler")(js.undefined)
        ret
    }
  }
  
}

