package typingsSlinky.antdMobileRn.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.imagePickerIndexNativeMod.ImagePickerNativeProps
import typingsSlinky.antdMobileRn.imagePickerStyleIndexNativeMod.IImagePickerStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ImagePicker {
  @JSImport("antd-mobile-rn", "ImagePicker")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antdMobileRn.mod.ImagePicker] {
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
    def styles(value: IImagePickerStyle): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ImagePickerNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ImagePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

