package typingsSlinky.formik

import org.scalajs.dom.raw.HTMLFormElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticFocusEvent
import typingsSlinky.formik.distTypesMod.FormikErrors
import typingsSlinky.formik.distTypesMod.FormikState
import typingsSlinky.formik.distTypesMod.FormikTouched
import typingsSlinky.formik.formikStrings.error
import typingsSlinky.formik.formikStrings.errors
import typingsSlinky.formik.formikStrings.isSubmitting
import typingsSlinky.formik.formikStrings.isValidating
import typingsSlinky.formik.formikStrings.status
import typingsSlinky.formik.formikStrings.submitCount
import typingsSlinky.formik.formikStrings.touched
import typingsSlinky.formik.formikStrings.values
import typingsSlinky.react.reactMod.ChangeEvent
import typingsSlinky.react.reactMod.FocusEvent
import typingsSlinky.react.reactMod.FormEvent
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Callback[Values] extends js.Object {
  var dirty: Boolean = js.native
  var error: js.UndefOr[js.Any] = js.native
  var errors: FormikErrors[Values] = js.native
  var initialValues: Values = js.native
  var isSubmitting: Boolean = js.native
  var isValid: Boolean = js.native
  var isValidating: Boolean = js.native
  var status: js.UndefOr[js.Any] = js.native
  var submitCount: Double = js.native
  var touched: FormikTouched[Values] = js.native
  var validateOnBlur: js.UndefOr[Boolean] = js.native
  var validateOnChange: js.UndefOr[Boolean] = js.native
  var values: Values = js.native
  def handleBlur(eventOrPath: String): Unit | (js.Function1[/* e */ js.UndefOr[SyntheticFocusEvent[_]], Unit]) = js.native
  def handleBlur(eventOrPath: FocusEvent[_]): Unit | (js.Function1[/* e */ js.UndefOr[SyntheticFocusEvent[_]], Unit]) = js.native
  def handleChange(eventOrPath: String): Unit | (js.Function1[/* eventOrValue */ js.Any, Unit]) = js.native
  def handleChange(eventOrPath: ChangeEvent[_]): Unit | (js.Function1[/* eventOrValue */ js.Any, Unit]) = js.native
  def handleReset(): Unit = js.native
  def handleSubmit(): Unit = js.native
  def handleSubmit(e: FormEvent[HTMLFormElement]): Unit = js.native
  def registerField(name: String, Comp: ReactComponentClass[_]): Unit = js.native
  def resetForm(): Unit = js.native
  def resetForm(nextValues: Values): Unit = js.native
  def setError(e: js.Any): Unit = js.native
  def setErrors(errors: FormikErrors[Values]): Unit = js.native
  def setFieldError(field: String, message: String): Unit = js.native
  def setFieldTouched(field: String): Unit = js.native
  def setFieldTouched(field: String, isTouched: js.UndefOr[scala.Nothing], shouldValidate: Boolean): Unit = js.native
  def setFieldTouched(field: String, isTouched: Boolean): Unit = js.native
  def setFieldTouched(field: String, isTouched: Boolean, shouldValidate: Boolean): Unit = js.native
  def setFieldValue(field: String, value: js.Any): Unit = js.native
  def setFieldValue(field: String, value: js.Any, shouldValidate: Boolean): Unit = js.native
  def setFormikState[K /* <: error | values | errors | touched | isValidating | isSubmitting | status | submitCount */](
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], K]
    ]
  ): Unit = js.native
  def setFormikState[K /* <: error | values | errors | touched | isValidating | isSubmitting | status | submitCount */](
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], K]
    ],
    callback: js.Function0[_]
  ): Unit = js.native
  def setFormikState[K /* <: error | values | errors | touched | isValidating | isSubmitting | status | submitCount */](state: Pick[FormikState[Values], K]): Unit = js.native
  def setFormikState[K /* <: error | values | errors | touched | isValidating | isSubmitting | status | submitCount */](state: Pick[FormikState[Values], K], callback: js.Function0[_]): Unit = js.native
  def setStatus(): Unit = js.native
  def setStatus(status: js.Any): Unit = js.native
  def setSubmitting(isSubmitting: Boolean): Unit = js.native
  def setTouched(touched: FormikTouched[Values]): Unit = js.native
  def setValues(values: Values): Unit = js.native
  def submitForm(): Unit = js.native
  def unregisterField(name: String): Unit = js.native
  def validateField(field: String): Unit = js.native
  def validateForm(): js.Promise[FormikErrors[Values]] = js.native
  def validateForm(values: js.Any): js.Promise[FormikErrors[Values]] = js.native
}

