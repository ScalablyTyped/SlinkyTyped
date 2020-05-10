package typingsSlinky.reactImageGallery.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLImageElement
import slinky.core.TagMod
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.ReactEventHandler
import typingsSlinky.react.mod.TouchEventHandler
import typingsSlinky.reactImageGallery.reactImageGalleryStrings.bottom
import typingsSlinky.reactImageGallery.reactImageGalleryStrings.left
import typingsSlinky.reactImageGallery.reactImageGalleryStrings.right
import typingsSlinky.reactImageGallery.reactImageGalleryStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactImageGalleryProps extends js.Object {
  var additionalClass: js.UndefOr[String] = js.native
  var autoPlay: js.UndefOr[Boolean] = js.native
  var disableArrowKeys: js.UndefOr[Boolean] = js.native
  var disableSwipe: js.UndefOr[Boolean] = js.native
  var disableThumbnailScroll: js.UndefOr[Boolean] = js.native
  var flickThreshold: js.UndefOr[Double] = js.native
  var indexSeparator: js.UndefOr[String] = js.native
  var infinite: js.UndefOr[Boolean] = js.native
  var isRTL: js.UndefOr[Boolean] = js.native
  var items: js.Array[ReactImageGalleryItem] = js.native
  var lazyLoad: js.UndefOr[Boolean] = js.native
  var onClick: js.UndefOr[js.Function1[/* event */ MouseEventHandler[HTMLDivElement], Unit]] = js.native
  var onErrorImageURL: js.UndefOr[String] = js.native
  var onImageError: js.UndefOr[js.Function1[/* event */ ReactEventHandler[HTMLImageElement], Unit]] = js.native
  var onImageLoad: js.UndefOr[js.Function1[/* event */ ReactEventHandler[HTMLImageElement], Unit]] = js.native
  var onMouseLeave: js.UndefOr[js.Function1[/* event */ MouseEventHandler[HTMLDivElement], Unit]] = js.native
  var onMouseOver: js.UndefOr[js.Function1[/* event */ MouseEventHandler[HTMLDivElement], Unit]] = js.native
  var onPause: js.UndefOr[js.Function1[/* currentIndex */ Double, Unit]] = js.native
  var onPlay: js.UndefOr[js.Function1[/* currentIndex */ Double, Unit]] = js.native
  var onScreenChange: js.UndefOr[js.Function1[/* fullScreenElement */ Element, Unit]] = js.native
  var onSlide: js.UndefOr[js.Function1[/* currentIndex */ Double, Unit]] = js.native
  var onThumbnailClick: js.UndefOr[
    js.Function2[/* event */ MouseEventHandler[HTMLAnchorElement], /* index */ Double, Unit]
  ] = js.native
  var onThumbnailError: js.UndefOr[js.Function1[/* event */ ReactEventHandler[HTMLImageElement], Unit]] = js.native
  var onTouchEnd: js.UndefOr[js.Function1[/* event */ TouchEventHandler[HTMLDivElement], Unit]] = js.native
  var onTouchMove: js.UndefOr[js.Function1[/* event */ TouchEventHandler[HTMLDivElement], Unit]] = js.native
  var onTouchStart: js.UndefOr[js.Function1[/* event */ TouchEventHandler[HTMLDivElement], Unit]] = js.native
  var preventDefaultTouchmoveEvent: js.UndefOr[Boolean] = js.native
  var renderCustomControls: js.UndefOr[js.Function0[TagMod[Any]]] = js.native
  var renderFullscreenButton: js.UndefOr[
    js.Function2[
      /* onClick */ MouseEventHandler[HTMLElement], 
      /* isFullscreen */ Boolean, 
      TagMod[Any]
    ]
  ] = js.native
  var renderItem: js.UndefOr[js.Function1[/* item */ ReactImageGalleryItem, TagMod[Any]]] = js.native
  var renderLeftNav: js.UndefOr[
    js.Function2[/* onClick */ MouseEventHandler[HTMLElement], /* isDisabled */ Boolean, TagMod[Any]]
  ] = js.native
  var renderPlayPauseButton: js.UndefOr[
    js.Function2[/* onClick */ MouseEventHandler[HTMLElement], /* isPlaying */ Boolean, TagMod[Any]]
  ] = js.native
  var renderRightNav: js.UndefOr[
    js.Function2[/* onClick */ MouseEventHandler[HTMLElement], /* isDisabled */ Boolean, TagMod[Any]]
  ] = js.native
  var renderThumbInner: js.UndefOr[js.Function1[/* item */ ReactImageGalleryItem, TagMod[Any]]] = js.native
  var showBullets: js.UndefOr[Boolean] = js.native
  var showFullscreenButton: js.UndefOr[Boolean] = js.native
  var showIndex: js.UndefOr[Boolean] = js.native
  var showNav: js.UndefOr[Boolean] = js.native
  var showPlayButton: js.UndefOr[Boolean] = js.native
  var showThumbnails: js.UndefOr[Boolean] = js.native
  var slideDuration: js.UndefOr[Double] = js.native
  var slideInterval: js.UndefOr[Double] = js.native
  var slideOnThumbnailOver: js.UndefOr[Boolean] = js.native
  var startIndex: js.UndefOr[Double] = js.native
  var stopPropagation: js.UndefOr[Boolean] = js.native
  var swipeThreshold: js.UndefOr[Double] = js.native
  var swipingTransitionDuration: js.UndefOr[Double] = js.native
  var thumbnailPosition: js.UndefOr[top | right | bottom | left] = js.native
  var useBrowserFullscreen: js.UndefOr[Boolean] = js.native
  var useTranslate3D: js.UndefOr[Boolean] = js.native
}

object ReactImageGalleryProps {
  @scala.inline
  def apply(items: js.Array[ReactImageGalleryItem]): ReactImageGalleryProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactImageGalleryProps]
  }
  @scala.inline
  implicit class ReactImageGalleryPropsOps[Self <: ReactImageGalleryProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[ReactImageGalleryItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalClass")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoPlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableArrowKeys(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableArrowKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableArrowKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableArrowKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableSwipe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSwipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableSwipe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSwipe")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableThumbnailScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableThumbnailScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableThumbnailScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableThumbnailScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withFlickThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flickThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlickThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flickThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withInfinite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfinite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinite")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRTL")(js.undefined)
        ret
    }
    @scala.inline
    def withLazyLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazyLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: /* event */ MouseEventHandler[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnErrorImageURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onErrorImageURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnErrorImageURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onErrorImageURL")(js.undefined)
        ret
    }
    @scala.inline
    def withOnImageError(value: /* event */ ReactEventHandler[HTMLImageElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onImageError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnImageError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onImageError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnImageLoad(value: /* event */ ReactEventHandler[HTMLImageElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onImageLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnImageLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onImageLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseLeave(value: /* event */ MouseEventHandler[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseOver(value: /* event */ MouseEventHandler[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOver")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPause(value: /* currentIndex */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPause")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPause")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlay(value: /* currentIndex */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScreenChange(value: /* fullScreenElement */ Element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScreenChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScreenChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScreenChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSlide(value: /* currentIndex */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSlide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSlide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnThumbnailClick(value: (/* event */ MouseEventHandler[HTMLAnchorElement], /* index */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onThumbnailClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnThumbnailClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onThumbnailClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnThumbnailError(value: /* event */ ReactEventHandler[HTMLImageElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onThumbnailError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnThumbnailError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onThumbnailError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchEnd(value: /* event */ TouchEventHandler[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchMove(value: /* event */ TouchEventHandler[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchStart(value: /* event */ TouchEventHandler[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventDefaultTouchmoveEvent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefaultTouchmoveEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventDefaultTouchmoveEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefaultTouchmoveEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderCustomControls(value: () => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCustomControls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRenderCustomControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCustomControls")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderFullscreenButton(value: (/* onClick */ MouseEventHandler[HTMLElement], /* isFullscreen */ Boolean) => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFullscreenButton")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderFullscreenButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFullscreenButton")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderItem(value: /* item */ ReactImageGalleryItem => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderItem")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderLeftNav(value: (/* onClick */ MouseEventHandler[HTMLElement], /* isDisabled */ Boolean) => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderLeftNav")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderLeftNav: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderLeftNav")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderPlayPauseButton(value: (/* onClick */ MouseEventHandler[HTMLElement], /* isPlaying */ Boolean) => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPlayPauseButton")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderPlayPauseButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPlayPauseButton")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderRightNav(value: (/* onClick */ MouseEventHandler[HTMLElement], /* isDisabled */ Boolean) => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderRightNav")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderRightNav: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderRightNav")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderThumbInner(value: /* item */ ReactImageGalleryItem => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderThumbInner")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderThumbInner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderThumbInner")(js.undefined)
        ret
    }
    @scala.inline
    def withShowBullets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBullets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowBullets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBullets")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFullscreenButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFullscreenButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFullscreenButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFullscreenButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNav(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNav")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNav: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNav")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPlayButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPlayButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPlayButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPlayButton")(js.undefined)
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
    def withSlideDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideOnThumbnailOver(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideOnThumbnailOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideOnThumbnailOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideOnThumbnailOver")(js.undefined)
        ret
    }
    @scala.inline
    def withStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withStopPropagation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopPropagation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipeThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipingTransitionDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipingTransitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipingTransitionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipingTransitionDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailPosition(value: top | right | bottom | left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withUseBrowserFullscreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBrowserFullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseBrowserFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBrowserFullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withUseTranslate3D(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTranslate3D")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTranslate3D: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTranslate3D")(js.undefined)
        ret
    }
  }
  
}

