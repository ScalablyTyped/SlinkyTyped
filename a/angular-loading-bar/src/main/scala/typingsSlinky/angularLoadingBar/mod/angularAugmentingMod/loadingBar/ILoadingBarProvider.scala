package typingsSlinky.angularLoadingBar.mod.angularAugmentingMod.loadingBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILoadingBarProvider extends js.Object {
  /**
    * Give illusion that there's always progress
    */
  var autoIncrement: js.UndefOr[Boolean] = js.native
  /**
    * Turn the loading bar on or off
    */
  var includeBar: js.UndefOr[Boolean] = js.native
  /**
    * Turn the spinner on or off
    */
  var includeSpinner: js.UndefOr[Boolean] = js.native
  /**
    * Latency Threshold
    */
  var latencyThreshold: js.UndefOr[Double] = js.native
  /**
    * Loading bar template
    */
  var loadingBarTemplate: js.UndefOr[String] = js.native
  /**
    * HTML element selector of parent
    */
  var parentSelector: js.UndefOr[String] = js.native
  /**
    * HTML template
    */
  var spinnerTemplate: js.UndefOr[String] = js.native
  /**
    * Starting size
    */
  var startSize: js.UndefOr[Double] = js.native
  /**
    * Complete the loading bar
    */
  def complete(): Unit = js.native
  /**
    * Increment the loading bar
    */
  def inc(): Unit = js.native
  /**
    * Set the percentage completed
    * @param {number} n - number between 0 and 1
    */
  def set(n: Double): Unit = js.native
  /**
    * Broadcast the start event
    */
  def start(): Unit = js.native
  /**
    * Get the percentage completed
    * @returns {number}
    */
  def status(): Double = js.native
}

object ILoadingBarProvider {
  @scala.inline
  def apply(
    complete: () => Unit,
    inc: () => Unit,
    set: Double => Unit,
    start: () => Unit,
    status: () => Double
  ): ILoadingBarProvider = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), inc = js.Any.fromFunction0(inc), set = js.Any.fromFunction1(set), start = js.Any.fromFunction0(start), status = js.Any.fromFunction0(status))
    __obj.asInstanceOf[ILoadingBarProvider]
  }
  @scala.inline
  implicit class ILoadingBarProviderOps[Self <: ILoadingBarProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInc(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inc")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStatus(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAutoIncrement(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoIncrement")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeBar")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeSpinner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSpinner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeSpinner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSpinner")(js.undefined)
        ret
    }
    @scala.inline
    def withLatencyThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latencyThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatencyThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latencyThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingBarTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingBarTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingBarTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingBarTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withParentSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinnerTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinnerTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withStartSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startSize")(js.undefined)
        ret
    }
  }
  
}

