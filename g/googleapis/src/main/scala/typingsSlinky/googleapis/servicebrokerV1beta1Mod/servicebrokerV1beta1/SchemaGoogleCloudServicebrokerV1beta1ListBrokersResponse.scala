package typingsSlinky.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for the `ListBrokers()` method.
  */
@js.native
trait SchemaGoogleCloudServicebrokerV1beta1ListBrokersResponse extends js.Object {
  /**
    * The list of brokers in the container.
    */
  var brokers: js.UndefOr[js.Array[SchemaGoogleCloudServicebrokerV1beta1Broker]] = js.native
  /**
    * This token allows you to get the next page of results for list requests.
    * If the number of results is larger than `pageSize`, use the
    * `nextPageToken` as a value for the query parameter `pageToken` in the
    * next list request. Subsequent list requests will have their own
    * `nextPageToken` to continue paging through the results
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudServicebrokerV1beta1ListBrokersResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudServicebrokerV1beta1ListBrokersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1beta1ListBrokersResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudServicebrokerV1beta1ListBrokersResponseOps[Self <: SchemaGoogleCloudServicebrokerV1beta1ListBrokersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrokers(value: js.Array[SchemaGoogleCloudServicebrokerV1beta1Broker]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokers")(js.undefined)
        ret
    }
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
  }
  
}

