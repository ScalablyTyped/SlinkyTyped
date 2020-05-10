package typingsSlinky.awsSdkClientCodecommitNode.typesGetMergeConflictsOutputMod

import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMergeConflictsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The commit ID of the destination commit specifier that was used in the merge evaluation.</p>
    */
  var destinationCommitId: String = js.native
  /**
    * <p>A Boolean value that indicates whether the code is mergable by the specified merge option.</p>
    */
  var mergeable: Boolean = js.native
  /**
    * <p>The commit ID of the source commit specifier that was used in the merge evaluation.</p>
    */
  var sourceCommitId: String = js.native
}

object GetMergeConflictsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    destinationCommitId: String,
    mergeable: Boolean,
    sourceCommitId: String
  ): GetMergeConflictsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], destinationCommitId = destinationCommitId.asInstanceOf[js.Any], mergeable = mergeable.asInstanceOf[js.Any], sourceCommitId = sourceCommitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMergeConflictsOutput]
  }
  @scala.inline
  implicit class GetMergeConflictsOutputOps[Self <: GetMergeConflictsOutput] (val x: Self) extends AnyVal {
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
    def withDestinationCommitId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationCommitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceCommitId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCommitId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

