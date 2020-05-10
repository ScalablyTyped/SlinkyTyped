package typingsSlinky.reactImageCrop.components

import org.scalajs.dom.raw.HTMLImageElement
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.img.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactImageCrop.mod.Crop
import typingsSlinky.reactImageCrop.mod.PercentCrop
import typingsSlinky.reactImageCrop.mod.ReactCropProps
import typingsSlinky.reactImageCrop.mod.^
import typingsSlinky.reactImageCrop.reactImageCropStrings.`use-credentials`
import typingsSlinky.reactImageCrop.reactImageCropStrings.anonymous
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactImageCrop {
  @JSImport("react-image-crop", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    @scala.inline
    def circularCrop(value: Boolean): this.type = set("circularCrop", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def crop(value: Crop): this.type = set("crop", value.asInstanceOf[js.Any])
    @scala.inline
    def crossorigin(value: anonymous | `use-credentials`): this.type = set("crossorigin", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def imageAlt(value: String): this.type = set("imageAlt", value.asInstanceOf[js.Any])
    @scala.inline
    def imageStyle(value: CSSProperties): this.type = set("imageStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def keepSelection(value: Boolean): this.type = set("keepSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def locked(value: Boolean): this.type = set("locked", value.asInstanceOf[js.Any])
    @scala.inline
    def maxHeight(value: Double): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def maxWidth(value: Double): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def minHeight(value: Double): this.type = set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def minWidth(value: Double): this.type = set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def onComplete(value: (/* crop */ Crop, /* percentCrop */ PercentCrop) => Unit): this.type = set("onComplete", js.Any.fromFunction2(value))
    @scala.inline
    def onDragEnd(value: () => Unit): this.type = set("onDragEnd", js.Any.fromFunction0(value))
    @scala.inline
    def onDragStart(value: () => Unit): this.type = set("onDragStart", js.Any.fromFunction0(value))
    @scala.inline
    def onImageError(value: /* event */ SyntheticEvent[Event_, HTMLImageElement] => Unit): this.type = set("onImageError", js.Any.fromFunction1(value))
    @scala.inline
    def onImageLoaded(value: /* target */ HTMLImageElement => Unit): this.type = set("onImageLoaded", js.Any.fromFunction1(value))
    @scala.inline
    def renderComponentReactElement(value: ReactElement): this.type = set("renderComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def renderComponent(value: TagMod[Any]): this.type = set("renderComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def renderSelectionAddon(value: /* state */ js.Any => TagMod[Any]): this.type = set("renderSelectionAddon", js.Any.fromFunction1(value))
    @scala.inline
    def ruleOfThirds(value: Boolean): this.type = set("ruleOfThirds", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactCropProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(onChange: (Crop, PercentCrop) => Unit, src: String): Builder = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange), src = src.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactCropProps]))
  }
}

