package typingsSlinky.rcFieldForm.interfaceMod

import typingsSlinky.rcFieldForm.rcFieldFormBooleans.`false`
import typingsSlinky.rcFieldForm.rcFieldFormBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<rc-field-form.rc-field-form/es/interface.FormInstance, 'validateFields'> & {  validateFields  :rc-field-form.rc-field-form/es/interface.InternalValidateFields,   prefixName ? :rc-field-form.rc-field-form/es/interface.InternalNamePath,   validateTrigger ? :string | std.Array<string> | false, getInternalHooks (secret : string): rc-field-form.rc-field-form/es/interface.InternalHooks | null} */
trait InternalFormInstance extends js.Object {
  var getFieldError: js.Function1[/* name */ NamePath, js.Array[String]]
  var getFieldValue: js.Function1[/* name */ NamePath, StoreValue]
  var getFieldsError: js.Function1[/* nameList */ js.UndefOr[js.Array[NamePath]], js.Array[FieldError]]
  var getFieldsValue: js.Function2[
    /* nameList */ js.UndefOr[js.Array[NamePath] | `true`], 
    /* filterFunc */ js.UndefOr[js.Function1[/* meta */ Meta, Boolean]], 
    Store
  ]
  var isFieldTouched: js.Function1[/* name */ NamePath, Boolean]
  var isFieldValidating: js.Function1[/* name */ NamePath, Boolean]
  var isFieldsTouched: js.Function2[
    /* nameList */ js.UndefOr[js.Array[NamePath]], 
    /* allFieldsTouched */ js.UndefOr[Boolean], 
    Boolean
  ]
  var isFieldsValidating: js.Function1[/* nameList */ js.Array[NamePath], Boolean]
  /**
    * Passed by field context props
    */
  var prefixName: js.UndefOr[InternalNamePath] = js.undefined
  var resetFields: js.Function1[/* fields */ js.UndefOr[js.Array[NamePath]], Unit]
  var setFields: js.Function1[/* fields */ js.Array[FieldData], Unit]
  var setFieldsValue: js.Function1[/* value */ Store, Unit]
  var submit: js.Function0[Unit]
  var validateFields: InternalValidateFields
  var validateTrigger: js.UndefOr[String | js.Array[String] | `false`] = js.undefined
  /**
    * Form component should register some content into store.
    * We pass the `HOOK_MARK` as key to avoid user call the function.
    */
  def getInternalHooks(secret: String): InternalHooks | Null
}

object InternalFormInstance {
  @scala.inline
  def apply(
    getFieldError: /* name */ NamePath => js.Array[String],
    getFieldValue: /* name */ NamePath => StoreValue,
    getFieldsError: /* nameList */ js.UndefOr[js.Array[NamePath]] => js.Array[FieldError],
    getFieldsValue: (/* nameList */ js.UndefOr[js.Array[NamePath] | `true`], /* filterFunc */ js.UndefOr[js.Function1[/* meta */ Meta, Boolean]]) => Store,
    getInternalHooks: String => InternalHooks | Null,
    isFieldTouched: /* name */ NamePath => Boolean,
    isFieldValidating: /* name */ NamePath => Boolean,
    isFieldsTouched: (/* nameList */ js.UndefOr[js.Array[NamePath]], /* allFieldsTouched */ js.UndefOr[Boolean]) => Boolean,
    isFieldsValidating: /* nameList */ js.Array[NamePath] => Boolean,
    resetFields: /* fields */ js.UndefOr[js.Array[NamePath]] => Unit,
    setFields: /* fields */ js.Array[FieldData] => Unit,
    setFieldsValue: /* value */ Store => Unit,
    submit: () => Unit,
    validateFields: (/* nameList */ js.UndefOr[js.Array[NamePath]], /* options */ js.UndefOr[ValidateOptions]) => js.Promise[Store]
  ): InternalFormInstance = {
    val __obj = js.Dynamic.literal(getFieldError = js.Any.fromFunction1(getFieldError), getFieldValue = js.Any.fromFunction1(getFieldValue), getFieldsError = js.Any.fromFunction1(getFieldsError), getFieldsValue = js.Any.fromFunction2(getFieldsValue), getInternalHooks = js.Any.fromFunction1(getInternalHooks), isFieldTouched = js.Any.fromFunction1(isFieldTouched), isFieldValidating = js.Any.fromFunction1(isFieldValidating), isFieldsTouched = js.Any.fromFunction2(isFieldsTouched), isFieldsValidating = js.Any.fromFunction1(isFieldsValidating), resetFields = js.Any.fromFunction1(resetFields), setFields = js.Any.fromFunction1(setFields), setFieldsValue = js.Any.fromFunction1(setFieldsValue), submit = js.Any.fromFunction0(submit), validateFields = js.Any.fromFunction2(validateFields))
    __obj.asInstanceOf[InternalFormInstance]
  }
  @scala.inline
  implicit class InternalFormInstanceOps[Self <: InternalFormInstance] (val x: Self) extends AnyVal {
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
    def setGetFieldError(value: /* name */ NamePath => js.Array[String]): Self = this.set("getFieldError", js.Any.fromFunction1(value))
    @scala.inline
    def setGetFieldValue(value: /* name */ NamePath => StoreValue): Self = this.set("getFieldValue", js.Any.fromFunction1(value))
    @scala.inline
    def setGetFieldsError(value: /* nameList */ js.UndefOr[js.Array[NamePath]] => js.Array[FieldError]): Self = this.set("getFieldsError", js.Any.fromFunction1(value))
    @scala.inline
    def setGetFieldsValue(
      value: (/* nameList */ js.UndefOr[js.Array[NamePath] | `true`], /* filterFunc */ js.UndefOr[js.Function1[/* meta */ Meta, Boolean]]) => Store
    ): Self = this.set("getFieldsValue", js.Any.fromFunction2(value))
    @scala.inline
    def setGetInternalHooks(value: String => InternalHooks | Null): Self = this.set("getInternalHooks", js.Any.fromFunction1(value))
    @scala.inline
    def setIsFieldTouched(value: /* name */ NamePath => Boolean): Self = this.set("isFieldTouched", js.Any.fromFunction1(value))
    @scala.inline
    def setIsFieldValidating(value: /* name */ NamePath => Boolean): Self = this.set("isFieldValidating", js.Any.fromFunction1(value))
    @scala.inline
    def setIsFieldsTouched(
      value: (/* nameList */ js.UndefOr[js.Array[NamePath]], /* allFieldsTouched */ js.UndefOr[Boolean]) => Boolean
    ): Self = this.set("isFieldsTouched", js.Any.fromFunction2(value))
    @scala.inline
    def setIsFieldsValidating(value: /* nameList */ js.Array[NamePath] => Boolean): Self = this.set("isFieldsValidating", js.Any.fromFunction1(value))
    @scala.inline
    def setResetFields(value: /* fields */ js.UndefOr[js.Array[NamePath]] => Unit): Self = this.set("resetFields", js.Any.fromFunction1(value))
    @scala.inline
    def setSetFields(value: /* fields */ js.Array[FieldData] => Unit): Self = this.set("setFields", js.Any.fromFunction1(value))
    @scala.inline
    def setSetFieldsValue(value: /* value */ Store => Unit): Self = this.set("setFieldsValue", js.Any.fromFunction1(value))
    @scala.inline
    def setSubmit(value: () => Unit): Self = this.set("submit", js.Any.fromFunction0(value))
    @scala.inline
    def setValidateFields(
      value: (/* nameList */ js.UndefOr[js.Array[NamePath]], /* options */ js.UndefOr[ValidateOptions]) => js.Promise[Store]
    ): Self = this.set("validateFields", js.Any.fromFunction2(value))
    @scala.inline
    def setPrefixName(value: InternalNamePath): Self = this.set("prefixName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixName: Self = this.set("prefixName", js.undefined)
    @scala.inline
    def setValidateTrigger(value: String | js.Array[String] | `false`): Self = this.set("validateTrigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateTrigger: Self = this.set("validateTrigger", js.undefined)
  }
  
}

