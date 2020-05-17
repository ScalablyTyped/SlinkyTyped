package typingsSlinky.reactImageMagnify.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactImageMagnify.anon.Height
import typingsSlinky.reactImageMagnify.anon.ReactImageMagnifyPropsRea
import typingsSlinky.reactImageMagnify.mod.LargeImageType
import typingsSlinky.reactImageMagnify.mod.SmallImageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactImageMagnify {
  @JSImport("react-image-magnify", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def enlargedImageClassName(value: String): this.type = set("enlargedImageClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def enlargedImageContainerClassName(value: String): this.type = set("enlargedImageContainerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def enlargedImageContainerDimensions(value: Height): this.type = set("enlargedImageContainerDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def enlargedImageContainerStyle(value: CSSProperties): this.type = set("enlargedImageContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def enlargedImagePortalId(value: String): this.type = set("enlargedImagePortalId", value.asInstanceOf[js.Any])
    @scala.inline
    def enlargedImagePosition(value: String): this.type = set("enlargedImagePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def enlargedImageStyle(value: CSSProperties): this.type = set("enlargedImageStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def fadeDurationInMs(value: Double): this.type = set("fadeDurationInMs", value.asInstanceOf[js.Any])
    @scala.inline
    def hintComponent(value: () => Unit): this.type = set("hintComponent", js.Any.fromFunction0(value))
    @scala.inline
    def hintTextMouse(value: String): this.type = set("hintTextMouse", value.asInstanceOf[js.Any])
    @scala.inline
    def hintTextTouch(value: String): this.type = set("hintTextTouch", value.asInstanceOf[js.Any])
    @scala.inline
    def hoverDelayInMs(value: Double): this.type = set("hoverDelayInMs", value.asInstanceOf[js.Any])
    @scala.inline
    def hoverOffDelayInMs(value: Double): this.type = set("hoverOffDelayInMs", value.asInstanceOf[js.Any])
    @scala.inline
    def imageClassName(value: String): this.type = set("imageClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def imageStyle(value: CSSProperties): this.type = set("imageStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def isActivatedOnTouch(value: Boolean): this.type = set("isActivatedOnTouch", value.asInstanceOf[js.Any])
    @scala.inline
    def isEnlargedImagePortalEnabledForTouch(value: Boolean): this.type = set("isEnlargedImagePortalEnabledForTouch", value.asInstanceOf[js.Any])
    @scala.inline
    def isHintEnabled(value: Boolean): this.type = set("isHintEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def lensComponent(value: () => Unit): this.type = set("lensComponent", js.Any.fromFunction0(value))
    @scala.inline
    def lensStyle(value: CSSProperties): this.type = set("lensStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def pressDuration(value: Double): this.type = set("pressDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def pressMoveThreshold(value: Double): this.type = set("pressMoveThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def shouldHideHintAfterFirstActivation(value: Boolean): this.type = set("shouldHideHintAfterFirstActivation", value.asInstanceOf[js.Any])
    @scala.inline
    def shouldUsePositiveSpaceLens(value: Boolean): this.type = set("shouldUsePositiveSpaceLens", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactImageMagnifyPropsRea): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(largeImage: LargeImageType, smallImage: SmallImageType): Builder = {
    val __props = js.Dynamic.literal(largeImage = largeImage.asInstanceOf[js.Any], smallImage = smallImage.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactImageMagnifyPropsRea]))
  }
}

