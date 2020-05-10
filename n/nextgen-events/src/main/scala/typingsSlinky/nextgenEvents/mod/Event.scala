package typingsSlinky.nextgenEvents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  var args: js.Any = js.native
  var emitter: NextGenEvents = js.native
  var interrupt: Null = js.native
  var mice: Double = js.native
  var name: String = js.native
  var sync: Boolean = js.native
  def callback(interrupt: js.Any): js.Any = js.native
}

object Event {
  @scala.inline
  def apply(
    args: js.Any,
    callback: js.Any => js.Any,
    emitter: NextGenEvents,
    interrupt: Null,
    mice: Double,
    name: String,
    sync: Boolean
  ): Event = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], callback = js.Any.fromFunction1(callback), emitter = emitter.asInstanceOf[js.Any], interrupt = interrupt.asInstanceOf[js.Any], mice = mice.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallback(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEmitter(value: NextGenEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterrupt(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interrupt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMice(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

