package typingsSlinky.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ListUsableSubnetworksResponse is the response of
  * ListUsableSubnetworksRequest.
  */
@js.native
trait SchemaListUsableSubnetworksResponse extends js.Object {
  /**
    * This token allows you to get the next page of results for list requests.
    * If the number of results is larger than `page_size`, use the
    * `next_page_token` as a value for the query parameter `page_token` in the
    * next request. The value will become empty when there are no more pages.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * A list of usable subnetworks in the specified network project.
    */
  var subnetworks: js.UndefOr[js.Array[SchemaUsableSubnetwork]] = js.native
}

object SchemaListUsableSubnetworksResponse {
  @scala.inline
  def apply(): SchemaListUsableSubnetworksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListUsableSubnetworksResponse]
  }
  @scala.inline
  implicit class SchemaListUsableSubnetworksResponseOps[Self <: SchemaListUsableSubnetworksResponse] (val x: Self) extends AnyVal {
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
    def withSubnetworks(value: js.Array[SchemaUsableSubnetwork]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetworks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetworks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetworks")(js.undefined)
        ret
    }
  }
  
}

