package typingsSlinky.reactImgpro.mod.ReactImgpro

import typingsSlinky.reactImgpro.anon.Blue
import typingsSlinky.reactImgpro.anon.Degree
import typingsSlinky.reactImgpro.anon.Height
import typingsSlinky.reactImgpro.anon.Horizontal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessImageProps extends js.Object {
   /* should be 0 - 1 */ var blur: js.UndefOr[Double] = js.native
  var brightness: js.UndefOr[Double] = js.native
  var colors: js.UndefOr[Blue] = js.native
  var contain: js.UndefOr[Size] = js.native
   /* should be -1 to 1 */ var contrast: js.UndefOr[Double] = js.native
   /* should be 0 - 100 */ var cover: js.UndefOr[Size] = js.native
  var customCdn: js.UndefOr[String] = js.native
  var disableRerender: js.UndefOr[Boolean] = js.native
  var disableWebWorker: js.UndefOr[Boolean] = js.native
  var dither565: js.UndefOr[Boolean] = js.native
   /* should be -1 to 1 */ var fade: js.UndefOr[Double] = js.native
  var flip: js.UndefOr[Horizontal] = js.native
  var greyscale: js.UndefOr[Boolean] = js.native
  var image: String = js.native
  var invert: js.UndefOr[Boolean] = js.native
  var normalize: js.UndefOr[Boolean] = js.native
   /* should be 0 - 1 */ var opacity: js.UndefOr[Double] = js.native
  var opaque: js.UndefOr[Boolean] = js.native
   /* should be 0 - 100 */ var posterize: js.UndefOr[Double] = js.native
  var quality: js.UndefOr[Double] = js.native
  var resize: js.UndefOr[Shape] = js.native
  var rotate: js.UndefOr[Degree] = js.native
  var scale: js.UndefOr[Boolean] = js.native
  var scaleToFitImage: js.UndefOr[Height] = js.native
  var sepia: js.UndefOr[Boolean] = js.native
  var storage: js.UndefOr[Boolean] = js.native
  def onProcessFinish(): Unit = js.native
}

object ProcessImageProps {
  @scala.inline
  def apply(image: String, onProcessFinish: () => Unit): ProcessImageProps = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], onProcessFinish = js.Any.fromFunction0(onProcessFinish))
    __obj.asInstanceOf[ProcessImageProps]
  }
  @scala.inline
  implicit class ProcessImagePropsOps[Self <: ProcessImageProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnProcessFinish(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProcessFinish")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBlur(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.undefined)
        ret
    }
    @scala.inline
    def withBrightness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrightness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightness")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: Blue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withContain(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contain")(js.undefined)
        ret
    }
    @scala.inline
    def withContrast(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContrast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrast")(js.undefined)
        ret
    }
    @scala.inline
    def withCover(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomCdn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customCdn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomCdn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customCdn")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableRerender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableRerender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableRerender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableRerender")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableWebWorker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableWebWorker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableWebWorker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableWebWorker")(js.undefined)
        ret
    }
    @scala.inline
    def withDither565(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dither565")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDither565: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dither565")(js.undefined)
        ret
    }
    @scala.inline
    def withFade(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fade")(js.undefined)
        ret
    }
    @scala.inline
    def withFlip(value: Horizontal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flip")(js.undefined)
        ret
    }
    @scala.inline
    def withGreyscale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greyscale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreyscale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greyscale")(js.undefined)
        ret
    }
    @scala.inline
    def withInvert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invert")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withOpaque(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opaque")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpaque: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opaque")(js.undefined)
        ret
    }
    @scala.inline
    def withPosterize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posterize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosterize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posterize")(js.undefined)
        ret
    }
    @scala.inline
    def withQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(js.undefined)
        ret
    }
    @scala.inline
    def withResize(value: Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.undefined)
        ret
    }
    @scala.inline
    def withRotate(value: Degree): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleToFitImage(value: Height): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleToFitImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleToFitImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleToFitImage")(js.undefined)
        ret
    }
    @scala.inline
    def withSepia(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sepia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSepia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sepia")(js.undefined)
        ret
    }
    @scala.inline
    def withStorage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(js.undefined)
        ret
    }
  }
  
}

