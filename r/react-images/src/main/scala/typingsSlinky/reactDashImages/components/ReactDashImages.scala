package typingsSlinky.reactDashImages.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLImageElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.ReactHTMLElement
import typingsSlinky.reactDashImages.reactDashImagesMod.Image
import typingsSlinky.reactDashImages.reactDashImagesMod.LightboxProps
import typingsSlinky.reactDashImages.reactDashImagesMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashImages
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-images", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    images: js.Array[Image],
    onClose: () => Unit,
    backdropClosesModal: js.UndefOr[Boolean] = js.undefined,
    closeButtonTitle: String = null,
    currentImage: Int | Double = null,
    customControls: js.Array[ReactHTMLElement[_]] = null,
    enableKeyboardInput: js.UndefOr[Boolean] = js.undefined,
    imageCountSeparator: String = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    leftArrowTitle: String = null,
    onClickImage: /* e */ SyntheticMouseEvent[HTMLImageElement] => Unit = null,
    onClickNext: () => Unit = null,
    onClickPrev: () => Unit = null,
    onClickThumbnail: /* index */ Double => Unit = null,
    preloadNextImage: js.UndefOr[Boolean] = js.undefined,
    preventScroll: js.UndefOr[Boolean] = js.undefined,
    rightArrowTitle: String = null,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    showImageCount: js.UndefOr[Boolean] = js.undefined,
    showThumbnails: js.UndefOr[Boolean] = js.undefined,
    spinner: () => ReactElement = null,
    spinnerColor: String = null,
    spinnerSize: Int | Double = null,
    width: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose))
    if (!js.isUndefined(backdropClosesModal)) __obj.updateDynamic("backdropClosesModal")(backdropClosesModal.asInstanceOf[js.Any])
    if (closeButtonTitle != null) __obj.updateDynamic("closeButtonTitle")(closeButtonTitle.asInstanceOf[js.Any])
    if (currentImage != null) __obj.updateDynamic("currentImage")(currentImage.asInstanceOf[js.Any])
    if (customControls != null) __obj.updateDynamic("customControls")(customControls.asInstanceOf[js.Any])
    if (!js.isUndefined(enableKeyboardInput)) __obj.updateDynamic("enableKeyboardInput")(enableKeyboardInput.asInstanceOf[js.Any])
    if (imageCountSeparator != null) __obj.updateDynamic("imageCountSeparator")(imageCountSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (leftArrowTitle != null) __obj.updateDynamic("leftArrowTitle")(leftArrowTitle.asInstanceOf[js.Any])
    if (onClickImage != null) __obj.updateDynamic("onClickImage")(js.Any.fromFunction1(onClickImage))
    if (onClickNext != null) __obj.updateDynamic("onClickNext")(js.Any.fromFunction0(onClickNext))
    if (onClickPrev != null) __obj.updateDynamic("onClickPrev")(js.Any.fromFunction0(onClickPrev))
    if (onClickThumbnail != null) __obj.updateDynamic("onClickThumbnail")(js.Any.fromFunction1(onClickThumbnail))
    if (!js.isUndefined(preloadNextImage)) __obj.updateDynamic("preloadNextImage")(preloadNextImage.asInstanceOf[js.Any])
    if (!js.isUndefined(preventScroll)) __obj.updateDynamic("preventScroll")(preventScroll.asInstanceOf[js.Any])
    if (rightArrowTitle != null) __obj.updateDynamic("rightArrowTitle")(rightArrowTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showImageCount)) __obj.updateDynamic("showImageCount")(showImageCount.asInstanceOf[js.Any])
    if (!js.isUndefined(showThumbnails)) __obj.updateDynamic("showThumbnails")(showThumbnails.asInstanceOf[js.Any])
    if (spinner != null) __obj.updateDynamic("spinner")(js.Any.fromFunction0(spinner))
    if (spinnerColor != null) __obj.updateDynamic("spinnerColor")(spinnerColor.asInstanceOf[js.Any])
    if (spinnerSize != null) __obj.updateDynamic("spinnerSize")(spinnerSize.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = LightboxProps
}

