package typingsSlinky.cordovaPluginCanvascamera

import typingsSlinky.cordovaPluginCanvascamera.cordovaPluginCanvascameraStrings.back
import typingsSlinky.cordovaPluginCanvascamera.cordovaPluginCanvascameraStrings.data
import typingsSlinky.cordovaPluginCanvascamera.cordovaPluginCanvascameraStrings.file
import typingsSlinky.cordovaPluginCanvascamera.cordovaPluginCanvascameraStrings.front
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasCameraOptions extends js.Object {
  /**
    * String, optional, default: file, file to use files for rendering (lower CPU / higher storage) or data to use base64 jpg data for rendering (higher cpu / lower storage).
    */
  var cameraFacing: js.UndefOr[front | back] = js.native
  var canvas: js.UndefOr[AnonWidth] = js.native
  var capture: js.UndefOr[AnonWidth] = js.native
  /**
    * Boolean, optional, default: false, a boolean to set flash mode on/off.
    */
  var flashMode: js.UndefOr[Boolean] = js.native
  /**
    * Number, optional, default: 30, desired number of frames per second.
    */
  var fps: js.UndefOr[Double] = js.native
  /**
    * Number, optional, default: 288, height in pixels of the video to capture and the output canvas height in pixels.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Function, optional, default : null, callback executed after a frame has been drawn. frame contains the canvas element, the image element, the tracking data.
    */
  // tslint:disable-next-line:prefer-method-signature
  var onAfterDraw: js.UndefOr[js.Function1[/* frame */ js.UndefOr[Frame], Unit]] = js.native
  /**
    * Function, optional, default : null, callback executed before a frame has been drawn. frame contains the canvas element, the image element, the tracking data.
    */
  // tslint:disable-next-line:prefer-method-signature
  var onBeforeDraw: js.UndefOr[js.Function1[/* frame */ js.UndefOr[Frame], Unit]] = js.native
  /**
    * Number, optional, default: 1/6, a ratio used to scale down the thumbnail.
    */
  var thumbnailRatio: js.UndefOr[Double] = js.native
  /**
    * String, optional, default: 'front', 'front' or 'back'.
    */
  var use: js.UndefOr[file | data] = js.native
  /**
    * Number, optional, default: 352, width in pixels of the video to capture and the output canvas width in pixels.
    */
  var width: js.UndefOr[Double] = js.native
}

object CanvasCameraOptions {
  @scala.inline
  def apply(): CanvasCameraOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasCameraOptions]
  }
  @scala.inline
  implicit class CanvasCameraOptionsOps[Self <: CanvasCameraOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCameraFacing(value: front | back): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraFacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCameraFacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraFacing")(js.undefined)
        ret
    }
    @scala.inline
    def withCanvas(value: AnonWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanvas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvas")(js.undefined)
        ret
    }
    @scala.inline
    def withCapture(value: AnonWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(js.undefined)
        ret
    }
    @scala.inline
    def withFlashMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlashMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashMode")(js.undefined)
        ret
    }
    @scala.inline
    def withFps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fps")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAfterDraw(value: /* frame */ js.UndefOr[Frame] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfterDraw")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAfterDraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfterDraw")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeDraw(value: /* frame */ js.UndefOr[Frame] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeDraw")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeDraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeDraw")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withUse(value: file | data): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

