package typingsSlinky.casperjs.mod

import typingsSlinky.phantomjs.WebPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CasperOptions extends js.Object {
  var clientScripts: js.UndefOr[js.Array[_]] = js.native
  var exitOnError: js.UndefOr[Boolean] = js.native
  var httpStatusHandlers: js.UndefOr[js.Any] = js.native
  var logLevel: js.UndefOr[String] = js.native
  var onAlert: js.UndefOr[js.Function] = js.native
  var onDie: js.UndefOr[js.Function] = js.native
  var onError: js.UndefOr[js.Function] = js.native
  var onLoadError: js.UndefOr[js.Function] = js.native
  var onPageInitialized: js.UndefOr[js.Function] = js.native
  var onResourceReceived: js.UndefOr[js.Function] = js.native
  var onResourceRequested: js.UndefOr[js.Function] = js.native
  var onStepComplete: js.UndefOr[js.Function] = js.native
  var onStepTimeout: js.UndefOr[js.Function] = js.native
  var onTimeout: js.UndefOr[js.Function] = js.native
  var onWaitTimeout: js.UndefOr[js.Function] = js.native
  var page: js.UndefOr[WebPage] = js.native
  var pageSettings: js.UndefOr[js.Any] = js.native
  var remoteScripts: js.UndefOr[js.Array[_]] = js.native
  var retryTimeout: js.UndefOr[Double] = js.native
  var safeLogs: js.UndefOr[Boolean] = js.native
  var silentErrors: js.UndefOr[Boolean] = js.native
  var stepTimeout: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
  var viewportSize: js.UndefOr[js.Any] = js.native
  var waitTimeout: js.UndefOr[Double] = js.native
}

object CasperOptions {
  @scala.inline
  def apply(): CasperOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CasperOptions]
  }
  @scala.inline
  implicit class CasperOptionsOps[Self <: CasperOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientScripts(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientScripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientScripts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientScripts")(js.undefined)
        ret
    }
    @scala.inline
    def withExitOnError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitOnError")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpStatusHandlers(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpStatusHandlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpStatusHandlers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpStatusHandlers")(js.undefined)
        ret
    }
    @scala.inline
    def withLogLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAlert(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAlert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnAlert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAlert")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDie(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDie")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadError(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLoadError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPageInitialized(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageInitialized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPageInitialized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageInitialized")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResourceReceived(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResourceReceived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnResourceReceived: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResourceReceived")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResourceRequested(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResourceRequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnResourceRequested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResourceRequested")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStepComplete(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStepComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnStepComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStepComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStepTimeout(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStepTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnStepTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStepTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTimeout(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWaitTimeout(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWaitTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnWaitTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWaitTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: WebPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSettings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteScripts(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteScripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteScripts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteScripts")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withSafeLogs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeLogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafeLogs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeLogs")(js.undefined)
        ret
    }
    @scala.inline
    def withSilentErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silentErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilentErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silentErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withStepTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepTimeout")(js.undefined)
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
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
    @scala.inline
    def withViewportSize(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewportSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportSize")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitTimeout")(js.undefined)
        ret
    }
  }
  
}

