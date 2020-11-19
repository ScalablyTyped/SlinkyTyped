package typingsSlinky.antDesignReactNative.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.cameraRollPickerMod.CameraRollPickerProps
import typingsSlinky.antDesignReactNative.imagePickerMod.ImagePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ImagePicker {
  
  @JSImport("@ant-design/react-native", "ImagePicker")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignReactNative.mod.ImagePicker] {
    
    @scala.inline
    def cameraPickerProps(value: CameraRollPickerProps): this.type = set("cameraPickerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cancelTextReactElement(value: ReactElement): this.type = set("cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cancelText(value: ReactElement): this.type = set("cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filesVarargs(value: js.Object*): this.type = set("files", js.Array(value :_*))
    
    @scala.inline
    def files(value: js.Array[js.Object]): this.type = set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAddImageClick(value: () => Unit): this.type = set("onAddImageClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def onChange(
      value: (/* files */ js.Array[js.Object], /* operationType */ String, /* index */ js.UndefOr[Double]) => Unit
    ): this.type = set("onChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def onFail(value: /* msg */ String => Unit): this.type = set("onFail", js.Any.fromFunction1(value))
    
    @scala.inline
    def onImageClick(value: (/* index */ js.UndefOr[Double], /* files */ js.UndefOr[js.Array[js.Object]]) => Unit): this.type = set("onImageClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styles(value: js.Object): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ImagePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ImagePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
