package typingsSlinky.pkijs.envelopedDataMod

import org.scalajs.dom.crypto.Algorithm
import typingsSlinky.pkijs.AnonHmacHashAlgorithm
import typingsSlinky.pkijs.AnonKdfAlgorithm
import typingsSlinky.pkijs.AnonRecipientCertificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvelopedData extends js.Object {
  var encryptedContentInfo: typingsSlinky.pkijs.encryptedContentInfoMod.default = js.native
  var originatorInfo: js.UndefOr[typingsSlinky.pkijs.originatorInfoMod.default] = js.native
  var recipientInfos: js.Array[typingsSlinky.pkijs.recipientInfoMod.default] = js.native
  var unprotectedAttrs: js.UndefOr[js.Array[typingsSlinky.pkijs.attributeMod.default]] = js.native
  var version: Double = js.native
  /**
    * Helpers function for filling "RecipientInfo" based on recipient's certificate.
    * Problem with WebCrypto is that for RSA certificates we have only one option - "key transport" and
    * for ECC certificates we also have one option - "key agreement". As soon as Google will implement
    * DH algorithm it would be possible to use "key agreement" also for RSA certificates.
    * @param {Certificate} [certificate] Recipient's certificate
    * @param {*} [parameters] Additional parameters neccessary for "fine tunning" of encryption process
    * @param {number} [variant] Variant = 1 is for "key transport", variant = 2 is for "key agreement". In fact the "variant" is unneccessary now because Google has no DH algorithm implementation. Thus key encryption scheme would be choosen by certificate type only: "key transport" for RSA and "key agreement" for ECC certificates.
    */
  def addRecipientByCertificate(
    certificate: typingsSlinky.pkijs.certificateMod.default,
    parameters: AnonKdfAlgorithm,
    variant: Double
  ): Boolean = js.native
  /**
    * Add recipient based on pre-defined data like password or KEK
    * @param {ArrayBuffer} preDefinedData ArrayBuffer with pre-defined data
    * @param {*} parameters Additional parameters neccessary for "fine tunning" of encryption process
    * @param {number} variant Variant = 1 for pre-defined "key encryption key" (KEK). Variant = 2 for password-based encryption.
    */
  def addRecipientByPreDefinedData(preDefinedData: js.typedarray.ArrayBuffer, parameters: AnonHmacHashAlgorithm, variant: Double): Boolean = js.native
  /**
    * Decrypt existing CMS Enveloped Data content
    * @param {number} recipientIndex Index of recipient
    * @param {*} parameters Additional parameters
    * @returns {Promise}
    */
  def decrypt(recipientIndex: Double, parameters: AnonRecipientCertificate): js.Thenable[js.typedarray.ArrayBuffer] = js.native
  /**
    * Create a new CMS Enveloped Data content with encrypted data
    * @param {Algorithm} contentEncryptionAlgorithm WebCrypto algorithm. For the moment here could be only "AES-CBC" or "AES-GCM" algorithms.
    * @param {ArrayBuffer} contentToEncrypt Content to encrypt
    * @returns {Promise}
    */
  def encrypt(contentEncryptionAlgorithm: Algorithm, contentToEncrypt: js.typedarray.ArrayBuffer): js.Thenable[js.typedarray.ArrayBuffer] = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object EnvelopedData {
  @scala.inline
  def apply(
    addRecipientByCertificate: (typingsSlinky.pkijs.certificateMod.default, AnonKdfAlgorithm, Double) => Boolean,
    addRecipientByPreDefinedData: (js.typedarray.ArrayBuffer, AnonHmacHashAlgorithm, Double) => Boolean,
    decrypt: (Double, AnonRecipientCertificate) => js.Thenable[js.typedarray.ArrayBuffer],
    encrypt: (Algorithm, js.typedarray.ArrayBuffer) => js.Thenable[js.typedarray.ArrayBuffer],
    encryptedContentInfo: typingsSlinky.pkijs.encryptedContentInfoMod.default,
    fromSchema: js.Any => Unit,
    recipientInfos: js.Array[typingsSlinky.pkijs.recipientInfoMod.default],
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: Double
  ): EnvelopedData = {
    val __obj = js.Dynamic.literal(addRecipientByCertificate = js.Any.fromFunction3(addRecipientByCertificate), addRecipientByPreDefinedData = js.Any.fromFunction3(addRecipientByPreDefinedData), decrypt = js.Any.fromFunction2(decrypt), encrypt = js.Any.fromFunction2(encrypt), encryptedContentInfo = encryptedContentInfo.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), recipientInfos = recipientInfos.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvelopedData]
  }
  @scala.inline
  implicit class EnvelopedDataOps[Self <: EnvelopedData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddRecipientByCertificate(value: (typingsSlinky.pkijs.certificateMod.default, AnonKdfAlgorithm, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRecipientByCertificate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAddRecipientByPreDefinedData(value: (js.typedarray.ArrayBuffer, AnonHmacHashAlgorithm, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRecipientByPreDefinedData")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDecrypt(value: (Double, AnonRecipientCertificate) => js.Thenable[js.typedarray.ArrayBuffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decrypt")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEncrypt(value: (Algorithm, js.typedarray.ArrayBuffer) => js.Thenable[js.typedarray.ArrayBuffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypt")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEncryptedContentInfo(value: typingsSlinky.pkijs.encryptedContentInfoMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptedContentInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromSchema(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromSchema")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRecipientInfos(value: js.Array[typingsSlinky.pkijs.recipientInfoMod.default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToSchema(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toSchema")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginatorInfo(value: typingsSlinky.pkijs.originatorInfoMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originatorInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginatorInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originatorInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withUnprotectedAttrs(value: js.Array[typingsSlinky.pkijs.attributeMod.default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprotectedAttrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnprotectedAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprotectedAttrs")(js.undefined)
        ret
    }
  }
  
}

