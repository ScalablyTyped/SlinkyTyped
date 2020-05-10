package typingsSlinky.reactSvgPanZoom.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactSvgPanZoom.AnonBackground
import typingsSlinky.reactSvgPanZoom.AnonPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-svg-pan-zoom.react-svg-pan-zoom.UncontrolledRequiredProps & std.Partial<react-svg-pan-zoom.react-svg-pan-zoom.OptionalProps> & std.Partial<react-svg-pan-zoom.react-svg-pan-zoom.UncontrolledExtraOptionalProps> */
@js.native
trait UncontrolledProps extends js.Object {
  var SVGBackground: js.UndefOr[String] = js.native
  var background: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var customMiniature: js.UndefOr[ReactElement | ReactComponentClass[js.Object]] = js.native
  var customToolbar: js.UndefOr[ReactComponentClass[_]] = js.native
  var detectAutoPan: js.UndefOr[Boolean] = js.native
  var detectPinchGesture: js.UndefOr[Boolean] = js.native
  var detectWheel: js.UndefOr[Boolean] = js.native
  var disableDoubleClickZoomWithToolAuto: js.UndefOr[Boolean] = js.native
  // height of the viewer displayed on screen
  var height: Double = js.native
  var miniatureProps: js.UndefOr[AnonBackground] = js.native
  var modifierKeys: js.UndefOr[js.Array[String]] = js.native
  var onChangeTool: js.UndefOr[js.Function1[/* tool */ Tool, Unit]] = js.native
  var onChangeValue: js.UndefOr[js.Function1[/* value */ Value, Unit]] = js.native
  var onClick: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[_], Unit]] = js.native
  var onDoubleClick: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[_], Unit]] = js.native
  var onMouseDown: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[_], Unit]] = js.native
  var onMouseMove: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[_], Unit]] = js.native
  var onMouseUp: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[_], Unit]] = js.native
  var onPan: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[_], Unit]] = js.native
  var onZoom: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[_], Unit]] = js.native
  var preventPanOutside: js.UndefOr[Boolean] = js.native
  var scaleFactor: js.UndefOr[Double] = js.native
  var scaleFactorMax: js.UndefOr[Double] = js.native
  var scaleFactorMin: js.UndefOr[Double] = js.native
  var scaleFactorOnWheel: js.UndefOr[Double] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var tool: js.UndefOr[Tool] = js.native
  var toolbarProps: js.UndefOr[AnonPosition] = js.native
  var value: js.UndefOr[Value] = js.native
  // width of the viewer displayed on screen
  var width: Double = js.native
}

object UncontrolledProps {
  @scala.inline
  def apply(height: Double, width: Double): UncontrolledProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[UncontrolledProps]
  }
  @scala.inline
  implicit class UncontrolledPropsOps[Self <: UncontrolledProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSVGBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVGBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSVGBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVGBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
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
    def withoutCustomMiniature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMiniature")(js.undefined)
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
    def withoutCustomToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customToolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withDetectAutoPan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectAutoPan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectAutoPan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectAutoPan")(js.undefined)
        ret
    }
    @scala.inline
    def withDetectPinchGesture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectPinchGesture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectPinchGesture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectPinchGesture")(js.undefined)
        ret
    }
    @scala.inline
    def withDetectWheel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectWheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectWheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectWheel")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableDoubleClickZoomWithToolAuto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDoubleClickZoomWithToolAuto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableDoubleClickZoomWithToolAuto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDoubleClickZoomWithToolAuto")(js.undefined)
        ret
    }
    @scala.inline
    def withMiniatureProps(value: AnonBackground): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miniatureProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMiniatureProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miniatureProps")(js.undefined)
        ret
    }
    @scala.inline
    def withModifierKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifierKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifierKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifierKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChangeTool(value: /* tool */ Tool => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeTool")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChangeTool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeTool")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChangeValue(value: /* value */ Value => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChangeValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: /* event */ ViewerMouseEvent[_] => Unit): Self = {
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
    def withOnDoubleClick(value: /* event */ ViewerMouseEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDoubleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseDown(value: /* event */ ViewerMouseEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseMove(value: /* event */ ViewerMouseEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseUp(value: /* event */ ViewerMouseEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPan(value: /* event */ ViewerMouseEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPan")(js.undefined)
        ret
    }
    @scala.inline
    def withOnZoom(value: /* event */ ViewerMouseEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventPanOutside(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventPanOutside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventPanOutside: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventPanOutside")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleFactorMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFactorMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleFactorMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFactorMax")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleFactorMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFactorMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleFactorMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFactorMin")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleFactorOnWheel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFactorOnWheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleFactorOnWheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFactorOnWheel")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Object): Self = {
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
    def withTool(value: Tool): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tool")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarProps(value: AnonPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarProps")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

