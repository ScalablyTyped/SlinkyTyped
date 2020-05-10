package typingsSlinky.rcFieldForm.interfaceMod

import typingsSlinky.rcFieldForm.rcFieldFormBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<rc-field-form.rc-field-form/lib/interface.FormInstance, 'validateFields'> & {  validateFields  :rc-field-form.rc-field-form/lib/interface.InternalValidateFields,   prefixName ? :rc-field-form.rc-field-form/lib/interface.InternalNamePath, getInternalHooks (secret : string): rc-field-form.rc-field-form/lib/interface.InternalHooks | null} */
@js.native
trait InternalFormInstance extends js.Object {
  var getFieldError: js.Function1[/* name */ NamePath, js.Array[String]] = js.native
  var getFieldValue: js.Function1[/* name */ NamePath, StoreValue] = js.native
  var getFieldsError: js.Function1[/* nameList */ js.UndefOr[js.Array[NamePath]], js.Array[FieldError]] = js.native
  var getFieldsValue: js.Function2[
    /* nameList */ js.UndefOr[js.Array[NamePath] | `true`], 
    /* filterFunc */ js.UndefOr[js.Function1[/* meta */ Meta, Boolean]], 
    Store
  ] = js.native
  var isFieldTouched: js.Function1[/* name */ NamePath, Boolean] = js.native
  var isFieldValidating: js.Function1[/* name */ NamePath, Boolean] = js.native
  var isFieldsTouched: js.Function2[
    /* nameList */ js.UndefOr[js.Array[NamePath]], 
    /* allFieldsTouched */ js.UndefOr[Boolean], 
    Boolean
  ] = js.native
  var isFieldsValidating: js.Function1[/* nameList */ js.Array[NamePath], Boolean] = js.native
  /**
    * Passed by field context props
    */
  var prefixName: js.UndefOr[InternalNamePath] = js.native
  var resetFields: js.Function1[/* fields */ js.UndefOr[js.Array[NamePath]], Unit] = js.native
  var setFields: js.Function1[/* fields */ js.Array[FieldData], Unit] = js.native
  var setFieldsValue: js.Function1[/* value */ Store, Unit] = js.native
  var submit: js.Function0[Unit] = js.native
  var validateFields: InternalValidateFields = js.native
  /**
    * Form component should register some content into store.
    * We pass the `HOOK_MARK` as key to avoid user call the function.
    */
  def getInternalHooks(secret: String): InternalHooks | Null = js.native
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
    def withGetFieldError(value: /* name */ NamePath => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFieldError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFieldValue(value: /* name */ NamePath => StoreValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFieldValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFieldsError(value: /* nameList */ js.UndefOr[js.Array[NamePath]] => js.Array[FieldError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFieldsError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFieldsValue(
      value: (/* nameList */ js.UndefOr[js.Array[NamePath] | `true`], /* filterFunc */ js.UndefOr[js.Function1[/* meta */ Meta, Boolean]]) => Store
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFieldsValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetInternalHooks(value: String => InternalHooks | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInternalHooks")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsFieldTouched(value: /* name */ NamePath => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFieldTouched")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsFieldValidating(value: /* name */ NamePath => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFieldValidating")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsFieldsTouched(
      value: (/* nameList */ js.UndefOr[js.Array[NamePath]], /* allFieldsTouched */ js.UndefOr[Boolean]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFieldsTouched")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsFieldsValidating(value: /* nameList */ js.Array[NamePath] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFieldsValidating")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResetFields(value: /* fields */ js.UndefOr[js.Array[NamePath]] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetFields")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFields(value: /* fields */ js.Array[FieldData] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFields")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFieldsValue(value: /* value */ Store => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFieldsValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubmit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValidateFields(
      value: (/* nameList */ js.UndefOr[js.Array[NamePath]], /* options */ js.UndefOr[ValidateOptions]) => js.Promise[Store]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateFields")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPrefixName(value: InternalNamePath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixName")(js.undefined)
        ret
    }
  }
  
}

