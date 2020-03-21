package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesCommentsForComparedCommitMod.UnmarshalledCommentsForComparedCommit
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/types/GetCommentsForComparedCommitOutput", JSImport.Namespace)
@js.native
object typesGetCommentsForComparedCommitOutputMod extends js.Object {
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
  
}

