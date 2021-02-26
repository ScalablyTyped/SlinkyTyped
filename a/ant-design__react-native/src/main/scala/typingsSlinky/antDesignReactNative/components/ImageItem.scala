package typingsSlinky.antDesignReactNative.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.imageItemMod.ImageItemProps
import typingsSlinky.antDesignReactNative.imageItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ImageItem {
  
  @scala.inline
  def apply(imageMargin: Double, imagesPerRow: Double): Builder = {
    val __props = js.Dynamic.literal(imageMargin = imageMargin.asInstanceOf[js.Any], imagesPerRow = imagesPerRow.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ImageItemProps]))
  }
  
  @JSImport("@ant-design/react-native/lib/image-picker/ImageItem", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def containerWidth(value: Double): this.type = set("containerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def item(value: js.Any): this.type = set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPress(value: /* repeated */ js.Any => _): this.type = set("onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedMarker(value: ReactElement): this.type = set("selectedMarker", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ImageItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
