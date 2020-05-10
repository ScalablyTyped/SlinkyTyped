package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAuthorizersRequest extends js.Object {
  /**
    * Return the list of authorizers in ascending alphabetical order.
    */
  var ascendingOrder: js.UndefOr[AscendingOrder] = js.native
  /**
    * A marker used to get the next set of results.
    */
  var marker: js.UndefOr[Marker] = js.native
  /**
    * The maximum number of results to return at one time.
    */
  var pageSize: js.UndefOr[PageSize] = js.native
  /**
    * The status of the list authorizers request.
    */
  var status: js.UndefOr[AuthorizerStatus] = js.native
}

object ListAuthorizersRequest {
  @scala.inline
  def apply(): ListAuthorizersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAuthorizersRequest]
  }
  @scala.inline
  implicit class ListAuthorizersRequestOps[Self <: ListAuthorizersRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withStatus(value: AuthorizerStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

