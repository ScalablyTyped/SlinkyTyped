package typingsSlinky.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOperationsResponse extends js.Object {
  /**
    * If there are more operations than you specified for MaxItems in the request, submit another request and include the value of NextPageMarker in the value of Marker.
    */
  var NextPageMarker: js.UndefOr[PageMarker] = js.native
  /**
    * Lists summaries of the operations.
    */
  var Operations: OperationSummaryList = js.native
}

object ListOperationsResponse {
  @scala.inline
  def apply(Operations: OperationSummaryList): ListOperationsResponse = {
    val __obj = js.Dynamic.literal(Operations = Operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOperationsResponse]
  }
  @scala.inline
  implicit class ListOperationsResponseOps[Self <: ListOperationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperations(value: OperationSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Operations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextPageMarker(value: PageMarker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPageMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPageMarker")(js.undefined)
        ret
    }
  }
  
}

