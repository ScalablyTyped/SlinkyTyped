package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCACertificatesResponse extends js.Object {
  /**
    * The CA certificates registered in your AWS account.
    */
  var certificates: js.UndefOr[CACertificates] = js.native
  /**
    * The current position within the list of CA certificates.
    */
  var nextMarker: js.UndefOr[Marker] = js.native
}

object ListCACertificatesResponse {
  @scala.inline
  def apply(): ListCACertificatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCACertificatesResponse]
  }
  @scala.inline
  implicit class ListCACertificatesResponseOps[Self <: ListCACertificatesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificates(value: CACertificates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificates")(js.undefined)
        ret
    }
    @scala.inline
    def withNextMarker(value: Marker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextMarker")(js.undefined)
        ret
    }
  }
  
}

