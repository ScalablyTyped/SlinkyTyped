package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesCommentMod.UnmarshalledComment
import typingsSlinky.awsSdkClientCodecommitNode.typesLocationMod.UnmarshalledLocation
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPostCommentForPullRequestOutputMod {
  
  @js.native
  trait PostCommentForPullRequestOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>In the directionality of the pull request, the blob ID of the 'after' blob.</p>
      */
    var afterBlobId: js.UndefOr[String] = js.native
    
    /**
      * <p>The full commit ID of the commit in the destination branch where the pull request will be merged.</p>
      */
    var afterCommitId: js.UndefOr[String] = js.native
    
    /**
      * <p>In the directionality of the pull request, the blob ID of the 'before' blob.</p>
      */
    var beforeBlobId: js.UndefOr[String] = js.native
    
    /**
      * <p>The full commit ID of the commit in the source branch used to create the pull request, or in the case of an updated pull request, the full commit ID of the commit used to update the pull request.</p>
      */
    var beforeCommitId: js.UndefOr[String] = js.native
    
    /**
      * <p>The content of the comment you posted.</p>
      */
    var comment: js.UndefOr[UnmarshalledComment] = js.native
    
    /**
      * <p>The location of the change where you posted your comment.</p>
      */
    var location: js.UndefOr[UnmarshalledLocation] = js.native
    
    /**
      * <p>The system-generated ID of the pull request. </p>
      */
    var pullRequestId: js.UndefOr[String] = js.native
    
    /**
      * <p>The name of the repository where you posted a comment on a pull request.</p>
      */
    var repositoryName: js.UndefOr[String] = js.native
  }
  object PostCommentForPullRequestOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): PostCommentForPullRequestOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostCommentForPullRequestOutput]
    }
    
    @scala.inline
    implicit class PostCommentForPullRequestOutputMutableBuilder[Self <: PostCommentForPullRequestOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterBlobId(value: String): Self = StObject.set(x, "afterBlobId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterBlobIdUndefined: Self = StObject.set(x, "afterBlobId", js.undefined)
      
      @scala.inline
      def setAfterCommitId(value: String): Self = StObject.set(x, "afterCommitId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterCommitIdUndefined: Self = StObject.set(x, "afterCommitId", js.undefined)
      
      @scala.inline
      def setBeforeBlobId(value: String): Self = StObject.set(x, "beforeBlobId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeBlobIdUndefined: Self = StObject.set(x, "beforeBlobId", js.undefined)
      
      @scala.inline
      def setBeforeCommitId(value: String): Self = StObject.set(x, "beforeCommitId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeCommitIdUndefined: Self = StObject.set(x, "beforeCommitId", js.undefined)
      
      @scala.inline
      def setComment(value: UnmarshalledComment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setLocation(value: UnmarshalledLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setPullRequestId(value: String): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullRequestIdUndefined: Self = StObject.set(x, "pullRequestId", js.undefined)
      
      @scala.inline
      def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
    }
  }
}
