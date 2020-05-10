package typingsSlinky.awsSdkClientKmsBrowser.typesImportKeyMaterialInputMod

import typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.KEY_MATERIAL_DOES_NOT_EXPIRE
import typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.KEY_MATERIAL_EXPIRES
import typingsSlinky.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import typingsSlinky.awsSdkTypes.httpMod.BrowserHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportKeyMaterialInput extends InputTypesUnion {
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
  var $httpOptions: js.UndefOr[BrowserHttpOptions] = js.native
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.native
  /**
    * <p>The encrypted key material to import. It must be encrypted with the public key that you received in the response to a previous <a>GetParametersForImport</a> request, using the wrapping algorithm that you specified in that request.</p>
    */
  var EncryptedKeyMaterial: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String = js.native
  /**
    * <p>Specifies whether the key material expires. The default is <code>KEY_MATERIAL_EXPIRES</code>, in which case you must include the <code>ValidTo</code> parameter. When this parameter is set to <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>, you must omit the <code>ValidTo</code> parameter.</p>
    */
  var ExpirationModel: js.UndefOr[KEY_MATERIAL_EXPIRES | KEY_MATERIAL_DOES_NOT_EXPIRE | String] = js.native
  /**
    * <p>The import token that you received in the response to a previous <a>GetParametersForImport</a> request. It must be from the same response that contained the public key that you used to encrypt the key material.</p>
    */
  var ImportToken: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String = js.native
  /**
    * <p>The identifier of the CMK to import the key material into. The CMK's <code>Origin</code> must be <code>EXTERNAL</code>.</p> <p>Specify the key ID or the Amazon Resource Name (ARN) of the CMK.</p> <p>For example:</p> <ul> <li> <p>Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code> </p> </li> <li> <p>Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code> </p> </li> </ul> <p>To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.</p>
    */
  var KeyId: String = js.native
  /**
    * <p>The time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. You must omit this parameter when the <code>ExpirationModel</code> parameter is set to <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>. Otherwise it is required.</p>
    */
  var ValidTo: js.UndefOr[js.Date | String | Double] = js.native
}

object ImportKeyMaterialInput {
  @scala.inline
  def apply(
    EncryptedKeyMaterial: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String,
    ImportToken: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String,
    KeyId: String
  ): ImportKeyMaterialInput = {
    val __obj = js.Dynamic.literal(EncryptedKeyMaterial = EncryptedKeyMaterial.asInstanceOf[js.Any], ImportToken = ImportToken.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportKeyMaterialInput]
  }
  @scala.inline
  implicit class ImportKeyMaterialInputOps[Self <: ImportKeyMaterialInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncryptedKeyMaterialArrayBufferView(value: js.typedarray.ArrayBufferView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptedKeyMaterial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryptedKeyMaterialArrayBuffer(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptedKeyMaterial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryptedKeyMaterial(value: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptedKeyMaterial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportTokenArrayBufferView(value: js.typedarray.ArrayBufferView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportTokenArrayBuffer(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportToken(value: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$abortSignal(value: AbortSignal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$abortSignal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$abortSignal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$abortSignal")(js.undefined)
        ret
    }
    @scala.inline
    def with$httpOptions(value: BrowserHttpOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$httpOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$httpOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$httpOptions")(js.undefined)
        ret
    }
    @scala.inline
    def with$maxRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$maxRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$maxRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$maxRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationModel(value: KEY_MATERIAL_EXPIRES | KEY_MATERIAL_DOES_NOT_EXPIRE | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationModel")(js.undefined)
        ret
    }
    @scala.inline
    def withValidToDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidTo(value: js.Date | String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidTo")(js.undefined)
        ret
    }
  }
  
}

