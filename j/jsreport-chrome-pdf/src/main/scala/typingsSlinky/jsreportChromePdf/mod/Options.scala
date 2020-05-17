package typingsSlinky.jsreportChromePdf.mod

import typingsSlinky.jsreportChromePdf.anon.PartialLaunchOptions
import typingsSlinky.jsreportChromePdf.jsreportChromePdfStrings.`dedicated-process`
import typingsSlinky.jsreportChromePdf.jsreportChromePdfStrings.`http-server`
import typingsSlinky.jsreportChromePdf.jsreportChromePdfStrings.`in-process`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://jsreport.net/learn/configuration
@js.native
trait Options extends js.Object {
  var allowLocalFilesAccess: Boolean = js.native
  var allowedModules: js.Array[String] = js.native
  var host: String = js.native
  var launchOptions: PartialLaunchOptions = js.native
  var numberOfWorkers: Double = js.native
  var portLeftBoundary: Double = js.native
  var portRightBoundary: Double = js.native
  var strategy: `dedicated-process` | `http-server` | `in-process` = js.native
  var timeout: Double = js.native
}

object Options {
  @scala.inline
  def apply(
    allowLocalFilesAccess: Boolean,
    allowedModules: js.Array[String],
    host: String,
    launchOptions: PartialLaunchOptions,
    numberOfWorkers: Double,
    portLeftBoundary: Double,
    portRightBoundary: Double,
    strategy: `dedicated-process` | `http-server` | `in-process`,
    timeout: Double
  ): Options = {
    val __obj = js.Dynamic.literal(allowLocalFilesAccess = allowLocalFilesAccess.asInstanceOf[js.Any], allowedModules = allowedModules.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], launchOptions = launchOptions.asInstanceOf[js.Any], numberOfWorkers = numberOfWorkers.asInstanceOf[js.Any], portLeftBoundary = portLeftBoundary.asInstanceOf[js.Any], portRightBoundary = portRightBoundary.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowLocalFilesAccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowLocalFilesAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedModules(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLaunchOptions(value: PartialLaunchOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfWorkers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfWorkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortLeftBoundary(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portLeftBoundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortRightBoundary(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portRightBoundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrategy(value: `dedicated-process` | `http-server` | `in-process`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

