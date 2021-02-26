package typingsSlinky.awsSdkClientKmsBrowser

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecryptInputMod {
  
  @js.native
  trait DecryptInput extends InputTypesUnion {
    
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
      * <p>Ciphertext to be decrypted. The blob includes metadata.</p>
      */
    var CiphertextBlob: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String = js.native
    
    /**
      * <p>The encryption context. If this was specified in the <a>Encrypt</a> function, it must be specified here or the decryption operation will fail. For more information, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html">Encryption Context</a>.</p>
      */
    var EncryptionContext: js.UndefOr[StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])] = js.native
    
    /**
      * <p>A list of grant tokens.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in the <i>AWS Key Management Service Developer Guide</i>.</p>
      */
    var GrantTokens: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.native
  }
  object DecryptInput {
    
    @scala.inline
    def apply(CiphertextBlob: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String): DecryptInput = {
      val __obj = js.Dynamic.literal(CiphertextBlob = CiphertextBlob.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecryptInput]
    }
    
    @scala.inline
    implicit class DecryptInputMutableBuilder[Self <: DecryptInput] (val x: Self) extends AnyVal {
      
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
      def setCiphertextBlob(value: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String): Self = StObject.set(x, "CiphertextBlob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiphertextBlobArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "CiphertextBlob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiphertextBlobArrayBufferView(value: js.typedarray.ArrayBufferView): Self = StObject.set(x, "CiphertextBlob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionContext(value: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "EncryptionContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionContextIterable(value: js.Iterable[js.Tuple2[String, String]]): Self = StObject.set(x, "EncryptionContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionContextUndefined: Self = StObject.set(x, "EncryptionContext", js.undefined)
      
      @scala.inline
      def setGrantTokens(value: js.Array[String] | js.Iterable[String]): Self = StObject.set(x, "GrantTokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrantTokensIterable(value: js.Iterable[String]): Self = StObject.set(x, "GrantTokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrantTokensUndefined: Self = StObject.set(x, "GrantTokens", js.undefined)
      
      @scala.inline
      def setGrantTokensVarargs(value: String*): Self = StObject.set(x, "GrantTokens", js.Array(value :_*))
    }
  }
}
