package typingsSlinky.reactImageMagnifiers.components

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactImageMagnifiers.mod.PictureInPictureMagnifierProps
import typingsSlinky.reactImageMagnifiers.reactImageMagnifiersStrings.bottom
import typingsSlinky.reactImageMagnifiers.reactImageMagnifiersStrings.left
import typingsSlinky.reactImageMagnifiers.reactImageMagnifiersStrings.right
import typingsSlinky.reactImageMagnifiers.reactImageMagnifiersStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PictureInPictureMagnifier {
  @JSImport("react-image-magnifiers", "PictureInPictureMagnifier")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def cursorStyle(value: String): this.type = set("cursorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def cursorStyleActive(value: String): this.type = set("cursorStyleActive", value.asInstanceOf[js.Any])
    @scala.inline
    def imageAlt(value: String): this.type = set("imageAlt", value.asInstanceOf[js.Any])
    @scala.inline
    def largeImageSrc(value: String): this.type = set("largeImageSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def onImageLoad(value: /* ev */ SyntheticEvent[Event, Element] => Unit): this.type = set("onImageLoad", js.Any.fromFunction1(value))
    @scala.inline
    def onLargeImageLoad(value: /* ev */ SyntheticEvent[Event, Element] => Unit): this.type = set("onLargeImageLoad", js.Any.fromFunction1(value))
    @scala.inline
    def onZoomEnd(value: () => Unit): this.type = set("onZoomEnd", js.Any.fromFunction0(value))
    @scala.inline
    def onZoomStart(value: () => Unit): this.type = set("onZoomStart", js.Any.fromFunction0(value))
    @scala.inline
    def previewHorizontalPos(value: left | right): this.type = set("previewHorizontalPos", value.asInstanceOf[js.Any])
    @scala.inline
    def previewOpacity(value: Double): this.type = set("previewOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def previewOverlayBackgroundColor(value: String): this.type = set("previewOverlayBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def previewOverlayBoxColor(value: String): this.type = set("previewOverlayBoxColor", value.asInstanceOf[js.Any])
    @scala.inline
    def previewOverlayBoxImage(value: String): this.type = set("previewOverlayBoxImage", value.asInstanceOf[js.Any])
    @scala.inline
    def previewOverlayBoxImageSize(value: String): this.type = set("previewOverlayBoxImageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def previewOverlayBoxOpacity(value: Double): this.type = set("previewOverlayBoxOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def previewOverlayOpacity(value: Double): this.type = set("previewOverlayOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def previewSizePercentage(value: Double): this.type = set("previewSizePercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def previewVerticalPos(value: top | bottom): this.type = set("previewVerticalPos", value.asInstanceOf[js.Any])
    @scala.inline
    def renderOverlay(value: /* state */ Boolean => ReactElement): this.type = set("renderOverlay", js.Any.fromFunction1(value))
    @scala.inline
    def shadow(value: Boolean): this.type = set("shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def shadowColor(value: String): this.type = set("shadowColor", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PictureInPictureMagnifierProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(imageSrc: String): Builder = {
    val __props = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PictureInPictureMagnifierProps]))
  }
}

