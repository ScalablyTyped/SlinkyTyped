package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RtmpOutputSettings extends js.Object {
  /**
    * If set to verifyAuthenticity, verify the tls certificate chain to a trusted Certificate Authority (CA).  This will cause rtmps outputs with self-signed certificates to fail.
    */
  var CertificateMode: js.UndefOr[RtmpOutputCertificateMode] = js.native
  /**
    * Number of seconds to wait before retrying a connection to the Flash Media server if the connection is lost.
    */
  var ConnectionRetryInterval: js.UndefOr[integerMin1] = js.native
  /**
    * The RTMP endpoint excluding the stream name (eg. rtmp://host/appname). For connection to Akamai, a username and password must be supplied. URI fields accept format identifiers.
    */
  var Destination: OutputLocationRef = js.native
  /**
    * Number of retry attempts.
    */
  var NumRetries: js.UndefOr[integerMin0] = js.native
}

object RtmpOutputSettings {
  @scala.inline
  def apply(Destination: OutputLocationRef): RtmpOutputSettings = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[RtmpOutputSettings]
  }
  @scala.inline
  implicit class RtmpOutputSettingsOps[Self <: RtmpOutputSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: OutputLocationRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCertificateMode(value: RtmpOutputCertificateMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateMode")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionRetryInterval(value: integerMin1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionRetryInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionRetryInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionRetryInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withNumRetries(value: integerMin0): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumRetries")(js.undefined)
        ret
    }
  }
  
}

