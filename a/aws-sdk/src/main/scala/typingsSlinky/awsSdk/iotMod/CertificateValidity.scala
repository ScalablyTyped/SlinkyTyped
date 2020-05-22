package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateValidity extends js.Object {
  /**
    * The certificate is not valid after this date.
    */
  var notAfter: js.UndefOr[js.Date] = js.native
  /**
    * The certificate is not valid before this date.
    */
  var notBefore: js.UndefOr[js.Date] = js.native
}

object CertificateValidity {
  @scala.inline
  def apply(notAfter: js.Date = null, notBefore: js.Date = null): CertificateValidity = {
    val __obj = js.Dynamic.literal()
    if (notAfter != null) __obj.updateDynamic("notAfter")(notAfter.asInstanceOf[js.Any])
    if (notBefore != null) __obj.updateDynamic("notBefore")(notBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateValidity]
  }
}

