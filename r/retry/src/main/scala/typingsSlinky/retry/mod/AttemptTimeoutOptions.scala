package typingsSlinky.retry.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttemptTimeoutOptions extends js.Object {
  /**
    * Callback to execute when the operation takes longer than the timeout.
    */
  var callback: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * A timeout in milliseconds.
    */
  var timeout: js.UndefOr[Double] = js.native
}

object AttemptTimeoutOptions {
  @scala.inline
  def apply(): AttemptTimeoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttemptTimeoutOptions]
  }
  @scala.inline
  implicit class AttemptTimeoutOptionsOps[Self <: AttemptTimeoutOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

