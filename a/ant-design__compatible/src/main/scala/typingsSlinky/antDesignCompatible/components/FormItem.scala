package typingsSlinky.antDesignCompatible.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignCompatible.antDesignCompatibleStrings._empty
import typingsSlinky.antDesignCompatible.antDesignCompatibleStrings.error
import typingsSlinky.antDesignCompatible.antDesignCompatibleStrings.success
import typingsSlinky.antDesignCompatible.antDesignCompatibleStrings.validating
import typingsSlinky.antDesignCompatible.antDesignCompatibleStrings.warning
import typingsSlinky.antDesignCompatible.formItemMod.FormItemProps
import typingsSlinky.antDesignCompatible.formItemMod.FormLabelAlign
import typingsSlinky.antDesignCompatible.formItemMod.default
import typingsSlinky.antd.gridColMod.ColProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormItem {
  @JSImport("@ant-design/compatible/lib/form/FormItem", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def colon(value: Boolean): this.type = set("colon", value.asInstanceOf[js.Any])
    @scala.inline
    def extraReactElement(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def extra(value: TagMod[Any]): this.type = set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def hasFeedback(value: Boolean): this.type = set("hasFeedback", value.asInstanceOf[js.Any])
    @scala.inline
    def helpReactElement(value: ReactElement): this.type = set("help", value.asInstanceOf[js.Any])
    @scala.inline
    def help(value: TagMod[Any]): this.type = set("help", value.asInstanceOf[js.Any])
    @scala.inline
    def htmlFor(value: String): this.type = set("htmlFor", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def labelReactElement(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def label(value: TagMod[Any]): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def labelAlign(value: FormLabelAlign): this.type = set("labelAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def labelCol(value: ColProps): this.type = set("labelCol", value.asInstanceOf[js.Any])
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def validateStatus(value: success | warning | error | validating | _empty): this.type = set("validateStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def wrapperCol(value: ColProps): this.type = set("wrapperCol", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FormItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FormItem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

