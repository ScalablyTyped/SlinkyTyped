package typingsSlinky.formik.withFormikMod

import typingsSlinky.formik.formikStrings.error
import typingsSlinky.formik.formikStrings.errors
import typingsSlinky.formik.formikStrings.isSubmitting
import typingsSlinky.formik.formikStrings.isValidating
import typingsSlinky.formik.formikStrings.status
import typingsSlinky.formik.formikStrings.submitCount
import typingsSlinky.formik.formikStrings.touched
import typingsSlinky.formik.formikStrings.values
import typingsSlinky.formik.typesMod.FormikErrors
import typingsSlinky.formik.typesMod.FormikState
import typingsSlinky.formik.typesMod.FormikTouched
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  props  :P} & formik.formik/dist/types.FormikActions<V> */
@js.native
trait FormikBag[P, V] extends js.Object {
  var props: P = js.native
  def resetForm(): Unit = js.native
  def resetForm(nextValues: V): Unit = js.native
  def setError(e: js.Any): Unit = js.native
  def setErrors(errors: FormikErrors[V]): Unit = js.native
  def setFieldError(field: /* keyof V */ String, message: String): Unit = js.native
  def setFieldTouched(field: /* keyof V */ String): Unit = js.native
  def setFieldTouched(field: /* keyof V */ String, isTouched: Boolean): Unit = js.native
  def setFieldTouched(field: /* keyof V */ String, isTouched: Boolean, shouldValidate: Boolean): Unit = js.native
  def setFieldValue(field: /* keyof V */ String, value: js.Any): Unit = js.native
  def setFieldValue(field: /* keyof V */ String, value: js.Any, shouldValidate: Boolean): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_error(f: js.Function2[/* prevState */ FormikState[V], /* props */ js.Any, Pick[FormikState[V], error]]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_error(
    f: js.Function2[/* prevState */ FormikState[V], /* props */ js.Any, Pick[FormikState[V], error]],
    callback: js.Function0[_]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_error(state: Pick[FormikState[V], error]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_error(state: Pick[FormikState[V], error], callback: js.Function0[_]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_errors(f: js.Function2[/* prevState */ FormikState[V], /* props */ js.Any, Pick[FormikState[V], errors]]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_errors(
    f: js.Function2[/* prevState */ FormikState[V], /* props */ js.Any, Pick[FormikState[V], errors]],
    callback: js.Function0[_]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_errors(state: Pick[FormikState[V], errors]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_errors(state: Pick[FormikState[V], errors], callback: js.Function0[_]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_isSubmitting(
    f: js.Function2[
      /* prevState */ FormikState[V], 
      /* props */ js.Any, 
      Pick[FormikState[V], isSubmitting]
    ]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_isSubmitting(
    f: js.Function2[
      /* prevState */ FormikState[V], 
      /* props */ js.Any, 
      Pick[FormikState[V], isSubmitting]
    ],
    callback: js.Function0[_]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_isSubmitting(state: Pick[FormikState[V], isSubmitting]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_isSubmitting(state: Pick[FormikState[V], isSubmitting], callback: js.Function0[_]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_isValidating(
    f: js.Function2[
      /* prevState */ FormikState[V], 
      /* props */ js.Any, 
      Pick[FormikState[V], isValidating]
    ]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_isValidating(
    f: js.Function2[
      /* prevState */ FormikState[V], 
      /* props */ js.Any, 
      Pick[FormikState[V], isValidating]
    ],
    callback: js.Function0[_]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_isValidating(state: Pick[FormikState[V], isValidating]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_isValidating(state: Pick[FormikState[V], isValidating], callback: js.Function0[_]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_status(f: js.Function2[/* prevState */ FormikState[V], /* props */ js.Any, Pick[FormikState[V], status]]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_status(
    f: js.Function2[/* prevState */ FormikState[V], /* props */ js.Any, Pick[FormikState[V], status]],
    callback: js.Function0[_]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_status(state: Pick[FormikState[V], status]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_status(state: Pick[FormikState[V], status], callback: js.Function0[_]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_submitCount(
    f: js.Function2[
      /* prevState */ FormikState[V], 
      /* props */ js.Any, 
      Pick[FormikState[V], submitCount]
    ]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_submitCount(
    f: js.Function2[
      /* prevState */ FormikState[V], 
      /* props */ js.Any, 
      Pick[FormikState[V], submitCount]
    ],
    callback: js.Function0[_]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_submitCount(state: Pick[FormikState[V], submitCount]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_submitCount(state: Pick[FormikState[V], submitCount], callback: js.Function0[_]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_touched(f: js.Function2[/* prevState */ FormikState[V], /* props */ js.Any, Pick[FormikState[V], touched]]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_touched(
    f: js.Function2[/* prevState */ FormikState[V], /* props */ js.Any, Pick[FormikState[V], touched]],
    callback: js.Function0[_]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_touched(state: Pick[FormikState[V], touched]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_touched(state: Pick[FormikState[V], touched], callback: js.Function0[_]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_values(f: js.Function2[/* prevState */ FormikState[V], /* props */ js.Any, Pick[FormikState[V], values]]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_values(
    f: js.Function2[/* prevState */ FormikState[V], /* props */ js.Any, Pick[FormikState[V], values]],
    callback: js.Function0[_]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_values(state: Pick[FormikState[V], values]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_values(state: Pick[FormikState[V], values], callback: js.Function0[_]): Unit = js.native
  def setStatus(): Unit = js.native
  def setStatus(status: js.Any): Unit = js.native
  def setSubmitting(isSubmitting: Boolean): Unit = js.native
  def setTouched(touched: FormikTouched[V]): Unit = js.native
  def setValues(values: V): Unit = js.native
  def submitForm(): Unit = js.native
  def validateField(field: String): Unit = js.native
  def validateForm(): js.Promise[FormikErrors[V]] = js.native
  def validateForm(values: js.Any): js.Promise[FormikErrors[V]] = js.native
}

