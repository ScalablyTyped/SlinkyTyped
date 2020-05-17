package typingsSlinky.pino.mod

import typingsSlinky.pino.anon.Label
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A data structure representing a log message, it represents the arguments passed to a logger statement, the level
  * at which they were logged and the hierarchy of child bindings.
  *
  * @description By default serializers are not applied to log output in the browser, but they will always be applied
  * to `messages` and `bindings` in the `logEvent` object. This allows  us to ensure a consistent format for all
  * values between server and client.
  */
@js.native
trait LogEvent extends js.Object {
  /**
    * Represents each child logger (if any), and the relevant bindings.
    *
    * @description For instance, given `logger.child({a: 1}).child({b: 2}).info({c: 3})`, the bindings array would
    * hold `[{a: 1}, {b: 2}]` and the `messages` array would be `[{c: 3}]`. The `bindings` are ordered according to
    * their position in the child logger hierarchy, with the lowest index being the top of the hierarchy.
    */
  var bindings: js.Array[Bindings] = js.native
  /**
    * Holds the `label` (for instance `info`), and the corresponding numerical `value` (for instance `30`).
    * This could be important in cases where client side level values and labels differ from server side.
    */
  var level: Label = js.native
  /**
    * All arguments passed to logger method, (for instance `logger.info('a', 'b', 'c')` would result in `messages`
    * array `['a', 'b', 'c']`).
    */
  var messages: js.Array[_] = js.native
  /**
    * Unix epoch timestamp in milliseconds, the time is taken from the moment the logger method is called.
    */
  var ts: Double = js.native
}

object LogEvent {
  @scala.inline
  def apply(bindings: js.Array[Bindings], level: Label, messages: js.Array[_], ts: Double): LogEvent = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  @scala.inline
  implicit class LogEventOps[Self <: LogEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindings(value: js.Array[Bindings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: Label): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessages(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

