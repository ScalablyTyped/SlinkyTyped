package typingsSlinky.formik.typesMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLFormElement
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.web.SyntheticFocusEvent
import typingsSlinky.formik.formikStrings.error
import typingsSlinky.formik.formikStrings.errors
import typingsSlinky.formik.formikStrings.isSubmitting
import typingsSlinky.formik.formikStrings.isValidating
import typingsSlinky.formik.formikStrings.status
import typingsSlinky.formik.formikStrings.submitCount
import typingsSlinky.formik.formikStrings.touched
import typingsSlinky.formik.formikStrings.values
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined formik.formik/dist/types.FormikProps<Values> & std.Pick<formik.formik/dist/types.FormikConfig<Values>, 'validate' | 'validationSchema'> */
@js.native
trait FormikContext[Values] extends js.Object {
  val dirty: Boolean = js.native
  var enableReinitialize: js.UndefOr[Boolean] = js.native
  var error: js.UndefOr[js.Any] = js.native
  var errors: FormikErrors[Values] = js.native
  val initialValues: Values = js.native
  var isInitialValid: js.UndefOr[Boolean | (js.Function1[/* props */ js.Object, Boolean])] = js.native
  var isSubmitting: Boolean = js.native
  val isValid: Boolean = js.native
  var isValidating: Boolean = js.native
  var status: js.UndefOr[js.Any] = js.native
  var submitCount: Double = js.native
  var touched: FormikTouched[Values] = js.native
  var validate: js.UndefOr[
    js.Function1[/* values */ Values, Unit | js.Object | js.Promise[FormikErrors[Values]]]
  ] = js.native
  var validateOnBlur: js.UndefOr[Boolean] = js.native
  var validateOnChange: js.UndefOr[Boolean] = js.native
  var validationSchema: js.UndefOr[js.Any | js.Function0[_]] = js.native
  var values: Values = js.native
  def handleBlur(e: SyntheticFocusEvent[_]): Unit = js.native
  def handleBlur[T](fieldOrEvent: T): Unit | (js.Function1[/* e */ js.Any, Unit]) = js.native
  def handleChange(e: ChangeEvent[_]): Unit = js.native
  def handleChange[T](field: T): (js.Function1[/* e */ js.Any | ChangeEvent[_], Unit]) | Unit = js.native
  def handleReset(): Unit = js.native
  def handleSubmit(): Unit = js.native
  def handleSubmit(e: SyntheticEvent[EventTarget with HTMLFormElement, Event]): Unit = js.native
  def registerField(name: String, Comp: ReactComponentClass[_]): Unit = js.native
  def resetForm(): Unit = js.native
  def resetForm(nextValues: Values): Unit = js.native
  def setError(e: js.Any): Unit = js.native
  def setErrors(errors: FormikErrors[Values]): Unit = js.native
  def setFieldError(field: /* keyof Values */ String, message: String): Unit = js.native
  def setFieldTouched(field: /* keyof Values */ String): Unit = js.native
  def setFieldTouched(field: /* keyof Values */ String, isTouched: Boolean): Unit = js.native
  def setFieldTouched(field: /* keyof Values */ String, isTouched: Boolean, shouldValidate: Boolean): Unit = js.native
  def setFieldValue(field: /* keyof Values */ String, value: js.Any): Unit = js.native
  def setFieldValue(field: /* keyof Values */ String, value: js.Any, shouldValidate: Boolean): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_error(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], error]
    ]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_error(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], error]
    ],
    callback: js.Function0[_]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_error(state: Pick[FormikState[Values], error]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_error(state: Pick[FormikState[Values], error], callback: js.Function0[_]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_errors(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], errors]
    ]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_errors(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], errors]
    ],
    callback: js.Function0[_]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_errors(state: Pick[FormikState[Values], errors]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_errors(state: Pick[FormikState[Values], errors], callback: js.Function0[_]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_isSubmitting(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], isSubmitting]
    ]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_isSubmitting(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], isSubmitting]
    ],
    callback: js.Function0[_]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_isSubmitting(state: Pick[FormikState[Values], isSubmitting]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_isSubmitting(state: Pick[FormikState[Values], isSubmitting], callback: js.Function0[_]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_isValidating(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], isValidating]
    ]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_isValidating(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], isValidating]
    ],
    callback: js.Function0[_]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_isValidating(state: Pick[FormikState[Values], isValidating]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_isValidating(state: Pick[FormikState[Values], isValidating], callback: js.Function0[_]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_status(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], status]
    ]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_status(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], status]
    ],
    callback: js.Function0[_]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_status(state: Pick[FormikState[Values], status]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_status(state: Pick[FormikState[Values], status], callback: js.Function0[_]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_submitCount(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], submitCount]
    ]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_submitCount(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], submitCount]
    ],
    callback: js.Function0[_]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_submitCount(state: Pick[FormikState[Values], submitCount]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_submitCount(state: Pick[FormikState[Values], submitCount], callback: js.Function0[_]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_touched(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], touched]
    ]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_touched(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], touched]
    ],
    callback: js.Function0[_]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_touched(state: Pick[FormikState[Values], touched]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_touched(state: Pick[FormikState[Values], touched], callback: js.Function0[_]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_values(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], values]
    ]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_values(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], values]
    ],
    callback: js.Function0[_]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_values(state: Pick[FormikState[Values], values]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_values(state: Pick[FormikState[Values], values], callback: js.Function0[_]): Unit = js.native
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

