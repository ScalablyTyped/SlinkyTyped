package typingsSlinky.antDesignReactNative.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.cameraRollPickerMod.CameraRollPickerProps
import typingsSlinky.antDesignReactNative.imageRollMod.ImageRollProps
import typingsSlinky.antDesignReactNative.imageRollMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ImageRoll {
  
  @scala.inline
  def apply(onCancel: () => Unit, onSelected: js.Object => Unit): Builder = {
    val __props = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), onSelected = js.Any.fromFunction1(onSelected))
    new Builder(js.Array(this.component, __props.asInstanceOf[ImageRollProps]))
  }
  
  @JSImport("@ant-design/react-native/lib/image-picker/ImageRoll", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def cameraPickerProps(value: CameraRollPickerProps): this.type = set("cameraPickerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cancelText(value: ReactElement): this.type = set("cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cancelTextReactElement(value: ReactElement): this.type = set("cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ImageRollProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
