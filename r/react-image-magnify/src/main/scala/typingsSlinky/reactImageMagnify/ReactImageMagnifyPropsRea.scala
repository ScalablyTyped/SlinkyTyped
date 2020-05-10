package typingsSlinky.reactImageMagnify

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactImageMagnify.mod.LargeImageType
import typingsSlinky.reactImageMagnify.mod.SmallImageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-image-magnify.react-image-magnify.ReactImageMagnifyProps & std.Readonly<{  children ? :react.react.ReactNode}> */
@js.native
trait ReactImageMagnifyPropsRea extends js.Object {
  val children: js.UndefOr[TagMod[Any]] = js.native
  /**
    * CSS class applied to root container element.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * CSS class applied to enlarged image element.
    */
  var enlargedImageClassName: js.UndefOr[String] = js.native
  /**
    * CSS class applied to enlarged image container element.
    */
  var enlargedImageContainerClassName: js.UndefOr[String] = js.native
  /**
    * Specify enlarged image container dimensions as an object with width and height properties.
    * Values may be expressed as a percentage (e.g. '150%') or a number (e.g. 200).
    * Percentage is based on small image dimension. Number is pixels.
    * Not applied when enlargedImagePosition is set to 'over', the default for touch input.
    */
  var enlargedImageContainerDimensions: js.UndefOr[AnonHeight] = js.native
  /**
    * Style applied to enlarged image container element.
    */
  var enlargedImageContainerStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * Render enlarged image into an HTML element of your choosing by specifying the target element id.
    * Requires React v16. Ignored for touch input by default - see isEnlargedImagePortalEnabledForTouch.
    */
  var enlargedImagePortalId: js.UndefOr[String] = js.native
  // Behavioral props
  /**
    * Enlarged image placement. Can be 'beside' or 'over'.
    *
    * Default: beside(over for touch)
    */
  var enlargedImagePosition: js.UndefOr[String] = js.native
  /**
    * Style applied to enlarged image element.
    */
  var enlargedImageStyle: js.UndefOr[CSSProperties] = js.native
  // Interation properties
  /**
    * Milliseconds duration of magnified image fade in/fade out.
    *
    * Default: 300
    */
  var fadeDurationInMs: js.UndefOr[Double] = js.native
  /**
    * Reference to a component class or functional component. A Default is provided.
    */
  var hintComponent: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Hint text for mouse.
    *
    * Default: Hover to Zoom
    */
  var hintTextMouse: js.UndefOr[String] = js.native
  /**
    * Hint text for touch.
    *
    * Default: Long-Touch to Zoom
    */
  var hintTextTouch: js.UndefOr[String] = js.native
  /**
    * Milliseconds to delay hover trigger.
    *
    * Default: 250
    */
  var hoverDelayInMs: js.UndefOr[Double] = js.native
  /**
    * Milliseconds to delay hover-off trigger.
    *
    * Default: 150
    */
  var hoverOffDelayInMs: js.UndefOr[Double] = js.native
  /**
    * CSS class applied to small image element.
    */
  var imageClassName: js.UndefOr[String] = js.native
  /**
    * Style applied to small image element.
    */
  var imageStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * Activate magnification immediately on touch. May impact scrolling.
    *
    * Default: false
    */
  var isActivatedOnTouch: js.UndefOr[Boolean] = js.native
  /**
    * Specify portal rendering should be honored for touch input.
    *
    * Default: false
    */
  var isEnlargedImagePortalEnabledForTouch: js.UndefOr[Boolean] = js.native
  /**
    * Enable hint feature.
    *
    * Default: false
    */
  var isHintEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Large image information
    */
  var largeImage: LargeImageType = js.native
  /**
    * Specify a custom lens component.
    */
  var lensComponent: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Style applied to tinted lens.
    */
  var lensStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * Milliseconds to delay long-press activation (long touch).
    *
    * Default: 500
    */
  var pressDuration: js.UndefOr[Double] = js.native
  /**
    * Pixels of movement allowed during long-press activation.
    *
    * Default: 5
    */
  var pressMoveThreshold: js.UndefOr[Double] = js.native
  /**
    * Only show hint until the first interaction begins.
    *
    * Default: true
    */
  var shouldHideHintAfterFirstActivation: js.UndefOr[Boolean] = js.native
  /**
    * Specify a positive space lens in place of the default negative space lens.
    *
    * Default: false
    */
  var shouldUsePositiveSpaceLens: js.UndefOr[Boolean] = js.native
  /**
    * Small image information.
    */
  var smallImage: SmallImageType = js.native
  /**
    * Style applied to root container element.
    */
  var style: js.UndefOr[CSSProperties] = js.native
}

object ReactImageMagnifyPropsRea {
  @scala.inline
  def apply(largeImage: LargeImageType, smallImage: SmallImageType): ReactImageMagnifyPropsRea = {
    val __obj = js.Dynamic.literal(largeImage = largeImage.asInstanceOf[js.Any], smallImage = smallImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactImageMagnifyPropsRea]
  }
  @scala.inline
  implicit class ReactImageMagnifyPropsReaOps[Self <: ReactImageMagnifyPropsRea] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLargeImage(value: LargeImageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmallImage(value: SmallImageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
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
    def withEnlargedImageClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enlargedImageClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnlargedImageClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enlargedImageClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withEnlargedImageContainerClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enlargedImageContainerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnlargedImageContainerClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enlargedImageContainerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withEnlargedImageContainerDimensions(value: AnonHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enlargedImageContainerDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnlargedImageContainerDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enlargedImageContainerDimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withEnlargedImageContainerStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enlargedImageContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnlargedImageContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enlargedImageContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withEnlargedImagePortalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enlargedImagePortalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnlargedImagePortalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enlargedImagePortalId")(js.undefined)
        ret
    }
    @scala.inline
    def withEnlargedImagePosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enlargedImagePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnlargedImagePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enlargedImagePosition")(js.undefined)
        ret
    }
    @scala.inline
    def withEnlargedImageStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enlargedImageStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnlargedImageStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enlargedImageStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFadeDurationInMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeDurationInMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFadeDurationInMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeDurationInMs")(js.undefined)
        ret
    }
    @scala.inline
    def withHintComponent(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintComponent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHintComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withHintTextMouse(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintTextMouse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHintTextMouse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintTextMouse")(js.undefined)
        ret
    }
    @scala.inline
    def withHintTextTouch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintTextTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHintTextTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintTextTouch")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverDelayInMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverDelayInMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverDelayInMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverDelayInMs")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverOffDelayInMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverOffDelayInMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverOffDelayInMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverOffDelayInMs")(js.undefined)
        ret
    }
    @scala.inline
    def withImageClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withImageStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withIsActivatedOnTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActivatedOnTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsActivatedOnTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActivatedOnTouch")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEnlargedImagePortalEnabledForTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnlargedImagePortalEnabledForTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEnlargedImagePortalEnabledForTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnlargedImagePortalEnabledForTouch")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHintEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHintEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHintEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHintEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLensComponent(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lensComponent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutLensComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lensComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withLensStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lensStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLensStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lensStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPressDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPressDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withPressMoveThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressMoveThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPressMoveThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressMoveThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldHideHintAfterFirstActivation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldHideHintAfterFirstActivation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldHideHintAfterFirstActivation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldHideHintAfterFirstActivation")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldUsePositiveSpaceLens(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldUsePositiveSpaceLens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldUsePositiveSpaceLens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldUsePositiveSpaceLens")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
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
  }
  
}

