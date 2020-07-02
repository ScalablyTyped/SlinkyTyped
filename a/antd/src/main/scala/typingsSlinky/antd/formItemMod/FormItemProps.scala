package typingsSlinky.antd.formItemMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.formItemInputMod.FormItemInputProps
import typingsSlinky.antd.formItemLabelMod.FormItemLabelProps
import typingsSlinky.rcFieldForm.interfaceMod.FormInstance
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormItemProps
  extends FormItemLabelProps
     with FormItemInputProps
     with RcFieldProps {
  var children: ChildrenType
  var className: js.UndefOr[String] = js.undefined
  /** Auto passed by List render props. User should not use this. */
  var fieldKey: js.UndefOr[Key | js.Array[Key]] = js.undefined
  var hasFeedback: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var noStyle: js.UndefOr[Boolean] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var validateStatus: js.UndefOr[ValidateStatus] = js.undefined
}

object FormItemProps {
  @scala.inline
  def apply(): FormItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormItemProps]
  }
  @scala.inline
  implicit class FormItemPropsOps[Self <: FormItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenFunction1(value: /* form */ FormInstance => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setChildren(value: ChildrenType): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setFieldKey(value: Key | js.Array[Key]): Self = this.set("fieldKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldKey: Self = this.set("fieldKey", js.undefined)
    @scala.inline
    def setHasFeedback(value: Boolean): Self = this.set("hasFeedback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasFeedback: Self = this.set("hasFeedback", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setNoStyle(value: Boolean): Self = this.set("noStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoStyle: Self = this.set("noStyle", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setValidateStatus(value: ValidateStatus): Self = this.set("validateStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateStatus: Self = this.set("validateStatus", js.undefined)
  }
  
}

