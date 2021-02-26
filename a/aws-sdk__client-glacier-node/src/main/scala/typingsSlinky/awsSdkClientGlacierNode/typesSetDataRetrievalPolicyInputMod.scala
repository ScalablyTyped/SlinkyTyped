package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod._InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesDataRetrievalPolicyMod.DataRetrievalPolicy
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSetDataRetrievalPolicyInputMod {
  
  @js.native
  trait SetDataRetrievalPolicyInput extends _InputTypesUnion {
    
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
      * <p>The data retrieval policy in JSON format.</p>
      */
    var Policy: js.UndefOr[DataRetrievalPolicy] = js.native
    
    /**
      * <p>The <code>AccountId</code> value is the AWS account ID. This value must match the AWS account ID associated with the credentials used to sign the request. You can either specify an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you specify your account ID, do not include any hyphens ('-') in the ID.</p>
      */
    var accountId: String = js.native
  }
  object SetDataRetrievalPolicyInput {
    
    @scala.inline
    def apply(accountId: String): SetDataRetrievalPolicyInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetDataRetrievalPolicyInput]
    }
    
    @scala.inline
    implicit class SetDataRetrievalPolicyInputMutableBuilder[Self <: SetDataRetrievalPolicyInput] (val x: Self) extends AnyVal {
      
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
      def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicy(value: DataRetrievalPolicy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
    }
  }
}
