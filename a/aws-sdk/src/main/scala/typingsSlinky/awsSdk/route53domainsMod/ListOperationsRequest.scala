package typingsSlinky.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOperationsRequest extends js.Object {
  /**
    * For an initial request for a list of operations, omit this element. If the number of operations that are not yet complete is greater than the value that you specified for MaxItems, you can use Marker to return additional operations. Get the value of NextPageMarker from the previous response, and submit another request that includes the value of NextPageMarker in the Marker element.
    */
  var Marker: js.UndefOr[PageMarker] = js.native
  /**
    * Number of domains to be returned. Default: 20
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.native
  /**
    * An optional parameter that lets you get information about all the operations that you submitted after a specified date and time. Specify the date and time in Coordinated Universal time (UTC).
    */
  var SubmittedSince: js.UndefOr[js.Date] = js.native
}

object ListOperationsRequest {
  @scala.inline
  def apply(): ListOperationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOperationsRequest]
  }
  @scala.inline
  implicit class ListOperationsRequestOps[Self <: ListOperationsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarker(value: PageMarker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxItems(value: PageMaxItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxItems")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmittedSince(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmittedSince")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmittedSince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmittedSince")(js.undefined)
        ret
    }
  }
  
}

