package typingsSlinky.formik

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLFormElement
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.web.SyntheticFocusEvent
import typingsSlinky.formik.anon.Dirty
import typingsSlinky.formik.anon.EnableReinitialize
import typingsSlinky.formik.anon.Error
import typingsSlinky.formik.anon.Errors
import typingsSlinky.formik.typesMod.FormikActions
import typingsSlinky.formik.typesMod.FormikConfig
import typingsSlinky.formik.typesMod.FormikErrors
import typingsSlinky.formik.typesMod.FormikState
import typingsSlinky.formik.typesMod.FormikTouched
import typingsSlinky.formik.typesMod.FormikValues
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formik/dist/Formik", JSImport.Namespace)
@js.native
object formikMod extends js.Object {
  @js.native
  class Formik[Values] protected ()
    extends Component[FormikConfig[Values], FormikState[Values], js.Any] {
    def this(props: FormikConfig[Values]) = this()
    var didMount: Boolean = js.native
    var fields: StringDictionary[ReactComponentClass[_]] = js.native
    var hbCache: StringDictionary[js.Function1[/* e */ js.Any, Unit]] = js.native
    var hcCache: StringDictionary[js.Function1[/* e */ js.Any | ChangeEvent[_], Unit]] = js.native
    var initialValues: Values = js.native
    var validator: js.Any = js.native
    @JSName("componentDidMount")
    def componentDidMount_MFormik(): Unit = js.native
    @JSName("componentDidUpdate")
    def componentDidUpdate_MFormik(prevProps: FormikConfig[Values]): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MFormik(): Unit = js.native
    def executeSubmit(): Unit = js.native
    def getFormikActions(): FormikActions[Values] = js.native
    def getFormikBag(): Error[Values] = js.native
    def getFormikComputedProps(): Dirty[Values] = js.native
    def getFormikContext(): Errors[Values] = js.native
    def handleBlur(eventOrPath: String): Unit | (js.Function1[/* e */ js.UndefOr[SyntheticFocusEvent[_]], Unit]) = js.native
    def handleBlur(eventOrPath: SyntheticFocusEvent[_]): Unit | (js.Function1[/* e */ js.UndefOr[SyntheticFocusEvent[_]], Unit]) = js.native
    def handleChange(eventOrPath: String): Unit | (js.Function1[/* eventOrValue */ js.Any, Unit]) = js.native
    def handleChange(eventOrPath: ChangeEvent[_]): Unit | (js.Function1[/* eventOrValue */ js.Any, Unit]) = js.native
    def handleReset(): Unit = js.native
    def handleSubmit(): Unit = js.native
    def handleSubmit(e: SyntheticEvent[EventTarget with HTMLFormElement, Event]): Unit = js.native
    def registerField(name: String, Comp: ReactComponentClass[_]): Unit = js.native
    def resetForm(): Unit = js.native
    def resetForm(nextValues: Values): Unit = js.native
    def runFieldLevelValidations(values: FormikValues): js.Promise[FormikErrors[Values]] = js.native
    def runSingleFieldLevelValidation(field: String, value: String): js.Promise[String] = js.native
    def runSingleFieldLevelValidation(field: String, value: Unit): js.Promise[String] = js.native
    def runValidateHandler(values: FormikValues): js.Promise[FormikErrors[Values]] = js.native
    def runValidationSchema(values: FormikValues): js.Promise[js.Object] = js.native
    def runValidations(): js.Promise[FormikErrors[Values]] = js.native
    def runValidations(values: FormikValues): js.Promise[FormikErrors[Values]] = js.native
    def setError(error: js.Any): Unit = js.native
    def setErrors(errors: FormikErrors[Values]): Unit = js.native
    def setFieldError(field: String): Unit = js.native
    def setFieldError(field: String, message: String): Unit = js.native
    def setFieldTouched(field: String): Unit = js.native
    def setFieldTouched(field: String, touched: Boolean): Unit = js.native
    def setFieldTouched(field: String, touched: Boolean, shouldValidate: Boolean): Unit = js.native
    def setFieldValue(field: String, value: js.Any): Unit = js.native
    def setFieldValue(field: String, value: js.Any, shouldValidate: Boolean): Unit = js.native
    def setFormikState(s: js.Any): Unit = js.native
    def setFormikState(s: js.Any, callback: js.Function0[Unit]): Unit = js.native
    def setStatus(): Unit = js.native
    def setStatus(status: js.Any): Unit = js.native
    def setSubmitting(isSubmitting: Boolean): Unit = js.native
    def setTouched(touched: FormikTouched[Values]): Unit = js.native
    def setValues(values: Values): Unit = js.native
    def submitForm(): js.Promise[Unit] = js.native
    def unregisterField(name: String): Unit = js.native
    def validateField(field: String): js.Promise[js.Object] = js.native
    def validateForm(values: Values): js.Promise[FormikErrors[Values]] = js.native
  }
  
  def validateYupSchema[T /* <: FormikValues */](values: T, schema: js.Any): js.Promise[Partial[T]] = js.native
  def validateYupSchema[T /* <: FormikValues */](values: T, schema: js.Any, sync: Boolean): js.Promise[Partial[T]] = js.native
  def validateYupSchema[T /* <: FormikValues */](values: T, schema: js.Any, sync: Boolean, context: js.Any): js.Promise[Partial[T]] = js.native
  def yupToFormErrors[Values](yupError: js.Any): FormikErrors[Values] = js.native
  /* static members */
  @js.native
  object Formik extends js.Object {
    var defaultProps: EnableReinitialize = js.native
  }
  
}

