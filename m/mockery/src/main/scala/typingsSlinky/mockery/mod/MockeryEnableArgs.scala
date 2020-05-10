package typingsSlinky.mockery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockeryEnableArgs extends js.Object {
  var useCleanCache: js.UndefOr[Boolean] = js.native
  var warnOnReplace: js.UndefOr[Boolean] = js.native
  var warnOnUnregistered: js.UndefOr[Boolean] = js.native
}

object MockeryEnableArgs {
  @scala.inline
  def apply(): MockeryEnableArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MockeryEnableArgs]
  }
  @scala.inline
  implicit class MockeryEnableArgsOps[Self <: MockeryEnableArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUseCleanCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCleanCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCleanCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCleanCache")(js.undefined)
        ret
    }
    @scala.inline
    def withWarnOnReplace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnOnReplace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarnOnReplace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnOnReplace")(js.undefined)
        ret
    }
    @scala.inline
    def withWarnOnUnregistered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnOnUnregistered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarnOnUnregistered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnOnUnregistered")(js.undefined)
        ret
    }
  }
  
}

