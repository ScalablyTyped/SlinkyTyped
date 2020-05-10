package typingsSlinky.hapiShot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClose extends js.Object {
  /** whether the request will emit a close event. Defaults to undefined, meaning no close event will be emitted. */
  var close: js.UndefOr[Boolean] = js.native
  /** indicates whether the request will fire an end event. Defaults to undefined, meaning an end event will fire. */
  var end: js.UndefOr[Boolean] = js.native
  /** whether the request will emit an error event. Defaults to undefined, meaning no error event will be emitted. If set to true, the emitted error will have a message of 'Simulated'. */
  var error: js.UndefOr[Boolean] = js.native
  /** indicates whether the request payload will be split into chunks. Defaults to `undefined`, meaning payload will not be chunked. */
  var split: js.UndefOr[Boolean] = js.native
}

object AnonClose {
  @scala.inline
  def apply(): AnonClose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonClose]
  }
  @scala.inline
  implicit class AnonCloseOps[Self <: AnonClose] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: Boolean): Self = {
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
    def withSplit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("split")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("split")(js.undefined)
        ret
    }
  }
  
}

