package typingsSlinky.fundamentalReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fundamentalReact.imageMod.ImageProps
import typingsSlinky.fundamentalReact.imageMod.imageSize
import typingsSlinky.fundamentalReact.imageMod.imageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Image {
  
  @scala.inline
  def apply(photo: String, size: imageSize): Builder = {
    val __props = js.Dynamic.literal(photo = photo.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ImageProps]))
  }
  
  @JSImport("fundamental-react", "Image")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: imageType): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ImageProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
