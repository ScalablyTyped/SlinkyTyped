package typingsSlinky.rcFieldForm.formMod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.rcFieldForm.interfaceMod.FieldData
import typingsSlinky.rcFieldForm.interfaceMod.FormInstance
import typingsSlinky.rcFieldForm.interfaceMod.Store
import typingsSlinky.rcFieldForm.interfaceMod.ValidateErrorEntity
import typingsSlinky.rcFieldForm.interfaceMod.ValidateMessages
import typingsSlinky.rcFieldForm.rcFieldFormBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormProps extends BaseFormProps {
  @JSName("children")
  var children_FormProps: js.UndefOr[RenderProps | ReactElement] = js.undefined
  var component: js.UndefOr[`false` | String | ReactComponentClass[_]] = js.undefined
  var fields: js.UndefOr[js.Array[FieldData]] = js.undefined
  var form: js.UndefOr[FormInstance] = js.undefined
  var initialValues: js.UndefOr[Store] = js.undefined
  var onFieldsChange: js.UndefOr[
    js.Function2[/* changedFields */ js.Array[FieldData], /* allFields */ js.Array[FieldData], Unit]
  ] = js.undefined
  var onFinish: js.UndefOr[js.Function1[/* values */ Store, Unit]] = js.undefined
  var onFinishFailed: js.UndefOr[js.Function1[/* errorInfo */ ValidateErrorEntity, Unit]] = js.undefined
  var onValuesChange: js.UndefOr[js.Function2[/* changedValues */ Store, /* values */ Store, Unit]] = js.undefined
  var preserve: js.UndefOr[Boolean] = js.undefined
  var validateMessages: js.UndefOr[ValidateMessages] = js.undefined
  var validateTrigger: js.UndefOr[String | js.Array[String] | `false`] = js.undefined
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
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenFunction2(value: (/* values */ Store, /* form */ FormInstance) => ReactElement): Self = this.set("children", js.Any.fromFunction2(value))
    @scala.inline
    def setChildren(value: RenderProps | ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setComponentFunctionComponent(value: ReactComponentClass[_]): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponentComponentClass(value: ReactComponentClass[_]): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponent(value: `false` | String | ReactComponentClass[_]): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setFieldsVarargs(value: FieldData*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[FieldData]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setForm(value: FormInstance): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    @scala.inline
    def setInitialValues(value: Store): Self = this.set("initialValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialValues: Self = this.set("initialValues", js.undefined)
    @scala.inline
    def setOnFieldsChange(value: (/* changedFields */ js.Array[FieldData], /* allFields */ js.Array[FieldData]) => Unit): Self = this.set("onFieldsChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnFieldsChange: Self = this.set("onFieldsChange", js.undefined)
    @scala.inline
    def setOnFinish(value: /* values */ Store => Unit): Self = this.set("onFinish", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFinish: Self = this.set("onFinish", js.undefined)
    @scala.inline
    def setOnFinishFailed(value: /* errorInfo */ ValidateErrorEntity => Unit): Self = this.set("onFinishFailed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFinishFailed: Self = this.set("onFinishFailed", js.undefined)
    @scala.inline
    def setOnValuesChange(value: (/* changedValues */ Store, /* values */ Store) => Unit): Self = this.set("onValuesChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnValuesChange: Self = this.set("onValuesChange", js.undefined)
    @scala.inline
    def setPreserve(value: Boolean): Self = this.set("preserve", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserve: Self = this.set("preserve", js.undefined)
    @scala.inline
    def setValidateMessages(value: ValidateMessages): Self = this.set("validateMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateMessages: Self = this.set("validateMessages", js.undefined)
    @scala.inline
    def setValidateTriggerVarargs(value: String*): Self = this.set("validateTrigger", js.Array(value :_*))
    @scala.inline
    def setValidateTrigger(value: String | js.Array[String] | `false`): Self = this.set("validateTrigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateTrigger: Self = this.set("validateTrigger", js.undefined)
  }
  
}

