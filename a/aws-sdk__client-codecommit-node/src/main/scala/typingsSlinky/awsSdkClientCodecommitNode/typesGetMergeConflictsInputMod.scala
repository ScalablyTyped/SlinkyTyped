package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FAST_FORWARD_MERGE
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetMergeConflictsInputMod {
  
  @js.native
  trait GetMergeConflictsInput extends InputTypesUnion {
    
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
      * <p>The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, a branch name or a full commit ID.</p>
      */
    var destinationCommitSpecifier: String = js.native
    
    /**
      * <p>The merge option or strategy you want to use to merge the code. The only valid value is FAST_FORWARD_MERGE.</p>
      */
    var mergeOption: FAST_FORWARD_MERGE | String = js.native
    
    /**
      * <p>The name of the repository where the pull request was created.</p>
      */
    var repositoryName: String = js.native
    
    /**
      * <p>The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, a branch name or a full commit ID.</p>
      */
    var sourceCommitSpecifier: String = js.native
  }
  object GetMergeConflictsInput {
    
    @scala.inline
    def apply(
      destinationCommitSpecifier: String,
      mergeOption: FAST_FORWARD_MERGE | String,
      repositoryName: String,
      sourceCommitSpecifier: String
    ): GetMergeConflictsInput = {
      val __obj = js.Dynamic.literal(destinationCommitSpecifier = destinationCommitSpecifier.asInstanceOf[js.Any], mergeOption = mergeOption.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any], sourceCommitSpecifier = sourceCommitSpecifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetMergeConflictsInput]
    }
    
    @scala.inline
    implicit class GetMergeConflictsInputMutableBuilder[Self <: GetMergeConflictsInput] (val x: Self) extends AnyVal {
      
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
      def setDestinationCommitSpecifier(value: String): Self = StObject.set(x, "destinationCommitSpecifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeOption(value: FAST_FORWARD_MERGE | String): Self = StObject.set(x, "mergeOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceCommitSpecifier(value: String): Self = StObject.set(x, "sourceCommitSpecifier", value.asInstanceOf[js.Any])
    }
  }
}
