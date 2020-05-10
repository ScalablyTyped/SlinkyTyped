package typingsSlinky.jsreportPhantomPdf

import typingsSlinky.jsreportPhantomPdf.jsreportPhantomPdfStrings.`dedicated-process`
import typingsSlinky.jsreportPhantomPdf.jsreportPhantomPdfStrings.`phantom-server`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<jsreport-phantom-pdf.jsreport-phantom-pdf.Options> */
@js.native
trait PartialOptions extends js.Object {
  var allowLocalFilesAccess: js.UndefOr[Boolean] = js.native
  var defaultPhantomjsVersion: js.UndefOr[String] = js.native
  var strategy: js.UndefOr[`dedicated-process` | `phantom-server`] = js.native
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
    def withDefaultPhantomjsVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPhantomjsVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPhantomjsVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPhantomjsVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withStrategy(value: `dedicated-process` | `phantom-server`): Self = {
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

