package typingsSlinky.cleaveJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cleave extends js.Object {
  def destroy(): Unit = js.native
  def getFormattedValue(): String = js.native
  def getISOFormatDate(): String = js.native
  def getRawValue(): String = js.native
  def setPhoneRegionCode(regionCode: String): Unit = js.native
  def setRawValue(value: String): Unit = js.native
}

object Cleave {
  @scala.inline
  def apply(
    destroy: () => Unit,
    getFormattedValue: () => String,
    getISOFormatDate: () => String,
    getRawValue: () => String,
    setPhoneRegionCode: String => Unit,
    setRawValue: String => Unit
  ): Cleave = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getFormattedValue = js.Any.fromFunction0(getFormattedValue), getISOFormatDate = js.Any.fromFunction0(getISOFormatDate), getRawValue = js.Any.fromFunction0(getRawValue), setPhoneRegionCode = js.Any.fromFunction1(setPhoneRegionCode), setRawValue = js.Any.fromFunction1(setRawValue))
    __obj.asInstanceOf[Cleave]
  }
  @scala.inline
  implicit class CleaveOps[Self <: Cleave] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFormattedValue(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormattedValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetISOFormatDate(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getISOFormatDate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRawValue(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRawValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetPhoneRegionCode(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPhoneRegionCode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRawValue(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRawValue")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

