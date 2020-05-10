package typingsSlinky.pkijs.encryptedDataMod

import typingsSlinky.pkijs.AnonContentEncryptionAlgorithm
import typingsSlinky.pkijs.AnonPassword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptedData extends js.Object {
  var encryptedContentInfo: typingsSlinky.pkijs.encryptedContentInfoMod.default = js.native
  var unprotectedAttrs: js.Array[typingsSlinky.pkijs.attributeMod.default] = js.native
  var version: Double = js.native
  /**
    * Create a new CMS Encrypted Data content
    * @param {*} parameters Parameters neccessary for encryption
    */
  def decrypt(parameters: AnonPassword): js.Thenable[js.typedarray.ArrayBuffer] = js.native
  /**
    * Create a new CMS Encrypted Data content
    * @param {*} parameters Parameters neccessary for encryption
    * @returns {Promise}
    */
  def encrypt(parameters: AnonContentEncryptionAlgorithm): js.Thenable[js.typedarray.ArrayBuffer] = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object EncryptedData {
  @scala.inline
  def apply(
    decrypt: AnonPassword => js.Thenable[js.typedarray.ArrayBuffer],
    encrypt: AnonContentEncryptionAlgorithm => js.Thenable[js.typedarray.ArrayBuffer],
    encryptedContentInfo: typingsSlinky.pkijs.encryptedContentInfoMod.default,
    fromSchema: js.Any => Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    unprotectedAttrs: js.Array[typingsSlinky.pkijs.attributeMod.default],
    version: Double
  ): EncryptedData = {
    val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction1(decrypt), encrypt = js.Any.fromFunction1(encrypt), encryptedContentInfo = encryptedContentInfo.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), unprotectedAttrs = unprotectedAttrs.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedData]
  }
  @scala.inline
  implicit class EncryptedDataOps[Self <: EncryptedData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecrypt(value: AnonPassword => js.Thenable[js.typedarray.ArrayBuffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decrypt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEncrypt(value: AnonContentEncryptionAlgorithm => js.Thenable[js.typedarray.ArrayBuffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypt")(js.Any.fromFunction1(value))
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
    def withUnprotectedAttrs(value: js.Array[typingsSlinky.pkijs.attributeMod.default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprotectedAttrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

