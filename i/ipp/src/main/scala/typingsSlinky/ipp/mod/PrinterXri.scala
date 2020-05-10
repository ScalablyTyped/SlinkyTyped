package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrinterXri extends js.Object {
  var `xri-authentication`: js.UndefOr[XriAuthentication] = js.native
  var `xri-security`: js.UndefOr[XriSecurity] = js.native
  var `xri-uri`: js.UndefOr[String] = js.native
}

object PrinterXri {
  @scala.inline
  def apply(): PrinterXri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrinterXri]
  }
  @scala.inline
  implicit class PrinterXriOps[Self <: PrinterXri] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withXri-authentication`(value: XriAuthentication): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xri-authentication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutXri-authentication`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xri-authentication")(js.undefined)
        ret
    }
    @scala.inline
    def `withXri-security`(value: XriSecurity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xri-security")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutXri-security`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xri-security")(js.undefined)
        ret
    }
    @scala.inline
    def `withXri-uri`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xri-uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutXri-uri`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xri-uri")(js.undefined)
        ret
    }
  }
  
}

