package typingsSlinky.reactImageGallery.components

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLImageElement
import slinky.core.TagMod
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
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

object ReactImageGallery {
  @JSImport("react-image-gallery", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def additionalClass(value: String): this.type = set("additionalClass", value.asInstanceOf[js.Any])
    @scala.inline
    def autoPlay(value: Boolean): this.type = set("autoPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def disableArrowKeys(value: Boolean): this.type = set("disableArrowKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def disableSwipe(value: Boolean): this.type = set("disableSwipe", value.asInstanceOf[js.Any])
    @scala.inline
    def disableThumbnailScroll(value: Boolean): this.type = set("disableThumbnailScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def flickThreshold(value: Double): this.type = set("flickThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def indexSeparator(value: String): this.type = set("indexSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def infinite(value: Boolean): this.type = set("infinite", value.asInstanceOf[js.Any])
    @scala.inline
    def isRTL(value: Boolean): this.type = set("isRTL", value.asInstanceOf[js.Any])
    @scala.inline
    def lazyLoad(value: Boolean): this.type = set("lazyLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: /* event */ MouseEventHandler[HTMLDivElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def onErrorImageURL(value: String): this.type = set("onErrorImageURL", value.asInstanceOf[js.Any])
    @scala.inline
    def onImageError(value: /* event */ ReactEventHandler[HTMLImageElement] => Unit): this.type = set("onImageError", js.Any.fromFunction1(value))
    @scala.inline
    def onImageLoad(value: /* event */ ReactEventHandler[HTMLImageElement] => Unit): this.type = set("onImageLoad", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseLeave(value: /* event */ MouseEventHandler[HTMLDivElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseOver(value: /* event */ MouseEventHandler[HTMLDivElement] => Unit): this.type = set("onMouseOver", js.Any.fromFunction1(value))
    @scala.inline
    def onPause(value: /* currentIndex */ Double => Unit): this.type = set("onPause", js.Any.fromFunction1(value))
    @scala.inline
    def onPlay(value: /* currentIndex */ Double => Unit): this.type = set("onPlay", js.Any.fromFunction1(value))
    @scala.inline
    def onScreenChange(value: /* fullScreenElement */ Element => Unit): this.type = set("onScreenChange", js.Any.fromFunction1(value))
    @scala.inline
    def onSlide(value: /* currentIndex */ Double => Unit): this.type = set("onSlide", js.Any.fromFunction1(value))
    @scala.inline
    def onThumbnailClick(value: (/* event */ MouseEventHandler[HTMLAnchorElement], /* index */ Double) => Unit): this.type = set("onThumbnailClick", js.Any.fromFunction2(value))
    @scala.inline
    def onThumbnailError(value: /* event */ ReactEventHandler[HTMLImageElement] => Unit): this.type = set("onThumbnailError", js.Any.fromFunction1(value))
    @scala.inline
    def onTouchEnd(value: /* event */ TouchEventHandler[HTMLDivElement] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onTouchMove(value: /* event */ TouchEventHandler[HTMLDivElement] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
    @scala.inline
    def onTouchStart(value: /* event */ TouchEventHandler[HTMLDivElement] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
    @scala.inline
    def preventDefaultTouchmoveEvent(value: Boolean): this.type = set("preventDefaultTouchmoveEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def renderCustomControls(value: () => TagMod[Any]): this.type = set("renderCustomControls", js.Any.fromFunction0(value))
    @scala.inline
    def renderFullscreenButton(value: (/* onClick */ MouseEventHandler[HTMLElement], /* isFullscreen */ Boolean) => TagMod[Any]): this.type = set("renderFullscreenButton", js.Any.fromFunction2(value))
    @scala.inline
    def renderItem(value: /* item */ ReactImageGalleryItem => TagMod[Any]): this.type = set("renderItem", js.Any.fromFunction1(value))
    @scala.inline
    def renderLeftNav(value: (/* onClick */ MouseEventHandler[HTMLElement], /* isDisabled */ Boolean) => TagMod[Any]): this.type = set("renderLeftNav", js.Any.fromFunction2(value))
    @scala.inline
    def renderPlayPauseButton(value: (/* onClick */ MouseEventHandler[HTMLElement], /* isPlaying */ Boolean) => TagMod[Any]): this.type = set("renderPlayPauseButton", js.Any.fromFunction2(value))
    @scala.inline
    def renderRightNav(value: (/* onClick */ MouseEventHandler[HTMLElement], /* isDisabled */ Boolean) => TagMod[Any]): this.type = set("renderRightNav", js.Any.fromFunction2(value))
    @scala.inline
    def renderThumbInner(value: /* item */ ReactImageGalleryItem => TagMod[Any]): this.type = set("renderThumbInner", js.Any.fromFunction1(value))
    @scala.inline
    def showBullets(value: Boolean): this.type = set("showBullets", value.asInstanceOf[js.Any])
    @scala.inline
    def showFullscreenButton(value: Boolean): this.type = set("showFullscreenButton", value.asInstanceOf[js.Any])
    @scala.inline
    def showIndex(value: Boolean): this.type = set("showIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def showNav(value: Boolean): this.type = set("showNav", value.asInstanceOf[js.Any])
    @scala.inline
    def showPlayButton(value: Boolean): this.type = set("showPlayButton", value.asInstanceOf[js.Any])
    @scala.inline
    def showThumbnails(value: Boolean): this.type = set("showThumbnails", value.asInstanceOf[js.Any])
    @scala.inline
    def slideDuration(value: Double): this.type = set("slideDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def slideInterval(value: Double): this.type = set("slideInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def slideOnThumbnailOver(value: Boolean): this.type = set("slideOnThumbnailOver", value.asInstanceOf[js.Any])
    @scala.inline
    def startIndex(value: Double): this.type = set("startIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def stopPropagation(value: Boolean): this.type = set("stopPropagation", value.asInstanceOf[js.Any])
    @scala.inline
    def swipeThreshold(value: Double): this.type = set("swipeThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def swipingTransitionDuration(value: Double): this.type = set("swipingTransitionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def thumbnailPosition(value: top | right | bottom | left): this.type = set("thumbnailPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def useBrowserFullscreen(value: Boolean): this.type = set("useBrowserFullscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def useTranslate3D(value: Boolean): this.type = set("useTranslate3D", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactImageGalleryProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(items: js.Array[ReactImageGalleryItem]): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactImageGalleryProps]))
  }
}

