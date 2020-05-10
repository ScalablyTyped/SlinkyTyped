package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOutgoingCertificatesResponse extends js.Object {
  /**
    * The marker for the next set of results.
    */
  var nextMarker: js.UndefOr[Marker] = js.native
  /**
    * The certificates that are being transferred but not yet accepted.
    */
  var outgoingCertificates: js.UndefOr[OutgoingCertificates] = js.native
}

object ListOutgoingCertificatesResponse {
  @scala.inline
  def apply(): ListOutgoingCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOutgoingCertificatesResponse]
  }
  @scala.inline
  implicit class ListOutgoingCertificatesResponseOps[Self <: ListOutgoingCertificatesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withOutgoingCertificates(value: OutgoingCertificates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoingCertificates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutgoingCertificates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoingCertificates")(js.undefined)
        ret
    }
  }
  
}

