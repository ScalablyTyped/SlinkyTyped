package typingsSlinky.awsSdkClientCodecommitNode.typesGetCommentsForComparedCommitOutputMod

import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesCommentsForComparedCommitMod.UnmarshalledCommentsForComparedCommit
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCommentsForComparedCommitOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>A list of comment objects on the compared commit.</p>
    */
  var commentsForComparedCommitData: js.UndefOr[js.Array[UnmarshalledCommentsForComparedCommit]] = js.native
  /**
    * <p>An enumeration token that can be used in a request to return the next batch of the results.</p>
    */
  var nextToken: js.UndefOr[String] = js.native
}

object GetCommentsForComparedCommitOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetCommentsForComparedCommitOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCommentsForComparedCommitOutput]
  }
  @scala.inline
  implicit class GetCommentsForComparedCommitOutputOps[Self <: GetCommentsForComparedCommitOutput] (val x: Self) extends AnyVal {
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
    def withCommentsForComparedCommitData(value: js.Array[UnmarshalledCommentsForComparedCommit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentsForComparedCommitData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommentsForComparedCommitData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentsForComparedCommitData")(js.undefined)
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

