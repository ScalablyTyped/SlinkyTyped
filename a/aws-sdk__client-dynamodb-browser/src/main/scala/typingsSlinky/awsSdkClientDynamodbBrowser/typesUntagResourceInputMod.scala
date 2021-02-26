package typingsSlinky.awsSdkClientDynamodbBrowser

import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUntagResourceInputMod {
  
  @js.native
  trait UntagResourceInput extends InputTypesUnion {
    
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
      * <p>The Amazon DyanamoDB resource the tags will be removed from. This value is an Amazon Resource Name (ARN).</p>
      */
    var ResourceArn: String = js.native
    
    /**
      * <p>A list of tag keys. Existing tags of the resource whose keys are members of this list will be removed from the Amazon DynamoDB resource.</p>
      */
    var TagKeys: js.Array[String] | js.Iterable[String] = js.native
  }
  object UntagResourceInput {
    
    @scala.inline
    def apply(ResourceArn: String, TagKeys: js.Array[String] | js.Iterable[String]): UntagResourceInput = {
      val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[UntagResourceInput]
    }
    
    @scala.inline
    implicit class UntagResourceInputMutableBuilder[Self <: UntagResourceInput] (val x: Self) extends AnyVal {
      
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
      def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagKeys(value: js.Array[String] | js.Iterable[String]): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagKeysIterable(value: js.Iterable[String]): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagKeysVarargs(value: String*): Self = StObject.set(x, "TagKeys", js.Array(value :_*))
    }
  }
}
