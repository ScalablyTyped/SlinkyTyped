package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListTagsForStreamInputMod {
  
  @js.native
  trait ListTagsForStreamInput extends InputTypesUnion {
    
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
      * <p>The key to use as the starting point for the list of tags. If this parameter is set, <code>ListTagsForStream</code> gets all tags that occur after <code>ExclusiveStartTagKey</code>. </p>
      */
    var ExclusiveStartTagKey: js.UndefOr[String] = js.native
    
    /**
      * <p>The number of tags to return. If this number is less than the total number of tags associated with the stream, <code>HasMoreTags</code> is set to <code>true</code>. To list additional tags, set <code>ExclusiveStartTagKey</code> to the last key in the response.</p>
      */
    var Limit: js.UndefOr[Double] = js.native
    
    /**
      * <p>The name of the stream.</p>
      */
    var StreamName: String = js.native
  }
  object ListTagsForStreamInput {
    
    @scala.inline
    def apply(StreamName: String): ListTagsForStreamInput = {
      val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListTagsForStreamInput]
    }
    
    @scala.inline
    implicit class ListTagsForStreamInputMutableBuilder[Self <: ListTagsForStreamInput] (val x: Self) extends AnyVal {
      
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
      def setExclusiveStartTagKey(value: String): Self = StObject.set(x, "ExclusiveStartTagKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveStartTagKeyUndefined: Self = StObject.set(x, "ExclusiveStartTagKey", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
      
      @scala.inline
      def setStreamName(value: String): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    }
  }
}
