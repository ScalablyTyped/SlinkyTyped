package typingsSlinky.reactEasyCrop.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactEasyCrop.AnonContainerClassName
import typingsSlinky.reactEasyCrop.AnonContainerStyle
import typingsSlinky.reactEasyCrop.mod.Area
import typingsSlinky.reactEasyCrop.mod.CropperProps
import typingsSlinky.reactEasyCrop.mod.ImageSize
import typingsSlinky.reactEasyCrop.mod.Location
import typingsSlinky.reactEasyCrop.mod.Size
import typingsSlinky.reactEasyCrop.mod.default
import typingsSlinky.reactEasyCrop.reactEasyCropStrings.rect
import typingsSlinky.reactEasyCrop.reactEasyCropStrings.round
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactEasyCrop {
  @JSImport("react-easy-crop", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def aspect(value: Double): this.type = set("aspect", value.asInstanceOf[js.Any])
    @scala.inline
    def classes(value: AnonContainerClassName): this.type = set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def cropShape(value: rect | round): this.type = set("cropShape", value.asInstanceOf[js.Any])
    @scala.inline
    def cropSize(value: Size): this.type = set("cropSize", value.asInstanceOf[js.Any])
    @scala.inline
    def crossOrigin(value: String): this.type = set("crossOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def initialCroppedAreaPixels(value: Area): this.type = set("initialCroppedAreaPixels", value.asInstanceOf[js.Any])
    @scala.inline
    def maxZoom(value: Double): this.type = set("maxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def minZoom(value: Double): this.type = set("minZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def onCropComplete(value: (/* croppedArea */ Area, /* croppedAreaPixels */ Area) => Unit): this.type = set("onCropComplete", js.Any.fromFunction2(value))
    @scala.inline
    def onImageLoaded(value: /* imageSize */ ImageSize => Unit): this.type = set("onImageLoaded", js.Any.fromFunction1(value))
    @scala.inline
    def onImgError(value: () => Unit): this.type = set("onImgError", js.Any.fromFunction0(value))
    @scala.inline
    def onInteractionEnd(value: () => Unit): this.type = set("onInteractionEnd", js.Any.fromFunction0(value))
    @scala.inline
    def onInteractionStart(value: () => Unit): this.type = set("onInteractionStart", js.Any.fromFunction0(value))
    @scala.inline
    def onRotationChange(value: /* rotation */ Double => Unit): this.type = set("onRotationChange", js.Any.fromFunction1(value))
    @scala.inline
    def onZoomChange(value: /* zoom */ Double => Unit): this.type = set("onZoomChange", js.Any.fromFunction1(value))
    @scala.inline
    def restrictPosition(value: Boolean): this.type = set("restrictPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def rotation(value: Double): this.type = set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def showGrid(value: Boolean): this.type = set("showGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: AnonContainerStyle): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def zoom(value: Double): this.type = set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def zoomSpeed(value: Double): this.type = set("zoomSpeed", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CropperProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(crop: Location, image: String, onCropChange: Location => Unit): Builder = {
    val __props = js.Dynamic.literal(crop = crop.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], onCropChange = js.Any.fromFunction1(onCropChange))
    new Builder(js.Array(this.component, __props.asInstanceOf[CropperProps]))
  }
}

