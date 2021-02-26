package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesChangeMessageVisibilityInputMod {
  
  @js.native
  trait ChangeMessageVisibilityInput extends InputTypesUnion {
    
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
      * <p>The URL of the Amazon SQS queue whose message's visibility is changed.</p> <p>Queue URLs and names are case-sensitive.</p>
      */
    var QueueUrl: String = js.native
    
    /**
      * <p>The receipt handle associated with the message whose visibility timeout is changed. This parameter is returned by the <code> <a>ReceiveMessage</a> </code> action.</p>
      */
    var ReceiptHandle: String = js.native
    
    /**
      * <p>The new value for the message's visibility timeout (in seconds). Values values: <code>0</code> to <code>43200</code>. Maximum: 12 hours.</p>
      */
    var VisibilityTimeout: Double = js.native
  }
  object ChangeMessageVisibilityInput {
    
    @scala.inline
    def apply(QueueUrl: String, ReceiptHandle: String, VisibilityTimeout: Double): ChangeMessageVisibilityInput = {
      val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any], ReceiptHandle = ReceiptHandle.asInstanceOf[js.Any], VisibilityTimeout = VisibilityTimeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeMessageVisibilityInput]
    }
    
    @scala.inline
    implicit class ChangeMessageVisibilityInputMutableBuilder[Self <: ChangeMessageVisibilityInput] (val x: Self) extends AnyVal {
      
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
      def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceiptHandle(value: String): Self = StObject.set(x, "ReceiptHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibilityTimeout(value: Double): Self = StObject.set(x, "VisibilityTimeout", value.asInstanceOf[js.Any])
    }
  }
}
