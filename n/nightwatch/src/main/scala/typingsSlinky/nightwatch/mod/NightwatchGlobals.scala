package typingsSlinky.nightwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NightwatchGlobals extends js.Object {
  /**
    * this controls whether to abort the test execution when an assertion failed and skip the rest
    * it's being used in waitFor commands and expect assertions
    * @default true
    */
  var abortOnAssertionFailure: js.UndefOr[Boolean] = js.native
  /**
    * controls the timeout time for async hooks. Expects the done() callback to be invoked within this time
    * or an error is thrown
    * @default 10000
    */
  var asyncHookTimeout: js.UndefOr[Double] = js.native
  /**
    * this will cause waitFor commands on elements to throw an error if multiple
    * elements are found using the given locate strategy and selector
    * @default true
    */
  var throwOnMultipleElementsReturned: js.UndefOr[Boolean] = js.native
  /**
    * this will overwrite the default polling interval (currently 500ms) for waitFor commands
    * and expect assertions that use retry
    * @default 300
    */
  var waitForConditionPollInterval: js.UndefOr[Double] = js.native
  /**
    * default timeout value in milliseconds for waitFor commands and implicit waitFor value for
    * expect assertions
    * @default 5000
    */
  var waitForConditionTimeout: js.UndefOr[Double] = js.native
}

object NightwatchGlobals {
  @scala.inline
  def apply(): NightwatchGlobals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NightwatchGlobals]
  }
  @scala.inline
  implicit class NightwatchGlobalsOps[Self <: NightwatchGlobals] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbortOnAssertionFailure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortOnAssertionFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbortOnAssertionFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortOnAssertionFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withAsyncHookTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncHookTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncHookTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncHookTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withThrowOnMultipleElementsReturned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwOnMultipleElementsReturned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrowOnMultipleElementsReturned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwOnMultipleElementsReturned")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForConditionPollInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForConditionPollInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForConditionPollInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForConditionPollInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForConditionTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForConditionTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForConditionTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForConditionTimeout")(js.undefined)
        ret
    }
  }
  
}

