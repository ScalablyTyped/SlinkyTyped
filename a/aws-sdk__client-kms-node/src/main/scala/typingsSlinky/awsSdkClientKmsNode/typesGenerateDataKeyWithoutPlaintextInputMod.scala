package typingsSlinky.awsSdkClientKmsNode

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.AES_128
import typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.AES_256
import typingsSlinky.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGenerateDataKeyWithoutPlaintextInputMod {
  
  @js.native
  trait GenerateDataKeyWithoutPlaintextInput extends InputTypesUnion {
    
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
      * <p>A set of key-value pairs that represents additional authenticated data.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html">Encryption Context</a> in the <i>AWS Key Management Service Developer Guide</i>.</p>
      */
    var EncryptionContext: js.UndefOr[StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])] = js.native
    
    /**
      * <p>A list of grant tokens.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in the <i>AWS Key Management Service Developer Guide</i>.</p>
      */
    var GrantTokens: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.native
    
    /**
      * <p>The identifier of the customer master key (CMK) under which to generate and encrypt the data encryption key.</p> <p>To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an alias name, prefix it with <code>"alias/"</code>. To specify a CMK in a different AWS account, you must use the key ARN or alias ARN.</p> <p>For example:</p> <ul> <li> <p>Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code> </p> </li> <li> <p>Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code> </p> </li> <li> <p>Alias name: <code>alias/ExampleAlias</code> </p> </li> <li> <p>Alias ARN: <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code> </p> </li> </ul> <p>To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>. To get the alias name and alias ARN, use <a>ListAliases</a>.</p>
      */
    var KeyId: String = js.native
    
    /**
      * <p>The length of the data encryption key. Use <code>AES_128</code> to generate a 128-bit symmetric key, or <code>AES_256</code> to generate a 256-bit symmetric key.</p>
      */
    var KeySpec: js.UndefOr[AES_256 | AES_128 | String] = js.native
    
    /**
      * <p>The length of the data encryption key in bytes. For example, use the value 64 to generate a 512-bit data key (64 bytes is 512 bits). For common key lengths (128-bit and 256-bit symmetric keys), we recommend that you use the <code>KeySpec</code> field instead of this one.</p>
      */
    var NumberOfBytes: js.UndefOr[Double] = js.native
  }
  object GenerateDataKeyWithoutPlaintextInput {
    
    @scala.inline
    def apply(KeyId: String): GenerateDataKeyWithoutPlaintextInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateDataKeyWithoutPlaintextInput]
    }
    
    @scala.inline
    implicit class GenerateDataKeyWithoutPlaintextInputMutableBuilder[Self <: GenerateDataKeyWithoutPlaintextInput] (val x: Self) extends AnyVal {
      
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
      
      @scala.inline
      def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySpec(value: AES_256 | AES_128 | String): Self = StObject.set(x, "KeySpec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySpecUndefined: Self = StObject.set(x, "KeySpec", js.undefined)
      
      @scala.inline
      def setNumberOfBytes(value: Double): Self = StObject.set(x, "NumberOfBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfBytesUndefined: Self = StObject.set(x, "NumberOfBytes", js.undefined)
    }
  }
}
