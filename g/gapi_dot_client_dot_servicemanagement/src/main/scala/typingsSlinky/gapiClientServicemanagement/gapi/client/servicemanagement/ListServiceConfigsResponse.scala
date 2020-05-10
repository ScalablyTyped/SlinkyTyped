package typingsSlinky.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListServiceConfigsResponse extends js.Object {
  /** The token of the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  /** The list of service configuration resources. */
  var serviceConfigs: js.UndefOr[js.Array[Service]] = js.native
}

object ListServiceConfigsResponse {
  @scala.inline
  def apply(): ListServiceConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceConfigsResponse]
  }
  @scala.inline
  implicit class ListServiceConfigsResponseOps[Self <: ListServiceConfigsResponse] (val x: Self) extends AnyVal {
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
    def withServiceConfigs(value: js.Array[Service]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceConfigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceConfigs")(js.undefined)
        ret
    }
  }
  
}

