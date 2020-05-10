package typingsSlinky.backstopjs.mod

import typingsSlinky.backstopjs.AnonArgs
import typingsSlinky.backstopjs.AnonBitmapsreference
import typingsSlinky.backstopjs.AnonErrorColor
import typingsSlinky.backstopjs.AnonFormat
import typingsSlinky.backstopjs.backstopjsStrings.CI
import typingsSlinky.backstopjs.backstopjsStrings.browser
import typingsSlinky.backstopjs.backstopjsStrings.chromy
import typingsSlinky.backstopjs.backstopjsStrings.json
import typingsSlinky.backstopjs.backstopjsStrings.puppeteer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var asyncCaptureLimit: js.UndefOr[Double] = js.native
  var asyncCompareLimit: js.UndefOr[Double] = js.native
  var baseUrl: js.UndefOr[String] = js.native
  var ci: js.UndefOr[AnonFormat] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var debugWindow: js.UndefOr[Boolean] = js.native
  var dockerCommandTemplate: js.UndefOr[String] = js.native
  var engine: js.UndefOr[chromy | puppeteer] = js.native
  var engineOptions: js.UndefOr[AnonArgs] = js.native
  var id: String = js.native
  var onBeforeScript: js.UndefOr[String] = js.native
  var onReadyScript: js.UndefOr[String] = js.native
  var paths: js.UndefOr[AnonBitmapsreference] = js.native
  var report: js.UndefOr[js.Array[browser | CI | json]] = js.native
  var resembleOutputOptions: js.UndefOr[AnonErrorColor] = js.native
  var scenarios: js.Array[Scenario] = js.native
  var viewports: js.Array[Viewport] = js.native
}

object Config {
  @scala.inline
  def apply(id: String, scenarios: js.Array[Scenario], viewports: js.Array[Viewport]): Config = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], scenarios = scenarios.asInstanceOf[js.Any], viewports = viewports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScenarios(value: js.Array[Scenario]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scenarios")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewports(value: js.Array[Viewport]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsyncCaptureLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncCaptureLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncCaptureLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncCaptureLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withAsyncCompareLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncCompareLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncCompareLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncCompareLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCi(value: AnonFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ci")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ci")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugWindow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withDockerCommandTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockerCommandTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDockerCommandTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockerCommandTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withEngine(value: chromy | puppeteer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineOptions(value: AnonArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeScript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBeforeScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeScript")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReadyScript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReadyScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnReadyScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReadyScript")(js.undefined)
        ret
    }
    @scala.inline
    def withPaths(value: AnonBitmapsreference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(js.undefined)
        ret
    }
    @scala.inline
    def withReport(value: js.Array[browser | CI | json]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("report")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("report")(js.undefined)
        ret
    }
    @scala.inline
    def withResembleOutputOptions(value: AnonErrorColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resembleOutputOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResembleOutputOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resembleOutputOptions")(js.undefined)
        ret
    }
  }
  
}

