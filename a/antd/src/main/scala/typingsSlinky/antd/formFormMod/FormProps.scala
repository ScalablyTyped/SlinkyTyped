package typingsSlinky.antd.formFormMod

import typingsSlinky.antd.formUtilMod.FormInstance
import typingsSlinky.antd.gridColMod.ColProps
import typingsSlinky.antd.interfaceMod.FormLabelAlign
import typingsSlinky.antd.sizeContextMod.SizeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RcFormProps * / any, 'form'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RcFormProps * / any[P]} */ trait FormProps extends js.Object {
  var colon: js.UndefOr[Boolean] = js.undefined
  var form: js.UndefOr[FormInstance] = js.undefined
  var hideRequiredMark: js.UndefOr[Boolean] = js.undefined
  var labelAlign: js.UndefOr[FormLabelAlign] = js.undefined
  var labelCol: js.UndefOr[ColProps] = js.undefined
  var layout: js.UndefOr[FormLayout] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var scrollToFirstError: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[SizeType] = js.undefined
  var wrapperCol: js.UndefOr[ColProps] = js.undefined
}

object FormProps {
  @scala.inline
  def apply(): FormProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormProps]
  }
  @scala.inline
  implicit class FormPropsOps[Self <: FormProps] (val x: Self) extends AnyVal {
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
    def setColon(value: Boolean): Self = this.set("colon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColon: Self = this.set("colon", js.undefined)
    @scala.inline
    def setForm(value: FormInstance): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    @scala.inline
    def setHideRequiredMark(value: Boolean): Self = this.set("hideRequiredMark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideRequiredMark: Self = this.set("hideRequiredMark", js.undefined)
    @scala.inline
    def setLabelAlign(value: FormLabelAlign): Self = this.set("labelAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelAlign: Self = this.set("labelAlign", js.undefined)
    @scala.inline
    def setLabelCol(value: ColProps): Self = this.set("labelCol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelCol: Self = this.set("labelCol", js.undefined)
    @scala.inline
    def setLayout(value: FormLayout): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setScrollToFirstError(value: Boolean): Self = this.set("scrollToFirstError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollToFirstError: Self = this.set("scrollToFirstError", js.undefined)
    @scala.inline
    def setSize(value: SizeType): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setWrapperCol(value: ColProps): Self = this.set("wrapperCol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapperCol: Self = this.set("wrapperCol", js.undefined)
  }
  
}

