package typingsSlinky.awsSdkClientDynamodbBrowser

import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesReplicaUpdateMod.ReplicaUpdate
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateGlobalTableInputMod {
  
  @js.native
  trait UpdateGlobalTableInput extends InputTypesUnion {
    
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
      * <p>The global table name.</p>
      */
    var GlobalTableName: String = js.native
    
    /**
      * <p>A list of regions that should be added or removed from the global table.</p>
      */
    var ReplicaUpdates: js.Array[ReplicaUpdate] | js.Iterable[ReplicaUpdate] = js.native
  }
  object UpdateGlobalTableInput {
    
    @scala.inline
    def apply(GlobalTableName: String, ReplicaUpdates: js.Array[ReplicaUpdate] | js.Iterable[ReplicaUpdate]): UpdateGlobalTableInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any], ReplicaUpdates = ReplicaUpdates.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateGlobalTableInput]
    }
    
    @scala.inline
    implicit class UpdateGlobalTableInputMutableBuilder[Self <: UpdateGlobalTableInput] (val x: Self) extends AnyVal {
      
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
      def setGlobalTableName(value: String): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaUpdates(value: js.Array[ReplicaUpdate] | js.Iterable[ReplicaUpdate]): Self = StObject.set(x, "ReplicaUpdates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaUpdatesIterable(value: js.Iterable[ReplicaUpdate]): Self = StObject.set(x, "ReplicaUpdates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaUpdatesVarargs(value: ReplicaUpdate*): Self = StObject.set(x, "ReplicaUpdates", js.Array(value :_*))
    }
  }
}
