package typingsSlinky.reactEasyCrop.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ImgHTMLAttributes
import typingsSlinky.react.mod.VideoHTMLAttributes
import typingsSlinky.reactEasyCrop.anon.ContainerClassName
import typingsSlinky.reactEasyCrop.anon.ContainerStyle
import typingsSlinky.reactEasyCrop.mod.CropperProps
import typingsSlinky.reactEasyCrop.mod.default
import typingsSlinky.reactEasyCrop.reactEasyCropStrings.rect
import typingsSlinky.reactEasyCrop.reactEasyCropStrings.round
import typingsSlinky.reactEasyCrop.typesMod.Area
import typingsSlinky.reactEasyCrop.typesMod.MediaSize
import typingsSlinky.reactEasyCrop.typesMod.Point
import typingsSlinky.reactEasyCrop.typesMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactEasyCrop {
  
  @JSImport("react-easy-crop", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def cropSize(value: Size): this.type = set("cropSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableAutomaticStylesInjection(value: Boolean): this.type = set("disableAutomaticStylesInjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def image(value: String): this.type = set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialCroppedAreaPixels(value: Area): this.type = set("initialCroppedAreaPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCropAreaChange(value: (/* croppedArea */ Area, /* croppedAreaPixels */ Area) => Unit): this.type = set("onCropAreaChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onCropComplete(value: (/* croppedArea */ Area, /* croppedAreaPixels */ Area) => Unit): this.type = set("onCropComplete", js.Any.fromFunction2(value))
    
    @scala.inline
    def onCropSizeChange(value: /* cropSize */ Size => Unit): this.type = set("onCropSizeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onInteractionEnd(value: () => Unit): this.type = set("onInteractionEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def onInteractionStart(value: () => Unit): this.type = set("onInteractionStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def onMediaLoaded(value: /* mediaSize */ MediaSize => Unit): this.type = set("onMediaLoaded", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRotationChange(value: /* rotation */ Double => Unit): this.type = set("onRotationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onZoomChange(value: /* zoom */ Double => Unit): this.type = set("onZoomChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def showGrid(value: Boolean): this.type = set("showGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transform(value: String): this.type = set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def video(value: String): this.type = set("video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def zoomWithScroll(value: Boolean): this.type = set("zoomWithScroll", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CropperProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    aspect: Double,
    classes: ContainerClassName,
    crop: Point,
    cropShape: rect | round,
    maxZoom: Double,
    mediaProps: ImgHTMLAttributes[HTMLElement] | VideoHTMLAttributes[HTMLElement],
    minZoom: Double,
    onCropChange: Point => Unit,
    restrictPosition: Boolean,
    rotation: Double,
    style: ContainerStyle,
    zoom: Double,
    zoomSpeed: Double
  ): Builder = {
    val __props = js.Dynamic.literal(aspect = aspect.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], crop = crop.asInstanceOf[js.Any], cropShape = cropShape.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], mediaProps = mediaProps.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], onCropChange = js.Any.fromFunction1(onCropChange), restrictPosition = restrictPosition.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any], zoomSpeed = zoomSpeed.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CropperProps]))
  }
}
