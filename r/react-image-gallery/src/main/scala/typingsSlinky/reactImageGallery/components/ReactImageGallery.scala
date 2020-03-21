package typingsSlinky.reactImageGallery.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLImageElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.div.tag
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.ReactEventHandler
import typingsSlinky.react.mod.TouchEventHandler
import typingsSlinky.reactImageGallery.mod.ReactImageGalleryItem
import typingsSlinky.reactImageGallery.mod.ReactImageGalleryProps
import typingsSlinky.reactImageGallery.mod.default
import typingsSlinky.reactImageGallery.reactImageGalleryStrings.bottom
import typingsSlinky.reactImageGallery.reactImageGalleryStrings.left
import typingsSlinky.reactImageGallery.reactImageGalleryStrings.right
import typingsSlinky.reactImageGallery.reactImageGalleryStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactImageGallery
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-image-gallery", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    items: js.Array[ReactImageGalleryItem],
    additionalClass: String = null,
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    disableArrowKeys: js.UndefOr[Boolean] = js.undefined,
    disableSwipe: js.UndefOr[Boolean] = js.undefined,
    disableThumbnailScroll: js.UndefOr[Boolean] = js.undefined,
    flickThreshold: Int | Double = null,
    indexSeparator: String = null,
    infinite: js.UndefOr[Boolean] = js.undefined,
    isRTL: js.UndefOr[Boolean] = js.undefined,
    lazyLoad: js.UndefOr[Boolean] = js.undefined,
    onClick: /* event */ MouseEventHandler[HTMLDivElement] => Unit = null,
    onErrorImage: String = null,
    onImageError: /* event */ ReactEventHandler[HTMLImageElement] => Unit = null,
    onImageLoad: /* event */ ReactEventHandler[HTMLImageElement] => Unit = null,
    onMouseLeave: /* event */ MouseEventHandler[HTMLDivElement] => Unit = null,
    onMouseOver: /* event */ MouseEventHandler[HTMLDivElement] => Unit = null,
    onPause: /* currentIndex */ Double => Unit = null,
    onPlay: /* currentIndex */ Double => Unit = null,
    onScreenChange: /* fullScreenElement */ org.scalajs.dom.raw.Element => Unit = null,
    onSlide: /* currentIndex */ Double => Unit = null,
    onThumbnailClick: (/* event */ MouseEventHandler[HTMLAnchorElement], /* index */ Double) => Unit = null,
    onThumbnailError: /* event */ ReactEventHandler[HTMLImageElement] => Unit = null,
    onTouchEnd: /* event */ TouchEventHandler[HTMLDivElement] => Unit = null,
    onTouchMove: /* event */ TouchEventHandler[HTMLDivElement] => Unit = null,
    onTouchStart: /* event */ TouchEventHandler[HTMLDivElement] => Unit = null,
    preventDefaultTouchmoveEvent: js.UndefOr[Boolean] = js.undefined,
    renderCustomControls: () => TagMod[Any] = null,
    renderFullscreenButton: (/* onClick */ MouseEventHandler[HTMLElement], /* isFullscreen */ Boolean) => TagMod[Any] = null,
    renderItem: /* item */ ReactImageGalleryItem => TagMod[Any] = null,
    renderLeftNav: (/* onClick */ MouseEventHandler[HTMLElement], /* isDisabled */ Boolean) => TagMod[Any] = null,
    renderPlayPauseButton: (/* onClick */ MouseEventHandler[HTMLElement], /* isPlaying */ Boolean) => TagMod[Any] = null,
    renderRightNav: (/* onClick */ MouseEventHandler[HTMLElement], /* isDisabled */ Boolean) => TagMod[Any] = null,
    renderThumbInner: /* item */ ReactImageGalleryItem => TagMod[Any] = null,
    showBullets: js.UndefOr[Boolean] = js.undefined,
    showFullscreenButton: js.UndefOr[Boolean] = js.undefined,
    showIndex: js.UndefOr[Boolean] = js.undefined,
    showNav: js.UndefOr[Boolean] = js.undefined,
    showPlayButton: js.UndefOr[Boolean] = js.undefined,
    showThumbnails: js.UndefOr[Boolean] = js.undefined,
    slideDuration: Int | Double = null,
    slideInterval: Int | Double = null,
    slideOnThumbnailOver: js.UndefOr[Boolean] = js.undefined,
    startIndex: Int | Double = null,
    stopPropagation: js.UndefOr[Boolean] = js.undefined,
    swipeThreshold: Int | Double = null,
    swipingTransitionDuration: Int | Double = null,
    thumbnailPosition: top | right | bottom | left = null,
    useBrowserFullscreen: js.UndefOr[Boolean] = js.undefined,
    useTranslate3D: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (additionalClass != null) __obj.updateDynamic("additionalClass")(additionalClass.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.asInstanceOf[js.Any])
    if (!js.isUndefined(disableArrowKeys)) __obj.updateDynamic("disableArrowKeys")(disableArrowKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(disableSwipe)) __obj.updateDynamic("disableSwipe")(disableSwipe.asInstanceOf[js.Any])
    if (!js.isUndefined(disableThumbnailScroll)) __obj.updateDynamic("disableThumbnailScroll")(disableThumbnailScroll.asInstanceOf[js.Any])
    if (flickThreshold != null) __obj.updateDynamic("flickThreshold")(flickThreshold.asInstanceOf[js.Any])
    if (indexSeparator != null) __obj.updateDynamic("indexSeparator")(indexSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite.asInstanceOf[js.Any])
    if (!js.isUndefined(isRTL)) __obj.updateDynamic("isRTL")(isRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(lazyLoad)) __obj.updateDynamic("lazyLoad")(lazyLoad.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onErrorImage != null) __obj.updateDynamic("onErrorImage")(onErrorImage.asInstanceOf[js.Any])
    if (onImageError != null) __obj.updateDynamic("onImageError")(js.Any.fromFunction1(onImageError))
    if (onImageLoad != null) __obj.updateDynamic("onImageLoad")(js.Any.fromFunction1(onImageLoad))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onScreenChange != null) __obj.updateDynamic("onScreenChange")(js.Any.fromFunction1(onScreenChange))
    if (onSlide != null) __obj.updateDynamic("onSlide")(js.Any.fromFunction1(onSlide))
    if (onThumbnailClick != null) __obj.updateDynamic("onThumbnailClick")(js.Any.fromFunction2(onThumbnailClick))
    if (onThumbnailError != null) __obj.updateDynamic("onThumbnailError")(js.Any.fromFunction1(onThumbnailError))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (!js.isUndefined(preventDefaultTouchmoveEvent)) __obj.updateDynamic("preventDefaultTouchmoveEvent")(preventDefaultTouchmoveEvent.asInstanceOf[js.Any])
    if (renderCustomControls != null) __obj.updateDynamic("renderCustomControls")(js.Any.fromFunction0(renderCustomControls))
    if (renderFullscreenButton != null) __obj.updateDynamic("renderFullscreenButton")(js.Any.fromFunction2(renderFullscreenButton))
    if (renderItem != null) __obj.updateDynamic("renderItem")(js.Any.fromFunction1(renderItem))
    if (renderLeftNav != null) __obj.updateDynamic("renderLeftNav")(js.Any.fromFunction2(renderLeftNav))
    if (renderPlayPauseButton != null) __obj.updateDynamic("renderPlayPauseButton")(js.Any.fromFunction2(renderPlayPauseButton))
    if (renderRightNav != null) __obj.updateDynamic("renderRightNav")(js.Any.fromFunction2(renderRightNav))
    if (renderThumbInner != null) __obj.updateDynamic("renderThumbInner")(js.Any.fromFunction1(renderThumbInner))
    if (!js.isUndefined(showBullets)) __obj.updateDynamic("showBullets")(showBullets.asInstanceOf[js.Any])
    if (!js.isUndefined(showFullscreenButton)) __obj.updateDynamic("showFullscreenButton")(showFullscreenButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showIndex)) __obj.updateDynamic("showIndex")(showIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(showNav)) __obj.updateDynamic("showNav")(showNav.asInstanceOf[js.Any])
    if (!js.isUndefined(showPlayButton)) __obj.updateDynamic("showPlayButton")(showPlayButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showThumbnails)) __obj.updateDynamic("showThumbnails")(showThumbnails.asInstanceOf[js.Any])
    if (slideDuration != null) __obj.updateDynamic("slideDuration")(slideDuration.asInstanceOf[js.Any])
    if (slideInterval != null) __obj.updateDynamic("slideInterval")(slideInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(slideOnThumbnailOver)) __obj.updateDynamic("slideOnThumbnailOver")(slideOnThumbnailOver.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(stopPropagation)) __obj.updateDynamic("stopPropagation")(stopPropagation.asInstanceOf[js.Any])
    if (swipeThreshold != null) __obj.updateDynamic("swipeThreshold")(swipeThreshold.asInstanceOf[js.Any])
    if (swipingTransitionDuration != null) __obj.updateDynamic("swipingTransitionDuration")(swipingTransitionDuration.asInstanceOf[js.Any])
    if (thumbnailPosition != null) __obj.updateDynamic("thumbnailPosition")(thumbnailPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(useBrowserFullscreen)) __obj.updateDynamic("useBrowserFullscreen")(useBrowserFullscreen.asInstanceOf[js.Any])
    if (!js.isUndefined(useTranslate3D)) __obj.updateDynamic("useTranslate3D")(useTranslate3D.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ReactImageGalleryProps
}

