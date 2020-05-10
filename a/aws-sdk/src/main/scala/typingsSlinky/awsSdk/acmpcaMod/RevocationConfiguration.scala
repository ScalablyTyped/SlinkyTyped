package typingsSlinky.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevocationConfiguration extends js.Object {
  /**
    * Configuration of the certificate revocation list (CRL), if any, maintained by your private CA.
    */
  var CrlConfiguration: js.UndefOr[typingsSlinky.awsSdk.acmpcaMod.CrlConfiguration] = js.native
}

object RevocationConfiguration {
  @scala.inline
  def apply(): RevocationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevocationConfiguration]
  }
  @scala.inline
  implicit class RevocationConfigurationOps[Self <: RevocationConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrlConfiguration(value: CrlConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrlConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrlConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrlConfiguration")(js.undefined)
        ret
    }
  }
  
}

