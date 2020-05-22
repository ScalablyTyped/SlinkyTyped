package typingsSlinky.reactImageMagnifiers.components

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactImageMagnifiers.mod.MagnifierPreviewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MagnifierPreview {
  @JSImport("react-image-magnifiers", "MagnifierPreview")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactImageMagnifiers.mod.MagnifierPreview] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def cursorStyle(value: String): this.type = set("cursorStyle", value.asInstanceOf[js.Any])
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
    def overlayBackgroundColor(value: Double): this.type = set("overlayBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def overlayBoxColor(value: Double): this.type = set("overlayBoxColor", value.asInstanceOf[js.Any])
    @scala.inline
    def overlayBoxImage(value: Double): this.type = set("overlayBoxImage", value.asInstanceOf[js.Any])
    @scala.inline
    def overlayBoxImageSize(value: Double): this.type = set("overlayBoxImageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def overlayBoxOpacity(value: Double): this.type = set("overlayBoxOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def overlayOpacity(value: Double): this.type = set("overlayOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def renderOverlay(value: /* state */ Boolean => TagMod[Any]): this.type = set("renderOverlay", js.Any.fromFunction1(value))
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def transitionSpeed(value: Double): this.type = set("transitionSpeed", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MagnifierPreviewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(imageSrc: String): Builder = {
    val __props = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MagnifierPreviewProps]))
  }
}

