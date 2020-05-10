package typingsSlinky.retry.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationOptions extends TimeoutsOptions {
  /**
    * Whether to retry forever.
    * @default false
    */
  var forever: js.UndefOr[Boolean] = js.native
  /**
    * The maximum time (in milliseconds) that the retried operation is allowed to run.
    * @default Infinity
    */
  var maxRetryTime: js.UndefOr[Double] = js.native
  /**
    * Whether to [unref](https://nodejs.org/api/timers.html#timers_unref) the setTimeout's.
    * @default false
    */
  var unref: js.UndefOr[Boolean] = js.native
}

object OperationOptions {
  @scala.inline
  def apply(): OperationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationOptions]
  }
  @scala.inline
  implicit class OperationOptionsOps[Self <: OperationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForever(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forever")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForever: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forever")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRetryTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetryTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRetryTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetryTime")(js.undefined)
        ret
    }
    @scala.inline
    def withUnref(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unref")(js.undefined)
        ret
    }
  }
  
}

