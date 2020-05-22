package typingsSlinky.reduxForm

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reduxForm.actionsMod.FormAction
import typingsSlinky.reduxForm.anon.PartialInitializeOptions
import typingsSlinky.reduxForm.fieldMod.BaseFieldProps
import typingsSlinky.reduxForm.fieldMod.GenericFieldHTMLAttributes
import typingsSlinky.reduxForm.formMod.FormProps
import typingsSlinky.reduxForm.formNameMod.FormNameProps
import typingsSlinky.reduxForm.formSectionMod.FormSectionProps
import typingsSlinky.reduxForm.mod.FieldType
import typingsSlinky.reduxForm.mod.FormErrors
import typingsSlinky.reduxForm.mod.FormWarnings
import typingsSlinky.reduxForm.reducerMod.FormReducer
import typingsSlinky.reduxForm.reducerMod.FormStateMap
import typingsSlinky.reduxForm.reduxFormMod.ConfigProps
import typingsSlinky.reduxForm.reduxFormMod.FormDecorator
import typingsSlinky.reduxForm.selectorsMod.BooleanSelector
import typingsSlinky.reduxForm.selectorsMod.DataSelector
import typingsSlinky.reduxForm.selectorsMod.ErrorSelector
import typingsSlinky.reduxForm.selectorsMod.FormOrFieldsBooleanSelector
import typingsSlinky.reduxForm.selectorsMod.NamesSelector
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form/immutable", JSImport.Namespace)
@js.native
object immutableMod extends js.Object {
  @js.native
  class Field[P /* <: GenericFieldHTMLAttributes | BaseFieldProps[js.Object] */] ()
    extends typingsSlinky.reduxForm.fieldMod.Field[P]
  
  @js.native
  class FieldArray[P, FieldValue] ()
    extends typingsSlinky.reduxForm.fieldArrayMod.FieldArray[P, FieldValue]
  
  @js.native
  class Fields[P] ()
    extends typingsSlinky.reduxForm.fieldsMod.Fields[P]
  
  @js.native
  class Form[FormData, P, ErrorType] ()
    extends Component[FormProps[FormData, P, ErrorType], js.Object, js.Any]
  
  @js.native
  class FormSection[P] ()
    extends Component[FormSectionProps[P] with P, js.Object, js.Any]
  
  @js.native
  class SubmissionError[FormData, ErrorType] protected ()
    extends typingsSlinky.reduxForm.mod.SubmissionError[FormData, ErrorType] {
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
  def arrayInsert(form: String, field: String, index: Double, value: js.Any): FormAction = js.native
  def arrayMove(form: String, field: String, from: Double, to: Double): FormAction = js.native
  def arrayPop(form: String, field: String): FormAction = js.native
  def arrayPush(form: String, field: String, value: js.Any): FormAction = js.native
  def arrayRemove(form: String, field: String, index: Double): FormAction = js.native
  def arrayRemoveAll(form: String, field: String): FormAction = js.native
  def arrayShift(form: String, field: String): FormAction = js.native
  def arraySplice(form: String, field: String, index: Double, removeNum: Double, value: js.Any): FormAction = js.native
  def arraySwap(form: String, field: String, indexA: Double, indexB: Double): FormAction = js.native
  def arrayUnshift(form: String, field: String, value: js.Any): FormAction = js.native
  def autofill(form: String, field: String, value: js.Any): FormAction = js.native
  def blur(form: String, field: String, value: js.Any): FormAction = js.native
  def blur(form: String, field: String, value: js.Any, touch: Boolean): FormAction = js.native
  def change(form: String, field: String, value: js.Any): FormAction = js.native
  def change(form: String, field: String, value: js.Any, touch: Boolean): FormAction = js.native
  def change(form: String, field: String, value: js.Any, touch: Boolean, persistentSubmitErrors: Boolean): FormAction = js.native
  def clearFields(form: String, keepTouched: Boolean, persistentSubmitErrors: Boolean, fields: String*): FormAction = js.native
  def clearSubmitErrors(form: String): FormAction = js.native
  def destroy(form: String*): FormAction = js.native
  def focus(form: String, field: String): FormAction = js.native
  def formValueSelector[State](form: String): js.Function2[/* state */ State, /* repeated */ String, _] = js.native
  def formValueSelector[State](form: String, getFormState: js.Function1[/* state */ State, FormStateMap]): js.Function2[/* state */ State, /* repeated */ String, _] = js.native
  def initialize(form: String, data: js.Any): FormAction = js.native
  def initialize(form: String, data: js.Any, keepDirty: Boolean): FormAction = js.native
  def initialize(form: String, data: js.Any, keepDirty: Boolean, options: PartialInitializeOptions): FormAction = js.native
  def initialize(form: String, data: js.Any, options: PartialInitializeOptions): FormAction = js.native
  def reduxForm[FormData, P, ErrorType](config: ConfigProps[FormData, P, ErrorType]): FormDecorator[FormData, P, ErrorType] = js.native
  def reduxForm[FormData, P, ErrorType](config: Partial[ConfigProps[FormData, P, ErrorType]]): FormDecorator[FormData, P, ErrorType] = js.native
  def registerField(form: String, name: String, `type`: FieldType): FormAction = js.native
  def reset(form: String): FormAction = js.native
  def resetSection(form: String, sections: String*): FormAction = js.native
  def setSubmitFailed(form: String, fields: String*): FormAction = js.native
  def startAsyncValidation(form: String): FormAction = js.native
  def startSubmit(form: String): FormAction = js.native
  def stopSubmit(form: String): FormAction = js.native
  def stopSubmit(form: String, errors: FormErrors[_, _]): FormAction = js.native
  def touch(form: String, fields: String*): FormAction = js.native
  def unregisterField(form: String, name: String): FormAction = js.native
  def untouch(form: String, fields: String*): FormAction = js.native
  def updateSyncErrors[T](from: String, syncErrors: FormErrors[_, T], error: T): FormAction = js.native
  def updateSyncWarnings[T](form: String, syncWarnings: FormWarnings[_, T], warning: T): FormAction = js.native
}

