package typingsSlinky.reactDashPlotlyDotJs.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.plotlyDotJs.plotlyDotJsMod.ButtonClickEvent
import typingsSlinky.plotlyDotJs.plotlyDotJsMod.ClickAnnotationEvent
import typingsSlinky.plotlyDotJs.plotlyDotJsMod.Config
import typingsSlinky.plotlyDotJs.plotlyDotJsMod.Data
import typingsSlinky.plotlyDotJs.plotlyDotJsMod.Frame
import typingsSlinky.plotlyDotJs.plotlyDotJsMod.FrameAnimationEvent
import typingsSlinky.plotlyDotJs.plotlyDotJsMod.Layout
import typingsSlinky.plotlyDotJs.plotlyDotJsMod.LegendClickEvent
import typingsSlinky.plotlyDotJs.plotlyDotJsMod.PlotMouseEvent
import typingsSlinky.plotlyDotJs.plotlyDotJsMod.PlotRelayoutEvent
import typingsSlinky.plotlyDotJs.plotlyDotJsMod.PlotRestyleEvent
import typingsSlinky.plotlyDotJs.plotlyDotJsMod.PlotSelectionEvent
import typingsSlinky.plotlyDotJs.plotlyDotJsMod.SliderChangeEvent
import typingsSlinky.plotlyDotJs.plotlyDotJsMod.SliderEndEvent
import typingsSlinky.plotlyDotJs.plotlyDotJsMod.SliderStartEvent
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashPlotlyDotJs.reactDashPlotlyDotJsMod.Figure
import typingsSlinky.reactDashPlotlyDotJs.reactDashPlotlyDotJsMod.PlotParams
import typingsSlinky.reactDashPlotlyDotJs.reactDashPlotlyDotJsMod.default
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashPlotlyDotJs
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-plotly.js", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, onClick, onError */
  def apply(
    data: js.Array[Data],
    layout: Partial[Layout],
    config: Partial[Config] = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    divId: String = null,
    frames: js.Array[Frame] = null,
    onAfterExport: () => Unit = null,
    onAfterPlot: () => Unit = null,
    onAnimated: () => Unit = null,
    onAnimatingFrame: /* event */ FrameAnimationEvent => Unit = null,
    onAnimationInterrupted: () => Unit = null,
    onAutoSize: () => Unit = null,
    onBeforeExport: () => Unit = null,
    onButtonClicked: /* event */ ButtonClickEvent => Unit = null,
    onClickAnnotation: /* event */ ClickAnnotationEvent => Unit = null,
    onDeselect: () => Unit = null,
    onDoubleClick: () => Unit = null,
    onFramework: () => Unit = null,
    onHover: /* event */ PlotMouseEvent => Unit = null,
    onInitialized: (/* figure */ Figure, /* graphDiv */ HTMLElement) => Unit = null,
    onLegendClick: /* event */ LegendClickEvent => Boolean = null,
    onLegendDoubleClick: /* event */ LegendClickEvent => Boolean = null,
    onPurge: (/* figure */ Figure, /* graphDiv */ HTMLElement) => Unit = null,
    onRedraw: () => Unit = null,
    onRelayout: /* event */ PlotRelayoutEvent => Unit = null,
    onRestyle: /* event */ PlotRestyleEvent => Unit = null,
    onSelected: /* event */ PlotSelectionEvent => Unit = null,
    onSelecting: /* event */ PlotSelectionEvent => Unit = null,
    onSliderChange: /* event */ SliderChangeEvent => Unit = null,
    onSliderEnd: /* event */ SliderEndEvent => Unit = null,
    onSliderStart: /* event */ SliderStartEvent => Unit = null,
    onTransitionInterrupted: () => Unit = null,
    onTransitioning: () => Unit = null,
    onUnhover: /* event */ PlotMouseEvent => Unit = null,
    onUpdate: (/* figure */ Figure, /* graphDiv */ HTMLElement) => Unit = null,
    revision: Int | Double = null,
    style: CSSProperties = null,
    useResizeHandler: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (divId != null) __obj.updateDynamic("divId")(divId.asInstanceOf[js.Any])
    if (frames != null) __obj.updateDynamic("frames")(frames.asInstanceOf[js.Any])
    if (onAfterExport != null) __obj.updateDynamic("onAfterExport")(js.Any.fromFunction0(onAfterExport))
    if (onAfterPlot != null) __obj.updateDynamic("onAfterPlot")(js.Any.fromFunction0(onAfterPlot))
    if (onAnimated != null) __obj.updateDynamic("onAnimated")(js.Any.fromFunction0(onAnimated))
    if (onAnimatingFrame != null) __obj.updateDynamic("onAnimatingFrame")(js.Any.fromFunction1(onAnimatingFrame))
    if (onAnimationInterrupted != null) __obj.updateDynamic("onAnimationInterrupted")(js.Any.fromFunction0(onAnimationInterrupted))
    if (onAutoSize != null) __obj.updateDynamic("onAutoSize")(js.Any.fromFunction0(onAutoSize))
    if (onBeforeExport != null) __obj.updateDynamic("onBeforeExport")(js.Any.fromFunction0(onBeforeExport))
    if (onButtonClicked != null) __obj.updateDynamic("onButtonClicked")(js.Any.fromFunction1(onButtonClicked))
    if (onClickAnnotation != null) __obj.updateDynamic("onClickAnnotation")(js.Any.fromFunction1(onClickAnnotation))
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(js.Any.fromFunction0(onDeselect))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction0(onDoubleClick))
    if (onFramework != null) __obj.updateDynamic("onFramework")(js.Any.fromFunction0(onFramework))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction1(onHover))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction2(onInitialized))
    if (onLegendClick != null) __obj.updateDynamic("onLegendClick")(js.Any.fromFunction1(onLegendClick))
    if (onLegendDoubleClick != null) __obj.updateDynamic("onLegendDoubleClick")(js.Any.fromFunction1(onLegendDoubleClick))
    if (onPurge != null) __obj.updateDynamic("onPurge")(js.Any.fromFunction2(onPurge))
    if (onRedraw != null) __obj.updateDynamic("onRedraw")(js.Any.fromFunction0(onRedraw))
    if (onRelayout != null) __obj.updateDynamic("onRelayout")(js.Any.fromFunction1(onRelayout))
    if (onRestyle != null) __obj.updateDynamic("onRestyle")(js.Any.fromFunction1(onRestyle))
    if (onSelected != null) __obj.updateDynamic("onSelected")(js.Any.fromFunction1(onSelected))
    if (onSelecting != null) __obj.updateDynamic("onSelecting")(js.Any.fromFunction1(onSelecting))
    if (onSliderChange != null) __obj.updateDynamic("onSliderChange")(js.Any.fromFunction1(onSliderChange))
    if (onSliderEnd != null) __obj.updateDynamic("onSliderEnd")(js.Any.fromFunction1(onSliderEnd))
    if (onSliderStart != null) __obj.updateDynamic("onSliderStart")(js.Any.fromFunction1(onSliderStart))
    if (onTransitionInterrupted != null) __obj.updateDynamic("onTransitionInterrupted")(js.Any.fromFunction0(onTransitionInterrupted))
    if (onTransitioning != null) __obj.updateDynamic("onTransitioning")(js.Any.fromFunction0(onTransitioning))
    if (onUnhover != null) __obj.updateDynamic("onUnhover")(js.Any.fromFunction1(onUnhover))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction2(onUpdate))
    if (revision != null) __obj.updateDynamic("revision")(revision.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useResizeHandler)) __obj.updateDynamic("useResizeHandler")(useResizeHandler.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PlotParams
}

