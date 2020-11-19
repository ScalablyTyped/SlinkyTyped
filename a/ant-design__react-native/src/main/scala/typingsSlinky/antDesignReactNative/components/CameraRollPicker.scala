package typingsSlinky.antDesignReactNative.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.cameraRollPickerMod.CameraRollPickerProps
import typingsSlinky.antDesignReactNative.cameraRollPickerMod.default
import typingsSlinky.reactNative.mod.CameraRollAssetType
import typingsSlinky.reactNative.mod.CameraRollGroupType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CameraRollPicker {
  
  @JSImport("@ant-design/react-native/lib/image-picker/CameraRollPicker", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def after(value: String): this.type = set("after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def assetType(value: CameraRollAssetType): this.type = set("assetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def callback(value: /* repeated */ js.Any => _): this.type = set("callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def containerWidth(value: Double): this.type = set("containerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def groupName(value: String): this.type = set("groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def groupTypes(value: CameraRollGroupType): this.type = set("groupTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mimeTypesVarargs(value: String*): this.type = set("mimeTypes", js.Array(value :_*))
    
    @scala.inline
    def mimeTypes(value: js.Array[String]): this.type = set("mimeTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectSingleItem(value: Boolean): this.type = set("selectSingleItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedVarargs(value: js.Any*): this.type = set("selected", js.Array(value :_*))
    
    @scala.inline
    def selected(value: js.Array[_]): this.type = set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedMarker(value: ReactElement): this.type = set("selectedMarker", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CameraRollPickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(first: Double, imageMargin: Double, imagesPerRow: Double, maximum: Double): Builder = {
    val __props = js.Dynamic.literal(first = first.asInstanceOf[js.Any], imageMargin = imageMargin.asInstanceOf[js.Any], imagesPerRow = imagesPerRow.asInstanceOf[js.Any], maximum = maximum.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CameraRollPickerProps]))
  }
}
