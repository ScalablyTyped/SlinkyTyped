package typingsSlinky.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListServerNeighborsRequest extends js.Object {
  /**
    * Configuration ID of the server for which neighbors are being listed.
    */
  var configurationId: ConfigurationId = js.native
  /**
    * Maximum number of results to return in a single page of output.
    */
  var maxResults: js.UndefOr[Integer] = js.native
  /**
    * List of configuration IDs to test for one-hop-away.
    */
  var neighborConfigurationIds: js.UndefOr[ConfigurationIdList] = js.native
  /**
    * Token to retrieve the next set of results. For example, if you previously specified 100 IDs for ListServerNeighborsRequest$neighborConfigurationIds but set ListServerNeighborsRequest$maxResults to 10, you received a set of 10 results along with a token. Use that token in this query to get the next set of 10.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * Flag to indicate if port and protocol information is needed as part of the response.
    */
  var portInformationNeeded: js.UndefOr[Boolean] = js.native
}

object ListServerNeighborsRequest {
  @scala.inline
  def apply(configurationId: ConfigurationId): ListServerNeighborsRequest = {
    val __obj = js.Dynamic.literal(configurationId = configurationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServerNeighborsRequest]
  }
  @scala.inline
  implicit class ListServerNeighborsRequestOps[Self <: ListServerNeighborsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationId(value: ConfigurationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxResults(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNeighborConfigurationIds(value: ConfigurationIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neighborConfigurationIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeighborConfigurationIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neighborConfigurationIds")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withPortInformationNeeded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portInformationNeeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortInformationNeeded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portInformationNeeded")(js.undefined)
        ret
    }
  }
  
}

