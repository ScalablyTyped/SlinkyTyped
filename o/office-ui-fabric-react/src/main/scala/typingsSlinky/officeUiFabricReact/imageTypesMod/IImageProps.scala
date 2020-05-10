package typingsSlinky.officeUiFabricReact.imageTypesMod

import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.react.mod.ImgHTMLAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IImageProps extends ImgHTMLAttributes[HTMLImageElement] {
  /**
    * Specifies the cover style to be used for this image. If not
    * specified, this will be dynamically calculated based on the
    * aspect ratio for the image.
    */
  var coverStyle: js.UndefOr[ImageCoverStyle] = js.native
  /**
    * Deprecated at v1.3.6, to replace the src in case of errors, use `onLoadingStateChange` instead and
    * rerender the Image with a difference src.
    * @deprecated Use `onLoadingStateChange` instead and
    * rerender the Image with a difference src.
    */
  var errorSrc: js.UndefOr[String] = js.native
  /**
    * Used to determine how the image is scaled and cropped to fit the frame.
    *
    * @defaultvalue If both dimensions are provided, then the image is fit using ImageFit.scale.
    * Otherwise, the image won't be scaled or cropped.
    */
  var imageFit: js.UndefOr[ImageFit] = js.native
  /**
    * If true, the image frame will expand to fill its parent container.
    */
  var maximizeFrame: js.UndefOr[Boolean] = js.native
  /**
    * Optional callback method for when the image load state has changed.
    * The 'loadState' parameter indicates the current state of the Image.
    */
  var onLoadingStateChange: js.UndefOr[js.Function1[/* loadState */ ImageLoadState, Unit]] = js.native
  /**
    * If true, fades the image in when loaded.
    * @defaultvalue true
    */
  var shouldFadeIn: js.UndefOr[Boolean] = js.native
  /**
    * If true, the image starts as visible and is hidden on error. Otherwise, the image is hidden until
    * it is successfully loaded. This disables shouldFadeIn.
    * @defaultvalue false;
    */
  var shouldStartVisible: js.UndefOr[Boolean] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IImageStyleProps, IImageStyles]] = js.native
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object IImageProps {
  @scala.inline
  def apply(): IImageProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IImageProps]
  }
  @scala.inline
  implicit class IImagePropsOps[Self <: IImageProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoverStyle(value: ImageCoverStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withImageFit(value: ImageFit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageFit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageFit")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximizeFrame(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizeFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximizeFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizeFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadingStateChange(value: /* loadState */ ImageLoadState => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadingStateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadingStateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadingStateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldFadeIn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFadeIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldFadeIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFadeIn")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldStartVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldStartVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldStartVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldStartVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IImageStyleProps => Partial[IImageStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IImageStyleProps, IImageStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

