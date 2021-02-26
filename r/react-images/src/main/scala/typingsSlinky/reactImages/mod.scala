package typingsSlinky.reactImages

import org.scalajs.dom.raw.HTMLImageElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ReactHTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-images", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[LightboxProps, js.Object, js.Any] {
    def this(props: LightboxProps) = this()
  }
  
  @js.native
  trait Image extends StObject {
    
    /**
      * The alt text for the image.
      */
    var alt: js.UndefOr[String] = js.native
    
    /**
      * The image caption.
      */
    var caption: js.UndefOr[String] = js.native
    
    /**
      * The source of the image. Required.
      */
    var src: String = js.native
    
    /**
      * array of strings or string
      */
    var srcSet: js.UndefOr[String | js.Array[String]] = js.native
  }
  object Image {
    
    @scala.inline
    def apply(src: String): Image = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image]
    }
    
    @scala.inline
    implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcSet(value: String | js.Array[String]): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
      
      @scala.inline
      def setSrcSetVarargs(value: String*): Self = StObject.set(x, "srcSet", js.Array(value :_*))
    }
  }
  
  type Lightbox = ReactComponentClass[LightboxProps]
  
  @js.native
  trait LightboxProps extends StObject {
    
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
      * Handle closing of the lightbox. Required.
      */
    def onClose(): Unit = js.native
    
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
  }
  object LightboxProps {
    
    @scala.inline
    def apply(images: js.Array[Image], onClose: () => Unit): LightboxProps = {
      val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose))
      __obj.asInstanceOf[LightboxProps]
    }
    
    @scala.inline
    implicit class LightboxPropsMutableBuilder[Self <: LightboxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackdropClosesModal(value: Boolean): Self = StObject.set(x, "backdropClosesModal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropClosesModalUndefined: Self = StObject.set(x, "backdropClosesModal", js.undefined)
      
      @scala.inline
      def setCloseButtonTitle(value: String): Self = StObject.set(x, "closeButtonTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseButtonTitleUndefined: Self = StObject.set(x, "closeButtonTitle", js.undefined)
      
      @scala.inline
      def setCurrentImage(value: Double): Self = StObject.set(x, "currentImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentImageUndefined: Self = StObject.set(x, "currentImage", js.undefined)
      
      @scala.inline
      def setCustomControls(value: js.Array[ReactHTMLElement[_]]): Self = StObject.set(x, "customControls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomControlsUndefined: Self = StObject.set(x, "customControls", js.undefined)
      
      @scala.inline
      def setCustomControlsVarargs(value: ReactHTMLElement[js.Any]*): Self = StObject.set(x, "customControls", js.Array(value :_*))
      
      @scala.inline
      def setEnableKeyboardInput(value: Boolean): Self = StObject.set(x, "enableKeyboardInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableKeyboardInputUndefined: Self = StObject.set(x, "enableKeyboardInput", js.undefined)
      
      @scala.inline
      def setImageCountSeparator(value: String): Self = StObject.set(x, "imageCountSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageCountSeparatorUndefined: Self = StObject.set(x, "imageCountSeparator", js.undefined)
      
      @scala.inline
      def setImages(value: js.Array[Image]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value :_*))
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      @scala.inline
      def setLeftArrowTitle(value: String): Self = StObject.set(x, "leftArrowTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftArrowTitleUndefined: Self = StObject.set(x, "leftArrowTitle", js.undefined)
      
      @scala.inline
      def setOnClickImage(value: /* e */ SyntheticMouseEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onClickImage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickImageUndefined: Self = StObject.set(x, "onClickImage", js.undefined)
      
      @scala.inline
      def setOnClickNext(value: () => Unit): Self = StObject.set(x, "onClickNext", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClickNextUndefined: Self = StObject.set(x, "onClickNext", js.undefined)
      
      @scala.inline
      def setOnClickPrev(value: () => Unit): Self = StObject.set(x, "onClickPrev", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClickPrevUndefined: Self = StObject.set(x, "onClickPrev", js.undefined)
      
      @scala.inline
      def setOnClickThumbnail(value: /* index */ Double => Unit): Self = StObject.set(x, "onClickThumbnail", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickThumbnailUndefined: Self = StObject.set(x, "onClickThumbnail", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPreloadNextImage(value: Boolean): Self = StObject.set(x, "preloadNextImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadNextImageUndefined: Self = StObject.set(x, "preloadNextImage", js.undefined)
      
      @scala.inline
      def setPreventScroll(value: Boolean): Self = StObject.set(x, "preventScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventScrollUndefined: Self = StObject.set(x, "preventScroll", js.undefined)
      
      @scala.inline
      def setRightArrowTitle(value: String): Self = StObject.set(x, "rightArrowTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightArrowTitleUndefined: Self = StObject.set(x, "rightArrowTitle", js.undefined)
      
      @scala.inline
      def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      @scala.inline
      def setShowImageCount(value: Boolean): Self = StObject.set(x, "showImageCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowImageCountUndefined: Self = StObject.set(x, "showImageCount", js.undefined)
      
      @scala.inline
      def setShowThumbnails(value: Boolean): Self = StObject.set(x, "showThumbnails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowThumbnailsUndefined: Self = StObject.set(x, "showThumbnails", js.undefined)
      
      @scala.inline
      def setSpinner(value: () => ReactElement): Self = StObject.set(x, "spinner", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSpinnerColor(value: String): Self = StObject.set(x, "spinnerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinnerColorUndefined: Self = StObject.set(x, "spinnerColor", js.undefined)
      
      @scala.inline
      def setSpinnerSize(value: Double): Self = StObject.set(x, "spinnerSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinnerSizeUndefined: Self = StObject.set(x, "spinnerSize", js.undefined)
      
      @scala.inline
      def setSpinnerUndefined: Self = StObject.set(x, "spinner", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
