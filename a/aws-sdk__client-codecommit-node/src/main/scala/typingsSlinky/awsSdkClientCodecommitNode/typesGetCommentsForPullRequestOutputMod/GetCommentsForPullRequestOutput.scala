package typingsSlinky.awsSdkClientCodecommitNode.typesGetCommentsForPullRequestOutputMod

import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesCommentsForPullRequestMod.UnmarshalledCommentsForPullRequest
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCommentsForPullRequestOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>An array of comment objects on the pull request.</p>
    */
  var commentsForPullRequestData: js.UndefOr[js.Array[UnmarshalledCommentsForPullRequest]] = js.native
  /**
    * <p>An enumeration token that can be used in a request to return the next batch of the results.</p>
    */
  var nextToken: js.UndefOr[String] = js.native
}

object GetCommentsForPullRequestOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetCommentsForPullRequestOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCommentsForPullRequestOutput]
  }
  @scala.inline
  implicit class GetCommentsForPullRequestOutputOps[Self <: GetCommentsForPullRequestOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$metadata(value: ResponseMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommentsForPullRequestData(value: js.Array[UnmarshalledCommentsForPullRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentsForPullRequestData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommentsForPullRequestData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentsForPullRequestData")(js.undefined)
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
  }
  
}

