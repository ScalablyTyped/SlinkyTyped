package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCertificatesByCAResponse extends js.Object {
  /**
    * The device certificates signed by the specified CA certificate.
    */
  var certificates: js.UndefOr[Certificates] = js.native
  /**
    * The marker for the next set of results, or null if there are no additional results.
    */
  var nextMarker: js.UndefOr[Marker] = js.native
}

object ListCertificatesByCAResponse {
  @scala.inline
  def apply(): ListCertificatesByCAResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCertificatesByCAResponse]
  }
  @scala.inline
  implicit class ListCertificatesByCAResponseOps[Self <: ListCertificatesByCAResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificates(value: Certificates): Self = {
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

