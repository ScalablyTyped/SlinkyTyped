package typingsSlinky.reactImages.mod

import org.scalajs.dom.raw.HTMLImageElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.ReactHTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LightboxProps extends js.Object {
  /**
    * Allow users to exit the lightbox by clicking the backdrop. Default value: false.
    */
  var backdropClosesModal: js.UndefOr[Boolean] = js.native
  /**
    * Custom close esc title. Default value: ' Close (Esc) '
    */
  var closeButtonTitle: js.UndefOr[String] = js.native
  /**
    * The index of the image to display initially. Default value: 0
    */
  var currentImage: js.UndefOr[Double] = js.native
  /**
    * An array of elements to display as custom controls on the top of lightbox. Default value: undefined
    */
  var customControls: js.UndefOr[js.Array[ReactHTMLElement[_]]] = js.native
  /**
    * Supports keyboard input - esc, arrow left, and arrow right. Default value: true
    */
  var enableKeyboardInput: js.UndefOr[Boolean] = js.native
  /**
    * The image count separator. Default value: ' of '
    */
  var imageCountSeparator: js.UndefOr[String] = js.native
  /**
    * Array of image objects. Required.
    */
  var images: js.Array[Image] = js.native
  /**
    * Whether or not the lightbox is displayed. Default value: false;
    */
  var isOpen: js.UndefOr[Boolean] = js.native
  /**
    * Custom of left arrow title. Default value: ' Previous (Left arrow key) '
    */
  var leftArrowTitle: js.UndefOr[String] = js.native
  /**
    * Handle click on image.
    */
  var onClickImage: js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLImageElement], Unit]] = js.native
  /**
    * Fired on request of the next image.
    */
  var onClickNext: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Fired on request of the previous image.
    */
  var onClickPrev: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Handle click on thumbnail.
    */
  var onClickThumbnail: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  /**
    * Based on the direction the user is navigating, preload the next available image. Default value: true
    */
  var preloadNextImage: js.UndefOr[Boolean] = js.native
  /**
    * Determines whether scrolling is prevented via react-scrolllock. Default value: true
    */
  var preventScroll: js.UndefOr[Boolean] = js.native
  /**
    * Customize right arrow title. Default value: ' Next (Right arrow key) '
    */
  var rightArrowTitle: js.UndefOr[String] = js.native
  /**
    * Optionally display a close "X" button in top right corner. Default value: true
    */
  var showCloseButton: js.UndefOr[Boolean] = js.native
  /**
    * Optionally display image index, e.g., "3 of 20". Default value: true
    */
  var showImageCount: js.UndefOr[Boolean] = js.native
  /**
    * Optionally display thumbnails beneath the Lightbox
    */
  var showThumbnails: js.UndefOr[Boolean] = js.native
  /**
    * Spinner component.
    */
  var spinner: js.UndefOr[js.Function0[ReactElement]] = js.native
  /**
    *  Color of spinner. Default value: 'white'
    */
  var spinnerColor: js.UndefOr[String] = js.native
  /**
    * Size of spinner. Default value: 100
    */
  var spinnerSize: js.UndefOr[Double] = js.native
  /**
    * Maximum width of the carousel; defaults to 1024px
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * Handle closing of the lightbox. Required.
    */
  def onClose(): Unit = js.native
}

object LightboxProps {
  @scala.inline
  def apply(images: js.Array[Image], onClose: () => Unit): LightboxProps = {
    val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose))
    __obj.asInstanceOf[LightboxProps]
  }
  @scala.inline
  implicit class LightboxPropsOps[Self <: LightboxProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImages(value: js.Array[Image]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBackdropClosesModal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropClosesModal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdropClosesModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropClosesModal")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseButtonTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButtonTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseButtonTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButtonTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentImage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentImage")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomControls(value: js.Array[ReactHTMLElement[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customControls")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableKeyboardInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableKeyboardInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableKeyboardInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableKeyboardInput")(js.undefined)
        ret
    }
    @scala.inline
    def withImageCountSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageCountSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageCountSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageCountSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftArrowTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftArrowTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftArrowTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftArrowTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClickImage(value: /* e */ SyntheticMouseEvent[HTMLImageElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickImage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClickImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickImage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClickNext(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickNext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnClickNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickNext")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClickPrev(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickPrev")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnClickPrev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickPrev")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClickThumbnail(value: /* index */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickThumbnail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClickThumbnail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickThumbnail")(js.undefined)
        ret
    }
    @scala.inline
    def withPreloadNextImage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadNextImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreloadNextImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadNextImage")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withRightArrowTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightArrowTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightArrowTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightArrowTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCloseButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCloseButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowImageCount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showImageCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowImageCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showImageCount")(js.undefined)
        ret
    }
    @scala.inline
    def withShowThumbnails(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showThumbnails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowThumbnails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showThumbnails")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinner(value: () => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinner")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSpinner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinner")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinnerColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinnerColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinnerSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinnerSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerSize")(js.undefined)
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

