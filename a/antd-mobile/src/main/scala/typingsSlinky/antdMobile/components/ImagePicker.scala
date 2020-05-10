package typingsSlinky.antdMobile.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobile.imagePickerMod.ImagePickerPropTypes
import typingsSlinky.antdMobile.imagePickerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ImagePicker {
  @JSImport("antd-mobile/lib/image-picker", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def accept(value: String): this.type = set("accept", value.asInstanceOf[js.Any])
    @scala.inline
    def capture(value: js.Any): this.type = set("capture", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def disableDelete(value: Boolean): this.type = set("disableDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def files(value: js.Array[js.Object]): this.type = set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def length(value: Double | String): this.type = set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
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
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ImagePickerPropTypes): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ImagePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

