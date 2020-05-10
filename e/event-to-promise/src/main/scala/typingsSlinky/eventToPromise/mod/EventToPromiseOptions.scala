package typingsSlinky.eventToPromise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventToPromiseOptions extends js.Object {
  /**  If true, all parameters of the emitted events are put in an array which is used to resolve/reject the promise. (default: `false`) */
  var array: js.UndefOr[Boolean] = js.native
  /** The name of the event which rejects the promise. (default: `'error'`) */
  var error: js.UndefOr[String] = js.native
  /** Whether the error event should be ignored and not reject the promise. (default: `false`) */
  var ignoreErrors: js.UndefOr[Boolean] = js.native
}

object EventToPromiseOptions {
  @scala.inline
  def apply(): EventToPromiseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventToPromiseOptions]
  }
  @scala.inline
  implicit class EventToPromiseOptionsOps[Self <: EventToPromiseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArray(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreErrors")(js.undefined)
        ret
    }
  }
  
}

