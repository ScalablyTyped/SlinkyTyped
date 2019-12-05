package typingsSlinky.reactDashPhotoswipe.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MouseEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.photoswipe.photoswipeMod.Item
import typingsSlinky.photoswipe.photoswipeMod.Options
import typingsSlinky.reactDashPhotoswipe.Anon_Prevent
import typingsSlinky.reactDashPhotoswipe.Anon_X
import typingsSlinky.reactDashPhotoswipe.reactDashPhotoswipeMod.PhotoSwipeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PhotoSwipe
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashPhotoswipe.reactDashPhotoswipeMod.PhotoSwipe] {
  @JSImport("react-photoswipe", "PhotoSwipe")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id */
  def apply(
    isOpen: Boolean,
    items: js.Array[Item],
    afterChange: /* instance */ typingsSlinky.reactDashPhotoswipe.reactDashPhotoswipeMod.PhotoSwipe => Unit = null,
    beforeChange: /* instance */ typingsSlinky.reactDashPhotoswipe.reactDashPhotoswipeMod.PhotoSwipe => Unit = null,
    close: /* instance */ typingsSlinky.reactDashPhotoswipe.reactDashPhotoswipeMod.PhotoSwipe => Unit = null,
    destroy: /* instance */ typingsSlinky.reactDashPhotoswipe.reactDashPhotoswipeMod.PhotoSwipe => Unit = null,
    gettingData: (/* instance */ typingsSlinky.reactDashPhotoswipe.reactDashPhotoswipeMod.PhotoSwipe, /* index */ Double, /* item */ Item) => Unit = null,
    imageLoadComplete: (/* instance */ typingsSlinky.reactDashPhotoswipe.reactDashPhotoswipeMod.PhotoSwipe, /* index */ Double, /* item */ Item) => Unit = null,
    initialZoomIn: /* instance */ typingsSlinky.reactDashPhotoswipe.reactDashPhotoswipeMod.PhotoSwipe => Unit = null,
    initialZoomInEnd: /* instance */ typingsSlinky.reactDashPhotoswipe.reactDashPhotoswipeMod.PhotoSwipe => Unit = null,
    initialZoomOut: /* instance */ typingsSlinky.reactDashPhotoswipe.reactDashPhotoswipeMod.PhotoSwipe => Unit = null,
    initialZoomOutEnd: /* instance */ typingsSlinky.reactDashPhotoswipe.reactDashPhotoswipeMod.PhotoSwipe => Unit = null,
    mouseUsed: /* instance */ typingsSlinky.reactDashPhotoswipe.reactDashPhotoswipeMod.PhotoSwipe => Unit = null,
    onClose: () => Unit = null,
    options: Options = null,
    parseVerticalMargin: (/* instance */ typingsSlinky.reactDashPhotoswipe.reactDashPhotoswipeMod.PhotoSwipe, /* item */ Item) => Unit = null,
    preventDragEvent: (/* instance */ typingsSlinky.reactDashPhotoswipe.reactDashPhotoswipeMod.PhotoSwipe, /* e */ MouseEvent, /* isDown */ Boolean, /* preventObj */ Anon_Prevent) => Unit = null,
    resize: /* instance */ typingsSlinky.reactDashPhotoswipe.reactDashPhotoswipeMod.PhotoSwipe => Unit = null,
    shareLinkClick: (/* instance */ typingsSlinky.reactDashPhotoswipe.reactDashPhotoswipeMod.PhotoSwipe, /* e */ MouseEvent, /* item */ Item) => Unit = null,
    unbindEvents: /* instance */ typingsSlinky.reactDashPhotoswipe.reactDashPhotoswipeMod.PhotoSwipe => Unit = null,
    updateScrollOffset: (/* instance */ typingsSlinky.reactDashPhotoswipe.reactDashPhotoswipeMod.PhotoSwipe, /* _offset */ Anon_X) => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashPhotoswipe.reactDashPhotoswipeMod.PhotoSwipe] = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    if (afterChange != null) __obj.updateDynamic("afterChange")(js.Any.fromFunction1(afterChange))
    if (beforeChange != null) __obj.updateDynamic("beforeChange")(js.Any.fromFunction1(beforeChange))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (gettingData != null) __obj.updateDynamic("gettingData")(js.Any.fromFunction3(gettingData))
    if (imageLoadComplete != null) __obj.updateDynamic("imageLoadComplete")(js.Any.fromFunction3(imageLoadComplete))
    if (initialZoomIn != null) __obj.updateDynamic("initialZoomIn")(js.Any.fromFunction1(initialZoomIn))
    if (initialZoomInEnd != null) __obj.updateDynamic("initialZoomInEnd")(js.Any.fromFunction1(initialZoomInEnd))
    if (initialZoomOut != null) __obj.updateDynamic("initialZoomOut")(js.Any.fromFunction1(initialZoomOut))
    if (initialZoomOutEnd != null) __obj.updateDynamic("initialZoomOutEnd")(js.Any.fromFunction1(initialZoomOutEnd))
    if (mouseUsed != null) __obj.updateDynamic("mouseUsed")(js.Any.fromFunction1(mouseUsed))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (parseVerticalMargin != null) __obj.updateDynamic("parseVerticalMargin")(js.Any.fromFunction2(parseVerticalMargin))
    if (preventDragEvent != null) __obj.updateDynamic("preventDragEvent")(js.Any.fromFunction4(preventDragEvent))
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction1(resize))
    if (shareLinkClick != null) __obj.updateDynamic("shareLinkClick")(js.Any.fromFunction3(shareLinkClick))
    if (unbindEvents != null) __obj.updateDynamic("unbindEvents")(js.Any.fromFunction1(unbindEvents))
    if (updateScrollOffset != null) __obj.updateDynamic("updateScrollOffset")(js.Any.fromFunction2(updateScrollOffset))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PhotoSwipeProps
}

