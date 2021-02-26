package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesRepositoryTriggerMod.RepositoryTrigger
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutRepositoryTriggersInputMod {
  
  @js.native
  trait PutRepositoryTriggersInput extends InputTypesUnion {
    
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
      * <p>The name of the repository where you want to create or update the trigger.</p>
      */
    var repositoryName: String = js.native
    
    /**
      * <p>The JSON block of configuration information for each trigger.</p>
      */
    var triggers: js.Array[RepositoryTrigger] | js.Iterable[RepositoryTrigger] = js.native
  }
  object PutRepositoryTriggersInput {
    
    @scala.inline
    def apply(repositoryName: String, triggers: js.Array[RepositoryTrigger] | js.Iterable[RepositoryTrigger]): PutRepositoryTriggersInput = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutRepositoryTriggersInput]
    }
    
    @scala.inline
    implicit class PutRepositoryTriggersInputMutableBuilder[Self <: PutRepositoryTriggersInput] (val x: Self) extends AnyVal {
      
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
      def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggers(value: js.Array[RepositoryTrigger] | js.Iterable[RepositoryTrigger]): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggersIterable(value: js.Iterable[RepositoryTrigger]): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggersVarargs(value: RepositoryTrigger*): Self = StObject.set(x, "triggers", js.Array(value :_*))
    }
  }
}
