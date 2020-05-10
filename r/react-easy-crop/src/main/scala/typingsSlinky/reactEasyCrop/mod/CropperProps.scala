package typingsSlinky.reactEasyCrop.mod

import typingsSlinky.reactEasyCrop.AnonContainerClassName
import typingsSlinky.reactEasyCrop.AnonContainerStyle
import typingsSlinky.reactEasyCrop.reactEasyCropStrings.rect
import typingsSlinky.reactEasyCrop.reactEasyCropStrings.round
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CropperProps extends js.Object {
  var aspect: js.UndefOr[Double] = js.native
  var classes: js.UndefOr[AnonContainerClassName] = js.native
  var crop: Location = js.native
  var cropShape: js.UndefOr[rect | round] = js.native
  var cropSize: js.UndefOr[Size] = js.native
  var crossOrigin: js.UndefOr[String] = js.native
  var image: String = js.native
  var initialCroppedAreaPixels: js.UndefOr[Area] = js.native
  var maxZoom: js.UndefOr[Double] = js.native
  var minZoom: js.UndefOr[Double] = js.native
  var onCropComplete: js.UndefOr[js.Function2[/* croppedArea */ Area, /* croppedAreaPixels */ Area, Unit]] = js.native
  var onImageLoaded: js.UndefOr[js.Function1[/* imageSize */ ImageSize, Unit]] = js.native
  var onImgError: js.UndefOr[js.Function0[Unit]] = js.native
  var onInteractionEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var onInteractionStart: js.UndefOr[js.Function0[Unit]] = js.native
  var onRotationChange: js.UndefOr[js.Function1[/* rotation */ Double, Unit]] = js.native
  var onZoomChange: js.UndefOr[js.Function1[/* zoom */ Double, Unit]] = js.native
  var restrictPosition: js.UndefOr[Boolean] = js.native
  var rotation: js.UndefOr[Double] = js.native
  var showGrid: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[AnonContainerStyle] = js.native
  var zoom: js.UndefOr[Double] = js.native
  var zoomSpeed: js.UndefOr[Double] = js.native
  def onCropChange(location: Location): Unit = js.native
}

object CropperProps {
  @scala.inline
  def apply(crop: Location, image: String, onCropChange: Location => Unit): CropperProps = {
    val __obj = js.Dynamic.literal(crop = crop.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], onCropChange = js.Any.fromFunction1(onCropChange))
    __obj.asInstanceOf[CropperProps]
  }
  @scala.inline
  implicit class CropperPropsOps[Self <: CropperProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrop(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnCropChange(value: Location => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCropChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAspect(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAspect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspect")(js.undefined)
        ret
    }
    @scala.inline
    def withClasses(value: AnonContainerClassName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withCropShape(value: rect | round): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCropShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropShape")(js.undefined)
        ret
    }
    @scala.inline
    def withCropSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCropSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialCroppedAreaPixels(value: Area): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialCroppedAreaPixels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialCroppedAreaPixels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialCroppedAreaPixels")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMinZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCropComplete(value: (/* croppedArea */ Area, /* croppedAreaPixels */ Area) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCropComplete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCropComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCropComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnImageLoaded(value: /* imageSize */ ImageSize => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onImageLoaded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnImageLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onImageLoaded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnImgError(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onImgError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnImgError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onImgError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInteractionEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInteractionEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnInteractionEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInteractionEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInteractionStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInteractionStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnInteractionStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInteractionStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRotationChange(value: /* rotation */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRotationChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRotationChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRotationChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnZoomChange(value: /* zoom */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoomChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnZoomChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoomChange")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withShowGrid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: AnonContainerStyle): Self = {
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
    def withZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomSpeed")(js.undefined)
        ret
    }
  }
  
}

