package typingsSlinky.pulumiAws.inputMod.acm

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateOptions extends js.Object {
  var certificateTransparencyLoggingPreference: js.UndefOr[Input[String]] = js.native
}

object CertificateOptions {
  @scala.inline
  def apply(): CertificateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateOptions]
  }
  @scala.inline
  implicit class CertificateOptionsOps[Self <: CertificateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateTransparencyLoggingPreference(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateTransparencyLoggingPreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateTransparencyLoggingPreference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateTransparencyLoggingPreference")(js.undefined)
        ret
    }
  }
  
}

