package typingsSlinky.knockback.Knockback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventWatcherOptions extends js.Object {
  var event_selector: String = js.native
  var key: js.UndefOr[String] = js.native
  def emitter(newEmitter: js.Any): Unit = js.native
  def update(newValue: js.Any): Unit = js.native
}

object EventWatcherOptions {
  @scala.inline
  def apply(emitter: js.Any => Unit, event_selector: String, update: js.Any => Unit): EventWatcherOptions = {
    val __obj = js.Dynamic.literal(emitter = js.Any.fromFunction1(emitter), event_selector = event_selector.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[EventWatcherOptions]
  }
  @scala.inline
  implicit class EventWatcherOptionsOps[Self <: EventWatcherOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmitter(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEvent_selector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
  }
  
}

