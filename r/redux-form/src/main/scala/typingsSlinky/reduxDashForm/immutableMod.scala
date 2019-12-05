package typingsSlinky.reduxDashForm

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.Component
import typingsSlinky.reduxDashForm.libActionsMod.FormAction
import typingsSlinky.reduxDashForm.libFieldMod.BaseFieldProps
import typingsSlinky.reduxDashForm.libFieldMod.GenericFieldHTMLAttributes
import typingsSlinky.reduxDashForm.libFormMod.FormProps
import typingsSlinky.reduxDashForm.libFormNameMod.FormNameProps
import typingsSlinky.reduxDashForm.libFormSectionMod.FormSectionProps
import typingsSlinky.reduxDashForm.libReducerMod.FormReducer
import typingsSlinky.reduxDashForm.libReducerMod.FormStateMap
import typingsSlinky.reduxDashForm.libReduxFormMod.ConfigProps
import typingsSlinky.reduxDashForm.libReduxFormMod.FormDecorator
import typingsSlinky.reduxDashForm.libSelectorsMod.BooleanSelector
import typingsSlinky.reduxDashForm.libSelectorsMod.DataSelector
import typingsSlinky.reduxDashForm.libSelectorsMod.ErrorSelector
import typingsSlinky.reduxDashForm.libSelectorsMod.FormOrFieldsBooleanSelector
import typingsSlinky.reduxDashForm.libSelectorsMod.NamesSelector
import typingsSlinky.reduxDashForm.reduxDashFormMod.FormErrors
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form/immutable", JSImport.Namespace)
@js.native
object immutableMod extends js.Object {
  @js.native
  class Field[P /* <: GenericFieldHTMLAttributes | BaseFieldProps[js.Object] */] ()
    extends typingsSlinky.reduxDashForm.libFieldMod.Field[P]
  
  @js.native
  class FieldArray[P, FieldValue] ()
    extends typingsSlinky.reduxDashForm.libFieldArrayMod.FieldArray[P, FieldValue]
  
  @js.native
  class Fields[P] ()
    extends typingsSlinky.reduxDashForm.libFieldsMod.Fields[P]
  
  @js.native
  class Form[FormData, P, ErrorType] ()
    extends Component[FormProps[FormData, P, ErrorType], js.Object, js.Any]
  
  @js.native
  class FormSection[P] ()
    extends Component[FormSectionProps[P] with P, js.Object, js.Any]
  
  @js.native
  class SubmissionError[FormData, ErrorType] protected ()
    extends typingsSlinky.reduxDashForm.reduxDashFormMod.SubmissionError[FormData, ErrorType] {
    def this(errors: FormErrors[FormData, ErrorType]) = this()
  }
  
  val FormName: ReactComponentClass[FormNameProps] = js.native
  val getFormAsyncErrors: ErrorSelector[js.Object, js.Object, String] = js.native
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
  val reducer: FormReducer = js.native
  def formValueSelector[State](form: String): js.Function2[/* state */ State, /* repeated */ String, _] = js.native
  def formValueSelector[State](form: String, getFormState: js.Function1[/* state */ State, FormStateMap]): js.Function2[/* state */ State, /* repeated */ String, _] = js.native
  def reduxForm[FormData, P, ErrorType](config: ConfigProps[FormData, P, ErrorType]): FormDecorator[FormData, P, Partial[ConfigProps[FormData, P, ErrorType]], ErrorType] = js.native
  def reduxForm[FormData, P, ErrorType](config: Partial[ConfigProps[FormData, P, ErrorType]]): FormDecorator[FormData, P, ConfigProps[FormData, P, ErrorType], ErrorType] = js.native
  def startSubmit(form: String): FormAction = js.native
  def stopSubmit(form: String): FormAction = js.native
  def stopSubmit(form: String, errors: FormErrors[_, _]): FormAction = js.native
}

