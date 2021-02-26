package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestEventMod.UnmarshalledPullRequestEvent
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDescribePullRequestEventsOutputMod {
  
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
  object DescribePullRequestEventsOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata, pullRequestEvents: js.Array[UnmarshalledPullRequestEvent]): DescribePullRequestEventsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], pullRequestEvents = pullRequestEvents.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribePullRequestEventsOutput]
    }
    
    @scala.inline
    implicit class DescribePullRequestEventsOutputMutableBuilder[Self <: DescribePullRequestEventsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
      
      @scala.inline
      def setPullRequestEvents(value: js.Array[UnmarshalledPullRequestEvent]): Self = StObject.set(x, "pullRequestEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullRequestEventsVarargs(value: UnmarshalledPullRequestEvent*): Self = StObject.set(x, "pullRequestEvents", js.Array(value :_*))
    }
  }
}
