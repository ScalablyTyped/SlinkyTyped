package typingsSlinky.grpcGrpcJs.backoffTimeoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackoffOptions extends js.Object {
  var initialDelay: js.UndefOr[Double] = js.native
  var jitter: js.UndefOr[Double] = js.native
  var maxDelay: js.UndefOr[Double] = js.native
  var multiplier: js.UndefOr[Double] = js.native
}

object BackoffOptions {
  @scala.inline
  def apply(): BackoffOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackoffOptions]
  }
  @scala.inline
  implicit class BackoffOptionsOps[Self <: BackoffOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withJitter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJitter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jitter")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiplier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiplier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiplier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiplier")(js.undefined)
        ret
    }
  }
  
}

