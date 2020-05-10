package typingsSlinky.expoMixpanelAnalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpoMixpanelAnalytics extends js.Object {
  var token: String = js.native
  def identify(userId: String): Unit = js.native
  def people_append(props: Props[_]): Unit = js.native
  def people_delete_user(): Unit = js.native
  def people_increment(props: Props[Double]): Unit = js.native
  def people_set(props: Props[_]): Unit = js.native
  def people_set_once(props: Props[_]): Unit = js.native
  def people_union(props: Props[js.Array[String]]): Unit = js.native
  def people_unset(keys: js.Array[String]): Unit = js.native
  def reset(): Unit = js.native
  def track(name: String, props: Props[_]): Unit = js.native
}

object ExpoMixpanelAnalytics {
  @scala.inline
  def apply(
    identify: String => Unit,
    people_append: Props[_] => Unit,
    people_delete_user: () => Unit,
    people_increment: Props[Double] => Unit,
    people_set: Props[_] => Unit,
    people_set_once: Props[_] => Unit,
    people_union: Props[js.Array[String]] => Unit,
    people_unset: js.Array[String] => Unit,
    reset: () => Unit,
    token: String,
    track: (String, Props[_]) => Unit
  ): ExpoMixpanelAnalytics = {
    val __obj = js.Dynamic.literal(identify = js.Any.fromFunction1(identify), people_append = js.Any.fromFunction1(people_append), people_delete_user = js.Any.fromFunction0(people_delete_user), people_increment = js.Any.fromFunction1(people_increment), people_set = js.Any.fromFunction1(people_set), people_set_once = js.Any.fromFunction1(people_set_once), people_union = js.Any.fromFunction1(people_union), people_unset = js.Any.fromFunction1(people_unset), reset = js.Any.fromFunction0(reset), token = token.asInstanceOf[js.Any], track = js.Any.fromFunction2(track))
    __obj.asInstanceOf[ExpoMixpanelAnalytics]
  }
  @scala.inline
  implicit class ExpoMixpanelAnalyticsOps[Self <: ExpoMixpanelAnalytics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentify(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identify")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPeople_append(value: Props[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("people_append")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPeople_delete_user(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("people_delete_user")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPeople_increment(value: Props[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("people_increment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPeople_set(value: Props[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("people_set")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPeople_set_once(value: Props[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("people_set_once")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPeople_union(value: Props[js.Array[String]] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("people_union")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPeople_unset(value: js.Array[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("people_unset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrack(value: (String, Props[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

