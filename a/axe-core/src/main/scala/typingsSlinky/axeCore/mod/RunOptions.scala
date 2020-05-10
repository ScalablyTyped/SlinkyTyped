package typingsSlinky.axeCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunOptions extends js.Object {
  var absolutePaths: js.UndefOr[Boolean] = js.native
  var elementRef: js.UndefOr[Boolean] = js.native
  var frameWaitTime: js.UndefOr[Double] = js.native
  var iframes: js.UndefOr[Boolean] = js.native
  var performanceTimer: js.UndefOr[Boolean] = js.native
  var preload: js.UndefOr[Boolean] = js.native
  var reporter: js.UndefOr[ReporterVersion] = js.native
  var restoreScroll: js.UndefOr[Boolean] = js.native
  var resultTypes: js.UndefOr[js.Array[resultGroups]] = js.native
  var rules: js.UndefOr[js.Object] = js.native
  var runOnly: js.UndefOr[RunOnly | (js.Array[String | TagValue])] = js.native
  var selectors: js.UndefOr[Boolean] = js.native
  var xpath: js.UndefOr[Boolean] = js.native
}

object RunOptions {
  @scala.inline
  def apply(): RunOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunOptions]
  }
  @scala.inline
  implicit class RunOptionsOps[Self <: RunOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsolutePaths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolutePaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbsolutePaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolutePaths")(js.undefined)
        ret
    }
    @scala.inline
    def withElementRef(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementRef")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameWaitTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameWaitTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameWaitTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameWaitTime")(js.undefined)
        ret
    }
    @scala.inline
    def withIframes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIframes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframes")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformanceTimer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performanceTimer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformanceTimer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performanceTimer")(js.undefined)
        ret
    }
    @scala.inline
    def withPreload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(js.undefined)
        ret
    }
    @scala.inline
    def withReporter(value: ReporterVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReporter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporter")(js.undefined)
        ret
    }
    @scala.inline
    def withRestoreScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestoreScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withResultTypes(value: js.Array[resultGroups]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withRules(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
        ret
    }
    @scala.inline
    def withRunOnly(value: RunOnly | (js.Array[String | TagValue])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectors")(js.undefined)
        ret
    }
    @scala.inline
    def withXpath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xpath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXpath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xpath")(js.undefined)
        ret
    }
  }
  
}

