package typingsSlinky.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofsca extends js.Object {
  def call_info_update(update_mask: Double, uri_to: String, uri_from: String): Double = js.native
  def call_info_update_default(): Double = js.native
  def call_info_update_mask(umask: Double): Double = js.native
  def call_info_update_turi(umask: Double, sto: String): Double = js.native
  def handle_subscribe(): Double = js.native
}

object Typeofsca {
  @scala.inline
  def apply(
    call_info_update: (Double, String, String) => Double,
    call_info_update_default: () => Double,
    call_info_update_mask: Double => Double,
    call_info_update_turi: (Double, String) => Double,
    handle_subscribe: () => Double
  ): Typeofsca = {
    val __obj = js.Dynamic.literal(call_info_update = js.Any.fromFunction3(call_info_update), call_info_update_default = js.Any.fromFunction0(call_info_update_default), call_info_update_mask = js.Any.fromFunction1(call_info_update_mask), call_info_update_turi = js.Any.fromFunction2(call_info_update_turi), handle_subscribe = js.Any.fromFunction0(handle_subscribe))
    __obj.asInstanceOf[Typeofsca]
  }
  @scala.inline
  implicit class TypeofscaOps[Self <: Typeofsca] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCall_info_update(value: (Double, String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("call_info_update")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCall_info_update_default(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("call_info_update_default")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCall_info_update_mask(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("call_info_update_mask")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCall_info_update_turi(value: (Double, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("call_info_update_turi")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHandle_subscribe(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle_subscribe")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

