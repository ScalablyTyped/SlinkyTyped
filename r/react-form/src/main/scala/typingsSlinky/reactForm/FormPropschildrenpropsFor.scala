package typingsSlinky.reactForm

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.reactForm.mod.FormApi
import typingsSlinky.reactForm.mod.FormErrors
import typingsSlinky.reactForm.mod.FormFunctionProps
import typingsSlinky.reactForm.mod.FormState
import typingsSlinky.reactForm.mod.FormValue
import typingsSlinky.reactForm.mod.FormValues
import typingsSlinky.reactForm.mod.RenderReturn
import typingsSlinky.reactForm.mod.ValidateValuesFunction
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-form.react-form.FormProps & {  children ? :(props : react-form.react-form.FormFunctionProps): react-form.react-form.RenderReturn | react-form.react-form.RenderReturn} */
@js.native
trait FormPropschildrenpropsFor extends js.Object {
  var asyncValidators: js.UndefOr[StringDictionary[js.Function1[/* value */ FormValue, js.Promise[_]]]] = js.native
  var children: js.UndefOr[(js.Function1[/* props */ FormFunctionProps, RenderReturn]) | RenderReturn] = js.native
  var component: js.UndefOr[ReactComponentClass[AnonFormApi]] = js.native
  var defaultValues: js.UndefOr[FormValues] = js.native
  var dontPreventDefault: js.UndefOr[Boolean] = js.native
  var dontValidateOnMount: js.UndefOr[Boolean] = js.native
  var formDidUpdate: js.UndefOr[js.Function1[/* formState */ FormState, Unit]] = js.native
  var getApi: js.UndefOr[js.Function1[/* formApi */ FormApi, Unit]] = js.native
  var onSubmit: js.UndefOr[
    js.Function3[
      /* values */ FormValues, 
      /* submissionEvent */ SyntheticEvent[Event_, _], 
      /* formApi */ FormApi, 
      Unit
    ]
  ] = js.native
  var onSubmitFailure: js.UndefOr[js.Function2[/* errors */ FormErrors, /* formApi */ FormApi, Unit]] = js.native
  var preSubmit: js.UndefOr[js.Function2[/* values */ FormValues, /* formApi */ FormApi, FormValues]] = js.native
  var preValidate: js.UndefOr[js.Function1[/* values */ FormValues, FormValues]] = js.native
  var render: js.UndefOr[js.Function1[/* formApi */ FormApi, RenderReturn]] = js.native
  var validateError: js.UndefOr[ValidateValuesFunction] = js.native
  var validateOnSubmit: js.UndefOr[Boolean] = js.native
  var validateSuccess: js.UndefOr[js.Function2[/* values */ FormValues, /* errors */ FormErrors, FormErrors]] = js.native
  var validateWarning: js.UndefOr[ValidateValuesFunction] = js.native
}

object FormPropschildrenpropsFor {
  @scala.inline
  def apply(): FormPropschildrenpropsFor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormPropschildrenpropsFor]
  }
  @scala.inline
  implicit class FormPropschildrenpropsForOps[Self <: FormPropschildrenpropsFor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsyncValidators(value: StringDictionary[js.Function1[/* value */ FormValue, js.Promise[_]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncValidators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncValidators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncValidators")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenFunction1(value: /* props */ FormFunctionProps => RenderReturn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChildren(value: (js.Function1[/* props */ FormFunctionProps, RenderReturn]) | RenderReturn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(null)
        ret
    }
    @scala.inline
    def withComponentFunctionComponent(value: ReactComponentClass[AnonFormApi]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentComponentClass(value: ReactComponentClass[AnonFormApi]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponent(value: ReactComponentClass[AnonFormApi]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValues(value: FormValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValues")(js.undefined)
        ret
    }
    @scala.inline
    def withDontPreventDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dontPreventDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDontPreventDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dontPreventDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withDontValidateOnMount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dontValidateOnMount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDontValidateOnMount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dontValidateOnMount")(js.undefined)
        ret
    }
    @scala.inline
    def withFormDidUpdate(value: /* formState */ FormState => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formDidUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormDidUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formDidUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withGetApi(value: /* formApi */ FormApi => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getApi")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetApi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getApi")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubmit(
      value: (/* values */ FormValues, /* submissionEvent */ SyntheticEvent[Event_, _], /* formApi */ FormApi) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubmitFailure(value: (/* errors */ FormErrors, /* formApi */ FormApi) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmitFailure")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSubmitFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmitFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withPreSubmit(value: (/* values */ FormValues, /* formApi */ FormApi) => FormValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preSubmit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPreSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withPreValidate(value: /* values */ FormValues => FormValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preValidate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPreValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preValidate")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(value: /* formApi */ FormApi => RenderReturn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateError(value: /* values */ FormValues => FormErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValidateError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateError")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateOnSubmit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnSubmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateOnSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateSuccess(value: (/* values */ FormValues, /* errors */ FormErrors) => FormErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateSuccess")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutValidateSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateWarning(value: /* values */ FormValues => FormErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateWarning")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValidateWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateWarning")(js.undefined)
        ret
    }
  }
  
}

