package typingsSlinky.reduxForm.reduxFormMod

import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.reduxForm.mod.FormErrors
import typingsSlinky.reduxForm.mod.FormWarnings
import typingsSlinky.reduxForm.reducerMod.FormStateMap
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigProps[FormData, P, ErrorType] extends js.Object {
  var asyncBlurFields: js.UndefOr[js.Array[String]] = js.native
  var asyncChangeFields: js.UndefOr[js.Array[String]] = js.native
  var asyncValidate: js.UndefOr[
    js.Function4[
      /* values */ FormData, 
      /* dispatch */ Dispatch[_], 
      /* props */ P with (InjectedFormProps[FormData, P, ErrorType]), 
      /* blurredField */ String, 
      js.Promise[_]
    ]
  ] = js.native
  var destroyOnUnmount: js.UndefOr[Boolean] = js.native
  var enableReinitialize: js.UndefOr[Boolean] = js.native
  var forceUnregisterOnUnmount: js.UndefOr[Boolean] = js.native
  var form: String = js.native
  var getFormState: js.UndefOr[GetFormState] = js.native
  var immutableProps: js.UndefOr[js.Array[String]] = js.native
  var initialValues: js.UndefOr[Partial[FormData]] = js.native
  var keepDirtyOnReinitialize: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[
    js.Function4[
      /* values */ Partial[FormData], 
      /* dispatch */ Dispatch[_], 
      /* props */ P with (InjectedFormProps[FormData, P, ErrorType]), 
      /* previousValues */ Partial[FormData], 
      Unit
    ]
  ] = js.native
  var onSubmit: js.UndefOr[
    (FormSubmitHandler[FormData, P with (InjectedFormProps[FormData, P, ErrorType]), ErrorType]) | (SubmitHandler[FormData, P with (InjectedFormProps[FormData, P, ErrorType]), ErrorType])
  ] = js.native
  var onSubmitFail: js.UndefOr[
    js.Function4[
      /* errors */ js.UndefOr[FormErrors[FormData, ErrorType]], 
      /* dispatch */ Dispatch[_], 
      /* submitError */ js.Any, 
      /* props */ P with (InjectedFormProps[FormData, P, ErrorType]), 
      Unit
    ]
  ] = js.native
  var onSubmitSuccess: js.UndefOr[
    js.Function3[
      /* result */ js.Any, 
      /* dispatch */ Dispatch[_], 
      /* props */ P with (InjectedFormProps[FormData, P, ErrorType]), 
      Unit
    ]
  ] = js.native
  var persistentSubmitErrors: js.UndefOr[Boolean] = js.native
  var propNamespace: js.UndefOr[String] = js.native
  var pure: js.UndefOr[Boolean] = js.native
  var shouldAsyncValidate: js.UndefOr[js.Function1[/* params */ AsyncValidateCallback[FormData, ErrorType], Boolean]] = js.native
  var shouldError: js.UndefOr[js.Function1[/* params */ ValidateCallback[FormData, P, ErrorType], Boolean]] = js.native
  var shouldValidate: js.UndefOr[js.Function1[/* params */ ValidateCallback[FormData, P, ErrorType], Boolean]] = js.native
  var shouldWarn: js.UndefOr[js.Function1[/* params */ ValidateCallback[FormData, P, ErrorType], Boolean]] = js.native
  var submitAsSideEffect: js.UndefOr[Boolean] = js.native
  var touchOnBlur: js.UndefOr[Boolean] = js.native
  var touchOnChange: js.UndefOr[Boolean] = js.native
  var updateUnregisteredFields: js.UndefOr[Boolean] = js.native
  var validate: js.UndefOr[
    js.Function2[
      /* values */ FormData, 
      /* props */ P with (InjectedFormProps[FormData, P, ErrorType]), 
      FormErrors[FormData, ErrorType]
    ]
  ] = js.native
  var warn: js.UndefOr[
    js.Function2[
      /* values */ FormData, 
      /* props */ P with (InjectedFormProps[FormData, P, ErrorType]), 
      FormWarnings[FormData, Unit]
    ]
  ] = js.native
}

object ConfigProps {
  @scala.inline
  def apply[FormData, P, ErrorType](form: String): ConfigProps[FormData, P, ErrorType] = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigProps[FormData, P, ErrorType]]
  }
  @scala.inline
  implicit class ConfigPropsOps[Self[formdata, p, errortype] <: ConfigProps[formdata, p, errortype], FormData, P, ErrorType] (val x: Self[FormData, P, ErrorType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[FormData, P, ErrorType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[FormData, P, ErrorType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[FormData, P, ErrorType]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[FormData, P, ErrorType]) with Other]
    @scala.inline
    def withForm(value: String): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsyncBlurFields(value: js.Array[String]): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncBlurFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncBlurFields: Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncBlurFields")(js.undefined)
        ret
    }
    @scala.inline
    def withAsyncChangeFields(value: js.Array[String]): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncChangeFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncChangeFields: Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncChangeFields")(js.undefined)
        ret
    }
    @scala.inline
    def withAsyncValidate(
      value: (/* values */ FormData, /* dispatch */ Dispatch[_], /* props */ P with (InjectedFormProps[FormData, P, ErrorType]), /* blurredField */ String) => js.Promise[_]
    ): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncValidate")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAsyncValidate: Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncValidate")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroyOnUnmount(value: Boolean): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyOnUnmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestroyOnUnmount: Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyOnUnmount")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableReinitialize(value: Boolean): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableReinitialize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableReinitialize: Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableReinitialize")(js.undefined)
        ret
    }
    @scala.inline
    def withForceUnregisterOnUnmount(value: Boolean): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceUnregisterOnUnmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceUnregisterOnUnmount: Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceUnregisterOnUnmount")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFormState(value: /* state */ js.Any => FormStateMap): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetFormState: Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormState")(js.undefined)
        ret
    }
    @scala.inline
    def withImmutableProps(value: js.Array[String]): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immutableProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImmutableProps: Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immutableProps")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialValues(value: Partial[FormData]): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialValues: Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialValues")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepDirtyOnReinitialize(value: Boolean): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepDirtyOnReinitialize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepDirtyOnReinitialize: Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepDirtyOnReinitialize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(
      value: (/* values */ Partial[FormData], /* dispatch */ Dispatch[_], /* props */ P with (InjectedFormProps[FormData, P, ErrorType]), /* previousValues */ Partial[FormData]) => Unit
    ): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubmitFunction3(
      value: (FormData, /* dispatch */ Dispatch[js.Any], P with (InjectedFormProps[FormData, P, ErrorType])) => Unit | (FormErrors[FormData, ErrorType]) | js.Promise[js.Any]
    ): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOnSubmit(
      value: (FormSubmitHandler[FormData, P with (InjectedFormProps[FormData, P, ErrorType]), ErrorType]) | (SubmitHandler[FormData, P with (InjectedFormProps[FormData, P, ErrorType]), ErrorType])
    ): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSubmit: Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubmitFail(
      value: (/* errors */ js.UndefOr[FormErrors[FormData, ErrorType]], /* dispatch */ Dispatch[_], /* submitError */ js.Any, /* props */ P with (InjectedFormProps[FormData, P, ErrorType])) => Unit
    ): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmitFail")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnSubmitFail: Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmitFail")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubmitSuccess(
      value: (/* result */ js.Any, /* dispatch */ Dispatch[_], /* props */ P with (InjectedFormProps[FormData, P, ErrorType])) => Unit
    ): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmitSuccess")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnSubmitSuccess: Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmitSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistentSubmitErrors(value: Boolean): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentSubmitErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistentSubmitErrors: Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentSubmitErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withPropNamespace(value: String): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropNamespace: Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propNamespace")(js.undefined)
        ret
    }
    @scala.inline
    def withPure(value: Boolean): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPure: Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pure")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldAsyncValidate(value: /* params */ AsyncValidateCallback[FormData, ErrorType] => Boolean): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldAsyncValidate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShouldAsyncValidate: Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldAsyncValidate")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldError(value: /* params */ ValidateCallback[FormData, P, ErrorType] => Boolean): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShouldError: Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldError")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldValidate(value: /* params */ ValidateCallback[FormData, P, ErrorType] => Boolean): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldValidate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShouldValidate: Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldValidate")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldWarn(value: /* params */ ValidateCallback[FormData, P, ErrorType] => Boolean): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldWarn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShouldWarn: Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldWarn")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmitAsSideEffect(value: Boolean): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitAsSideEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmitAsSideEffect: Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitAsSideEffect")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchOnBlur(value: Boolean): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchOnBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchOnBlur: Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchOnBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchOnChange(value: Boolean): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchOnChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchOnChange: Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchOnChange")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateUnregisteredFields(value: Boolean): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateUnregisteredFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateUnregisteredFields: Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateUnregisteredFields")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate(
      value: (/* values */ FormData, /* props */ P with (InjectedFormProps[FormData, P, ErrorType])) => FormErrors[FormData, ErrorType]
    ): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutValidate: Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
    @scala.inline
    def withWarn(
      value: (/* values */ FormData, /* props */ P with (InjectedFormProps[FormData, P, ErrorType])) => FormWarnings[FormData, Unit]
    ): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutWarn: Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warn")(js.undefined)
        ret
    }
  }
  
}

