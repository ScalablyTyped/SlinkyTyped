package typingsSlinky.antd.formItemMod

import slinky.core.TagMod
import typingsSlinky.antd.formItemInputMod.FormItemInputProps
import typingsSlinky.antd.formItemLabelMod.FormItemLabelProps
import typingsSlinky.antd.gridColMod.ColProps
import typingsSlinky.antd.interfaceMod.FormLabelAlign
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FieldProps * / any, 'children'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FieldProps * / any[P]} */ trait FormItemProps
  extends FormItemLabelProps
     with FormItemInputProps {
  var children: ChildrenType
  var className: js.UndefOr[String] = js.undefined
  /** Auto passed by List render props. User should not use this. */
  var fieldKey: js.UndefOr[Double] = js.undefined
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
  def apply(
    children: ChildrenType = null,
    className: String = null,
    colon: js.UndefOr[Boolean] = js.undefined,
    extra: TagMod[Any] = null,
    fieldKey: js.UndefOr[Double] = js.undefined,
    hasFeedback: js.UndefOr[Boolean] = js.undefined,
    help: TagMod[Any] = null,
    htmlFor: String = null,
    id: String = null,
    label: TagMod[Any] = null,
    labelAlign: FormLabelAlign = null,
    labelCol: ColProps = null,
    noStyle: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    validateStatus: ValidateStatus = null,
    wrapperCol: ColProps = null
  ): FormItemProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(colon)) __obj.updateDynamic("colon")(colon.get.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (!js.isUndefined(fieldKey)) __obj.updateDynamic("fieldKey")(fieldKey.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasFeedback)) __obj.updateDynamic("hasFeedback")(hasFeedback.get.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (htmlFor != null) __obj.updateDynamic("htmlFor")(htmlFor.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelAlign != null) __obj.updateDynamic("labelAlign")(labelAlign.asInstanceOf[js.Any])
    if (labelCol != null) __obj.updateDynamic("labelCol")(labelCol.asInstanceOf[js.Any])
    if (!js.isUndefined(noStyle)) __obj.updateDynamic("noStyle")(noStyle.get.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (validateStatus != null) __obj.updateDynamic("validateStatus")(validateStatus.asInstanceOf[js.Any])
    if (wrapperCol != null) __obj.updateDynamic("wrapperCol")(wrapperCol.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormItemProps]
  }
}

