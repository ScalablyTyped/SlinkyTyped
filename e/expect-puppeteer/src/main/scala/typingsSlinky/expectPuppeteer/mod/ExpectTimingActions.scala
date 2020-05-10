package typingsSlinky.expectPuppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configures how to poll for an element.
  */
@js.native
trait ExpectTimingActions extends js.Object {
  /**
    * delay to pass to the puppeteer element.type API
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * An interval at which the pageFunction is executed. Defaults to "raf".
    */
  var polling: js.UndefOr[ExpectPolling] = js.native
  /**
    * Maximum time to wait for in milliseconds. Defaults to 500.
    */
  var timeout: js.UndefOr[Double] = js.native
}

object ExpectTimingActions {
  @scala.inline
  def apply(): ExpectTimingActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpectTimingActions]
  }
  @scala.inline
  implicit class ExpectTimingActionsOps[Self <: ExpectTimingActions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withPolling(value: ExpectPolling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polling")(js.undefined)
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

