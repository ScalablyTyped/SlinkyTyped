package typingsSlinky.awsSdkClientKmsNode.typesReEncryptInputMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReEncryptInput extends InputTypesUnion {
  
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
    * <p>Ciphertext of the data to reencrypt.</p>
    */
  var CiphertextBlob: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String = js.native
  
  /**
    * <p>Encryption context to use when the data is reencrypted.</p>
    */
  var DestinationEncryptionContext: js.UndefOr[StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])] = js.native
  
  /**
    * <p>A unique identifier for the CMK that is used to reencrypt the data.</p> <p>To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an alias name, prefix it with <code>"alias/"</code>. To specify a CMK in a different AWS account, you must use the key ARN or alias ARN.</p> <p>For example:</p> <ul> <li> <p>Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code> </p> </li> <li> <p>Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code> </p> </li> <li> <p>Alias name: <code>alias/ExampleAlias</code> </p> </li> <li> <p>Alias ARN: <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code> </p> </li> </ul> <p>To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>. To get the alias name and alias ARN, use <a>ListAliases</a>.</p>
    */
  var DestinationKeyId: String = js.native
  
  /**
    * <p>A list of grant tokens.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in the <i>AWS Key Management Service Developer Guide</i>.</p>
    */
  var GrantTokens: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.native
  
  /**
    * <p>Encryption context used to encrypt and decrypt the data specified in the <code>CiphertextBlob</code> parameter.</p>
    */
  var SourceEncryptionContext: js.UndefOr[StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])] = js.native
}
object ReEncryptInput {
  
  @scala.inline
  def apply(
    CiphertextBlob: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String,
    DestinationKeyId: String
  ): ReEncryptInput = {
    val __obj = js.Dynamic.literal(CiphertextBlob = CiphertextBlob.asInstanceOf[js.Any], DestinationKeyId = DestinationKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReEncryptInput]
  }
  
  @scala.inline
  implicit class ReEncryptInputOps[Self <: ReEncryptInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCiphertextBlobArrayBufferView(value: js.typedarray.ArrayBufferView): Self = this.set("CiphertextBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCiphertextBlobArrayBuffer(value: js.typedarray.ArrayBuffer): Self = this.set("CiphertextBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCiphertextBlob(value: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String): Self = this.set("CiphertextBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationKeyId(value: String): Self = this.set("DestinationKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$abortSignal(value: AbortSignal): Self = this.set("$abortSignal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$abortSignal: Self = this.set("$abortSignal", js.undefined)
    
    @scala.inline
    def set$httpOptions(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
    ): Self = this.set("$httpOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$httpOptions: Self = this.set("$httpOptions", js.undefined)
    
    @scala.inline
    def set$maxRetries(value: Double): Self = this.set("$maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$maxRetries: Self = this.set("$maxRetries", js.undefined)
    
    @scala.inline
    def setDestinationEncryptionContextIterable(value: js.Iterable[js.Tuple2[String, String]]): Self = this.set("DestinationEncryptionContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationEncryptionContext(value: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): Self = this.set("DestinationEncryptionContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationEncryptionContext: Self = this.set("DestinationEncryptionContext", js.undefined)
    
    @scala.inline
    def setGrantTokensVarargs(value: String*): Self = this.set("GrantTokens", js.Array(value :_*))
    
    @scala.inline
    def setGrantTokensIterable(value: js.Iterable[String]): Self = this.set("GrantTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantTokens(value: js.Array[String] | js.Iterable[String]): Self = this.set("GrantTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrantTokens: Self = this.set("GrantTokens", js.undefined)
    
    @scala.inline
    def setSourceEncryptionContextIterable(value: js.Iterable[js.Tuple2[String, String]]): Self = this.set("SourceEncryptionContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceEncryptionContext(value: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): Self = this.set("SourceEncryptionContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceEncryptionContext: Self = this.set("SourceEncryptionContext", js.undefined)
  }
}
