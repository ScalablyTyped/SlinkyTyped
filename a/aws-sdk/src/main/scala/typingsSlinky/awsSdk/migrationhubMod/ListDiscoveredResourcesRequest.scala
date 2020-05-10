package typingsSlinky.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDiscoveredResourcesRequest extends js.Object {
  /**
    * The maximum number of results returned per page.
    */
  var MaxResults: js.UndefOr[MaxResultsResources] = js.native
  /**
    * The name of the MigrationTask. Do not store personal data in this field. 
    */
  var MigrationTaskName: typingsSlinky.awsSdk.migrationhubMod.MigrationTaskName = js.native
  /**
    * If a NextToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in NextToken.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * The name of the ProgressUpdateStream.
    */
  var ProgressUpdateStream: typingsSlinky.awsSdk.migrationhubMod.ProgressUpdateStream = js.native
}

object ListDiscoveredResourcesRequest {
  @scala.inline
  def apply(MigrationTaskName: MigrationTaskName, ProgressUpdateStream: ProgressUpdateStream): ListDiscoveredResourcesRequest = {
    val __obj = js.Dynamic.literal(MigrationTaskName = MigrationTaskName.asInstanceOf[js.Any], ProgressUpdateStream = ProgressUpdateStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDiscoveredResourcesRequest]
  }
  @scala.inline
  implicit class ListDiscoveredResourcesRequestOps[Self <: ListDiscoveredResourcesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMigrationTaskName(value: MigrationTaskName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MigrationTaskName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgressUpdateStream(value: ProgressUpdateStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressUpdateStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResultsResources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: Token): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

