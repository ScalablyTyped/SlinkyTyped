package typingsSlinky.antDashDesignDashPro.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.Node
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.atAntvG2.atAntvG2Mod.EventParams
import typingsSlinky.atAntvG2.atAntvG2Mod.Styles.background
import typingsSlinky.bizcharts.Anon_Bottom
import typingsSlinky.bizcharts.Anon_Data
import typingsSlinky.bizcharts.Anon_Items
import typingsSlinky.bizcharts.Anon_Tooltip
import typingsSlinky.bizcharts.Anon_TooltipAny
import typingsSlinky.bizcharts.bizchartsMod.ChartProps
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Chart
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.antDashDesignDashPro.libChartsBizchartsMod.Chart] {
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "Chart")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, dangerouslySetInnerHTML, onAbort, onAnimationEnd, onAnimationIteration, onAnimationStart, onBlur, onCanPlay, onCanPlayThrough, onChange, onClick, onCompositionEnd, onCompositionStart, onCompositionUpdate, onContextMenu, onCopy, onCut, onDoubleClick, onDrag, onDragEnd, onDragEnter, onDragExit, onDragLeave, onDragOver, onDragStart, onDrop, onDurationChange, onEmptied, onEncrypted, onEnded, onError, onFocus, onInput, onInvalid, onKeyDown, onKeyPress, onKeyUp, onLoad, onLoadStart, onLoadedData, onLoadedMetadata, onMouseDown, onMouseEnter, onMouseLeave, onMouseMove, onMouseOut, onMouseOver, onMouseUp, onPaste, onPause, onPlay, onPlaying, onPointerCancel, onPointerDown, onPointerEnter, onPointerLeave, onPointerMove, onPointerOut, onPointerOver, onPointerUp, onProgress, onRateChange, onScroll, onSeeked, onSeeking, onSelect, onStalled, onSubmit, onSuspend, onTimeUpdate, onTouchCancel, onTouchEnd, onTouchMove, onTouchStart, onTransitionEnd, onVolumeChange, onWaiting, onWheel */
  def apply(
    height: Double,
    animate: js.UndefOr[Boolean] = js.undefined,
    background: background = null,
    data: js.Any = null,
    filter: js.Array[_] = null,
    forceFit: js.UndefOr[Boolean] = js.undefined,
    onAuxClick: SyntheticMouseEvent[js.Object] => Unit = null,
    onBeforeInput: SyntheticEvent[EventTarget with js.Object, Event] => Unit = null,
    onGetG2Instance: /* chart */ typingsSlinky.atAntvG2.atAntvG2Mod.Chart => Unit = null,
    onItemSelected: /* ev */ EventParams => Unit = null,
    onItemSelectedChange: /* ev */ Anon_Data => Unit = null,
    onItemUnselected: /* ev */ EventParams => Unit = null,
    onPlotClick: /* ev */ EventParams => Unit = null,
    onPlotDblClick: /* ev */ EventParams => Unit = null,
    onPlotEnter: /* ev */ EventParams => Unit = null,
    onPlotLeave: /* ev */ EventParams => Unit = null,
    onPlotMove: /* ev */ EventParams => Unit = null,
    onReset: SyntheticEvent[EventTarget with js.Object, Event] => Unit = null,
    onTooltipChange: /* ev */ Anon_Items => Unit = null,
    onTooltipHide: /* ev */ Anon_TooltipAny => Unit = null,
    onTooltipShow: /* ev */ Anon_Tooltip => Unit = null,
    padding: String | Anon_Bottom | Double | (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple2[String, String]) = null,
    pixelRatio: Int | Double = null,
    placeholder: Node | String | Boolean = null,
    plotBackground: background = null,
    scale: js.Any = null,
    style: CSSProperties = null,
    width: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.antDashDesignDashPro.libChartsBizchartsMod.Chart] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(forceFit)) __obj.updateDynamic("forceFit")(forceFit.asInstanceOf[js.Any])
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onGetG2Instance != null) __obj.updateDynamic("onGetG2Instance")(js.Any.fromFunction1(onGetG2Instance))
    if (onItemSelected != null) __obj.updateDynamic("onItemSelected")(js.Any.fromFunction1(onItemSelected))
    if (onItemSelectedChange != null) __obj.updateDynamic("onItemSelectedChange")(js.Any.fromFunction1(onItemSelectedChange))
    if (onItemUnselected != null) __obj.updateDynamic("onItemUnselected")(js.Any.fromFunction1(onItemUnselected))
    if (onPlotClick != null) __obj.updateDynamic("onPlotClick")(js.Any.fromFunction1(onPlotClick))
    if (onPlotDblClick != null) __obj.updateDynamic("onPlotDblClick")(js.Any.fromFunction1(onPlotDblClick))
    if (onPlotEnter != null) __obj.updateDynamic("onPlotEnter")(js.Any.fromFunction1(onPlotEnter))
    if (onPlotLeave != null) __obj.updateDynamic("onPlotLeave")(js.Any.fromFunction1(onPlotLeave))
    if (onPlotMove != null) __obj.updateDynamic("onPlotMove")(js.Any.fromFunction1(onPlotMove))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onTooltipChange != null) __obj.updateDynamic("onTooltipChange")(js.Any.fromFunction1(onTooltipChange))
    if (onTooltipHide != null) __obj.updateDynamic("onTooltipHide")(js.Any.fromFunction1(onTooltipHide))
    if (onTooltipShow != null) __obj.updateDynamic("onTooltipShow")(js.Any.fromFunction1(onTooltipShow))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (plotBackground != null) __obj.updateDynamic("plotBackground")(plotBackground.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ChartProps
}

