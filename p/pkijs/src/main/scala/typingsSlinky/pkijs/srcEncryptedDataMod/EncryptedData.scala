package typingsSlinky.pkijs.srcEncryptedDataMod

import typingsSlinky.pkijs.Anon_ContentEncryptionAlgorithm
import typingsSlinky.pkijs.Anon_Password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptedData extends js.Object {
  var encryptedContentInfo: typingsSlinky.pkijs.srcEncryptedContentInfoMod.default
  var unprotectedAttrs: js.Array[typingsSlinky.pkijs.srcAttributeMod.default]
  var version: Double
  /**
    * Create a new CMS Encrypted Data content
    * @param {*} parameters Parameters neccessary for encryption
    */
  def decrypt(parameters: Anon_Password): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer]
  /**
    * Create a new CMS Encrypted Data content
    * @param {*} parameters Parameters neccessary for encryption
    * @returns {Promise}
    */
  def encrypt(parameters: Anon_ContentEncryptionAlgorithm): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer]
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object EncryptedData {
  @scala.inline
  def apply(
    decrypt: Anon_Password => js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer],
    encrypt: Anon_ContentEncryptionAlgorithm => js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer],
    encryptedContentInfo: typingsSlinky.pkijs.srcEncryptedContentInfoMod.default,
    fromSchema: js.Any => Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    unprotectedAttrs: js.Array[typingsSlinky.pkijs.srcAttributeMod.default],
    version: Double
  ): EncryptedData = {
    val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction1(decrypt), encrypt = js.Any.fromFunction1(encrypt), encryptedContentInfo = encryptedContentInfo.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), unprotectedAttrs = unprotectedAttrs.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EncryptedData]
  }
}

