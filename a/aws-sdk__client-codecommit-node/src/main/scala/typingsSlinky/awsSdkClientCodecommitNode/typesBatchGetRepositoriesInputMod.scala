package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBatchGetRepositoriesInputMod {
  
  @js.native
  trait BatchGetRepositoriesInput extends InputTypesUnion {
    
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
      * <p>The names of the repositories to get information about.</p>
      */
    var repositoryNames: js.Array[String] | js.Iterable[String] = js.native
  }
  object BatchGetRepositoriesInput {
    
    @scala.inline
    def apply(repositoryNames: js.Array[String] | js.Iterable[String]): BatchGetRepositoriesInput = {
      val __obj = js.Dynamic.literal(repositoryNames = repositoryNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchGetRepositoriesInput]
    }
    
    @scala.inline
    implicit class BatchGetRepositoriesInputMutableBuilder[Self <: BatchGetRepositoriesInput] (val x: Self) extends AnyVal {
      
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
      def setRepositoryNames(value: js.Array[String] | js.Iterable[String]): Self = StObject.set(x, "repositoryNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryNamesIterable(value: js.Iterable[String]): Self = StObject.set(x, "repositoryNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryNamesVarargs(value: String*): Self = StObject.set(x, "repositoryNames", js.Array(value :_*))
    }
  }
}
