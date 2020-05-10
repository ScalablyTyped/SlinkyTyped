package typingsSlinky.emberTestHelpers.waitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaitOptions extends js.Object {
  var waitForAJAX: js.UndefOr[Boolean] = js.native
  var waitForTimers: js.UndefOr[Boolean] = js.native
  var waitForWaiters: js.UndefOr[Boolean] = js.native
}

object WaitOptions {
  @scala.inline
  def apply(): WaitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaitOptions]
  }
  @scala.inline
  implicit class WaitOptionsOps[Self <: WaitOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWaitForAJAX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForAJAX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForAJAX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForAJAX")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForTimers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForTimers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForTimers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForTimers")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForWaiters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForWaiters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForWaiters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForWaiters")(js.undefined)
        ret
    }
  }
  
}

