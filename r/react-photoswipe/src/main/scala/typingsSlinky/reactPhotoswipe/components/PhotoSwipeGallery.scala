package typingsSlinky.reactPhotoswipe.components

import org.scalajs.dom.raw.MouseEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.photoswipe.mod.Item
import typingsSlinky.photoswipe.mod.Options
import typingsSlinky.reactPhotoswipe.anon.Prevent
import typingsSlinky.reactPhotoswipe.anon.X
import typingsSlinky.reactPhotoswipe.mod.PhotoSwipeGalleryItem
import typingsSlinky.reactPhotoswipe.mod.PhotoSwipeGalleryProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PhotoSwipeGallery {
  
  @scala.inline
  def apply(items: js.Array[PhotoSwipeGalleryItem], thumbnailContent: PhotoSwipeGalleryItem => ReactElement): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any], thumbnailContent = js.Any.fromFunction1(thumbnailContent))
    new Builder(js.Array(this.component, __props.asInstanceOf[PhotoSwipeGalleryProps]))
  }
  
  @JSImport("react-photoswipe", "PhotoSwipeGallery")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactPhotoswipe.mod.PhotoSwipeGallery] {
    
    @scala.inline
    def afterChange(value: /* instance */ typingsSlinky.reactPhotoswipe.mod.PhotoSwipe => Unit): this.type = set("afterChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def beforeChange(value: /* instance */ typingsSlinky.reactPhotoswipe.mod.PhotoSwipe => Unit): this.type = set("beforeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def close(value: /* instance */ typingsSlinky.reactPhotoswipe.mod.PhotoSwipe => Unit): this.type = set("close", js.Any.fromFunction1(value))
    
    @scala.inline
    def destroy(value: /* instance */ typingsSlinky.reactPhotoswipe.mod.PhotoSwipe => Unit): this.type = set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def gettingData(
      value: (/* instance */ typingsSlinky.reactPhotoswipe.mod.PhotoSwipe, /* index */ Double, /* item */ Item) => Unit
    ): this.type = set("gettingData", js.Any.fromFunction3(value))
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def imageLoadComplete(
      value: (/* instance */ typingsSlinky.reactPhotoswipe.mod.PhotoSwipe, /* index */ Double, /* item */ Item) => Unit
    ): this.type = set("imageLoadComplete", js.Any.fromFunction3(value))
    
    @scala.inline
    def initialZoomIn(value: /* instance */ typingsSlinky.reactPhotoswipe.mod.PhotoSwipe => Unit): this.type = set("initialZoomIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def initialZoomInEnd(value: /* instance */ typingsSlinky.reactPhotoswipe.mod.PhotoSwipe => Unit): this.type = set("initialZoomInEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def initialZoomOut(value: /* instance */ typingsSlinky.reactPhotoswipe.mod.PhotoSwipe => Unit): this.type = set("initialZoomOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def initialZoomOutEnd(value: /* instance */ typingsSlinky.reactPhotoswipe.mod.PhotoSwipe => Unit): this.type = set("initialZoomOutEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mouseUsed(value: /* instance */ typingsSlinky.reactPhotoswipe.mod.PhotoSwipe => Unit): this.type = set("mouseUsed", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClose(value: () => Unit): this.type = set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def options(value: Options): this.type = set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def parseVerticalMargin(value: (/* instance */ typingsSlinky.reactPhotoswipe.mod.PhotoSwipe, /* item */ Item) => Unit): this.type = set("parseVerticalMargin", js.Any.fromFunction2(value))
    
    @scala.inline
    def preventDragEvent(
      value: (/* instance */ typingsSlinky.reactPhotoswipe.mod.PhotoSwipe, /* e */ MouseEvent, /* isDown */ Boolean, /* preventObj */ Prevent) => Unit
    ): this.type = set("preventDragEvent", js.Any.fromFunction4(value))
    
    @scala.inline
    def resize(value: /* instance */ typingsSlinky.reactPhotoswipe.mod.PhotoSwipe => Unit): this.type = set("resize", js.Any.fromFunction1(value))
    
    @scala.inline
    def shareLinkClick(
      value: (/* instance */ typingsSlinky.reactPhotoswipe.mod.PhotoSwipe, /* e */ MouseEvent, /* item */ Item) => Unit
    ): this.type = set("shareLinkClick", js.Any.fromFunction3(value))
    
    @scala.inline
    def unbindEvents(value: /* instance */ typingsSlinky.reactPhotoswipe.mod.PhotoSwipe => Unit): this.type = set("unbindEvents", js.Any.fromFunction1(value))
    
    @scala.inline
    def updateScrollOffset(value: (/* instance */ typingsSlinky.reactPhotoswipe.mod.PhotoSwipe, /* _offset */ X) => Unit): this.type = set("updateScrollOffset", js.Any.fromFunction2(value))
  }
  
  def withProps(p: PhotoSwipeGalleryProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
