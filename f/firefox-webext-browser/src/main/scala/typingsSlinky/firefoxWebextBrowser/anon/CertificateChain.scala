package typingsSlinky.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateChain extends js.Object {
  /** Include the entire certificate chain. */
  var certificateChain: js.UndefOr[Boolean] = js.native
  /** Include raw certificate data for processing by the extension. */
  var rawDER: js.UndefOr[Boolean] = js.native
}

object CertificateChain {
  @scala.inline
  def apply(): CertificateChain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateChain]
  }
  @scala.inline
  implicit class CertificateChainOps[Self <: CertificateChain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateChain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateChain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateChain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateChain")(js.undefined)
        ret
    }
    @scala.inline
    def withRawDER(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawDER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawDER: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawDER")(js.undefined)
        ret
    }
  }
  
}

