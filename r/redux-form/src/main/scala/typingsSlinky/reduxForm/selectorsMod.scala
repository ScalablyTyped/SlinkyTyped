package typingsSlinky.reduxForm

import typingsSlinky.reduxForm.mod.FormErrors
import typingsSlinky.reduxForm.reduxFormMod.GetFormState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-form/lib/selectors", JSImport.Namespace)
@js.native
object selectorsMod extends js.Object {
  
  val getFormAsyncErrors: ErrorSelector[js.Object, js.Object, String] = js.native
  
  val getFormError: ErrorSelector[js.Object, js.Object, String] = js.native
  
  val getFormInitialValues: DataSelector[js.Object, js.Object] = js.native
  
  val getFormMeta: DataSelector[js.Object, js.Object] = js.native
  
  val getFormNames: NamesSelector[js.Object] = js.native
  
  val getFormSubmitErrors: ErrorSelector[js.Object, js.Object, String] = js.native
  
  val getFormSyncErrors: ErrorSelector[js.Object, js.Object, String] = js.native
  
  val getFormSyncWarnings: ErrorSelector[js.Object, js.Object, String] = js.native
  
  val getFormValues: DataSelector[js.Object, js.Object] = js.native
  
  val hasSubmitFailed: BooleanSelector[js.Object] = js.native
  
  val hasSubmitSucceeded: BooleanSelector[js.Object] = js.native
  
  val isAsyncValidating: BooleanSelector[js.Object] = js.native
  
  val isDirty: FormOrFieldsBooleanSelector[js.Object] = js.native
  
  val isInvalid: BooleanSelector[js.Object] = js.native
  
  val isPristine: FormOrFieldsBooleanSelector[js.Object] = js.native
  
  val isSubmitting: BooleanSelector[js.Object] = js.native
  
  val isValid: BooleanSelector[js.Object] = js.native
  
  type BooleanSelector[State] = js.Function2[
    /* formName */ String, 
    /* getFormState */ js.UndefOr[GetFormState], 
    js.Function1[/* state */ State, Boolean]
  ]
  
  type DataSelector[FormData, State] = js.Function2[
    /* formName */ String, 
    /* getFormState */ js.UndefOr[GetFormState], 
    js.Function1[/* state */ State, FormData]
  ]
  
  type ErrorSelector[FormData, State, ErrorType] = js.Function2[
    /* formName */ String, 
    /* getFormState */ js.UndefOr[GetFormState], 
    js.Function1[/* state */ State, FormErrors[FormData, ErrorType]]
  ]
  
  type FormOrFieldsBooleanSelector[State] = js.Function2[
    /* formName */ String, 
    /* getFormState */ js.UndefOr[GetFormState], 
    js.Function2[/* state */ State, /* repeated */ String, Boolean]
  ]
  
  type NamesSelector[State] = js.Function1[
    /* getFormState */ js.UndefOr[GetFormState], 
    js.Function1[/* state */ State, js.Array[String]]
  ]
}
