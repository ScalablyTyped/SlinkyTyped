package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeFunctionOptions extends js.Object {
  var abi: js.UndefOr[NativeABI] = js.native
  var exceptions: js.UndefOr[ExceptionsBehavior] = js.native
  var scheduling: js.UndefOr[SchedulingBehavior] = js.native
  var traps: js.UndefOr[CodeTraps] = js.native
}

object NativeFunctionOptions {
  @scala.inline
  def apply(): NativeFunctionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeFunctionOptions]
  }
  @scala.inline
  implicit class NativeFunctionOptionsOps[Self <: NativeFunctionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbi(value: NativeABI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abi")(js.undefined)
        ret
    }
    @scala.inline
    def withExceptions(value: ExceptionsBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExceptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceptions")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduling(value: SchedulingBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduling")(js.undefined)
        ret
    }
    @scala.inline
    def withTraps(value: CodeTraps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTraps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traps")(js.undefined)
        ret
    }
  }
  
}

