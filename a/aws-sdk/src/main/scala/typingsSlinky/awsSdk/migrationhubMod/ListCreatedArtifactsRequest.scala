package typingsSlinky.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCreatedArtifactsRequest extends js.Object {
  /**
    * Maximum number of results to be returned per page.
    */
  var MaxResults: js.UndefOr[MaxResultsCreatedArtifacts] = js.native
  /**
    * Unique identifier that references the migration task. Do not store personal data in this field. 
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

object ListCreatedArtifactsRequest {
  @scala.inline
  def apply(MigrationTaskName: MigrationTaskName, ProgressUpdateStream: ProgressUpdateStream): ListCreatedArtifactsRequest = {
    val __obj = js.Dynamic.literal(MigrationTaskName = MigrationTaskName.asInstanceOf[js.Any], ProgressUpdateStream = ProgressUpdateStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCreatedArtifactsRequest]
  }
  @scala.inline
  implicit class ListCreatedArtifactsRequestOps[Self <: ListCreatedArtifactsRequest] (val x: Self) extends AnyVal {
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
    def withMaxResults(value: MaxResultsCreatedArtifacts): Self = {
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

