package typingsSlinky.formik.anon

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLFormElement
import slinky.core.SyntheticEvent
import slinky.web.SyntheticFocusEvent
import typingsSlinky.formik.typesMod.FieldHelperProps
import typingsSlinky.formik.typesMod.FieldInputProps
import typingsSlinky.formik.typesMod.FieldMetaProps
import typingsSlinky.formik.typesMod.FormikErrors
import typingsSlinky.formik.typesMod.FormikState
import typingsSlinky.formik.typesMod.FormikTouched
import typingsSlinky.formik.typesMod.FormikValues
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dirty[Values /* <: FormikValues */] extends js.Object {
  
  var dirty: Boolean = js.native
  
  var errors: FormikErrors[Values] = js.native
  
  def getFieldHelpers(name: String): FieldHelperProps[_] = js.native
  
  def getFieldMeta(name: String): FieldMetaProps[_] = js.native
  
  def getFieldProps(nameOrOptions: js.Any): FieldInputProps[_] = js.native
  
  def handleBlur(e: SyntheticFocusEvent[_]): Unit = js.native
  def handleBlur[T](fieldOrEvent: T): Unit | (js.Function1[/* e */ js.Any, Unit]) = js.native
  
  def handleChange(e: ChangeEvent[_]): Unit = js.native
  def handleChange[T_1](field: T_1): (js.Function1[/* e */ String | ChangeEvent[_], Unit]) | Unit = js.native
  
  def handleReset(e: js.Any): Unit = js.native
  
  def handleSubmit(): Unit = js.native
  def handleSubmit(e: SyntheticEvent[EventTarget with HTMLFormElement, Event]): Unit = js.native
  
  var initialErrors: FormikErrors[_] = js.native
  
  var initialStatus: js.Any = js.native
  
  var initialTouched: FormikTouched[_] = js.native
  
  var initialValues: Values = js.native
  
  var isSubmitting: Boolean = js.native
  
  var isValid: Boolean = js.native
  
  var isValidating: Boolean = js.native
  
  def registerField(name: String, hasValidate: js.Any): Unit = js.native
  
  def resetForm(): Unit = js.native
  def resetForm(nextState: Partial[FormikState[Values]]): Unit = js.native
  
  def setErrors(errors: FormikErrors[Values]): Unit = js.native
  
  def setFieldError(field: String): Unit = js.native
  def setFieldError(field: String, value: String): Unit = js.native
  
  def setFieldTouched(field: String): js.Any = js.native
  def setFieldTouched(field: String, touched: js.UndefOr[scala.Nothing], shouldValidate: Boolean): js.Any = js.native
  def setFieldTouched(field: String, touched: Boolean): js.Any = js.native
  def setFieldTouched(field: String, touched: Boolean, shouldValidate: Boolean): js.Any = js.native
  
  def setFieldValue(field: String, value: js.Any): js.Any = js.native
  def setFieldValue(field: String, value: js.Any, shouldValidate: Boolean): js.Any = js.native
  
  def setFormikState(stateOrCb: js.Function1[/* state */ FormikState[Values], FormikState[Values]]): Unit = js.native
  def setFormikState(stateOrCb: FormikState[Values]): Unit = js.native
  
  def setStatus(status: js.Any): Unit = js.native
  
  def setSubmitting(isSubmitting: Boolean): Unit = js.native
  
  def setTouched(touched: FormikTouched[Values]): js.Any = js.native
  def setTouched(touched: FormikTouched[Values], shouldValidate: Boolean): js.Any = js.native
  
  def setValues(values: Values): js.Any = js.native
  def setValues(values: Values, shouldValidate: Boolean): js.Any = js.native
  
  var status: js.UndefOr[js.Any] = js.native
  
  var submitCount: Double = js.native
  
  def submitForm(): js.Promise[_] = js.native
  
  var touched: FormikTouched[Values] = js.native
  
  def unregisterField(name: String): Unit = js.native
  
  def validateField(name: String): js.Promise[js.UndefOr[String | Unit]] = js.native
  
  def validateForm(): js.Promise[FormikErrors[Values]] = js.native
  def validateForm(values: Values): js.Promise[FormikErrors[Values]] = js.native
  
  var validateOnBlur: Boolean = js.native
  
  var validateOnChange: Boolean = js.native
  
  var validateOnMount: Boolean = js.native
  
  var values: Values = js.native
}
