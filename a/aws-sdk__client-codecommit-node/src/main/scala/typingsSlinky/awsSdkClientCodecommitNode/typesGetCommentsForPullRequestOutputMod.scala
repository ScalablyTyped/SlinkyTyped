package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesCommentsForPullRequestMod.UnmarshalledCommentsForPullRequest
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetCommentsForPullRequestOutputMod {
  
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
    implicit class GetCommentsForPullRequestOutputMutableBuilder[Self <: GetCommentsForPullRequestOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsForPullRequestData(value: js.Array[UnmarshalledCommentsForPullRequest]): Self = StObject.set(x, "commentsForPullRequestData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsForPullRequestDataUndefined: Self = StObject.set(x, "commentsForPullRequestData", js.undefined)
      
      @scala.inline
      def setCommentsForPullRequestDataVarargs(value: UnmarshalledCommentsForPullRequest*): Self = StObject.set(x, "commentsForPullRequestData", js.Array(value :_*))
      
      @scala.inline
      def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    }
  }
}
