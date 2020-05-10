package typingsSlinky.reactPhotoswipe.mod

import org.scalajs.dom.raw.MouseEvent
import slinky.core.TagMod
import typingsSlinky.photoswipe.mod.Item
import typingsSlinky.photoswipe.mod.Options
import typingsSlinky.reactPhotoswipe.AnonPrevent
import typingsSlinky.reactPhotoswipe.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<react-photoswipe.react-photoswipe.PhotoSwipeProps, 'isOpen'> */
@js.native
trait PhotoSwipeGalleryProps extends js.Object {
  var afterChange: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.native
  var beforeChange: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.native
  /**
    * class name
    * @default pswp-gallery
    */
  var className: js.UndefOr[String] = js.native
  var close: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.native
  var destroy: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.native
  var gettingData: js.UndefOr[
    js.Function3[/* instance */ PhotoSwipe, /* index */ Double, /* item */ Item, Unit]
  ] = js.native
  var id: js.UndefOr[String] = js.native
  var imageLoadComplete: js.UndefOr[
    js.Function3[/* instance */ PhotoSwipe, /* index */ Double, /* item */ Item, Unit]
  ] = js.native
  var initialZoomIn: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.native
  var initialZoomInEnd: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.native
  var initialZoomOut: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.native
  var initialZoomOutEnd: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.native
  /**
    * is open
    * @default false
    */
  var isOpen: js.UndefOr[Boolean] = js.native
  /**
    * photoswipe item
    * {@link http://photoswipe.com/documentation/getting-started.html}
    */
  var items: js.Array[PhotoSwipeGalleryItem] = js.native
  var mouseUsed: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.native
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  var options: js.UndefOr[Options] = js.native
  var parseVerticalMargin: js.UndefOr[js.Function2[/* instance */ PhotoSwipe, /* item */ Item, Unit]] = js.native
  var preventDragEvent: js.UndefOr[
    js.Function4[
      /* instance */ PhotoSwipe, 
      /* e */ MouseEvent, 
      /* isDown */ Boolean, 
      /* preventObj */ AnonPrevent, 
      Unit
    ]
  ] = js.native
  var resize: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.native
  var shareLinkClick: js.UndefOr[
    js.Function3[/* instance */ PhotoSwipe, /* e */ MouseEvent, /* item */ Item, Unit]
  ] = js.native
  var unbindEvents: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.native
  var updateScrollOffset: js.UndefOr[js.Function2[/* instance */ PhotoSwipe, /* _offset */ AnonX, Unit]] = js.native
  /**
    * Thumbnail content
    * @default <img src={item.src} width='100' height='100'/>
    */
  def thumbnailContent(item: PhotoSwipeGalleryItem): TagMod[Any] = js.native
}

object PhotoSwipeGalleryProps {
  @scala.inline
  def apply(items: js.Array[PhotoSwipeGalleryItem], thumbnailContent: PhotoSwipeGalleryItem => TagMod[Any]): PhotoSwipeGalleryProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], thumbnailContent = js.Any.fromFunction1(thumbnailContent))
    __obj.asInstanceOf[PhotoSwipeGalleryProps]
  }
  @scala.inline
  implicit class PhotoSwipeGalleryPropsOps[Self <: PhotoSwipeGalleryProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[PhotoSwipeGalleryItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnailContent(value: PhotoSwipeGalleryItem => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailContent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAfterChange(value: /* instance */ PhotoSwipe => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterChange")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeChange(value: /* instance */ PhotoSwipe => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeChange")(js.undefined)
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
    def withClose(value: /* instance */ PhotoSwipe => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* instance */ PhotoSwipe => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withGettingData(value: (/* instance */ PhotoSwipe, /* index */ Double, /* item */ Item) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gettingData")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutGettingData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gettingData")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withImageLoadComplete(value: (/* instance */ PhotoSwipe, /* index */ Double, /* item */ Item) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageLoadComplete")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutImageLoadComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageLoadComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialZoomIn(value: /* instance */ PhotoSwipe => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialZoomIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInitialZoomIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialZoomIn")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialZoomInEnd(value: /* instance */ PhotoSwipe => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialZoomInEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInitialZoomInEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialZoomInEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialZoomOut(value: /* instance */ PhotoSwipe => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialZoomOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInitialZoomOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialZoomOut")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialZoomOutEnd(value: /* instance */ PhotoSwipe => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialZoomOutEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInitialZoomOutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialZoomOutEnd")(js.undefined)
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
    def withMouseUsed(value: /* instance */ PhotoSwipe => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseUsed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseUsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseUsed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withParseVerticalMargin(value: (/* instance */ PhotoSwipe, /* item */ Item) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseVerticalMargin")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutParseVerticalMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseVerticalMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventDragEvent(
      value: (/* instance */ PhotoSwipe, /* e */ MouseEvent, /* isDown */ Boolean, /* preventObj */ AnonPrevent) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDragEvent")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutPreventDragEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDragEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withResize(value: /* instance */ PhotoSwipe => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.undefined)
        ret
    }
    @scala.inline
    def withShareLinkClick(value: (/* instance */ PhotoSwipe, /* e */ MouseEvent, /* item */ Item) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareLinkClick")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutShareLinkClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareLinkClick")(js.undefined)
        ret
    }
    @scala.inline
    def withUnbindEvents(value: /* instance */ PhotoSwipe => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unbindEvents")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUnbindEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unbindEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateScrollOffset(value: (/* instance */ PhotoSwipe, /* _offset */ AnonX) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateScrollOffset")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdateScrollOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateScrollOffset")(js.undefined)
        ret
    }
  }
  
}

