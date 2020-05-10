package typingsSlinky.jsreportPhantomPdf.mod

import typingsSlinky.jsreportPhantomPdf.jsreportPhantomPdfStrings.`dedicated-process`
import typingsSlinky.jsreportPhantomPdf.jsreportPhantomPdfStrings.`phantom-server`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// const enum PhantomStrategy {
//   dedicatedProcess = 'dedicated-process',
//   phantomServer = 'phantom-server'
// }
@js.native
trait Options extends js.Object {
  var allowLocalFilesAccess: Boolean = js.native
  // appDirectory: string;
  var defaultPhantomjsVersion: String = js.native
  var strategy: `dedicated-process` | `phantom-server` = js.native
  var timeout: Double = js.native
}

object Options {
  @scala.inline
  def apply(
    allowLocalFilesAccess: Boolean,
    defaultPhantomjsVersion: String,
    strategy: `dedicated-process` | `phantom-server`,
    timeout: Double
  ): Options = {
    val __obj = js.Dynamic.literal(allowLocalFilesAccess = allowLocalFilesAccess.asInstanceOf[js.Any], defaultPhantomjsVersion = defaultPhantomjsVersion.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
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
    def withDefaultPhantomjsVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPhantomjsVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrategy(value: `dedicated-process` | `phantom-server`): Self = {
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

