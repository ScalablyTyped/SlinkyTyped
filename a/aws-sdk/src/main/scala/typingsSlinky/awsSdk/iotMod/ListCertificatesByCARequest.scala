package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCertificatesByCARequest extends js.Object {
  /**
    * Specifies the order for results. If True, the results are returned in ascending order, based on the creation date.
    */
  var ascendingOrder: js.UndefOr[AscendingOrder] = js.native
  /**
    * The ID of the CA certificate. This operation will list all registered device certificate that were signed by this CA certificate.
    */
  var caCertificateId: CertificateId = js.native
  /**
    * The marker for the next set of results.
    */
  var marker: js.UndefOr[Marker] = js.native
  /**
    * The result page size.
    */
  var pageSize: js.UndefOr[PageSize] = js.native
}

object ListCertificatesByCARequest {
  @scala.inline
  def apply(caCertificateId: CertificateId): ListCertificatesByCARequest = {
    val __obj = js.Dynamic.literal(caCertificateId = caCertificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCertificatesByCARequest]
  }
  @scala.inline
  implicit class ListCertificatesByCARequestOps[Self <: ListCertificatesByCARequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaCertificateId(value: CertificateId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caCertificateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAscendingOrder(value: AscendingOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascendingOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAscendingOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascendingOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: Marker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: PageSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
  }
  
}

