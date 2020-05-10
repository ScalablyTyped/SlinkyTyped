package typingsSlinky.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofpresence extends js.Object {
  def handle_publish(): Double = js.native
  def handle_publish_uri(sender_uri: String): Double = js.native
  def handle_subscribe(): Double = js.native
  def handle_subscribe_uri(wuri: String): Double = js.native
  def pres_auth_status(watcher_uri: String, presentity_uri: String): Double = js.native
  def pres_has_subscribers(pres_uri: String, wevent: String): Double = js.native
  def pres_refresh_watchers(pres: String, event: String, `type`: Double): Double = js.native
  def pres_refresh_watchers_file(pres: String, event: String, `type`: Double, file_uri: String, filename: String): Double = js.native
  def pres_update_watchers(pres_uri: String, event: String): Double = js.native
}

object Typeofpresence {
  @scala.inline
  def apply(
    handle_publish: () => Double,
    handle_publish_uri: String => Double,
    handle_subscribe: () => Double,
    handle_subscribe_uri: String => Double,
    pres_auth_status: (String, String) => Double,
    pres_has_subscribers: (String, String) => Double,
    pres_refresh_watchers: (String, String, Double) => Double,
    pres_refresh_watchers_file: (String, String, Double, String, String) => Double,
    pres_update_watchers: (String, String) => Double
  ): Typeofpresence = {
    val __obj = js.Dynamic.literal(handle_publish = js.Any.fromFunction0(handle_publish), handle_publish_uri = js.Any.fromFunction1(handle_publish_uri), handle_subscribe = js.Any.fromFunction0(handle_subscribe), handle_subscribe_uri = js.Any.fromFunction1(handle_subscribe_uri), pres_auth_status = js.Any.fromFunction2(pres_auth_status), pres_has_subscribers = js.Any.fromFunction2(pres_has_subscribers), pres_refresh_watchers = js.Any.fromFunction3(pres_refresh_watchers), pres_refresh_watchers_file = js.Any.fromFunction5(pres_refresh_watchers_file), pres_update_watchers = js.Any.fromFunction2(pres_update_watchers))
    __obj.asInstanceOf[Typeofpresence]
  }
  @scala.inline
  implicit class TypeofpresenceOps[Self <: Typeofpresence] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandle_publish(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle_publish")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHandle_publish_uri(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle_publish_uri")(js.Any.fromFunction1(value))
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
    def withPres_auth_status(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pres_auth_status")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPres_has_subscribers(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pres_has_subscribers")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPres_refresh_watchers(value: (String, String, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pres_refresh_watchers")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withPres_refresh_watchers_file(value: (String, String, Double, String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pres_refresh_watchers_file")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withPres_update_watchers(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pres_update_watchers")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

