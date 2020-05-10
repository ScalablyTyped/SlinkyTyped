package typingsSlinky.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofrls extends js.Object {
  def handle_notify(): Double = js.native
  def handle_subscribe(): Double = js.native
  def handle_subscribe_uri(wuri: String): Double = js.native
  def update_subs(uri: String, event: String): Double = js.native
}

object Typeofrls {
  @scala.inline
  def apply(
    handle_notify: () => Double,
    handle_subscribe: () => Double,
    handle_subscribe_uri: String => Double,
    update_subs: (String, String) => Double
  ): Typeofrls = {
    val __obj = js.Dynamic.literal(handle_notify = js.Any.fromFunction0(handle_notify), handle_subscribe = js.Any.fromFunction0(handle_subscribe), handle_subscribe_uri = js.Any.fromFunction1(handle_subscribe_uri), update_subs = js.Any.fromFunction2(update_subs))
    __obj.asInstanceOf[Typeofrls]
  }
  @scala.inline
  implicit class TypeofrlsOps[Self <: Typeofrls] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandle_notify(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle_notify")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHandle_subscribe(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle_subscribe")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHandle_subscribe_uri(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle_subscribe_uri")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate_subs(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update_subs")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

