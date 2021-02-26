package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListPullRequestsOutputMod {
  
  @js.native
  trait ListPullRequestsOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>An enumeration token that when provided in a request, returns the next batch of the results.</p>
      */
    var nextToken: js.UndefOr[String] = js.native
    
    /**
      * <p>The system-generated IDs of the pull requests.</p>
      */
    var pullRequestIds: js.Array[String] = js.native
  }
  object ListPullRequestsOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata, pullRequestIds: js.Array[String]): ListPullRequestsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], pullRequestIds = pullRequestIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListPullRequestsOutput]
    }
    
    @scala.inline
    implicit class ListPullRequestsOutputMutableBuilder[Self <: ListPullRequestsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
      
      @scala.inline
      def setPullRequestIds(value: js.Array[String]): Self = StObject.set(x, "pullRequestIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullRequestIdsVarargs(value: String*): Self = StObject.set(x, "pullRequestIds", js.Array(value :_*))
    }
  }
}
