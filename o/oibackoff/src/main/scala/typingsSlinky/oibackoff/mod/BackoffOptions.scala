package typingsSlinky.oibackoff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackoffOptions extends js.Object {
  var algorithm: js.UndefOr[
    typingsSlinky.oibackoff.oibackoffStrings.incremental | typingsSlinky.oibackoff.oibackoffStrings.exponential | typingsSlinky.oibackoff.oibackoffStrings.fibonacci
  ] = js.native
  var delayRatio: js.UndefOr[Double] = js.native
  var maxDelay: js.UndefOr[Double] = js.native
  var maxTries: js.UndefOr[Double] = js.native
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
    def withAlgorithm(
      value: typingsSlinky.oibackoff.oibackoffStrings.incremental | typingsSlinky.oibackoff.oibackoffStrings.exponential | typingsSlinky.oibackoff.oibackoffStrings.fibonacci
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayRatio")(js.undefined)
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
    def withMaxTries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTries")(js.undefined)
        ret
    }
  }
  
}

