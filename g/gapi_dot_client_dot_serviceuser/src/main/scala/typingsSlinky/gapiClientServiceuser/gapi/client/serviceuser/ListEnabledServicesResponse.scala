package typingsSlinky.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEnabledServicesResponse extends js.Object {
  /**
    * Token that can be passed to `ListEnabledServices` to resume a paginated
    * query.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** Services enabled for the specified parent. */
  var services: js.UndefOr[js.Array[PublishedService]] = js.native
}

object ListEnabledServicesResponse {
  @scala.inline
  def apply(): ListEnabledServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEnabledServicesResponse]
  }
  @scala.inline
  implicit class ListEnabledServicesResponseOps[Self <: ListEnabledServicesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withServices(value: js.Array[PublishedService]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(js.undefined)
        ret
    }
  }
  
}

