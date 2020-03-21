package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestEventMod.UnmarshalledPullRequestEvent
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/types/DescribePullRequestEventsOutput", JSImport.Namespace)
@js.native
object typesDescribePullRequestEventsOutputMod extends js.Object {
  @js.native
  trait DescribePullRequestEventsOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>An enumeration token that can be used in a request to return the next batch of the results.</p>
      */
    var nextToken: js.UndefOr[String] = js.native
    /**
      * <p>Information about the pull request events.</p>
      */
    var pullRequestEvents: js.Array[UnmarshalledPullRequestEvent] = js.native
  }
  
}

