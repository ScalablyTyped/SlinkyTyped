package typingsSlinky.reactNativeScaledImage.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.ImageSourcePropType
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNativeScaledImage.mod.ScaledImageProps
import typingsSlinky.reactNativeScaledImage.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeScaledImage {
  
  @JSImport("react-native-scaled-image", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ImageStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ScaledImageProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(source: ImageSourcePropType): Builder = {
    val __props = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ScaledImageProps]))
  }
}
