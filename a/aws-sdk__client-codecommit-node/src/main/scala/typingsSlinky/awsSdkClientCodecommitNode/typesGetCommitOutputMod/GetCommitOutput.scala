package typingsSlinky.awsSdkClientCodecommitNode.typesGetCommitOutputMod

import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesCommitMod.UnmarshalledCommit
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCommitOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>A commit data type object that contains information about the specified commit.</p>
    */
  var commit: UnmarshalledCommit
}

object GetCommitOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, commit: UnmarshalledCommit): GetCommitOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCommitOutput]
  }
}

