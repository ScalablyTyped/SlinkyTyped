package typingsSlinky.karmaJasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined jasmine.jasmine.EnvConfiguration & {  timeoutInterval ? :number} */
@js.native
trait EnvConfigurationtimeoutIn extends js.Object {
  var Promise: js.UndefOr[js.Function] = js.native
  var failFast: js.UndefOr[Boolean] = js.native
  var failSpecWithNoExpectations: js.UndefOr[Boolean] = js.native
  var hideDisabled: js.UndefOr[Boolean] = js.native
  var oneFailurePerSpec: js.UndefOr[Boolean] = js.native
  var random: js.UndefOr[Boolean] = js.native
  var seed: js.UndefOr[Double] = js.native
  var specFilter: js.UndefOr[js.Function] = js.native
  /** @deprecated undocumented to be removed */
  var timeoutInterval: js.UndefOr[Double] = js.native
}

object EnvConfigurationtimeoutIn {
  @scala.inline
  def apply(): EnvConfigurationtimeoutIn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvConfigurationtimeoutIn]
  }
  @scala.inline
  implicit class EnvConfigurationtimeoutInOps[Self <: EnvConfigurationtimeoutIn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPromise(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Promise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Promise")(js.undefined)
        ret
    }
    @scala.inline
    def withFailFast(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failFast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailFast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failFast")(js.undefined)
        ret
    }
    @scala.inline
    def withFailSpecWithNoExpectations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failSpecWithNoExpectations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailSpecWithNoExpectations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failSpecWithNoExpectations")(js.undefined)
        ret
    }
    @scala.inline
    def withHideDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOneFailurePerSpec(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneFailurePerSpec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOneFailurePerSpec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneFailurePerSpec")(js.undefined)
        ret
    }
    @scala.inline
    def withRandom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("random")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRandom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("random")(js.undefined)
        ret
    }
    @scala.inline
    def withSeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecFilter(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutInterval")(js.undefined)
        ret
    }
  }
  
}

