package typingsSlinky.reduxBootstrap.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevToolsOptions extends js.Object {
  var actionBlacklist: js.UndefOr[String | js.Array[String]] = js.native
  var actionCreators: js.UndefOr[js.Array[_] | js.Object] = js.native
  var actionSanitizer: js.UndefOr[js.Function] = js.native
  var actionWhitelist: js.UndefOr[String | js.Array[String]] = js.native
  var autoPause: js.UndefOr[Boolean] = js.native
  var features: js.UndefOr[js.Object] = js.native
  var latency: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var pauseActionType: js.UndefOr[String] = js.native
  var predicate: js.UndefOr[js.Function] = js.native
  var serialize: js.UndefOr[Boolean | js.Object] = js.native
  var shouldHotReload: js.UndefOr[Boolean] = js.native
  var shouldRecordChanges: js.UndefOr[Boolean] = js.native
  var shouldStartLocked: js.UndefOr[Boolean] = js.native
  var stateSanitizer: js.UndefOr[js.Function] = js.native
}

object DevToolsOptions {
  @scala.inline
  def apply(): DevToolsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevToolsOptions]
  }
  @scala.inline
  implicit class DevToolsOptionsOps[Self <: DevToolsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionBlacklist(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionBlacklist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionBlacklist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionBlacklist")(js.undefined)
        ret
    }
    @scala.inline
    def withActionCreators(value: js.Array[_] | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionCreators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionCreators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionCreators")(js.undefined)
        ret
    }
    @scala.inline
    def withActionSanitizer(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionSanitizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionSanitizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionSanitizer")(js.undefined)
        ret
    }
    @scala.inline
    def withActionWhitelist(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionWhitelist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionWhitelist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionWhitelist")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoPause(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPause")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatures(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(js.undefined)
        ret
    }
    @scala.inline
    def withLatency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latency")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPauseActionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseActionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPauseActionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseActionType")(js.undefined)
        ret
    }
    @scala.inline
    def withPredicate(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predicate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredicate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predicate")(js.undefined)
        ret
    }
    @scala.inline
    def withSerialize(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldHotReload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldHotReload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldHotReload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldHotReload")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldRecordChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRecordChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldRecordChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRecordChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldStartLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldStartLocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldStartLocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldStartLocked")(js.undefined)
        ret
    }
    @scala.inline
    def withStateSanitizer(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateSanitizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateSanitizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateSanitizer")(js.undefined)
        ret
    }
  }
  
}

