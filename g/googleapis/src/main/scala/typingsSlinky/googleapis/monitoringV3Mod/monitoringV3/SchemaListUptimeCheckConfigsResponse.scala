package typingsSlinky.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The protocol for the ListUptimeCheckConfigs response.
  */
@js.native
trait SchemaListUptimeCheckConfigsResponse extends js.Object {
  /**
    * This field represents the pagination token to retrieve the next page of
    * results. If the value is empty, it means no further results for the
    * request. To retrieve the next page of results, the value of the
    * next_page_token is passed to the subsequent List method call (in the
    * request message&#39;s page_token field).
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The total number of uptime check configurations for the project,
    * irrespective of any pagination.
    */
  var totalSize: js.UndefOr[Double] = js.native
  /**
    * The returned uptime check configurations.
    */
  var uptimeCheckConfigs: js.UndefOr[js.Array[SchemaUptimeCheckConfig]] = js.native
}

object SchemaListUptimeCheckConfigsResponse {
  @scala.inline
  def apply(): SchemaListUptimeCheckConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListUptimeCheckConfigsResponse]
  }
  @scala.inline
  implicit class SchemaListUptimeCheckConfigsResponseOps[Self <: SchemaListUptimeCheckConfigsResponse] (val x: Self) extends AnyVal {
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
    def withTotalSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSize")(js.undefined)
        ret
    }
    @scala.inline
    def withUptimeCheckConfigs(value: js.Array[SchemaUptimeCheckConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uptimeCheckConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUptimeCheckConfigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uptimeCheckConfigs")(js.undefined)
        ret
    }
  }
  
}

