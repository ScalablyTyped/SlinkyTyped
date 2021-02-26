package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetCommentsForPullRequestInputMod {
  
  @js.native
  trait GetCommentsForPullRequestInput extends InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.native
    
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ] = js.native
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.native
    
    /**
      * <p>The full commit ID of the commit in the source branch that was the tip of the branch at the time the comment was made.</p>
      */
    var afterCommitId: js.UndefOr[String] = js.native
    
    /**
      * <p>The full commit ID of the commit in the destination branch that was the tip of the branch at the time the pull request was created.</p>
      */
    var beforeCommitId: js.UndefOr[String] = js.native
    
    /**
      * <p>A non-negative integer used to limit the number of returned results. The default is 100 comments. You can return up to 500 comments with a single request.</p>
      */
    var maxResults: js.UndefOr[Double] = js.native
    
    /**
      * <p>An enumeration token that when provided in a request, returns the next batch of the results.</p>
      */
    var nextToken: js.UndefOr[String] = js.native
    
    /**
      * <p>The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.</p>
      */
    var pullRequestId: String = js.native
    
    /**
      * <p>The name of the repository that contains the pull request.</p>
      */
    var repositoryName: js.UndefOr[String] = js.native
  }
  object GetCommentsForPullRequestInput {
    
    @scala.inline
    def apply(pullRequestId: String): GetCommentsForPullRequestInput = {
      val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCommentsForPullRequestInput]
    }
    
    @scala.inline
    implicit class GetCommentsForPullRequestInputMutableBuilder[Self <: GetCommentsForPullRequestInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      @scala.inline
      def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      @scala.inline
      def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      @scala.inline
      def setAfterCommitId(value: String): Self = StObject.set(x, "afterCommitId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterCommitIdUndefined: Self = StObject.set(x, "afterCommitId", js.undefined)
      
      @scala.inline
      def setBeforeCommitId(value: String): Self = StObject.set(x, "beforeCommitId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeCommitIdUndefined: Self = StObject.set(x, "beforeCommitId", js.undefined)
      
      @scala.inline
      def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      @scala.inline
      def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
      
      @scala.inline
      def setPullRequestId(value: String): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
    }
  }
}
