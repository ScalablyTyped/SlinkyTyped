package typingsSlinky.jqueryJcrop.JQuery.Jcrop

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var addClass: js.UndefOr[String] = js.native
  var allowMove: js.UndefOr[Boolean] = js.native
  var allowResize: js.UndefOr[Boolean] = js.native
  // Basic Settings
  var allowSelect: js.UndefOr[Boolean] = js.native
  var animationDelay: js.UndefOr[Double] = js.native
  /** Aspect ratio of w/h (e.g. 1 for square)  */
  var aspectRatio: js.UndefOr[Double] = js.native
  var baseClass: js.UndefOr[String] = js.native
  /** Set color of background container @default 'black' */
  var bgColor: js.UndefOr[String] = js.native
  var bgFade: js.UndefOr[Boolean] = js.native
  /** Opacity of outer image when cropping; between 0 and 1 @default .6 */
  var bgOpacity: js.UndefOr[Double] = js.native
  var borderOpacity: js.UndefOr[Double] = js.native
  var boundary: js.UndefOr[Double] = js.native
  /** Maximum height of cropping area @default 0 (no limit) */
  var boxHeight: js.UndefOr[Double] = js.native
  /** Maximum width of cropping area @default 0 (no limit) */
  var boxWidth: js.UndefOr[Double] = js.native
  var createBorders: js.UndefOr[js.Array[CardinalDirection]] = js.native
  var createDragbars: js.UndefOr[js.Array[CardinalDirection]] = js.native
  var createHandles: js.UndefOr[js.Array[CardinalDirection | IntermediateDirection]] = js.native
  var dragEdges: js.UndefOr[Boolean] = js.native
  var drawBorders: js.UndefOr[Boolean] = js.native
  var fadeTime: js.UndefOr[Double] = js.native
  var fixedSupport: js.UndefOr[Boolean] = js.native
  var handleOpacity: js.UndefOr[Double] = js.native
  var handleSize: js.UndefOr[Double | Null] = js.native
  var keySupport: js.UndefOr[Boolean] = js.native
  /** Maximum width/height, use 0 for unbounded dimension; [width, height] */
  var maxSize: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var minSelect: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  /** Minimum width/height, use 0 for unbounded dimension; [width, height] */
  var minSize: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  /** Called when the selection is moving */
  var onChange: js.UndefOr[JCropEventHandler] = js.native
  /** Called when double-clicked */
  var onDblClick: js.UndefOr[JCropEventHandler] = js.native
  /** Called when the selection is released */
  var onRelease: js.UndefOr[JCropEventHandler] = js.native
  /** Called when selection is completed */
  var onSelect: js.UndefOr[JCropEventHandler] = js.native
  /** Set an initial selection area; [x, y, x2, y2] */
  var setSelect: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.native
  var shade: js.UndefOr[Boolean | Null] = js.native
  var swingSpeed: js.UndefOr[Double] = js.native
  var touchSupport: js.UndefOr[Boolean | Null] = js.native
  var trackDocument: js.UndefOr[Boolean] = js.native
  /** Specify the true size of the image */
  var trueSize: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClass")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowMove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMove")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowResize")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withAspectRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseClass")(js.undefined)
        ret
    }
    @scala.inline
    def withBgColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBgFade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgFade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgFade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgFade")(js.undefined)
        ret
    }
    @scala.inline
    def withBgOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundary(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateBorders(value: js.Array[CardinalDirection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createBorders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateBorders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createBorders")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateDragbars(value: js.Array[CardinalDirection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDragbars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateDragbars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDragbars")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateHandles(value: js.Array[CardinalDirection | IntermediateDirection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createHandles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateHandles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createHandles")(js.undefined)
        ret
    }
    @scala.inline
    def withDragEdges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEdges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragEdges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEdges")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawBorders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawBorders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawBorders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawBorders")(js.undefined)
        ret
    }
    @scala.inline
    def withFadeTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFadeTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedSupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleSize")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleSizeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleSize")(null)
        ret
    }
    @scala.inline
    def withKeySupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeySupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySupport")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSize(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSelect(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSize(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* c */ SelectionInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDblClick(value: /* c */ SelectionInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDblClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDblClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDblClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRelease(value: /* c */ SelectionInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRelease")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRelease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRelease")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: /* c */ SelectionInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSelect(value: js.Tuple4[Double, Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withShade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shade")(js.undefined)
        ret
    }
    @scala.inline
    def withShadeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shade")(null)
        ret
    }
    @scala.inline
    def withSwingSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swingSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwingSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swingSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchSupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchSupportNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchSupport")(null)
        ret
    }
    @scala.inline
    def withTrackDocument(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackDocument")(js.undefined)
        ret
    }
    @scala.inline
    def withTrueSize(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trueSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrueSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trueSize")(js.undefined)
        ret
    }
  }
  
}

