package typingsSlinky.antd.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.formItemInputMod.FormItemInputMiscProps
import typingsSlinky.antd.formItemInputMod.FormItemInputProps
import typingsSlinky.antd.formItemMod.ValidateStatus
import typingsSlinky.antd.gridColMod.ColProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormItemInput {
  @JSImport("antd/lib/form/FormItemInput", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
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
    def validateStatus(value: ValidateStatus): this.type = set("validateStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def wrapperCol(value: ColProps): this.type = set("wrapperCol", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FormItemInputProps with FormItemInputMiscProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(errors: js.Array[TagMod[Any]], onDomErrorVisibleChange: Boolean => Unit, prefixCls: String): Builder = {
    val __props = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], onDomErrorVisibleChange = js.Any.fromFunction1(onDomErrorVisibleChange), prefixCls = prefixCls.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FormItemInputProps with FormItemInputMiscProps]))
  }
}

