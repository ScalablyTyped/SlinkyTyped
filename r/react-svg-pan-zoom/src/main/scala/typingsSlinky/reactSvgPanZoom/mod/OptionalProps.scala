package typingsSlinky.reactSvgPanZoom.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactSvgPanZoom.anon.Background
import typingsSlinky.reactSvgPanZoom.anon.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionalProps extends js.Object {
  // background of the svg
  var SVGBackground: String = js.native
  // background of the viewer
  var background: String = js.native
  // className of the Viewer
  var className: String = js.native
  var customMiniature: ReactElement | ReactComponentClass[js.Object] = js.native
  // override default toolbar component
  // TODO: specify function type more clearly
  var customToolbar: ReactComponentClass[_] = js.native
  // perform PAN if the mouse is on viewer border
  var detectAutoPan: Boolean = js.native
  var detectPinchGesture: Boolean = js.native
  // detect zoom operation performed trough pinch gesture or mouse scroll
  var detectWheel: Boolean = js.native
  // Turn off zoom on double click
  var disableDoubleClickZoomWithToolAuto: Boolean = js.native
  var miniatureProps: Background = js.native
  // modifier keys //https://developer.mozilla.org/en-US/docs/Web/API/KeyboardEvent/getModifierState
  var modifierKeys: js.Array[String] = js.native
  // if disabled the user can move the image outside the viewer
  var preventPanOutside: Boolean = js.native
  // how much scale in or out
  var scaleFactor: Double = js.native
  // maximum amount of scale a user can zoom in to
  var scaleFactorMax: Double = js.native
  // minimum amount of a scale a user can zoom out of
  var scaleFactorMin: Double = js.native
  // how much scale in or out on mouse wheel (requires detectWheel enabled)
  var scaleFactorOnWheel: Double = js.native
  // CSS style of the Viewer
  var style: js.Object = js.native
  var toolbarProps: Position = js.native
  // Note: The `T` type parameter is the type of the `target` of the event:
  // handler click
  def onClick[T](event: ViewerMouseEvent[T]): Unit = js.native
  // handler double click
  def onDoubleClick[T](event: ViewerMouseEvent[T]): Unit = js.native
  // handler mousedown
  def onMouseDown[T](event: ViewerMouseEvent[T]): Unit = js.native
  // handler mousemove
  def onMouseMove[T](event: ViewerMouseEvent[T]): Unit = js.native
  // handler mouseup
  def onMouseUp[T](event: ViewerMouseEvent[T]): Unit = js.native
  // handler pan action performed
  def onPan[T](event: ViewerMouseEvent[T]): Unit = js.native
  // handler zoom level changed
  def onZoom[T](event: ViewerMouseEvent[T]): Unit = js.native
}

object OptionalProps {
  @scala.inline
  def apply(
    SVGBackground: String,
    background: String,
    className: String,
    customMiniature: ReactElement | ReactComponentClass[js.Object],
    customToolbar: ReactComponentClass[_],
    detectAutoPan: Boolean,
    detectPinchGesture: Boolean,
    detectWheel: Boolean,
    disableDoubleClickZoomWithToolAuto: Boolean,
    miniatureProps: Background,
    modifierKeys: js.Array[String],
    onClick: ViewerMouseEvent[js.Any] => Unit,
    onDoubleClick: ViewerMouseEvent[js.Any] => Unit,
    onMouseDown: ViewerMouseEvent[js.Any] => Unit,
    onMouseMove: ViewerMouseEvent[js.Any] => Unit,
    onMouseUp: ViewerMouseEvent[js.Any] => Unit,
    onPan: ViewerMouseEvent[js.Any] => Unit,
    onZoom: ViewerMouseEvent[js.Any] => Unit,
    preventPanOutside: Boolean,
    scaleFactor: Double,
    scaleFactorMax: Double,
    scaleFactorMin: Double,
    scaleFactorOnWheel: Double,
    style: js.Object,
    toolbarProps: Position
  ): OptionalProps = {
    val __obj = js.Dynamic.literal(SVGBackground = SVGBackground.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], customMiniature = customMiniature.asInstanceOf[js.Any], customToolbar = customToolbar.asInstanceOf[js.Any], detectAutoPan = detectAutoPan.asInstanceOf[js.Any], detectPinchGesture = detectPinchGesture.asInstanceOf[js.Any], detectWheel = detectWheel.asInstanceOf[js.Any], disableDoubleClickZoomWithToolAuto = disableDoubleClickZoomWithToolAuto.asInstanceOf[js.Any], miniatureProps = miniatureProps.asInstanceOf[js.Any], modifierKeys = modifierKeys.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onDoubleClick = js.Any.fromFunction1(onDoubleClick), onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseMove = js.Any.fromFunction1(onMouseMove), onMouseUp = js.Any.fromFunction1(onMouseUp), onPan = js.Any.fromFunction1(onPan), onZoom = js.Any.fromFunction1(onZoom), preventPanOutside = preventPanOutside.asInstanceOf[js.Any], scaleFactor = scaleFactor.asInstanceOf[js.Any], scaleFactorMax = scaleFactorMax.asInstanceOf[js.Any], scaleFactorMin = scaleFactorMin.asInstanceOf[js.Any], scaleFactorOnWheel = scaleFactorOnWheel.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], toolbarProps = toolbarProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalProps]
  }
  @scala.inline
  implicit class OptionalPropsOps[Self <: OptionalProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSVGBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVGBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomMiniatureReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMiniature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomMiniatureFunctionComponent(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMiniature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomMiniatureComponentClass(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMiniature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomMiniature(value: ReactElement | ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMiniature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomToolbarFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customToolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomToolbarComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customToolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomToolbar(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customToolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetectAutoPan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectAutoPan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetectPinchGesture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectPinchGesture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetectWheel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectWheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableDoubleClickZoomWithToolAuto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDoubleClickZoomWithToolAuto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMiniatureProps(value: Background): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miniatureProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifierKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifierKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClick(value: ViewerMouseEvent[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnDoubleClick(value: ViewerMouseEvent[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnMouseDown(value: ViewerMouseEvent[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnMouseMove(value: ViewerMouseEvent[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnMouseUp(value: ViewerMouseEvent[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnPan(value: ViewerMouseEvent[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnZoom(value: ViewerMouseEvent[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPreventPanOutside(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventPanOutside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleFactorMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFactorMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleFactorMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFactorMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleFactorOnWheel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFactorOnWheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolbarProps(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarProps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

