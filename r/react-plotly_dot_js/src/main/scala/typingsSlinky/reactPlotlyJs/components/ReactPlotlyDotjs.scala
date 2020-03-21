package typingsSlinky.reactPlotlyJs.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.plotlyJs.mod.ButtonClickEvent
import typingsSlinky.plotlyJs.mod.Data
import typingsSlinky.plotlyJs.mod.Frame
import typingsSlinky.plotlyJs.mod.PlotRestyleEvent
import typingsSlinky.reactPlotlyJs.PartialConfig
import typingsSlinky.reactPlotlyJs.PartialLayout
import typingsSlinky.reactPlotlyJs.ReadonlyClickAnnotationEv
import typingsSlinky.reactPlotlyJs.ReadonlyError
import typingsSlinky.reactPlotlyJs.ReadonlyFigure
import typingsSlinky.reactPlotlyJs.ReadonlyFrameAnimationEve
import typingsSlinky.reactPlotlyJs.ReadonlyHTMLElement
import typingsSlinky.reactPlotlyJs.ReadonlyLegendClickEvent
import typingsSlinky.reactPlotlyJs.ReadonlyPlotMouseEvent
import typingsSlinky.reactPlotlyJs.ReadonlyPlotRelayoutEvent
import typingsSlinky.reactPlotlyJs.ReadonlyPlotSelectionEven
import typingsSlinky.reactPlotlyJs.ReadonlySliderChangeEvent
import typingsSlinky.reactPlotlyJs.ReadonlySliderEndEvent
import typingsSlinky.reactPlotlyJs.ReadonlySliderStartEvent
import typingsSlinky.reactPlotlyJs.mod.PlotParams
import typingsSlinky.reactPlotlyJs.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactPlotlyDotjs
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-plotly.js", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    data: js.Array[Data],
    layout: PartialLayout,
    config: PartialConfig = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    divId: String = null,
    frames: js.Array[Frame] = null,
    onAfterExport: () => Unit = null,
    onAfterPlot: () => Unit = null,
    onAnimated: () => Unit = null,
    onAnimatingFrame: /* event */ ReadonlyFrameAnimationEve => Unit = null,
    onAnimationInterrupted: () => Unit = null,
    onAutoSize: () => Unit = null,
    onBeforeExport: () => Unit = null,
    onButtonClicked: /* event */ ButtonClickEvent => Unit = null,
    onClick: /* event */ ReadonlyPlotMouseEvent => Unit = null,
    onClickAnnotation: /* event */ ReadonlyClickAnnotationEv => Unit = null,
    onDeselect: () => Unit = null,
    onDoubleClick: () => Unit = null,
    onError: /* err */ ReadonlyError => Unit = null,
    onFramework: () => Unit = null,
    onHover: /* event */ ReadonlyPlotMouseEvent => Unit = null,
    onInitialized: (/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement) => Unit = null,
    onLegendClick: /* event */ ReadonlyLegendClickEvent => Boolean = null,
    onLegendDoubleClick: /* event */ ReadonlyLegendClickEvent => Boolean = null,
    onPurge: (/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement) => Unit = null,
    onRedraw: () => Unit = null,
    onRelayout: /* event */ ReadonlyPlotRelayoutEvent => Unit = null,
    onRestyle: /* event */ PlotRestyleEvent => Unit = null,
    onSelected: /* event */ ReadonlyPlotSelectionEven => Unit = null,
    onSelecting: /* event */ ReadonlyPlotSelectionEven => Unit = null,
    onSliderChange: /* event */ ReadonlySliderChangeEvent => Unit = null,
    onSliderEnd: /* event */ ReadonlySliderEndEvent => Unit = null,
    onSliderStart: /* event */ ReadonlySliderStartEvent => Unit = null,
    onTransitionInterrupted: () => Unit = null,
    onTransitioning: () => Unit = null,
    onUnhover: /* event */ ReadonlyPlotMouseEvent => Unit = null,
    onUpdate: (/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement) => Unit = null,
    revision: Int | Double = null,
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
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onClickAnnotation != null) __obj.updateDynamic("onClickAnnotation")(js.Any.fromFunction1(onClickAnnotation))
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(js.Any.fromFunction0(onDeselect))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction0(onDoubleClick))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
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
    if (!js.isUndefined(useResizeHandler)) __obj.updateDynamic("useResizeHandler")(useResizeHandler.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PlotParams
}

