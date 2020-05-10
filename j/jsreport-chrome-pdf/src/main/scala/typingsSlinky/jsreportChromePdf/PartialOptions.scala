package typingsSlinky.jsreportChromePdf

import typingsSlinky.jsreportChromePdf.jsreportChromePdfStrings.`dedicated-process`
import typingsSlinky.jsreportChromePdf.jsreportChromePdfStrings.`http-server`
import typingsSlinky.jsreportChromePdf.jsreportChromePdfStrings.`in-process`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<jsreport-chrome-pdf.jsreport-chrome-pdf.Options> */
@js.native
trait PartialOptions extends js.Object {
  var allowLocalFilesAccess: js.UndefOr[Boolean] = js.native
  var allowedModules: js.UndefOr[js.Array[String]] = js.native
  var host: js.UndefOr[String] = js.native
  var launchOptions: js.UndefOr[PartialLaunchOptions] = js.native
  var numberOfWorkers: js.UndefOr[Double] = js.native
  var portLeftBoundary: js.UndefOr[Double] = js.native
  var portRightBoundary: js.UndefOr[Double] = js.native
  var strategy: js.UndefOr[`dedicated-process` | `http-server` | `in-process`] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object PartialOptions {
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
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
    def withoutAllowLocalFilesAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowLocalFilesAccess")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedModules(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedModules")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchOptions(value: PartialLaunchOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfWorkers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfWorkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfWorkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfWorkers")(js.undefined)
        ret
    }
    @scala.inline
    def withPortLeftBoundary(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portLeftBoundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortLeftBoundary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portLeftBoundary")(js.undefined)
        ret
    }
    @scala.inline
    def withPortRightBoundary(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portRightBoundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortRightBoundary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portRightBoundary")(js.undefined)
        ret
    }
    @scala.inline
    def withStrategy(value: `dedicated-process` | `http-server` | `in-process`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(js.undefined)
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

