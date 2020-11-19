package typingsSlinky.antDesignPro.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticAnimationEvent
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticPointerEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.SyntheticTransitionEvent
import slinky.web.SyntheticUIEvent
import slinky.web.SyntheticWheelEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antvG2.mod.EventParams
import typingsSlinky.antvG2.mod.Styles.background
import typingsSlinky.bizcharts.anon.Bottom
import typingsSlinky.bizcharts.anon.Data
import typingsSlinky.bizcharts.anon.Items
import typingsSlinky.bizcharts.anon.TooltipAny
import typingsSlinky.bizcharts.mod.ChartProps
import typingsSlinky.react.anon.Html
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.DragEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Chart {
  
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "Chart")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.bizchartsMod.Chart] {
    
    @scala.inline
    def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def background(value: typingsSlinky.antvG2.mod.Styles.background): this.type = set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def data(value: js.Any): this.type = set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterVarargs(value: js.Any*): this.type = set("filter", js.Array(value :_*))
    
    @scala.inline
    def filter(value: js.Array[_]): this.type = set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def forceFit(value: Boolean): this.type = set("forceFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAbort(value: SyntheticEvent[Event, js.Object] => Unit): this.type = set("onAbort", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAnimationEnd(value: SyntheticAnimationEvent[js.Object] => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAnimationIteration(value: SyntheticAnimationEvent[js.Object] => Unit): this.type = set("onAnimationIteration", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAnimationStart(value: SyntheticAnimationEvent[js.Object] => Unit): this.type = set("onAnimationStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAuxClick(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onAuxClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onBeforeInput(value: SyntheticEvent[EventTarget with js.Object, Event] => Unit): this.type = set("onBeforeInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def onBlur(value: SyntheticFocusEvent[js.Object] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCanPlay(value: SyntheticEvent[Event, js.Object] => Unit): this.type = set("onCanPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCanPlayThrough(value: SyntheticEvent[Event, js.Object] => Unit): this.type = set("onCanPlayThrough", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: SyntheticEvent[EventTarget with js.Object, Event] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClick(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCompositionEnd(value: SyntheticCompositionEvent[js.Object] => Unit): this.type = set("onCompositionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCompositionStart(value: SyntheticCompositionEvent[js.Object] => Unit): this.type = set("onCompositionStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCompositionUpdate(value: SyntheticCompositionEvent[js.Object] => Unit): this.type = set("onCompositionUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onContextMenu(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCopy(value: SyntheticClipboardEvent[js.Object] => Unit): this.type = set("onCopy", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCut(value: SyntheticClipboardEvent[js.Object] => Unit): this.type = set("onCut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDoubleClick(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDrag(value: DragEvent[js.Object] => Unit): this.type = set("onDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragEnd(value: DragEvent[js.Object] => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragEnter(value: DragEvent[js.Object] => Unit): this.type = set("onDragEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragExit(value: DragEvent[js.Object] => Unit): this.type = set("onDragExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragLeave(value: DragEvent[js.Object] => Unit): this.type = set("onDragLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragOver(value: DragEvent[js.Object] => Unit): this.type = set("onDragOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragStart(value: DragEvent[js.Object] => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDrop(value: DragEvent[js.Object] => Unit): this.type = set("onDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDurationChange(value: SyntheticEvent[Event, js.Object] => Unit): this.type = set("onDurationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEmptied(value: SyntheticEvent[Event, js.Object] => Unit): this.type = set("onEmptied", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEncrypted(value: SyntheticEvent[Event, js.Object] => Unit): this.type = set("onEncrypted", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEnded(value: SyntheticEvent[Event, js.Object] => Unit): this.type = set("onEnded", js.Any.fromFunction1(value))
    
    @scala.inline
    def onError(value: SyntheticEvent[Event, js.Object] => Unit): this.type = set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[js.Object] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onGetG2Instance(value: /* chart */ typingsSlinky.antvG2.mod.Chart => Unit): this.type = set("onGetG2Instance", js.Any.fromFunction1(value))
    
    @scala.inline
    def onInput(value: SyntheticEvent[EventTarget with js.Object, Event] => Unit): this.type = set("onInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def onInvalid(value: SyntheticEvent[EventTarget with js.Object, Event] => Unit): this.type = set("onInvalid", js.Any.fromFunction1(value))
    
    @scala.inline
    def onItemSelected(value: /* ev */ EventParams => Unit): this.type = set("onItemSelected", js.Any.fromFunction1(value))
    
    @scala.inline
    def onItemSelectedChange(value: /* ev */ Data => Unit): this.type = set("onItemSelectedChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onItemUnselected(value: /* ev */ EventParams => Unit): this.type = set("onItemUnselected", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyDown(value: SyntheticKeyboardEvent[js.Object] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyPress(value: SyntheticKeyboardEvent[js.Object] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyUp(value: SyntheticKeyboardEvent[js.Object] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoad(value: SyntheticEvent[Event, js.Object] => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadStart(value: SyntheticEvent[Event, js.Object] => Unit): this.type = set("onLoadStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadedData(value: SyntheticEvent[Event, js.Object] => Unit): this.type = set("onLoadedData", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadedMetadata(value: SyntheticEvent[Event, js.Object] => Unit): this.type = set("onLoadedMetadata", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseDown(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseEnter(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseLeave(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseMove(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseOut(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseOver(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseUp(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPaste(value: SyntheticClipboardEvent[js.Object] => Unit): this.type = set("onPaste", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPause(value: SyntheticEvent[Event, js.Object] => Unit): this.type = set("onPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPlay(value: SyntheticEvent[Event, js.Object] => Unit): this.type = set("onPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPlaying(value: SyntheticEvent[Event, js.Object] => Unit): this.type = set("onPlaying", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPlotClick(value: /* ev */ EventParams => Unit): this.type = set("onPlotClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPlotDblClick(value: /* ev */ EventParams => Unit): this.type = set("onPlotDblClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPlotEnter(value: /* ev */ EventParams => Unit): this.type = set("onPlotEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPlotLeave(value: /* ev */ EventParams => Unit): this.type = set("onPlotLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPlotMove(value: /* ev */ EventParams => Unit): this.type = set("onPlotMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerCancel(value: SyntheticPointerEvent[js.Object] => Unit): this.type = set("onPointerCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerDown(value: SyntheticPointerEvent[js.Object] => Unit): this.type = set("onPointerDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerEnter(value: SyntheticPointerEvent[js.Object] => Unit): this.type = set("onPointerEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerLeave(value: SyntheticPointerEvent[js.Object] => Unit): this.type = set("onPointerLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerMove(value: SyntheticPointerEvent[js.Object] => Unit): this.type = set("onPointerMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerOut(value: SyntheticPointerEvent[js.Object] => Unit): this.type = set("onPointerOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerOver(value: SyntheticPointerEvent[js.Object] => Unit): this.type = set("onPointerOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerUp(value: SyntheticPointerEvent[js.Object] => Unit): this.type = set("onPointerUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onProgress(value: SyntheticEvent[Event, js.Object] => Unit): this.type = set("onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRateChange(value: SyntheticEvent[Event, js.Object] => Unit): this.type = set("onRateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onReset(value: SyntheticEvent[EventTarget with js.Object, Event] => Unit): this.type = set("onReset", js.Any.fromFunction1(value))
    
    @scala.inline
    def onScroll(value: SyntheticUIEvent[js.Object] => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSeeked(value: SyntheticEvent[Event, js.Object] => Unit): this.type = set("onSeeked", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSeeking(value: SyntheticEvent[Event, js.Object] => Unit): this.type = set("onSeeking", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSelect(value: SyntheticEvent[Event, js.Object] => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStalled(value: SyntheticEvent[Event, js.Object] => Unit): this.type = set("onStalled", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSubmit(value: SyntheticEvent[EventTarget with js.Object, Event] => Unit): this.type = set("onSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSuspend(value: SyntheticEvent[Event, js.Object] => Unit): this.type = set("onSuspend", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTimeUpdate(value: SyntheticEvent[Event, js.Object] => Unit): this.type = set("onTimeUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTooltipChange(value: /* ev */ Items => Unit): this.type = set("onTooltipChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTooltipHide(value: /* ev */ TooltipAny => Unit): this.type = set("onTooltipHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTooltipShow(value: /* ev */ typingsSlinky.bizcharts.anon.Tooltip => Unit): this.type = set("onTooltipShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchCancel(value: SyntheticTouchEvent[js.Object] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchEnd(value: SyntheticTouchEvent[js.Object] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchMove(value: SyntheticTouchEvent[js.Object] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchStart(value: SyntheticTouchEvent[js.Object] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTransitionEnd(value: SyntheticTransitionEvent[js.Object] => Unit): this.type = set("onTransitionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onVolumeChange(value: SyntheticEvent[Event, js.Object] => Unit): this.type = set("onVolumeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onWaiting(value: SyntheticEvent[Event, js.Object] => Unit): this.type = set("onWaiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def onWheel(value: SyntheticWheelEvent[js.Object] => Unit): this.type = set("onWheel", js.Any.fromFunction1(value))
    
    @scala.inline
    def padding(
      value: String | Bottom | Double | (js.Tuple4[Double | String, Double | String, Double | String, Double | String]) | (js.Tuple2[String, String])
    ): this.type = set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pixelRatio(value: Double): this.type = set("pixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholderReactElement(value: ReactElement): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholder(value: ReactElement | String | Boolean): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def plotBackground(value: background): this.type = set("plotBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scale(value: js.Any): this.type = set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(height: Double): Builder = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ChartProps]))
  }
}
