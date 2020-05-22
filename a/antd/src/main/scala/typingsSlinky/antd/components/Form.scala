package typingsSlinky.antd.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.formFormMod.FormLayout
import typingsSlinky.antd.formFormMod.FormProps
import typingsSlinky.antd.formUtilMod.FormInstance
import typingsSlinky.antd.gridColMod.ColProps
import typingsSlinky.antd.interfaceMod.FormLabelAlign
import typingsSlinky.antd.sizeContextMod.SizeType
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Form {
  @JSImport("antd/lib/form", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, Ref[js.Any] with js.Object] {
    @scala.inline
    def colon(value: Boolean): this.type = set("colon", value.asInstanceOf[js.Any])
    @scala.inline
    def form(value: FormInstance): this.type = set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def hideRequiredMark(value: Boolean): this.type = set("hideRequiredMark", value.asInstanceOf[js.Any])
    @scala.inline
    def labelAlign(value: FormLabelAlign): this.type = set("labelAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def labelCol(value: ColProps): this.type = set("labelCol", value.asInstanceOf[js.Any])
    @scala.inline
    def layout(value: FormLayout): this.type = set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollToFirstError(value: Boolean): this.type = set("scrollToFirstError", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def wrapperCol(value: ColProps): this.type = set("wrapperCol", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FormProps with RefAttributes[FormInstance]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Form.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

