package typingsSlinky.reactForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldApi extends js.Object {
  def getError(): FormError = js.native
  def getFieldName(): String = js.native
  def getSuccess(): FormError = js.native
  def getTouched(): Boolean = js.native
  def getValue(): FormValue = js.native
  def getWarning(): FormError = js.native
  def setError(error: FormError): Unit = js.native
  def setSuccess(success: FormError): Unit = js.native
  def setTouched(touched: Boolean): Unit = js.native
  def setValue(value: FormValue): Unit = js.native
  def setWarning(warning: FormError): Unit = js.native
}

object FieldApi {
  @scala.inline
  def apply(
    getError: () => FormError,
    getFieldName: () => String,
    getSuccess: () => FormError,
    getTouched: () => Boolean,
    getValue: () => FormValue,
    getWarning: () => FormError,
    setError: FormError => Unit,
    setSuccess: FormError => Unit,
    setTouched: Boolean => Unit,
    setValue: FormValue => Unit,
    setWarning: FormError => Unit
  ): FieldApi = {
    val __obj = js.Dynamic.literal(getError = js.Any.fromFunction0(getError), getFieldName = js.Any.fromFunction0(getFieldName), getSuccess = js.Any.fromFunction0(getSuccess), getTouched = js.Any.fromFunction0(getTouched), getValue = js.Any.fromFunction0(getValue), getWarning = js.Any.fromFunction0(getWarning), setError = js.Any.fromFunction1(setError), setSuccess = js.Any.fromFunction1(setSuccess), setTouched = js.Any.fromFunction1(setTouched), setValue = js.Any.fromFunction1(setValue), setWarning = js.Any.fromFunction1(setWarning))
    __obj.asInstanceOf[FieldApi]
  }
  @scala.inline
  implicit class FieldApiOps[Self <: FieldApi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetError(value: () => FormError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFieldName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFieldName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSuccess(value: () => FormError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSuccess")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTouched(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTouched")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValue(value: () => FormValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWarning(value: () => FormError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWarning")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetError(value: FormError => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSuccess(value: FormError => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTouched(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTouched")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetValue(value: FormValue => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetWarning(value: FormError => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWarning")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

