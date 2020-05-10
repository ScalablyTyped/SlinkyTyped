package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.AnonDeviceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnBLECharacteristicValueChangeOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_OnBLECharacteristicValueChangeOptions: js.UndefOr[js.Function1[/* res */ AnonDeviceId, Unit]] = js.native
}

object OnBLECharacteristicValueChangeOptions {
  @scala.inline
  def apply(): OnBLECharacteristicValueChangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnBLECharacteristicValueChangeOptions]
  }
  @scala.inline
  implicit class OnBLECharacteristicValueChangeOptionsOps[Self <: OnBLECharacteristicValueChangeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuccess(value: /* res */ AnonDeviceId => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

